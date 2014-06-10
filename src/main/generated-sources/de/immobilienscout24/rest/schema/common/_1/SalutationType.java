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
 * Java-Klasse f�r SalutationType.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="SalutationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FEMALE"/>
 *     &lt;enumeration value="MALE"/>
 *     &lt;enumeration value="COMPANY"/>
 *     &lt;enumeration value="NO_SALUTATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SalutationType")
@XmlEnum
public enum SalutationType {

	/**
	 * weibliche Anrede
	 * 
	 */
	FEMALE,

	/**
	 * m�nnnliche Anrede
	 * 
	 */
	MALE,

	/**
	 * Anrede f�r Firmen
	 * 
	 */
	COMPANY,

	/**
	 * Keine besondere Anrede.
	 * 
	 */
	NO_SALUTATION;

	public String value() {
		return name();
	}

	public static SalutationType fromValue(String v) {
		return valueOf(v);
	}

}
