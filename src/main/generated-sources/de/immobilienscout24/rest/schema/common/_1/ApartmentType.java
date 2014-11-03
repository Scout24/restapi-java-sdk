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
 * <p>Java-Klasse fr ApartmentType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ApartmentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ROOF_STOREY"/>
 *     &lt;enumeration value="LOFT"/>
 *     &lt;enumeration value="MAISONETTE"/>
 *     &lt;enumeration value="PENTHOUSE"/>
 *     &lt;enumeration value="TERRACED_FLAT"/>
 *     &lt;enumeration value="GROUND_FLOOR"/>
 *     &lt;enumeration value="APARTMENT"/>
 *     &lt;enumeration value="RAISED_GROUND_FLOOR"/>
 *     &lt;enumeration value="HALF_BASEMENT"/>
 *     &lt;enumeration value="OTHER"/>
 *     &lt;enumeration value="NO_INFORMATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ApartmentType")
@XmlEnum
public enum ApartmentType {


    /**
     * Dachgeschoss
     * 
     */
    ROOF_STOREY,

    /**
     * Loft
     * 
     */
    LOFT,

    /**
     * Maisonette
     * 
     */
    MAISONETTE,

    /**
     * Penthouse
     * 
     */
    PENTHOUSE,

    /**
     * Terrassenwohnung
     * 
     */
    TERRACED_FLAT,

    /**
     * Erdgeschosswohnung
     * 
     */
    GROUND_FLOOR,

    /**
     * Etagenwohnung
     * 
     */
    APARTMENT,

    /**
     * Hochparterre
     * 
     */
    RAISED_GROUND_FLOOR,

    /**
     * Souterrain
     * 
     */
    HALF_BASEMENT,

    /**
     * Sonstige
     * 
     */
    OTHER,

    /**
     * Keine Angabe (wird zusammen mit OTHER verwendet)
     *                     
     * 
     */
    @Deprecated
    NO_INFORMATION;

    public String value() {
        return name();
    }

    public static ApartmentType fromValue(String v) {
        return valueOf(v);
    }

}
