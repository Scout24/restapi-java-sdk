package de.is24.rest.api.export.api.parser.impl;

import java.io.IOException;
import java.io.StringReader;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dom4j.DocumentException;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.JDOMParseException;
import org.jdom.input.SAXBuilder;

import de.is24.rest.api.export.api.ObjectApi.IResultParser;

/**
 * @author Martin Fluegge
 * 
 */
public abstract class AbstractResultParser implements IResultParser {

	private static final Log LOG = LogFactory.getLog(AbstractResultParser.class);

	protected Element getXMLRootElement(String response) throws JDOMException, IOException, DocumentException {

		LOG.info("Response:" + response);

		SAXBuilder builder = new SAXBuilder();
		org.jdom.Document doc = builder.build(new StringReader(new String(response.getBytes(), "UTF-8")));

		return doc.getRootElement();
	}

	public abstract String getResult(String response);

	/**
	 * Handles the Exception thrown when invoking a request. Returns the error
	 * code and the detailed message provided by the server as an exception.
	 * Subclasses can override it to provide more detailed messages or
	 * exceptions.
	 */
	@Override
	public void handleException(Throwable throwable, String errorResponse) {

		Message parseMessage;
		if (errorResponse != null) {
			parseMessage = parseMessage(errorResponse);
			throwException(throwable, parseMessage);
		} else {
			throw new RuntimeException(throwable);
		}
	}

	/**
	 * Subclasses may overwrite thos method to throw different exceptions
	 * 
	 * @param throwable
	 * @param parseMessage
	 */
	protected void throwException(Throwable throwable, Message parseMessage) {
		throw new RuntimeException(parseMessage.getMessageCode() + ": " + parseMessage.getMessage(), throwable);
	}

	/**
	 * Parses the response and creates a message object.
	 * 
	 * @param response
	 * @return
	 */
	protected Message parseMessage(String response) {
		Message message = new Message();

		Element xmlRootElement;
		try {
			xmlRootElement = getXMLRootElement(response);
			Element messageElement = xmlRootElement.getChild("message");

			message.setMessage(messageElement.getChild("message").getText());
			message.setMessageCode(messageElement.getChild("messageCode").getText());

		} catch (JDOMParseException e) {
			// not parsable response
			message.setMessage(response);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		return message;
	}

	/**
	 * 
	 * @author Martin Fluegge
	 * 
	 */
	public static class Message {

		private int returnCode;
		private String messageCode;
		private String message;

		public int getReturnCode() {
			return returnCode;
		}

		public void setReturnCode(int returnCode) {
			this.returnCode = returnCode;
		}

		public String getMessageCode() {
			return messageCode;
		}

		public void setMessageCode(String messageCode) {
			this.messageCode = messageCode;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
	}
}
