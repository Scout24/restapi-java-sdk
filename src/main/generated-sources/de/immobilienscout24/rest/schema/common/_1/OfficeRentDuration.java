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
 * <p>Java-Klasse fr OfficeRentDuration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="OfficeRentDuration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WEEKLY"/>
 *     &lt;enumeration value="MONTHLY"/>
 *     &lt;enumeration value="YEARLY"/>
 *     &lt;enumeration value="LONG_TERM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OfficeRentDuration")
@XmlEnum
public enum OfficeRentDuration {


    /**
     * wochenweise
     * 
     */
    WEEKLY,

    /**
     * monatsweise
     * 
     */
    MONTHLY,

    /**
     *  1 bis 2 Jahre
     * 
     */
    YEARLY,

    /**
     * langfristig
     * 
     */
    LONG_TERM;

    public String value() {
        return name();
    }

    public static OfficeRentDuration fromValue(String v) {
        return valueOf(v);
    }

}
