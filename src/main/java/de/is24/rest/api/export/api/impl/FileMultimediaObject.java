package de.is24.rest.api.export.api.impl;

import java.io.File;

/**
 * @author Martin Fluegge
 * 
 */
public abstract class FileMultimediaObject extends AbstractMultimediaObject {

	private File file;

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}
}
