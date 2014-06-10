package de.is24.rest.api.export.api.parser.impl;

/**
 * @author Rene Boettge
 * 
 */
public class GeoCodingFailedException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public GeoCodingFailedException(String s) {
		super(s);
	}

	public GeoCodingFailedException(Throwable e) {
		super(e);
	}

	public GeoCodingFailedException(String message, Throwable e) {
		super(message, e);
	}
}
