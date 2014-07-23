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
 * <p>Java-Klasse fr HouseTypeStageOfCompletionType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="HouseTypeStageOfCompletionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNSPECIFIED"/>
 *     &lt;enumeration value="CONSTRUCTIONKIT"/>
 *     &lt;enumeration value="UPGRADING"/>
 *     &lt;enumeration value="TURNKEYWITHCELLAR"/>
 *     &lt;enumeration value="TURNKEYWITHOUTFLOORSLAP"/>
 *     &lt;enumeration value="TURNKEYWITHFLOORSLAP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HouseTypeStageOfCompletionType")
@XmlEnum
public enum HouseTypeStageOfCompletionType {


    /**
     * nicht spezifiziert
     * 
     */
    UNSPECIFIED,

    /**
     * Bausatzhaus
     * 
     */
    CONSTRUCTIONKIT,

    /**
     * Ausbauhaus
     * 
     */
    UPGRADING,

    /**
     * Schlsselfertig mit Keller
     * 
     */
    TURNKEYWITHCELLAR,

    /**
     * Schlsselfertig ohne Bodenplatte
     * 
     */
    TURNKEYWITHOUTFLOORSLAP,

    /**
     * Schlsselfertig mit Bodenplatte
     * 
     */
    TURNKEYWITHFLOORSLAP;

    public String value() {
        return name();
    }

    public static HouseTypeStageOfCompletionType fromValue(String v) {
        return valueOf(v);
    }

}
