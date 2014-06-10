package de.is24.common.xml;

/**
 * needed for: producing only XML-valid characters in the XML responses. needed
 * because: real-estates-description fields in TERMS may contain characters in
 * an unexpected encoding.
 */
public class XmlSafeCharacterAdapter {
	public static String unmarshal(String value) {
		return value;
	}

	public static String marshal(String v) {
		if (v != null) {
			return stripOrTranslateNonValidXMLCharacters(v);
		} else {
			return null;
		}
	}

	private static String stripOrTranslateNonValidXMLCharacters(String in) {
		if (in == null || in.isEmpty()) {
			return "";
		}

		StringBuilder out = new StringBuilder();
		for (int i = 0; i < in.length(); i++) {
			char current = in.charAt(i);

			if (isSafeChar(current)) {
				out.append(current);
			} else { // we are very kind and will translate some unsafe
						// ISO-8859-1, CP1252 chars
				if (current == 0x80) { // EURO
					out.append('\u20AC');
				} else if (current == 0x84) { // double low quotation mark
					out.append('\u201E');
				} else if (current == 0x91) { // left single quotation mark
					out.append('\u2018');
				} else if (current == 0x92) { // right single quotation mark
					out.append('\u2019');
				} else if (current == 0x93) { // left double quotation mark
					out.append('\u201C');
				} else if (current == 0x94) { // right double quotation mark
					out.append('\u201D');
				} else if ((current == 0x96) || (current == 0x97)) { // simplify
																		// some
																		// variants
																		// of
																		// hyphens
																		// to
																		// minus
					out.append('-');
				}
			}
		}
		return out.toString();
	}

	private static boolean isSafeChar(char current) {
		return ( // OR expression for safe characters

				// single safe characters
				(current == 0x9) || (current == 0xA) || (current == 0xD) ||

				// safe character ranges
						((current >= 0x20) && (current <= 0x7F)) || // windows
																	// chars
																	// from 0x80
																	// to 0x9F
																	// are not
																	// always
																	// XML-safe
						((current >= 0xA0) && (current <= 0xD7FF)) || ((current >= 0xE000) && (current <= 0xFFFD)) || ((current >= 0x10000) && (current <= 0x10FFFF)))
				&&

				( // AND expression for forbidden characters

				// single invalid chracters
				(current != 0xBD) && (current != 0xBF) && (current != 0xEF));
	}
}
