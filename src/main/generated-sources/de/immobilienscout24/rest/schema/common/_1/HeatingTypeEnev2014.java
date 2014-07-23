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
 * <p>Java-Klasse fr HeatingTypeEnev2014.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="HeatingTypeEnev2014">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_INFORMATION"/>
 *     &lt;enumeration value="SELF_CONTAINED_CENTRAL_HEATING"/>
 *     &lt;enumeration value="STOVE_HEATING"/>
 *     &lt;enumeration value="CENTRAL_HEATING"/>
 *     &lt;enumeration value="COMBINED_HEAT_AND_POWER_PLANT"/>
 *     &lt;enumeration value="ELECTRIC_HEATING"/>
 *     &lt;enumeration value="DISTRICT_HEATING"/>
 *     &lt;enumeration value="FLOOR_HEATING"/>
 *     &lt;enumeration value="GAS_HEATING"/>
 *     &lt;enumeration value="WOOD_PELLET_HEATING"/>
 *     &lt;enumeration value="NIGHT_STORAGE_HEATER"/>
 *     &lt;enumeration value="OIL_HEATING"/>
 *     &lt;enumeration value="SOLAR_HEATING"/>
 *     &lt;enumeration value="HEAT_PUMP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HeatingTypeEnev2014")
@XmlEnum
public enum HeatingTypeEnev2014 {


    /**
     * keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Etagenheizung
     * 
     */
    SELF_CONTAINED_CENTRAL_HEATING,

    /**
     * Ofenheizung
     * 
     */
    STOVE_HEATING,

    /**
     * Zentralheizung
     * 
     */
    CENTRAL_HEATING,

    /**
     * Blockheizkraftwerk
     * 
     */
    COMBINED_HEAT_AND_POWER_PLANT,

    /**
     * Elektro-Heizung
     * 
     */
    ELECTRIC_HEATING,

    /**
     * Fernwrmedampf
     * 
     */
    DISTRICT_HEATING,

    /**
     * Fubodenheizung
     * 
     */
    FLOOR_HEATING,

    /**
     * Gas-Heizung
     * 
     */
    GAS_HEATING,

    /**
     * Holz-Pelletheizung
     * 
     */
    WOOD_PELLET_HEATING,

    /**
     * Nachtspeicherofen
     * 
     */
    NIGHT_STORAGE_HEATER,

    /**
     * lheizung
     * 
     */
    OIL_HEATING,

    /**
     * Solar-Heizung
     * 
     */
    SOLAR_HEATING,

    /**
     * Wrmepumpe
     * 
     */
    HEAT_PUMP;

    public String value() {
        return name();
    }

    public static HeatingTypeEnev2014 fromValue(String v) {
        return valueOf(v);
    }

}
