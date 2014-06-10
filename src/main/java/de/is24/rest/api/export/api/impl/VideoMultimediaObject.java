package de.is24.rest.api.export.api.impl;

import java.io.File;

import org.apache.commons.lang3.StringEscapeUtils;

import de.is24.rest.api.export.api.impl.IS24ApiImpl.MultimediaType;

/**
 * 
 * @author Martin Fluegge
 * 
 */
public class VideoMultimediaObject extends FileMultimediaObject {

	private String videoId;

	public VideoMultimediaObject() {
		super();
	}

	public VideoMultimediaObject(String title, File file) {
		setTitle(title);
		setFile(file);
	}

	@Override
	public MultimediaType getType() {
		return MultimediaType.VIDEO;
	}

	@Override
	public String getAttachmentXml() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>" + NL);
		buffer.append("<common:attachment xsi:type=\"common:StreamingVideo\" xmlns:common=\"http://rest.immobilienscout24.de/schema/common/1.0\" xmlns:ns3=\"http://rest.immobilienscout24.de/schema/platform/gis/1.0\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">"
				+ NL);
		buffer.append("<title>" + StringEscapeUtils.escapeXml(getTitle()) + "</title>" + NL);
		buffer.append("<videoId>" + videoId + "</videoId>" + NL);
		buffer.append("</common:attachment>");
		return buffer.toString();
	}

	public String getVideoId() {
		return videoId;
	}

	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}
}