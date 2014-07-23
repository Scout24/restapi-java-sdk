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
 * <p>Java-Klasse fr SiteConstructibleType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SiteConstructibleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONSTRUCTIONPLAN"/>
 *     &lt;enumeration value="NEIGHBOURCONSTRUCTION"/>
 *     &lt;enumeration value="EXTERNALAREA"/>
 *     &lt;enumeration value="NO_INFORMATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SiteConstructibleType")
@XmlEnum
public enum SiteConstructibleType {


    /**
     * Bebauungsplan
     * 
     */
    CONSTRUCTIONPLAN,

    /**
     * wie Nachbarbebauung
     * 
     */
    NEIGHBOURCONSTRUCTION,

    /**
     * Aussengebiet
     * 
     */
    EXTERNALAREA,

    /**
     * Keine Angabe
     * 
     */
    NO_INFORMATION;

    public String value() {
        return name();
    }

    public static SiteConstructibleType fromValue(String v) {
        return valueOf(v);
    }

}
