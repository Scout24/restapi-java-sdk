package de.is24.rest.api.export.api.parser.impl;

/**
 * @author Rene Boettge
 * 
 */
public class RealestateResultParsingException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public RealestateResultParsingException(String s) {
		super(s);
	}

	public RealestateResultParsingException(Throwable e) {
		super(e);
	}
}
