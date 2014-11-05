//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.11.05 um 11:03:21 AM CET 
//


package de.immobilienscout24.rest.schema.common._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für IndustryType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="IndustryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SHOWROOM_SPACE"/>
 *     &lt;enumeration value="HALL"/>
 *     &lt;enumeration value="HIGH_LACK_STORAGE"/>
 *     &lt;enumeration value="INDUSTRY_HALL"/>
 *     &lt;enumeration value="INDUSTRY_HALL_WITH_OPEN_AREA"/>
 *     &lt;enumeration value="COLD_STORAGE"/>
 *     &lt;enumeration value="MULTIDECK_CABINET_STORAGE"/>
 *     &lt;enumeration value="STORAGE_WITH_OPEN_AREA"/>
 *     &lt;enumeration value="STORAGE_AREA"/>
 *     &lt;enumeration value="STORAGE_HALL"/>
 *     &lt;enumeration value="SERVICE_AREA"/>
 *     &lt;enumeration value="SHIPPING_STORAGE"/>
 *     &lt;enumeration value="REPAIR_SHOP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IndustryType")
@XmlEnum
public enum IndustryType {


    /**
     * Ausstellungsfläche
     * 
     */
    SHOWROOM_SPACE,

    /**
     * Halle
     * 
     */
    HALL,

    /**
     * Hochregallager
     * 
     */
    HIGH_LACK_STORAGE,

    /**
     * Industriehalle
     * 
     */
    INDUSTRY_HALL,

    /**
     * Industriehalle mit Freifläche
     * 
     */
    INDUSTRY_HALL_WITH_OPEN_AREA,

    /**
     * Kühlhaus
     * 
     */
    COLD_STORAGE,

    /**
     * Kühlregallager
     * 
     */
    MULTIDECK_CABINET_STORAGE,

    /**
     * Lager mit Freifläche
     * 
     */
    STORAGE_WITH_OPEN_AREA,

    /**
     * Lagerfläche
     * 
     */
    STORAGE_AREA,

    /**
     * Lagerhalle
     * 
     */
    STORAGE_HALL,

    /**
     * Servicefläche
     * 
     */
    SERVICE_AREA,

    /**
     * Speditionslager
     * 
     */
    SHIPPING_STORAGE,

    /**
     * Werkstatt
     * 
     */
    REPAIR_SHOP;

    public String value() {
        return name();
    }

    public static IndustryType fromValue(String v) {
        return valueOf(v);
    }

}
