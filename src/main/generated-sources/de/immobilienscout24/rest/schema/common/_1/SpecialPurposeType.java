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
 * <p>Java-Klasse fr SpecialPurposeType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SpecialPurposeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RESIDENCE"/>
 *     &lt;enumeration value="FARM"/>
 *     &lt;enumeration value="HORSE_FARM"/>
 *     &lt;enumeration value="VINEYARD"/>
 *     &lt;enumeration value="REPAIR_SHOP"/>
 *     &lt;enumeration value="LEISURE_FACILITY"/>
 *     &lt;enumeration value="INDUSTRIAL_AREA"/>
 *     &lt;enumeration value="SPECIAL_ESTATE"/>
 *     &lt;enumeration value="COMMERCIAL_CENTRE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SpecialPurposeType")
@XmlEnum
public enum SpecialPurposeType {


    /**
     * Anwesen
     * 
     */
    RESIDENCE,

    /**
     * Bauernhof
     * 
     */
    FARM,

    /**
     * Reiterhof
     * 
     */
    HORSE_FARM,

    /**
     * Weingut
     * 
     */
    VINEYARD,

    /**
     * Werkstatt
     * 
     */
    REPAIR_SHOP,

    /**
     * Freizeitanlage
     * 
     */
    LEISURE_FACILITY,

    /**
     * Gewerbeflche
     * 
     */
    INDUSTRIAL_AREA,

    /**
     * Spezialobjekt
     * 
     */
    SPECIAL_ESTATE,

    /**
     * Gewerbepark
     * 
     */
    COMMERCIAL_CENTRE;

    public String value() {
        return name();
    }

    public static SpecialPurposeType fromValue(String v) {
        return valueOf(v);
    }

}
