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
 * <p>Java-Klasse fr HouseTypeEnergyStandardType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="HouseTypeEnergyStandardType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNSPECIFIED"/>
 *     &lt;enumeration value="LOW_ENERGY_40"/>
 *     &lt;enumeration value="LOW_ENERGY_60"/>
 *     &lt;enumeration value="PASSIVE_HOUSE"/>
 *     &lt;enumeration value="ENERGY_EFFICIENT_40"/>
 *     &lt;enumeration value="ENERGY_EFFICIENT_55"/>
 *     &lt;enumeration value="ENERGY_EFFICIENT_70"/>
 *     &lt;enumeration value="LOW_ENERGY_HOUSE"/>
 *     &lt;enumeration value="NULL_ENERGY_HOUSE"/>
 *     &lt;enumeration value="PLUS_ENERGY_HOUSE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HouseTypeEnergyStandardType")
@XmlEnum
public enum HouseTypeEnergyStandardType {


    /**
     * nicht spezifiziert
     * 
     */
    UNSPECIFIED,

    /**
     * Niedrigenergiehaus KfW 40
     * 
     */
    LOW_ENERGY_40,

    /**
     * Niedriegenergiehaus KfW60
     * 
     */
    LOW_ENERGY_60,

    /**
     * Passivhaus
     * 
     */
    PASSIVE_HOUSE,

    /**
     * KfW-Effizienzhaus 40
     * 
     */
    ENERGY_EFFICIENT_40,

    /**
     * KfW-Effizienzhaus 55
     * 
     */
    ENERGY_EFFICIENT_55,

    /**
     * KfW-Effizienzhaus 70
     * 
     */
    ENERGY_EFFICIENT_70,

    /**
     * Niedrigenergiehaus
     * 
     */
    LOW_ENERGY_HOUSE,

    /**
     * Nullenergiehaus
     * 
     */
    NULL_ENERGY_HOUSE,

    /**
     * Plusenergiehaus
     * 
     */
    PLUS_ENERGY_HOUSE;

    public String value() {
        return name();
    }

    public static HouseTypeEnergyStandardType fromValue(String v) {
        return valueOf(v);
    }

}
