package de.is24.rest.api.export.api.parser.impl;

import de.is24.rest.api.export.api.Is24Api;

/**
 * @author Martin Fluegge
 * 
 */
public class GetContactResultparser extends AbstractResultParser {

	@Override
	public String getResult(String response) {
		// TODO parse for exception?
		return response;
	}

	protected void throwException(Throwable throwable, Message parseMessage) {

		if (parseMessage != null && Is24Api.ERROR_RESOURCE_NOT_FOUND.equals(parseMessage.getMessageCode())) {
			throw new ContactDoesNotExistException(parseMessage.getMessageCode() + ": " + parseMessage.getMessage(), throwable);
		}

		throw new RuntimeException(parseMessage.getMessageCode() + ": " + parseMessage.getMessage(), throwable);
	}

	public static class ContactDoesNotExistException extends IS24ApiException {

		private static final long serialVersionUID = 1L;

		public ContactDoesNotExistException(String message, Throwable throwable) {
			super(message, throwable);
		}

		public ContactDoesNotExistException() {
			super();
		}
	}
}
