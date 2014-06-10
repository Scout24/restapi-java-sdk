package de.is24.rest.api.export.api.parser.impl;

/**
 * @author Martin Fluegge
 * 
 */
public class DeactivateRealestateResultParser extends CreateRealestateResultParser {
	protected String getRegExp() {
		return "\\[[0-9]+_[0-9]+\\]";
	}
}
