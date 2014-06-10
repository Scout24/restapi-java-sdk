package de.is24.rest.api.export.api.parser.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Martin Fluegge
 * 
 */
public class GetCustomerNameResultParser extends AbstractResultParser {

	@Override
	public String getResult(String response) {
		String regex = "\"username\" : \"[a-zA-Z]+\"";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(response);

		if (m.find()) {
			return m.group(0).replace("\"username\" :", "").replace("\"", "").trim();
		}
		throw new RuntimeException("Could not parse response");
	}
}
