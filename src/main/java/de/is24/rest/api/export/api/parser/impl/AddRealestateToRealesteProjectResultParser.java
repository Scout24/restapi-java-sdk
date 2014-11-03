package de.is24.rest.api.export.api.parser.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jdom.Element;
import org.jdom.input.JDOMParseException;

/**
 * @author Martin Fluegge
 * 
 */
public class AddRealestateToRealesteProjectResultParser extends AbstractResultParser {

	@Override
	public String getResult(String response) {
		return null;
	}

	protected Message parseMessage(String response) {
		AddRealestateToProjectMessage message = new AddRealestateToProjectMessage();

		Element xmlRootElement;
		try {
			xmlRootElement = getXMLRootElement(response);

			Element messageElement = xmlRootElement.getChild("realEstateProjectEntry");

			if (messageElement != null) {

				message.setMessage(messageElement.getChild("message").getText());
				message.setMessageCode(messageElement.getChild("messageCode").getText());
				message.setRealEstateId(messageElement.getChild("realEstateId").getText());
				message.setRealEstateExternalId(messageElement.getChild("realEstateExternalId").getText());
			} else {
				return super.parseMessage(response);
			}

		} catch (JDOMParseException e) {
			// not parsable response
			message.setMessage(response);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		return message;
	}

	@Override
	protected void throwException(Throwable throwable, Message parseMessage) {

		if ("ERROR_RESOURCE_NOT_FOUND".equals(parseMessage.getMessageCode())) {

			String projectId = "";

			try {
				String regex = "\\[[0-9]+\\]";
				Pattern p = Pattern.compile(regex);
				Matcher m = p.matcher(parseMessage.getMessage());

				if (m.find()) {
					projectId = m.group(0).replace("[", "").replace("]", "");
				}
			} catch (Exception e) {
				// do not produce errors during error handling
				e.printStackTrace();
			}

			throw new ProjectNotFoundException(projectId);
		}

		super.throwException(throwable, parseMessage);
	}

	/**
	 * 
	 * @author Martin Fluegge
	 * 
	 */
	public static class AddRealestateToProjectMessage extends Message {

		private String realEstateId;
		private String realEstateExternalId;

		public String getRealEstateId() {
			return realEstateId;
		}

		public void setRealEstateId(String realEstateId) {
			this.realEstateId = realEstateId;
		}

		public String getRealEstateExternalId() {
			return realEstateExternalId;
		}

		public void setRealEstateExternalId(String realEstateExternalId) {
			this.realEstateExternalId = realEstateExternalId;
		}
	}
}
