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
 * Java-Klasse f�r CommercializationType.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="CommercializationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BUY"/>
 *     &lt;enumeration value="RENT"/>
 *     &lt;enumeration value="LEASE"/>
 *     &lt;enumeration value="LEASEHOLD"/>
 *     &lt;enumeration value="COMPULSORY_AUCTION"/>
 *     &lt;enumeration value="RENT_AND_BUY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CommercializationType")
@XmlEnum
public enum CommercializationType {

	/**
	 * Kauf
	 * 
	 */
	BUY,

	/**
	 * Miete
	 * 
	 */
	RENT,

	/**
	 * Pacht
	 * 
	 */
	LEASE,

	/**
	 * Erbpacht
	 * 
	 */
	LEASEHOLD,

	/**
	 * Zwangsversteigerung
	 * 
	 */
	COMPULSORY_AUCTION,

	/**
	 * Miete und Kauf
	 * 
	 */
	RENT_AND_BUY;

	public String value() {
		return name();
	}

	public static CommercializationType fromValue(String v) {
		return valueOf(v);
	}

}
