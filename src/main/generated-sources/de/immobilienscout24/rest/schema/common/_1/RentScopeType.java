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
 * <p>Java-Klasse fr RentScopeType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RentScopeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NET_RENT"/>
 *     &lt;enumeration value="GROSS_RENT"/>
 *     &lt;enumeration value="INCONSISTENT_WARM_RENT"/>
 *     &lt;enumeration value="WARM_RENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RentScopeType")
@XmlEnum
public enum RentScopeType {


    /**
     * Netto Kaltmiete ohne irgendwelche Betriebskosten
     *                     
     * 
     */
    NET_RENT,

    /**
     * Netto Kaltmiete plus Betriebskosten Kalt
     * 
     */
    GROSS_RENT,

    /**
     * Netto Kaltmiete plus Betriebskosten Kalt und Warm, mit
     *                         Inkonsistenzen
     *                     
     * 
     */
    INCONSISTENT_WARM_RENT,

    /**
     * Netto Kaltmiete plus Betriebskosten Kalt und Warm
     *                     
     * 
     */
    WARM_RENT;

    public String value() {
        return name();
    }

    public static RentScopeType fromValue(String v) {
        return valueOf(v);
    }

}
