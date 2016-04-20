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
 * <p>Java-Klasse für PriceType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PriceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RENT_PER_MONTH"/>
 *     &lt;enumeration value="RENT_PER_SQM"/>
 *     &lt;enumeration value="PURCHASE_PRICE"/>
 *     &lt;enumeration value="LEASE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PriceType")
@XmlEnum
public enum PriceType {


    /**
     * Miete pro Monat
     * 
     */
    RENT_PER_MONTH,

    /**
     * Miete pro Quadratmeter
     * 
     */
    RENT_PER_SQM,

    /**
     * Kaufpreis
     * 
     */
    PURCHASE_PRICE,

    /**
     * Pacht
     * 
     */
    LEASE;

    public String value() {
        return name();
    }

    public static PriceType fromValue(String v) {
        return valueOf(v);
    }

}
