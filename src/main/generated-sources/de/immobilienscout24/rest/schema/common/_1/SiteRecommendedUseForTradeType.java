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
 * Java-Klasse f�r SiteRecommendedUseForTradeType.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="SiteRecommendedUseForTradeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_INFORMATION"/>
 *     &lt;enumeration value="FARMLAND"/>
 *     &lt;enumeration value="FUTURE_DEVELOPMENT_LAND"/>
 *     &lt;enumeration value="MOORAGE"/>
 *     &lt;enumeration value="OFFICE"/>
 *     &lt;enumeration value="CAMPING"/>
 *     &lt;enumeration value="BIG_STORE"/>
 *     &lt;enumeration value="LITTLE_STORE"/>
 *     &lt;enumeration value="GARAGE"/>
 *     &lt;enumeration value="GARDEN"/>
 *     &lt;enumeration value="GASTRONOMY"/>
 *     &lt;enumeration value="BUSINESS"/>
 *     &lt;enumeration value="HOTEL"/>
 *     &lt;enumeration value="INDUSTRY"/>
 *     &lt;enumeration value="NO_DEVELOPMENT"/>
 *     &lt;enumeration value="SMALL_BUSINESS"/>
 *     &lt;enumeration value="STOCK"/>
 *     &lt;enumeration value="ORCHARD"/>
 *     &lt;enumeration value="CAR_PARK"/>
 *     &lt;enumeration value="PRODUCTION"/>
 *     &lt;enumeration value="PARKING_SPACE"/>
 *     &lt;enumeration value="FORREST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SiteRecommendedUseForTradeType")
@XmlEnum
public enum SiteRecommendedUseForTradeType {

	/**
	 * keine Angabe
	 * 
	 */
	NO_INFORMATION,

	/**
	 * Ackerland
	 * 
	 */
	FARMLAND,

	/**
	 * Bauerwartungsland
	 * 
	 */
	FUTURE_DEVELOPMENT_LAND,

	/**
	 * Bootsstand
	 * 
	 */
	MOORAGE,

	/**
	 * B�ro
	 * 
	 */
	OFFICE,

	/**
	 * Camping
	 * 
	 */
	CAMPING,

	/**
	 * Einzelhandel - gro�
	 * 
	 */
	BIG_STORE,

	/**
	 * Einzelhandel - klein
	 * 
	 */
	LITTLE_STORE,

	/**
	 * Garage
	 * 
	 */
	GARAGE,

	/**
	 * Garten
	 * 
	 */
	GARDEN,

	/**
	 * Gastronomie
	 * 
	 */
	GASTRONOMY,

	/**
	 * Gewerbe
	 * 
	 */
	BUSINESS,

	/**
	 * Hotel
	 * 
	 */
	HOTEL,

	/**
	 * Industrie
	 * 
	 */
	INDUSTRY,

	/**
	 * Keine Bebauung
	 * 
	 */
	NO_DEVELOPMENT,

	/**
	 * Kleingewerbe
	 * 
	 */
	SMALL_BUSINESS,

	/**
	 * Lager
	 * 
	 */
	STOCK,

	/**
	 * Obstpflanzung
	 * 
	 */
	ORCHARD,

	/**
	 * Parkhaus
	 * 
	 */
	CAR_PARK,

	/**
	 * Produktion
	 * 
	 */
	PRODUCTION,

	/**
	 * Stellpl�tze
	 * 
	 */
	PARKING_SPACE,

	/**
	 * Wald
	 * 
	 */
	FORREST;

	public String value() {
		return name();
	}

	public static SiteRecommendedUseForTradeType fromValue(String v) {
		return valueOf(v);
	}

}
