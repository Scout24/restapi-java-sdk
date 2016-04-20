//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.04.19 um 09:36:45 AM CEST 
//


package de.immobilienscout24.rest.schema.common._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Die Geo-Hierarchie-Informationen.
 * 
 * <p>Java-Klasse fr GeoHierarchy complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GeoHierarchy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="continent" type="{http://rest.immobilienscout24.de/schema/common/1.0}Continent" minOccurs="0"/>
 *         &lt;element name="country" type="{http://rest.immobilienscout24.de/schema/common/1.0}Country"/>
 *         &lt;element name="region" type="{http://rest.immobilienscout24.de/schema/common/1.0}Region"/>
 *         &lt;element name="city" type="{http://rest.immobilienscout24.de/schema/common/1.0}City"/>
 *         &lt;element name="quarter" type="{http://rest.immobilienscout24.de/schema/common/1.0}Quarter"/>
 *         &lt;element name="neighbourhood" type="{http://rest.immobilienscout24.de/schema/common/1.0}Neighbourhood" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoHierarchy", propOrder = {
    "continent",
    "country",
    "region",
    "city",
    "quarter",
    "neighbourhood"
})
public class GeoHierarchy {

    protected Continent continent;
    @XmlElement(required = true)
    protected Country country;
    @XmlElement(required = true)
    protected Region region;
    @XmlElement(required = true)
    protected City city;
    @XmlElement(required = true)
    protected Quarter quarter;
    protected Neighbourhood neighbourhood;

    /**
     * Ruft den Wert der continent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Continent }
     *     
     */
    public Continent getContinent() {
        return continent;
    }

    /**
     * Legt den Wert der continent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Continent }
     *     
     */
    public void setContinent(Continent value) {
        this.continent = value;
    }

    /**
     * Ruft den Wert der country-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getCountry() {
        return country;
    }

    /**
     * Legt den Wert der country-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setCountry(Country value) {
        this.country = value;
    }

    /**
     * Ruft den Wert der region-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Region }
     *     
     */
    public Region getRegion() {
        return region;
    }

    /**
     * Legt den Wert der region-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Region }
     *     
     */
    public void setRegion(Region value) {
        this.region = value;
    }

    /**
     * Ruft den Wert der city-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link City }
     *     
     */
    public City getCity() {
        return city;
    }

    /**
     * Legt den Wert der city-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link City }
     *     
     */
    public void setCity(City value) {
        this.city = value;
    }

    /**
     * Ruft den Wert der quarter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Quarter }
     *     
     */
    public Quarter getQuarter() {
        return quarter;
    }

    /**
     * Legt den Wert der quarter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Quarter }
     *     
     */
    public void setQuarter(Quarter value) {
        this.quarter = value;
    }

    /**
     * Ruft den Wert der neighbourhood-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Neighbourhood }
     *     
     */
    public Neighbourhood getNeighbourhood() {
        return neighbourhood;
    }

    /**
     * Legt den Wert der neighbourhood-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Neighbourhood }
     *     
     */
    public void setNeighbourhood(Neighbourhood value) {
        this.neighbourhood = value;
    }

}
