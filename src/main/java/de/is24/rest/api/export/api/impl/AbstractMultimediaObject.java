package de.is24.rest.api.export.api.impl;

import de.is24.rest.api.export.api.IMultimediaObject;

/**
 * @author Martin Fluegge
 * 
 */
public abstract class AbstractMultimediaObject implements IMultimediaObject {

	private String title;
	protected String NL = System.getProperty("line.separator");

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public void setTitle(String title) {

		if (title == null) {
			title = "Kein Titel";
		}

		if (title.length() > 30) {
			throw new AttachmentTitleTooLongException("The title must not contain more than 30 characters.", title);
		}

		this.title = title;
	}

	/**
	 * 
	 * @author Martin Fluegge
	 * 
	 */
	public static class AttachmentTitleTooLongException extends RuntimeException {

		private static final long serialVersionUID = 1L;
		private String title;

		public AttachmentTitleTooLongException(String message, String title) {
			super(message);
			this.title = title;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}
	}
}
