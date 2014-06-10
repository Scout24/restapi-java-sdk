package de.is24.rest.api.export.api;

import de.is24.rest.api.export.api.impl.IS24ApiImpl.MultimediaType;

/**
 * 
 * @author Martin Fluegge
 * 
 */
public interface IMultimediaObject {

	public String getTitle();

	public void setTitle(String title);

	public MultimediaType getType();

	public String getAttachmentXml();
}