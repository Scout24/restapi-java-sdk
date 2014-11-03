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
 * <p>Java-Klasse fr CompulsoryAuctionType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CompulsoryAuctionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FREEHOLD_FLAT"/>
 *     &lt;enumeration value="FAMILY_HOUSE"/>
 *     &lt;enumeration value="BUSINESS_AND_YIELD"/>
 *     &lt;enumeration value="LOT"/>
 *     &lt;enumeration value="GARAGE_AND_OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CompulsoryAuctionType")
@XmlEnum
public enum CompulsoryAuctionType {


    /**
     * Eigentumswohnungen
     * 
     */
    FREEHOLD_FLAT,

    /**
     *  1+2 Familienhuser
     * 
     */
    FAMILY_HOUSE,

    /**
     * Gewerbe + Rendite
     * 
     */
    BUSINESS_AND_YIELD,

    /**
     * Grundstcke
     * 
     */
    LOT,

    /**
     * Garagen + Sonstiges
     * 
     */
    GARAGE_AND_OTHER;

    public String value() {
        return name();
    }

    public static CompulsoryAuctionType fromValue(String v) {
        return valueOf(v);
    }

}
