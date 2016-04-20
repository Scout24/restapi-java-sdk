//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.04.19 um 09:36:45 AM CEST 
//


package de.immobilienscout24.rest.schema.common._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse fr RoomType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RoomType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SINGLE"/>
 *     &lt;enumeration value="SHARED"/>
 *     &lt;enumeration value="SINGLE_AND_SHARED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoomType")
@XmlEnum
public enum RoomType {


    /**
     * Einzelzimmer
     *                     
     * 
     */
    SINGLE,

    /**
     * Mehrbettzimmer
     *                     
     * 
     */
    SHARED,

    /**
     * Einzel- und Mehrbettzimmer
     *                     
     * 
     */
    SINGLE_AND_SHARED;

    public String value() {
        return name();
    }

    public static RoomType fromValue(String v) {
        return valueOf(v);
    }

}
