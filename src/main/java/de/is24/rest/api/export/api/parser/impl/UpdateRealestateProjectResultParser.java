package de.is24.rest.api.export.api.parser.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Martin Fluegge
 * 
 */
public class UpdateRealestateProjectResultParser extends CreateRealestateResultParser {

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

			throw new ContactResultParsingException("Unparsable content " + content);
		} catch (ContactResultParsingException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String getRegExp() {
		return "\\[[a-zA-Z0-9]+\\]";
	}
}
