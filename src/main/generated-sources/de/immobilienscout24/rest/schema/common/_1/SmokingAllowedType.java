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
 * <p>Java-Klasse für SmokingAllowedType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SmokingAllowedType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_INFORMATION"/>
 *     &lt;enumeration value="ALLOWED"/>
 *     &lt;enumeration value="UNWANTED"/>
 *     &lt;enumeration value="OWN_ROOM_ONLY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SmokingAllowedType")
@XmlEnum
public enum SmokingAllowedType {


    /**
     * Keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Erlaubt
     * 
     */
    ALLOWED,

    /**
     * Unerwünscht
     * 
     */
    UNWANTED,

    /**
     * Nur im eigenem Zimmer
     * 
     */
    OWN_ROOM_ONLY;

    public String value() {
        return name();
    }

    public static SmokingAllowedType fromValue(String v) {
        return valueOf(v);
    }

}
