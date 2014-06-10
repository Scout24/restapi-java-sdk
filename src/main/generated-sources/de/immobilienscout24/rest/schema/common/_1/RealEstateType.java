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
 * Java-Klasse f�r RealEstateType.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="RealEstateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="APARTMENT_RENT"/>
 *     &lt;enumeration value="APARTMENT_BUY"/>
 *     &lt;enumeration value="HOUSE_RENT"/>
 *     &lt;enumeration value="HOUSE_BUY"/>
 *     &lt;enumeration value="GARAGE_RENT"/>
 *     &lt;enumeration value="GARAGE_BUY"/>
 *     &lt;enumeration value="LIVING_RENT_SITE"/>
 *     &lt;enumeration value="LIVING_BUY_SITE"/>
 *     &lt;enumeration value="TRADE_SITE"/>
 *     &lt;enumeration value="HOUSE_TYPE"/>
 *     &lt;enumeration value="FLAT_SHARE_ROOM"/>
 *     &lt;enumeration value="SENIOR_CARE"/>
 *     &lt;enumeration value="ASSISTED_LIVING"/>
 *     &lt;enumeration value="OFFICE"/>
 *     &lt;enumeration value="INDUSTRY"/>
 *     &lt;enumeration value="STORE"/>
 *     &lt;enumeration value="GASTRONOMY"/>
 *     &lt;enumeration value="SPECIAL_PURPOSE"/>
 *     &lt;enumeration value="INVESTMENT"/>
 *     &lt;enumeration value="COMPULSORY_AUCTION"/>
 *     &lt;enumeration value="SHORT_TERM_ACCOMMODATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RealEstateType")
@XmlEnum
public enum RealEstateType {

	/**
	 * Mietwohnung
	 * 
	 */
	APARTMENT_RENT,

	/**
	 * Wohnung zum Kauf
	 * 
	 */
	APARTMENT_BUY,

	/**
	 * Haus zur Miete
	 * 
	 */
	HOUSE_RENT,

	/**
	 * Haus zum Kauf
	 * 
	 */
	HOUSE_BUY,

	/**
	 * Garage zur Miete
	 * 
	 */
	GARAGE_RENT,

	/**
	 * Garage zum Kauf
	 * 
	 */
	GARAGE_BUY,

	/**
	 * Wohngrundst�ck zur Miete
	 * 
	 */
	LIVING_RENT_SITE,

	/**
	 * Wohngrundst�ck zum Kauf
	 * 
	 */
	LIVING_BUY_SITE,

	/**
	 * Gewerbegrundst�ck
	 * 
	 */
	TRADE_SITE,

	/**
	 * Typenhaus
	 * 
	 */
	HOUSE_TYPE,

	/**
	 * WG-Zimmer
	 * 
	 */
	FLAT_SHARE_ROOM,

	/**
	 * Altenpflege
	 * 
	 */
	SENIOR_CARE,

	/**
	 * Seniorenwohnen
	 * 
	 */
	ASSISTED_LIVING,

	/**
	 * B�ro und Praxis
	 * 
	 */
	OFFICE,

	/**
	 * Halle und Produktion
	 * 
	 */
	INDUSTRY,

	/**
	 * Einzelhandel
	 * 
	 */
	STORE,

	/**
	 * Gastronomie und Hotel
	 * 
	 */
	GASTRONOMY,

	/**
	 * Spezialgewerbe
	 * 
	 */
	SPECIAL_PURPOSE,

	/**
	 * Anlageimmobilie
	 * 
	 */
	INVESTMENT,

	/**
	 * Zwangsversteigerung
	 * 
	 */
	COMPULSORY_AUCTION,

	/**
	 * Wohnen auf Zeit (WAZ)
	 * 
	 */
	SHORT_TERM_ACCOMMODATION;

	public String value() {
		return name();
	}

	public static RealEstateType fromValue(String v) {
		return valueOf(v);
	}

}
