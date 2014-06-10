//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.04.11 um 01:54:30 PM CEST 
//

package de.immobilienscout24.rest.schema.common._1;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1 extends XmlAdapter<String, String> {

	public String unmarshal(String value) {
		return (de.is24.common.xml.XmlSafeCharacterAdapter.unmarshal(value));
	}

	public String marshal(String value) {
		return (de.is24.common.xml.XmlSafeCharacterAdapter.marshal(value));
	}

}
