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
 * Java-Klasse f�r OfficeType.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="OfficeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LOFT"/>
 *     &lt;enumeration value="STUDIO"/>
 *     &lt;enumeration value="OFFICE"/>
 *     &lt;enumeration value="OFFICE_FLOOR"/>
 *     &lt;enumeration value="OFFICE_BUILDING"/>
 *     &lt;enumeration value="OFFICE_CENTRE"/>
 *     &lt;enumeration value="OFFICE_STORAGE_BUILDING"/>
 *     &lt;enumeration value="SURGERY"/>
 *     &lt;enumeration value="SURGERY_FLOOR"/>
 *     &lt;enumeration value="SURGERY_BUILDING"/>
 *     &lt;enumeration value="COMMERCIAL_CENTRE"/>
 *     &lt;enumeration value="LIVING_AND_COMMERCIAL_BUILDING"/>
 *     &lt;enumeration value="OFFICE_AND_COMMERCIAL_BUILDING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OfficeType")
@XmlEnum
public enum OfficeType {

	/**
	 * Loft
	 * 
	 */
	LOFT,

	/**
	 * Atelier
	 * 
	 */
	STUDIO,

	/**
	 * B�ro
	 * 
	 */
	OFFICE,

	/**
	 * B�roetage
	 * 
	 */
	OFFICE_FLOOR,

	/**
	 * B�rohaus
	 * 
	 */
	OFFICE_BUILDING,

	/**
	 * B�rozentrum
	 * 
	 */
	OFFICE_CENTRE,

	/**
	 * B�ro-/ Lagergeb�ude
	 * 
	 */
	OFFICE_STORAGE_BUILDING,

	/**
	 * Praxis
	 * 
	 */
	SURGERY,

	/**
	 * Praxisetage
	 * 
	 */
	SURGERY_FLOOR,

	/**
	 * Praxishaus
	 * 
	 */
	SURGERY_BUILDING,

	/**
	 * Gewerbezentrum
	 * 
	 */
	COMMERCIAL_CENTRE,

	/**
	 * Wohn- und Gesch�ftsgeb�ude
	 * 
	 */
	LIVING_AND_COMMERCIAL_BUILDING,

	/**
	 * B�ro- und Gesch�ftsgeb�ude
	 * 
	 */
	OFFICE_AND_COMMERCIAL_BUILDING;

	public String value() {
		return name();
	}

	public static OfficeType fromValue(String v) {
		return valueOf(v);
	}

}
