package de.is24.rest.api.export.api.parser.impl;

/**
 * @author Martin Fluegge
 * 
 */
public class ResultParsingException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ResultParsingException(String s) {
		super(s);
	}

	public ResultParsingException(Throwable e) {
		super(e);
	}
}
