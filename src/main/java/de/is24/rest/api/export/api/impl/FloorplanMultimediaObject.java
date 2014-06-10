package de.is24.rest.api.export.api.impl;

/**
 * @author Martin Fluegge
 * 
 */
public abstract class FloorplanMultimediaObject extends FileMultimediaObject {
	private boolean isFloorplan;

	public boolean isFloorplan() {
		return isFloorplan;
	}

	public void setFloorplan(boolean isFloorplan) {
		this.isFloorplan = isFloorplan;
	}
}
