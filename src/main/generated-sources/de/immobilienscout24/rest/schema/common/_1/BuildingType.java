//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.11.05 um 11:50:50 AM CET 
//


package de.immobilienscout24.rest.schema.common._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für BuildingType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="BuildingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_INFORMATION"/>
 *     &lt;enumeration value="SINGLE_FAMILY_HOUSE"/>
 *     &lt;enumeration value="MID_TERRACE_HOUSE"/>
 *     &lt;enumeration value="END_TERRACE_HOUSE"/>
 *     &lt;enumeration value="MULTI_FAMILY_HOUSE"/>
 *     &lt;enumeration value="BUNGALOW"/>
 *     &lt;enumeration value="FARMHOUSE"/>
 *     &lt;enumeration value="SEMIDETACHED_HOUSE"/>
 *     &lt;enumeration value="VILLA"/>
 *     &lt;enumeration value="CASTLE_MANOR_HOUSE"/>
 *     &lt;enumeration value="SPECIAL_REAL_ESTATE"/>
 *     &lt;enumeration value="TERRACE_HOUSE"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BuildingType")
@XmlEnum
public enum BuildingType {


    /**
     * Keine Angabe (wird zusammen mit OTHER verwendet)
     *                     
     * 
     */
    @Deprecated
    NO_INFORMATION,

    /**
     * Einfamilienhaus (freistehend)
     * 
     */
    SINGLE_FAMILY_HOUSE,

    /**
     * Reihenmittelhaus
     * 
     */
    MID_TERRACE_HOUSE,

    /**
     * Reiheneckhaus
     * 
     */
    END_TERRACE_HOUSE,

    /**
     * Mehrfamilienhaus
     * 
     */
    MULTI_FAMILY_HOUSE,

    /**
     * Bungalow
     * 
     */
    BUNGALOW,

    /**
     * Bauernhaus
     * 
     */
    FARMHOUSE,

    /**
     * Doppelhaushälfte
     * 
     */
    SEMIDETACHED_HOUSE,

    /**
     * Villa
     * 
     */
    VILLA,

    /**
     * Burg/Schloss
     * 
     */
    CASTLE_MANOR_HOUSE,

    /**
     * Besondere Immobilie
     * 
     */
    SPECIAL_REAL_ESTATE,

    /**
     * Reihenhaus
     * 
     */
    TERRACE_HOUSE,

    /**
     * Wohnimmobilie (sonstige)
     * 
     */
    OTHER;

    public String value() {
        return name();
    }

    public static BuildingType fromValue(String v) {
        return valueOf(v);
    }

}
