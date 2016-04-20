//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.04.19 um 09:36:45 AM CEST 
//


package de.immobilienscout24.rest.schema.common._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TvConnectionType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TvConnectionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_INFORMATION"/>
 *     &lt;enumeration value="CABLE"/>
 *     &lt;enumeration value="SATELLITE"/>
 *     &lt;enumeration value="CABLE_AND_SATELLITE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TvConnectionType")
@XmlEnum
public enum TvConnectionType {


    /**
     * Keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Kabel
     * 
     */
    CABLE,

    /**
     * Satellit
     * 
     */
    SATELLITE,

    /**
     * Kabel und Satellit
     * 
     */
    CABLE_AND_SATELLITE;

    public String value() {
        return name();
    }

    public static TvConnectionType fromValue(String v) {
        return valueOf(v);
    }

}
