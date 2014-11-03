package de.is24.rest.api.export.api.parser.impl;

import de.is24.rest.api.export.api.impl.IS24ApiImpl.AddAttachmentException;

/**
 * @author Martin Fluegge
 * 
 */
public class CreateAttachmentResultParser extends AbstractRegExpResultParser {

	public String getRegExp() {
		return "\\[[0-9]+\\]";
	}

	protected void throwException(Throwable throwable, Message parseMessage) {

		String message = parseMessage.getMessage();
		if (message != null && message.contains("The maximum number of attachments has been reached")) {
			throw new MaximumNumberOfAttachmentsReachedException(parseMessage, throwable);
		}

		throw new RuntimeException(parseMessage.getMessageCode() + ": " + parseMessage.getMessage(), throwable);
	}

	@Override
	protected void throwDefaultException(Throwable throwable) {

		throw new AddAttachmentException(throwable);
	}

	/**
	 * 
	 * @author Martin Fluegge
	 * 
	 */
	public static class MaximumNumberOfAttachmentsReachedException extends IS24ApiException {

		private static final long serialVersionUID = 1L;

		public MaximumNumberOfAttachmentsReachedException(Message parseMessage, Throwable throwable) {
			super(parseMessage.getMessageCode() + ": " + parseMessage.getMessage(), throwable);
		}
	}
}
