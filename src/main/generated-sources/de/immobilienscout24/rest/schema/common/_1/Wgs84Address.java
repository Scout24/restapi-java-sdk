//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.04.19 um 09:36:45 AM CEST 
//


package de.immobilienscout24.rest.schema.common._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Adresse erweitert mit WGS84 Geokoordinaten.
 * 
 * Definition der Basisfelder einer Adresse.
 * 
 * <p>Java-Klasse für Wgs84Address complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Wgs84Address">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/common/1.0}Address">
 *       &lt;sequence>
 *         &lt;element name="quarter" type="{http://rest.immobilienscout24.de/schema/common/1.0}TextField" minOccurs="0"/>
 *         &lt;element name="wgs84Coordinate" type="{http://rest.immobilienscout24.de/schema/common/1.0}Wgs84Coordinate" minOccurs="0"/>
 *         &lt;element name="preciseHouseNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="geoHierarchy" type="{http://rest.immobilienscout24.de/schema/common/1.0}GeoHierarchy" minOccurs="0"/>
 *         &lt;element name="description" type="{http://rest.immobilienscout24.de/schema/common/1.0}Wgs84AddressDescription" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Wgs84Address", propOrder = {
    "quarter",
    "wgs84Coordinate",
    "preciseHouseNumber",
    "geoHierarchy",
    "description"
})
public class Wgs84Address
    extends Address
{

    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String quarter;
    protected Wgs84Coordinate wgs84Coordinate;
    protected Boolean preciseHouseNumber;
    protected GeoHierarchy geoHierarchy;
    protected Wgs84AddressDescription description;

    /**
     * Ruft den Wert der quarter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuarter() {
        return quarter;
    }

    /**
     * Legt den Wert der quarter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuarter(String value) {
        this.quarter = value;
    }

    /**
     * Ruft den Wert der wgs84Coordinate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Wgs84Coordinate }
     *     
     */
    public Wgs84Coordinate getWgs84Coordinate() {
        return wgs84Coordinate;
    }

    /**
     * Legt den Wert der wgs84Coordinate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Wgs84Coordinate }
     *     
     */
    public void setWgs84Coordinate(Wgs84Coordinate value) {
        this.wgs84Coordinate = value;
    }

    /**
     * Ruft den Wert der preciseHouseNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreciseHouseNumber() {
        return preciseHouseNumber;
    }

    /**
     * Legt den Wert der preciseHouseNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreciseHouseNumber(Boolean value) {
        this.preciseHouseNumber = value;
    }

    /**
     * Ruft den Wert der geoHierarchy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeoHierarchy }
     *     
     */
    public GeoHierarchy getGeoHierarchy() {
        return geoHierarchy;
    }

    /**
     * Legt den Wert der geoHierarchy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoHierarchy }
     *     
     */
    public void setGeoHierarchy(GeoHierarchy value) {
        this.geoHierarchy = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Wgs84AddressDescription }
     *     
     */
    public Wgs84AddressDescription getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Wgs84AddressDescription }
     *     
     */
    public void setDescription(Wgs84AddressDescription value) {
        this.description = value;
    }

}
