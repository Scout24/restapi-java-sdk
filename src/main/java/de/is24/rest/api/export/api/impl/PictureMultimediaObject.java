package de.is24.rest.api.export.api.impl;

import java.io.File;

import org.apache.commons.lang3.StringEscapeUtils;

import de.is24.rest.api.export.api.impl.IS24ApiImpl.MultimediaType;

/**
 * 
 * @author Martin Fluegge
 * 
 */
public class PictureMultimediaObject extends FloorplanMultimediaObject {

	private boolean isTitlePicture;

	public PictureMultimediaObject() {
		super();
	}

	public PictureMultimediaObject(String title, File file, boolean isFloorplan, boolean istTitlePicture) {
		setTitle(title);
		setFloorplan(isFloorplan);
		setTitlePicture(istTitlePicture);
		setFile(file);
	}

	@Override
	public MultimediaType getType() {
		return MultimediaType.PICTURE;
	}

	public boolean isTitlePicture() {
		return isTitlePicture;
	}

	public void setTitlePicture(boolean isTitlePicture) {
		this.isTitlePicture = isTitlePicture;
	}

	@Override
	public String getAttachmentXml() {

		StringBuffer buffer = new StringBuffer();
		buffer.append("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>" + NL);
		buffer.append("<common:attachment xsi:type=\"common:Picture\" xmlns:common=\"http://rest.immobilienscout24.de/schema/common/1.0\" xmlns:ns3=\"http://rest.immobilienscout24.de/schema/platform/gis/1.0\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">"
				+ NL);
		buffer.append("<title>" + StringEscapeUtils.escapeXml(getTitle()) + "</title>" + NL);
		buffer.append("<floorplan>" + isFloorplan() + "</floorplan>" + NL);
		buffer.append("<titlePicture>" + isTitlePicture + "</titlePicture>" + NL);
		buffer.append("</common:attachment>");
		return buffer.toString();
	}
}