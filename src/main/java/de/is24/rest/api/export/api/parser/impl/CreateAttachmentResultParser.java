package de.is24.rest.api.export.api.parser.impl;

/**
 * @author Martin Fluegge
 * 
 */
public class CreateAttachmentResultParser extends AbstractRegExpResultParser {

	public String getRegExp() {
		return "\\[[0-9]+\\]";
	}
}
