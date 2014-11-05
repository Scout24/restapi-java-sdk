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
 * <p>Java-Klasse für StoreType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="StoreType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SHOWROOM_SPACE"/>
 *     &lt;enumeration value="SHOPPING_CENTRE"/>
 *     &lt;enumeration value="FACTORY_OUTLET"/>
 *     &lt;enumeration value="DEPARTMENT_STORE"/>
 *     &lt;enumeration value="KIOSK"/>
 *     &lt;enumeration value="STORE"/>
 *     &lt;enumeration value="SELF_SERVICE_MARKET"/>
 *     &lt;enumeration value="SALES_AREA"/>
 *     &lt;enumeration value="SALES_HALL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StoreType")
@XmlEnum
public enum StoreType {


    /**
     * Ausstellungsfläche
     * 
     */
    SHOWROOM_SPACE,

    /**
     * Einkaufszentrum
     * 
     */
    SHOPPING_CENTRE,

    /**
     * Factory Outlet
     * 
     */
    FACTORY_OUTLET,

    /**
     * Kaufhaus
     * 
     */
    DEPARTMENT_STORE,

    /**
     * Kiosk
     * 
     */
    KIOSK,

    /**
     * Laden
     * 
     */
    STORE,

    /**
     * SB-Markt
     * 
     */
    SELF_SERVICE_MARKET,

    /**
     * Verkaufsfläche
     * 
     */
    SALES_AREA,

    /**
     * Verkaufshalle
     * 
     */
    SALES_HALL;

    public String value() {
        return name();
    }

    public static StoreType fromValue(String v) {
        return valueOf(v);
    }

}
