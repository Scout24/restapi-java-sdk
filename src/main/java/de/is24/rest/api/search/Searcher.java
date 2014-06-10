package de.is24.rest.api.search;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Martin Fluegge
 * 
 *         TODO better us a generated class from the specific wsdl
 */
@XmlRootElement(name = "searcher")
public class Searcher {

	private String id;

	@XmlAttribute(name = "id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
