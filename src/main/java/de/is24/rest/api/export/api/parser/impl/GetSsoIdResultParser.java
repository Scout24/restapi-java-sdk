package de.is24.rest.api.export.api.parser.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Martin Fluegge
 * 
 */
public class GetSsoIdResultParser extends AbstractResultParser {

	@Override
	public String getResult(String response) {
		System.out.println(response);
		String regex = "\"ssoId\" : [0-9]+";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(response);

		if (m.find()) {
			return m.group(0).replace("\"ssoId\" :", "").replace("\"", "").trim();
		}
		throw new RuntimeException("Could not parse response");
	}
}
