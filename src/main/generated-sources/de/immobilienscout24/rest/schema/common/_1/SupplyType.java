//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.06.23 um 09:51:43 AM CEST 
//


package de.immobilienscout24.rest.schema.common._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse fr SupplyType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SupplyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_INFORMATION"/>
 *     &lt;enumeration value="DIRECT_APPROACH"/>
 *     &lt;enumeration value="NO_DIRECT_APPROACH"/>
 *     &lt;enumeration value="CAR_APPROACH"/>
 *     &lt;enumeration value="APPROACH_TO_THE_FRONT"/>
 *     &lt;enumeration value="APPROACH_TO_THE_BACK"/>
 *     &lt;enumeration value="FULL_TIME"/>
 *     &lt;enumeration value="FORENOON"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SupplyType")
@XmlEnum
public enum SupplyType {


    /**
     * Keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Direkter Zugang
     * 
     */
    DIRECT_APPROACH,

    /**
     * Keine direkte Anfahrt
     * 
     */
    NO_DIRECT_APPROACH,

    /**
     * PKW-Zufahrt
     * 
     */
    CAR_APPROACH,

    /**
     * Anfahrt von vorne
     * 
     */
    APPROACH_TO_THE_FRONT,

    /**
     * Anfahrt von hinten
     * 
     */
    APPROACH_TO_THE_BACK,

    /**
     * Ganztgig
     * 
     */
    FULL_TIME,

    /**
     * Vormittags
     * 
     */
    FORENOON;

    public String value() {
        return name();
    }

    public static SupplyType fromValue(String v) {
        return valueOf(v);
    }

}
