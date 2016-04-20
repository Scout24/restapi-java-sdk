//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.04.19 um 09:36:45 AM CEST 
//


package de.immobilienscout24.rest.schema.offer.realestatestock._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für priceRegionRealEstateStock complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="priceRegionRealEstateStock">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="priceRegion" type="{http://rest.immobilienscout24.de/schema/offer/realestatestock/1.0}priceRegion"/>
 *         &lt;element name="realestateCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "priceRegionRealEstateStock", propOrder = {
    "priceRegion",
    "realestateCount"
})
public class PriceRegionRealEstateStock {

    @XmlElement(required = true)
    protected PriceRegion priceRegion;
    @XmlElement(defaultValue = "0")
    protected int realestateCount;

    /**
     * Ruft den Wert der priceRegion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PriceRegion }
     *     
     */
    public PriceRegion getPriceRegion() {
        return priceRegion;
    }

    /**
     * Legt den Wert der priceRegion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRegion }
     *     
     */
    public void setPriceRegion(PriceRegion value) {
        this.priceRegion = value;
    }

    /**
     * Ruft den Wert der realestateCount-Eigenschaft ab.
     * 
     */
    public int getRealestateCount() {
        return realestateCount;
    }

    /**
     * Legt den Wert der realestateCount-Eigenschaft fest.
     * 
     */
    public void setRealestateCount(int value) {
        this.realestateCount = value;
    }

}
