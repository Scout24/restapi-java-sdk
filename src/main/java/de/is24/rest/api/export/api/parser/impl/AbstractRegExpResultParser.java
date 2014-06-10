package de.is24.rest.api.export.api.parser.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Martin Fluegge
 * 
 */
public abstract class AbstractRegExpResultParser extends AbstractResultParser {

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

			throw new ResultParsingException("Unparsable content '" + content + "'");
		} catch (ResultParsingException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public abstract String getRegExp();
}
