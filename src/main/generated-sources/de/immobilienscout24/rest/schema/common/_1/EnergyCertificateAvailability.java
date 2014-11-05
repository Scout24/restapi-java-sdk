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
 * <p>Java-Klasse für EnergyCertificateAvailability.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="EnergyCertificateAvailability">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AVAILABLE"/>
 *     &lt;enumeration value="NOT_AVAILABLE_YET"/>
 *     &lt;enumeration value="NOT_REQUIRED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnergyCertificateAvailability")
@XmlEnum
public enum EnergyCertificateAvailability {


    /**
     * vorhanden
     * 
     */
    AVAILABLE,

    /**
     * noch nicht vorhanden
     * 
     */
    NOT_AVAILABLE_YET,

    /**
     * nicht notwendig
     * 
     */
    NOT_REQUIRED;

    public String value() {
        return name();
    }

    public static EnergyCertificateAvailability fromValue(String v) {
        return valueOf(v);
    }

}
