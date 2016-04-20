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
 * <p>Java-Klasse für PriceIntervalType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PriceIntervalType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DAY"/>
 *     &lt;enumeration value="WEEK"/>
 *     &lt;enumeration value="MONTH"/>
 *     &lt;enumeration value="YEAR"/>
 *     &lt;enumeration value="ONE_TIME_CHARGE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PriceIntervalType")
@XmlEnum
public enum PriceIntervalType {


    /**
     * Zahlung pro Tag
     * 
     */
    DAY,

    /**
     * Zahlung pro Woche
     * 
     */
    WEEK,

    /**
     * Zahlung pro Monat
     * 
     */
    MONTH,

    /**
     * Zahlung pro Jahr
     * 
     */
    YEAR,

    /**
     * Einmalzahlung
     * 
     */
    ONE_TIME_CHARGE;

    public String value() {
        return name();
    }

    public static PriceIntervalType fromValue(String v) {
        return valueOf(v);
    }

}
