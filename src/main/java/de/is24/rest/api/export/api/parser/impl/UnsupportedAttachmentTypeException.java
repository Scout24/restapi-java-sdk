package de.is24.rest.api.export.api.parser.impl;

import de.is24.rest.api.export.api.parser.impl.AbstractResultParser.Message;

public class UnsupportedAttachmentTypeException extends IS24ApiException {

	private static final long serialVersionUID = 1L;

	public UnsupportedAttachmentTypeException(Message parseMessage, Throwable throwable) {
		super(parseMessage.getMessageCode() + ": " + parseMessage.getMessage(), throwable);
	}
}