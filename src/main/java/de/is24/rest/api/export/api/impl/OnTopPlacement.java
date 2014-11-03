package de.is24.rest.api.export.api.impl;

/**
 * 
 * @author Martin Fluegge
 * 
 */
public enum OnTopPlacement {
	SHOW_CASE("showcaseplacement"), PREMIUM("premiumplacement"), TOP("topplacement"), ALL("all");

	private String name;

	OnTopPlacement(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}