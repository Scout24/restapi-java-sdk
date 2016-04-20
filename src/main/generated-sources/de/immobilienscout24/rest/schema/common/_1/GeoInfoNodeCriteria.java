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
 * Liste der IS24 Geo-Ids.
 * 
 * <p>Java-Klasse für GeoInfoNodeCriteria complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GeoInfoNodeCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="continentId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="countryId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="regionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cityId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="districtId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="label" type="{http://rest.immobilienscout24.de/schema/common/1.0}TextField" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoInfoNodeCriteria", propOrder = {

})
public class GeoInfoNodeCriteria {

    protected long continentId;
    protected long countryId;
    protected Long regionId;
    protected Long cityId;
    protected Long districtId;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String label;

    /**
     * Ruft den Wert der continentId-Eigenschaft ab.
     * 
     */
    public long getContinentId() {
        return continentId;
    }

    /**
     * Legt den Wert der continentId-Eigenschaft fest.
     * 
     */
    public void setContinentId(long value) {
        this.continentId = value;
    }

    /**
     * Ruft den Wert der countryId-Eigenschaft ab.
     * 
     */
    public long getCountryId() {
        return countryId;
    }

    /**
     * Legt den Wert der countryId-Eigenschaft fest.
     * 
     */
    public void setCountryId(long value) {
        this.countryId = value;
    }

    /**
     * Ruft den Wert der regionId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRegionId() {
        return regionId;
    }

    /**
     * Legt den Wert der regionId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRegionId(Long value) {
        this.regionId = value;
    }

    /**
     * Ruft den Wert der cityId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCityId() {
        return cityId;
    }

    /**
     * Legt den Wert der cityId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCityId(Long value) {
        this.cityId = value;
    }

    /**
     * Ruft den Wert der districtId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDistrictId() {
        return districtId;
    }

    /**
     * Legt den Wert der districtId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDistrictId(Long value) {
        this.districtId = value;
    }

    /**
     * Ruft den Wert der label-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Legt den Wert der label-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

}
