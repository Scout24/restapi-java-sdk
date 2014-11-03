package de.is24.rest.api.export.api.parser.impl;

import de.is24.rest.api.export.api.Is24Api;

/**
 * @author Martin Fluegge
 * 
 */
public class OnTopProductResultParser extends AbstractResultParser {

	@Override
	public String getResult(String response) {
		// TODO parse for exception?
		return response;
	}

	protected void throwException(Throwable throwable, Message parseMessage) {

		if (parseMessage != null && Is24Api.ERROR_RESOURCE_VALIDATION.equals(parseMessage.getMessageCode())) {

			if (parseMessage.getMessage() != null) {
				if (parseMessage.getMessage().contains("No tally found to ontop realestate")) {
					throw new NoOnTopContingentAvailableException(parseMessage.getMessage(), throwable);
				} else if (parseMessage.getMessage().contains("Not allowed to perform ontop for unpublished realestate")) {
					throw new CouldNotPlaceOnTopOnUnpublishedObjectException(parseMessage.getMessage(), throwable);
				} else if (parseMessage.getMessage().contains("is already top placed")) {
					throw new ObjectIsAlreadyPlacedException(parseMessage.getMessage(), throwable);
				} else if (parseMessage.getMessage().contains("be deleted before")) {
					throw new ObjectCannotBeDeletedException(parseMessage.getMessage(), throwable);
				}
			}
		}

		throw new RuntimeException(parseMessage.getMessageCode() + ": " + parseMessage.getMessage(), throwable);
	}

	/**
	 * 
	 * @author Martin Fluegge
	 * 
	 */
	public static class NoOnTopContingentAvailableException extends IS24ApiException {

		private static final long serialVersionUID = 1L;

		public NoOnTopContingentAvailableException(String message, Throwable throwable) {
			super(message, throwable);
		}

		public NoOnTopContingentAvailableException() {
			super();
		}
	}

	/**
	 * 
	 * @author Martin Fluegge
	 * 
	 */
	public static class CouldNotPlaceOnTopOnUnpublishedObjectException extends IS24ApiException {

		private static final long serialVersionUID = 1L;

		public CouldNotPlaceOnTopOnUnpublishedObjectException(String message, Throwable throwable) {
			super(message, throwable);
		}

		public CouldNotPlaceOnTopOnUnpublishedObjectException() {
			super();
		}
	}

	/**
	 * 
	 * @author Martin Fluegge
	 * 
	 */
	public static class ObjectIsAlreadyPlacedException extends IS24ApiException {

		private static final long serialVersionUID = 1L;

		public ObjectIsAlreadyPlacedException(String message, Throwable throwable) {
			super(message, throwable);
		}

		public ObjectIsAlreadyPlacedException() {
			super();
		}
	}

	/**
	 * 
	 * @author Martin Fluegge
	 * 
	 */
	public static class ObjectCannotBeDeletedException extends IS24ApiException {

		private static final long serialVersionUID = 1L;

		public ObjectCannotBeDeletedException(String message, Throwable throwable) {
			super(message, throwable);
		}

		public ObjectCannotBeDeletedException() {
			super();
		}
	}
}
