package de.is24.rest.api.export.api.parser.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import de.is24.rest.api.export.api.Is24Api;

/**
 * @author Martin Fluegge
 * 
 */
public class ContactResultParser extends AbstractResultParser {

	@Override
	public String getResult(String response) {
		try {

			Message message = parseMessage(response);

			String content = message.getMessage();

			String regex = getRegExp();
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(content);

			if (m.find()) {
				return m.group(0).replace("[", "").replace("]", "");
			}

			throw new ContactResultParsingException("Unparsable content '" + content + "'");
		} catch (ContactResultParsingException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String getRegExp() {
		// return "\\[[a-zA-Z0-9]+\\]";
		return "(?!\\[contact\\])\\[.+\\]";
	}

	@Override
	protected void throwException(Throwable throwable, Message parseMessage) {
		if (parseMessage != null && Is24Api.ERROR_COMMON_REQUEST_CONFLICT.equals(parseMessage.getMessageCode())) {
			throw new ContactAlreadyExistsException(parseMessage, throwable);
		} else if (parseMessage != null && Is24Api.ERROR_COMMON_SCHEMA_VALIDATION_FAILED.equals(parseMessage.getMessageCode())) {
			throw new ContactSchemaValidationException(parseMessage, throwable);
		}

		super.throwException(throwable, parseMessage);
	}

	/**
	 * 
	 * @author Martin Fluegge
	 * 
	 */
	public static class ContactSchemaValidationException extends IS24ApiException {

		private static final long serialVersionUID = 1L;

		public ContactSchemaValidationException(Message parseMessage, Throwable throwable) {
			super(parseMessage.getMessageCode() + ": " + parseMessage.getMessage(), throwable);
		}
	}

	/**
	 * 
	 * @author Martin Fluegge
	 * 
	 */
	public static class ContactAlreadyExistsException extends IS24ApiException {

		private String conflictId;
		private static final long serialVersionUID = 1L;

		public ContactAlreadyExistsException(Message parseMessage, Throwable throwable) {

			super(parseMessage.getMessageCode() + ": " + parseMessage.getMessage(), throwable);
			parseConflictId(parseMessage);
		}

		private void parseConflictId(Message parseMessage) {
			try {
				String message = parseMessage.getMessage();

				String regex = ":[0-9]+\\]";
				// String regex = ".*";
				Pattern p = Pattern.compile(regex);
				Matcher m = p.matcher(message);

				if (m.find()) {
					conflictId = m.group(0).replace(":", "").replace("]", "");
				}
				System.out.println(message);
			} catch (ResultParsingException e) {
				throw e;
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}

		public ContactAlreadyExistsException(String message, Throwable throwable) {
			super(message, throwable);
		}

		public ContactAlreadyExistsException() {
			super();
		}

		public String getConflictId() {
			return conflictId;
		}

		public void setConflictId(String conflictId) {
			this.conflictId = conflictId;
		}
	}
}
