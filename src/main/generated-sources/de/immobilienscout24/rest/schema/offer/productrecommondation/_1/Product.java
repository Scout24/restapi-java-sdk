//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.11.05 um 11:50:50 AM CET 
//


package de.immobilienscout24.rest.schema.offer.productrecommondation._1;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für product complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="product">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="articleNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="priceRegion" type="{http://rest.immobilienscout24.de/schema/offer/productrecommondation/1.0}priceRegion"/>
 *         &lt;element name="maxRealEstates" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "product", propOrder = {
    "articleNumber",
    "price",
    "priceRegion",
    "maxRealEstates"
})
public class Product {

    @XmlElement(required = true)
    protected String articleNumber;
    @XmlElement(required = true)
    protected BigDecimal price;
    @XmlElement(required = true)
    protected PriceRegion priceRegion;
    @XmlElement(required = true)
    protected BigInteger maxRealEstates;

    /**
     * Ruft den Wert der articleNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArticleNumber() {
        return articleNumber;
    }

    /**
     * Legt den Wert der articleNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArticleNumber(String value) {
        this.articleNumber = value;
    }

    /**
     * Ruft den Wert der price-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Legt den Wert der price-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

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
     * Ruft den Wert der maxRealEstates-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxRealEstates() {
        return maxRealEstates;
    }

    /**
     * Legt den Wert der maxRealEstates-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxRealEstates(BigInteger value) {
        this.maxRealEstates = value;
    }

}
