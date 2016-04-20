//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.04.19 um 09:36:45 AM CEST 
//


package de.immobilienscout24.rest.schema.offer.listelement._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import de.immobilienscout24.rest.schema.common._1.CommercializationType;
import de.immobilienscout24.rest.schema.common._1.CourtageInfo;
import de.immobilienscout24.rest.schema.common._1.Price;


/**
 * Elemente für Gewerbe-Objekte.
 * 
 * <p>Java-Klasse für OfferIndustry complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OfferIndustry">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/offer/listelement/1.0}OfferRealEstateForList">
 *       &lt;group ref="{http://rest.immobilienscout24.de/schema/common/1.0}BaseIndustryGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferIndustry", propOrder = {
    "commercializationType",
    "price",
    "calculatedPrice",
    "totalFloorSpace",
    "netFloorSpace",
    "minDivisible",
    "courtage"
})
public class OfferIndustry
    extends OfferRealEstateForList
{

    @XmlElement(required = true)
    protected CommercializationType commercializationType;
    @XmlElement(required = true)
    protected Price price;
    protected Price calculatedPrice;
    protected Double totalFloorSpace;
    protected Double netFloorSpace;
    protected Double minDivisible;
    @XmlElement(required = true)
    protected CourtageInfo courtage;

    /**
     * Ruft den Wert der commercializationType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CommercializationType }
     *     
     */
    public CommercializationType getCommercializationType() {
        return commercializationType;
    }

    /**
     * Legt den Wert der commercializationType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CommercializationType }
     *     
     */
    public void setCommercializationType(CommercializationType value) {
        this.commercializationType = value;
    }

    /**
     * Ruft den Wert der price-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getPrice() {
        return price;
    }

    /**
     * Legt den Wert der price-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setPrice(Price value) {
        this.price = value;
    }

    /**
     * Ruft den Wert der calculatedPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getCalculatedPrice() {
        return calculatedPrice;
    }

    /**
     * Legt den Wert der calculatedPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setCalculatedPrice(Price value) {
        this.calculatedPrice = value;
    }

    /**
     * Ruft den Wert der totalFloorSpace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalFloorSpace() {
        return totalFloorSpace;
    }

    /**
     * Legt den Wert der totalFloorSpace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalFloorSpace(Double value) {
        this.totalFloorSpace = value;
    }

    /**
     * Ruft den Wert der netFloorSpace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNetFloorSpace() {
        return netFloorSpace;
    }

    /**
     * Legt den Wert der netFloorSpace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNetFloorSpace(Double value) {
        this.netFloorSpace = value;
    }

    /**
     * Ruft den Wert der minDivisible-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinDivisible() {
        return minDivisible;
    }

    /**
     * Legt den Wert der minDivisible-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinDivisible(Double value) {
        this.minDivisible = value;
    }

    /**
     * Ruft den Wert der courtage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CourtageInfo }
     *     
     */
    public CourtageInfo getCourtage() {
        return courtage;
    }

    /**
     * Legt den Wert der courtage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CourtageInfo }
     *     
     */
    public void setCourtage(CourtageInfo value) {
        this.courtage = value;
    }

}
