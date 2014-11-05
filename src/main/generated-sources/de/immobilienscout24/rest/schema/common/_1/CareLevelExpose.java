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
 * <p>Java-Klasse für CareLevelExpose.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CareLevelExpose">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CARE_LEVEL_1"/>
 *     &lt;enumeration value="CARE_LEVEL_2"/>
 *     &lt;enumeration value="CARE_LEVEL_3"/>
 *     &lt;enumeration value="CARE_LEVEL_1_AND_2"/>
 *     &lt;enumeration value="CARE_LEVEL_2_AND_3"/>
 *     &lt;enumeration value="ALL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CareLevelExpose")
@XmlEnum
public enum CareLevelExpose {


    /**
     * Pflegestufe 1
     *                     
     * 
     */
    CARE_LEVEL_1,

    /**
     * Pflegestufe 2
     *                     
     * 
     */
    CARE_LEVEL_2,

    /**
     * Pflegestufe 3
     *                     
     * 
     */
    CARE_LEVEL_3,

    /**
     * Pflegestufen 1 und 2
     *                     
     * 
     */
    CARE_LEVEL_1_AND_2,

    /**
     * Pflegestufen 2 und 3
     *                     
     * 
     */
    CARE_LEVEL_2_AND_3,

    /**
     * Alle Pflegestufen
     *                     
     * 
     */
    ALL;

    public String value() {
        return name();
    }

    public static CareLevelExpose fromValue(String v) {
        return valueOf(v);
    }

}
