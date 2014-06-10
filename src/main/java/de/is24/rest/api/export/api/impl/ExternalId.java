package de.is24.rest.api.export.api.impl;

/**
 * @author Martin Fluegge
 * 
 */
public class ExternalId extends AbstractId {

	public ExternalId(String id) {
		super(id);
	}

	@Override
	public String getId() {

		if (!id.startsWith("ext-")) {
			id = "ext-" + id;
		}
		return id;
	}
}
