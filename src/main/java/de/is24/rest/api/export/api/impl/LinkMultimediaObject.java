package de.is24.rest.api.export.api.impl;

import org.apache.commons.lang3.StringEscapeUtils;

import de.is24.rest.api.export.api.impl.IS24ApiImpl.MultimediaType;

/**
 * 
 * @author Martin Fluegge
 * 
 */
public class LinkMultimediaObject extends AbstractMultimediaObject {

	private String link;

	public LinkMultimediaObject(String title, String link) {
		setLink(link);
		setTitle(title);
	}

	@Override
	public MultimediaType getType() {
		return MultimediaType.LINK;
	}

	@Override
	public String getAttachmentXml() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>" + NL);
		buffer.append("<common:attachment xsi:type=\"common:Link\" xmlns:common=\"http://rest.immobilienscout24.de/schema/common/1.0\" xmlns:ns3=\"http://rest.immobilienscout24.de/schema/platform/gis/1.0\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">"
				+ NL);
		buffer.append("<title>" + StringEscapeUtils.escapeXml(getTitle()) + "</title>" + NL);
		buffer.append("<url>" + encode(getLink()) + "</url>" + NL);
		buffer.append("</common:attachment>");
		return buffer.toString();
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) { this.link=link; }

	private String encode(String link) {
		return StringEscapeUtils.escapeXml(link);
	}
}
