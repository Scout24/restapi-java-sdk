//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.04.19 um 09:36:45 AM CEST 
//


package de.immobilienscout24.rest.schema.realestate.counts._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="is24publishedRealEstatesCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="is24notPublishedRealEstatesCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="homepagePublishedRealEstatesCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="marketPlacePublishedRealEstatesCount" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>long">
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "is24PublishedRealEstatesCount",
    "is24NotPublishedRealEstatesCount",
    "homepagePublishedRealEstatesCount",
    "marketPlacePublishedRealEstatesCount"
})
@XmlRootElement(name = "realEstateCounts")
public class RealEstateCounts {

    @XmlElement(name = "is24publishedRealEstatesCount")
    protected long is24PublishedRealEstatesCount;
    @XmlElement(name = "is24notPublishedRealEstatesCount")
    protected long is24NotPublishedRealEstatesCount;
    protected Long homepagePublishedRealEstatesCount;
    protected List<RealEstateCounts.MarketPlacePublishedRealEstatesCount> marketPlacePublishedRealEstatesCount;

    /**
     * Ruft den Wert der is24PublishedRealEstatesCount-Eigenschaft ab.
     * 
     */
    public long getIs24PublishedRealEstatesCount() {
        return is24PublishedRealEstatesCount;
    }

    /**
     * Legt den Wert der is24PublishedRealEstatesCount-Eigenschaft fest.
     * 
     */
    public void setIs24PublishedRealEstatesCount(long value) {
        this.is24PublishedRealEstatesCount = value;
    }

    /**
     * Ruft den Wert der is24NotPublishedRealEstatesCount-Eigenschaft ab.
     * 
     */
    public long getIs24NotPublishedRealEstatesCount() {
        return is24NotPublishedRealEstatesCount;
    }

    /**
     * Legt den Wert der is24NotPublishedRealEstatesCount-Eigenschaft fest.
     * 
     */
    public void setIs24NotPublishedRealEstatesCount(long value) {
        this.is24NotPublishedRealEstatesCount = value;
    }

    /**
     * Ruft den Wert der homepagePublishedRealEstatesCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHomepagePublishedRealEstatesCount() {
        return homepagePublishedRealEstatesCount;
    }

    /**
     * Legt den Wert der homepagePublishedRealEstatesCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHomepagePublishedRealEstatesCount(Long value) {
        this.homepagePublishedRealEstatesCount = value;
    }

    /**
     * Gets the value of the marketPlacePublishedRealEstatesCount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketPlacePublishedRealEstatesCount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarketPlacePublishedRealEstatesCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RealEstateCounts.MarketPlacePublishedRealEstatesCount }
     * 
     * 
     */
    public List<RealEstateCounts.MarketPlacePublishedRealEstatesCount> getMarketPlacePublishedRealEstatesCount() {
        if (marketPlacePublishedRealEstatesCount == null) {
            marketPlacePublishedRealEstatesCount = new ArrayList<RealEstateCounts.MarketPlacePublishedRealEstatesCount>();
        }
        return this.marketPlacePublishedRealEstatesCount;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>long">
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class MarketPlacePublishedRealEstatesCount {

        @XmlValue
        protected long value;
        @XmlAttribute(name = "name", required = true)
        protected String name;

        /**
         * Ruft den Wert der value-Eigenschaft ab.
         * 
         */
        public long getValue() {
            return value;
        }

        /**
         * Legt den Wert der value-Eigenschaft fest.
         * 
         */
        public void setValue(long value) {
            this.value = value;
        }

        /**
         * Ruft den Wert der name-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Legt den Wert der name-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

    }

}
