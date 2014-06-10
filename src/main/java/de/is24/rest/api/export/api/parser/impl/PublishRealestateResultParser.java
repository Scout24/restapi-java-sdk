package de.is24.rest.api.export.api.parser.impl;

/**
 * @author Martin Fluegge
 * 
 */
public class PublishRealestateResultParser extends AbstractResultParser {

	/**
	 * Subclasses may overwrite thos method to throw different exceptions
	 * 
	 * @param throwable
	 * @param parseMessage
	 */
	protected void throwException(Throwable throwable, Message parseMessage) {

		String message = parseMessage.getMessage();
		if (message != null && (message.contains("No automatic booking enabled") || message.contains("No contingent available"))) {
			throw new PublicLimitExceededException(parseMessage.getMessageCode() + ": " + parseMessage.getMessage(), throwable);
		}

		throw new RuntimeException(parseMessage.getMessageCode() + ": " + parseMessage.getMessage(), throwable);
	}

	@Override
	public String getResult(String response) {
		return response;
	}

	/**
	 * 
	 * @author Martin Fluegge
	 * 
	 */
	public static class PublicLimitExceededException extends RuntimeException {

		private static final long serialVersionUID = 1L;

		public PublicLimitExceededException(String message, Throwable throwable) {
			super(message, throwable);
		}
	}
}
