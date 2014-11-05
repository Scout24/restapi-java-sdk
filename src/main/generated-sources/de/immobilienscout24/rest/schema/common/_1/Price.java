//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.11.05 um 11:50:50 AM CET 
//


package de.immobilienscout24.rest.schema.common._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Basistyp für Preise.
 * 
 * <p>Java-Klasse für Price complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Price">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="currency" type="{http://rest.immobilienscout24.de/schema/common/1.0}Currency"/>
 *         &lt;element name="marketingType" type="{http://rest.immobilienscout24.de/schema/common/1.0}MarketingType" minOccurs="0"/>
 *         &lt;element name="priceIntervalType" type="{http://rest.immobilienscout24.de/schema/common/1.0}PriceIntervalType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Price", propOrder = {
    "value",
    "currency",
    "marketingType",
    "priceIntervalType"
})
@XmlSeeAlso({
    BudgetPrice.class
})
public class Price {

    protected double value;
    @XmlElement(required = true)
    protected Currency currency;
    protected MarketingType marketingType;
    protected PriceIntervalType priceIntervalType;

    /**
     * Ruft den Wert der value-Eigenschaft ab.
     * 
     */
    public double getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Ruft den Wert der currency-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     * Legt den Wert der currency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCurrency(Currency value) {
        this.currency = value;
    }

    /**
     * Ruft den Wert der marketingType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MarketingType }
     *     
     */
    public MarketingType getMarketingType() {
        return marketingType;
    }

    /**
     * Legt den Wert der marketingType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingType }
     *     
     */
    public void setMarketingType(MarketingType value) {
        this.marketingType = value;
    }

    /**
     * Ruft den Wert der priceIntervalType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PriceIntervalType }
     *     
     */
    public PriceIntervalType getPriceIntervalType() {
        return priceIntervalType;
    }

    /**
     * Legt den Wert der priceIntervalType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceIntervalType }
     *     
     */
    public void setPriceIntervalType(PriceIntervalType value) {
        this.priceIntervalType = value;
    }

}
