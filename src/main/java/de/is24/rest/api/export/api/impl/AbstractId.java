package de.is24.rest.api.export.api.impl;

import de.is24.rest.api.export.api.ObjectApi.ObjectId;

/**
 * @author Martin Fluegge
 * 
 */
public class AbstractId implements ObjectId {
	protected String id;

	public AbstractId(String id) {
		this.id = id;
	}

	@Override
	public String getId() {
		return id;
	}
}
