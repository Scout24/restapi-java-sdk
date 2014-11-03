//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.10.22 um 03:41:54 PM CEST 
//


package de.immobilienscout24.rest.schema.common._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse fr OfficeType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
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
     * Bro
     * 
     */
    OFFICE,

    /**
     * Broetage
     * 
     */
    OFFICE_FLOOR,

    /**
     * Brohaus
     * 
     */
    OFFICE_BUILDING,

    /**
     * Brozentrum
     * 
     */
    OFFICE_CENTRE,

    /**
     * Bro-/ Lagergebude
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
     * Wohn- und Geschftsgebude
     * 
     */
    LIVING_AND_COMMERCIAL_BUILDING,

    /**
     * Bro- und Geschftsgebude
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
