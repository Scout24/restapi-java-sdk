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
 * <p>Java-Klasse fr EnergySourceEnev2014.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="EnergySourceEnev2014">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_INFORMATION"/>
 *     &lt;enumeration value="GEOTHERMAL"/>
 *     &lt;enumeration value="SOLAR_HEATING"/>
 *     &lt;enumeration value="PELLET_HEATING"/>
 *     &lt;enumeration value="GAS"/>
 *     &lt;enumeration value="OIL"/>
 *     &lt;enumeration value="DISTRICT_HEATING"/>
 *     &lt;enumeration value="ELECTRICITY"/>
 *     &lt;enumeration value="COAL"/>
 *     &lt;enumeration value="ACID_GAS"/>
 *     &lt;enumeration value="SOUR_GAS"/>
 *     &lt;enumeration value="LIQUID_GAS"/>
 *     &lt;enumeration value="STEAM_DISTRICT_HEATING"/>
 *     &lt;enumeration value="WOOD"/>
 *     &lt;enumeration value="WOOD_CHIPS"/>
 *     &lt;enumeration value="COAL_COKE"/>
 *     &lt;enumeration value="LOCAL_HEATING"/>
 *     &lt;enumeration value="HEAT_SUPPLY"/>
 *     &lt;enumeration value="BIO_ENERGY"/>
 *     &lt;enumeration value="WIND_ENERGY"/>
 *     &lt;enumeration value="HYDRO_ENERGY"/>
 *     &lt;enumeration value="ENVIRONMENTAL_THERMAL_ENERGY"/>
 *     &lt;enumeration value="COMBINED_HEAT_AND_POWER_FOSSIL_FUELS"/>
 *     &lt;enumeration value="COMBINED_HEAT_AND_POWER_RENEWABLE_ENERGY"/>
 *     &lt;enumeration value="COMBINED_HEAT_AND_POWER_REGENERATIVE_ENERGY"/>
 *     &lt;enumeration value="COMBINED_HEAT_AND_POWER_BIO_ENERGY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnergySourceEnev2014")
@XmlEnum
public enum EnergySourceEnev2014 {


    /**
     * Keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Erdwrme
     * 
     */
    GEOTHERMAL,

    /**
     * Solarheizung
     * 
     */
    SOLAR_HEATING,

    /**
     * Pelletheizung
     * 
     */
    PELLET_HEATING,

    /**
     * Gas
     * 
     */
    GAS,

    /**
     * l
     * 
     */
    OIL,

    /**
     * Fernwrme
     * 
     */
    DISTRICT_HEATING,

    /**
     * Strom
     * 
     */
    ELECTRICITY,

    /**
     * Kohle
     * 
     */
    COAL,

    /**
     * Erdgas leicht
     * 
     */
    ACID_GAS,

    /**
     * Erdgas schwer
     * 
     */
    SOUR_GAS,

    /**
     * Flssiggas
     * 
     */
    LIQUID_GAS,

    /**
     * Fernwrme Dampf
     * 
     */
    STEAM_DISTRICT_HEATING,

    /**
     * Holz
     * 
     */
    WOOD,

    /**
     * Holz-Hackschnitzel
     * 
     */
    WOOD_CHIPS,

    /**
     * Kohle/Koks
     * 
     */
    COAL_COKE,

    /**
     * Nahwrme
     * 
     */
    LOCAL_HEATING,

    /**
     * Wrmelieferung
     * 
     */
    HEAT_SUPPLY,

    /**
     * BIO Energie
     * 
     */
    BIO_ENERGY,

    /**
     * Windenergie
     * 
     */
    WIND_ENERGY,

    /**
     * Wasserenergie
     * 
     */
    HYDRO_ENERGY,

    /**
     * Umweltwrme
     * 
     */
    ENVIRONMENTAL_THERMAL_ENERGY,

    /**
     * KWK fossil
     * 
     */
    COMBINED_HEAT_AND_POWER_FOSSIL_FUELS,

    /**
     * KWK erneuerbar
     * 
     */
    COMBINED_HEAT_AND_POWER_RENEWABLE_ENERGY,

    /**
     * KWK regenerativ
     * 
     */
    COMBINED_HEAT_AND_POWER_REGENERATIVE_ENERGY,

    /**
     * KWK bio
     * 
     */
    COMBINED_HEAT_AND_POWER_BIO_ENERGY;

    public String value() {
        return name();
    }

    public static EnergySourceEnev2014 fromValue(String v) {
        return valueOf(v);
    }

}
