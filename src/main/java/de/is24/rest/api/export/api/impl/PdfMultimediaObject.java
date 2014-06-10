package de.is24.rest.api.export.api.impl;

import java.io.File;

import org.apache.commons.lang3.StringEscapeUtils;

import de.is24.rest.api.export.api.impl.IS24ApiImpl.MultimediaType;

/**
 * 
 * @author Martin Fluegge
 * 
 */
public class PdfMultimediaObject extends FloorplanMultimediaObject {
	@Override
	public MultimediaType getType() {
		return MultimediaType.PDF;
	}

	public PdfMultimediaObject() {
		super();
	}

	public PdfMultimediaObject(String title, File file, boolean isFloorplan) {
		setTitle(title);
		setFloorplan(isFloorplan);
		setFile(file);
	}

	@Override
	public String getAttachmentXml() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>" + NL);
		buffer.append("<common:attachment xsi:type=\"common:PDFDocument\" xmlns:common=\"http://rest.immobilienscout24.de/schema/common/1.0\" xmlns:ns3=\"http://rest.immobilienscout24.de/schema/platform/gis/1.0\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">"
				+ NL);
		buffer.append("<title>" + StringEscapeUtils.escapeXml(getTitle()) + "</title>" + NL);
		buffer.append("<floorplan>" + isFloorplan() + "</floorplan>" + NL);
		buffer.append("</common:attachment>");
		String string = buffer.toString();

		System.out.println(string);
		return string;
	}
}