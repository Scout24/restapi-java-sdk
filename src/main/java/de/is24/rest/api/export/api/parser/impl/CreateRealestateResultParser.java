package de.is24.rest.api.export.api.parser.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import de.is24.rest.api.export.api.Is24Api;

/**
 * @author Martin Fluegge
 * @author Rene Boettge
 * 
 */
public class CreateRealestateResultParser extends AbstractResultParser {

	@Override
	public String getResult(String response) {
		try {

			Message message = parseMessage(response);

			String content = message.getMessage();

			String regex = getRegExp();
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(content);

			if (m.find()) {
				/*
				 * it is possible to find two suitable entries because two
				 * different response strings
				 * 
				 * Resource [realestate] with id [(externalId) test_bla] has
				 * been deleted.
				 * 
				 * Resource [realestate] with id [1234567] has been deleted.
				 */
				String idWithoutBrackets = m.group(0).replace("[", "").replace("]", "");
				return idWithoutBrackets.replaceAll("\\(externalId\\) ", "ext-");
			}

			throw new RealestateResultParsingException("Unparsable content " + content);
		} catch (RealestateResultParsingException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String getRegExp() {
		// TODO: which characters are allowed for external id?
		// return
		// "(?!\\[realestate\\])\\[(?:\\(externalId\\) )?[0-9a-zA-Z-_ /]+\\]";
		return "(?!\\[realestate\\])\\[(?:\\(externalId\\) )?.+\\]";
	}

	protected void throwException(Throwable throwable, Message parseMessage) {

		if (parseMessage != null && Is24Api.ERROR_GEOCODING_FAILED.equals(parseMessage.getMessageCode())) {
			throw new GeoCodingFailedException(parseMessage.getMessageCode() + ": " + parseMessage.getMessage(), throwable);
		}

		super.throwException(throwable, parseMessage);
	}
}
