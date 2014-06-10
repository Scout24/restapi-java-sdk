package de.is24.rest.api.export.api.parser.impl;

/**
 * @author Martin Fluegge
 * 
 */
public class ContactResultParsingException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ContactResultParsingException(String s) {
		super(s);
	}

	public ContactResultParsingException(Throwable e) {
		super(e);
	}
}
