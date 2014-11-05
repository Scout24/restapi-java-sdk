//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.11.05 um 11:03:21 AM CET 
//


package de.immobilienscout24.rest.schema.common._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ContactFormType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ContactFormType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EMAIL"/>
 *     &lt;enumeration value="LONG"/>
 *     &lt;enumeration value="PHONE"/>
 *     &lt;enumeration value="NONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContactFormType")
@XmlEnum
public enum ContactFormType {


    /**
     * E-Mail-Kontaktformular (Schnellkontakt)
     * 
     */
    EMAIL,

    /**
     * Ausfuehrliches Kontaktformular
     * 
     */
    LONG,

    /**
     * Telefon-Kontaktformular
     * 
     */
    PHONE,

    /**
     * Zeigt an, dass kein Kontaktformular sinnvoll angezeigt werden
     *                         kann, z.B. da der Anbieter zwar Kontaktaufnahme per E-Mail wuenscht, aber selbst keine
     *                         E-Mail-Adresse angegeben hat.
     *                     
     * 
     */
    NONE;

    public String value() {
        return name();
    }

    public static ContactFormType fromValue(String v) {
        return valueOf(v);
    }

}
