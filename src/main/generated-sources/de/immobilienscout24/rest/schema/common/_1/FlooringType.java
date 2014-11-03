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
 * <p>Java-Klasse fr FlooringType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="FlooringType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_INFORMATION"/>
 *     &lt;enumeration value="CONCRETE"/>
 *     &lt;enumeration value="EPOXY_RESIN"/>
 *     &lt;enumeration value="TILES"/>
 *     &lt;enumeration value="PLANKS"/>
 *     &lt;enumeration value="LAMINATE"/>
 *     &lt;enumeration value="PARQUET"/>
 *     &lt;enumeration value="PVC"/>
 *     &lt;enumeration value="CARPET"/>
 *     &lt;enumeration value="ANTISTATIC_FLOOR"/>
 *     &lt;enumeration value="OFFICE_CARPET"/>
 *     &lt;enumeration value="STONE"/>
 *     &lt;enumeration value="CUSTOMIZABLE"/>
 *     &lt;enumeration value="WITHOUT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FlooringType")
@XmlEnum
public enum FlooringType {


    /**
     * keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Beton
     * 
     */
    CONCRETE,

    /**
     * Epoxydharzboden
     * 
     */
    EPOXY_RESIN,

    /**
     * Fliesen
     * 
     */
    TILES,

    /**
     * Dielen
     * 
     */
    PLANKS,

    /**
     * Laminat
     * 
     */
    LAMINATE,

    /**
     * Parkett
     * 
     */
    PARQUET,

    /**
     * PVC
     * 
     */
    PVC,

    /**
     * Teppichboden
     * 
     */
    CARPET,

    /**
     * antistatischer Teppichboden
     * 
     */
    ANTISTATIC_FLOOR,

    /**
     * stuhlrollenfeste Teppichfliesen
     * 
     */
    OFFICE_CARPET,

    /**
     * Stein
     * 
     */
    STONE,

    /**
     * nach Mieterwunsch
     * 
     */
    CUSTOMIZABLE,

    /**
     * ohne Bodenbelag
     * 
     */
    WITHOUT;

    public String value() {
        return name();
    }

    public static FlooringType fromValue(String v) {
        return valueOf(v);
    }

}
