package de.is24.rest.api.export.api.parser.impl;

import de.is24.rest.api.export.api.Is24Api;

/**
 * @author Martin Fluegge
 * 
 */
public class DeleteRealestateFromRealesteProjectResultParser extends AbstractRegExpResultParser {

	public String getRegExp() {
		return "\\[[0-9]+\\]";
	}

	@Override
	protected void throwException(Throwable throwable, Message parseMessage) {

		if (parseMessage != null && Is24Api.ERROR_RESOURCE_VALIDATION.equals(parseMessage.getMessageCode())) {

			if (parseMessage.getMessage() != null) {

				if (parseMessage.getMessage().contains("remove published realestate from project")) {
					throw new CannotRemovePublishedRealestateFromProjectException(parseMessage.getMessage(), throwable);
				}
			}
		}
		super.throwDefaultException(throwable);
	}

	public static class CannotRemovePublishedRealestateFromProjectException extends IS24ApiException {
		private static final long serialVersionUID = 1L;

		public CannotRemovePublishedRealestateFromProjectException(String message, Throwable throwable) {
			super(message, throwable);
		}

		public CannotRemovePublishedRealestateFromProjectException() {
			super();
		}
	}
}