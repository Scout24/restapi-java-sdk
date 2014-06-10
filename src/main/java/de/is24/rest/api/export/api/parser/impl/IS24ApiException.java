package de.is24.rest.api.export.api.parser.impl;

/**
 * @author Martin Fluegge
 * 
 */
public class IS24ApiException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public IS24ApiException(String message, Throwable throwable) {
		super(message, throwable);
	}

	public IS24ApiException() {
		super();
	}
}
