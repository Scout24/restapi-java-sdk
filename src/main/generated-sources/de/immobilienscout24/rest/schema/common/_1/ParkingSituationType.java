//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.04.11 um 01:54:30 PM CEST 
//

package de.immobilienscout24.rest.schema.common._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse f�r ParkingSituationType.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="ParkingSituationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_INFORMATION"/>
 *     &lt;enumeration value="GOOD"/>
 *     &lt;enumeration value="BAD"/>
 *     &lt;enumeration value="RESIDENT_PARKING"/>
 *     &lt;enumeration value="OWN_PARKING_SPACE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParkingSituationType")
@XmlEnum
public enum ParkingSituationType {

	/**
	 * Keine Angabe
	 * 
	 */
	NO_INFORMATION,

	/**
	 * Gut
	 * 
	 */
	GOOD,

	/**
	 * schlecht
	 * 
	 */
	BAD,

	/**
	 * Anwohnerparkplatz verf�gbar
	 * 
	 */
	RESIDENT_PARKING,

	/**
	 * eigener Parkplatz verf�gbar
	 * 
	 */
	OWN_PARKING_SPACE;

	public String value() {
		return name();
	}

	public static ParkingSituationType fromValue(String v) {
		return valueOf(v);
	}

}
