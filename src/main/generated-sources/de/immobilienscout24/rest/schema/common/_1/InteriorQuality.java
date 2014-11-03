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
 * <p>Java-Klasse fr InteriorQuality.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="InteriorQuality">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_INFORMATION"/>
 *     &lt;enumeration value="LUXURY"/>
 *     &lt;enumeration value="SOPHISTICATED"/>
 *     &lt;enumeration value="NORMAL"/>
 *     &lt;enumeration value="SIMPLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InteriorQuality")
@XmlEnum
public enum InteriorQuality {


    /**
     * Keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Luxus
     * 
     */
    LUXURY,

    /**
     * Gehoben
     * 
     */
    SOPHISTICATED,

    /**
     * Normal
     * 
     */
    NORMAL,

    /**
     * Einfach
     * 
     */
    SIMPLE;

    public String value() {
        return name();
    }

    public static InteriorQuality fromValue(String v) {
        return valueOf(v);
    }

}
