//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.10.22 um 03:41:54 PM CEST 
//


package de.immobilienscout24.rest.schema.offer.listelement._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import de.immobilienscout24.rest.schema.common._1.BudgetPrice;
import de.immobilienscout24.rest.schema.common._1.CourtageInfo;
import de.immobilienscout24.rest.schema.common._1.Price;


/**
 * Eigenschaften fr den Haus-Miete Immobilientyp.
 * 
 * <p>Java-Klasse fr OfferHouseRent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OfferHouseRent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/offer/listelement/1.0}OfferRealEstateForList">
 *       &lt;sequence>
 *         &lt;group ref="{http://rest.immobilienscout24.de/schema/common/1.0}BaseHouseRentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferHouseRent", propOrder = {
    "price",
    "livingSpace",
    "plotArea",
    "numberOfRooms",
    "energyPerformanceCertificate",
    "courtage",
    "builtInKitchen",
    "calculatedPrice"
})
public class OfferHouseRent
    extends OfferRealEstateForList
{

    protected Price price;
    protected double livingSpace;
    protected double plotArea;
    protected double numberOfRooms;
    protected Boolean energyPerformanceCertificate;
    @XmlElement(required = true)
    protected CourtageInfo courtage;
    protected boolean builtInKitchen;
    protected BudgetPrice calculatedPrice;

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
     * Ruft den Wert der livingSpace-Eigenschaft ab.
     * 
     */
    public double getLivingSpace() {
        return livingSpace;
    }

    /**
     * Legt den Wert der livingSpace-Eigenschaft fest.
     * 
     */
    public void setLivingSpace(double value) {
        this.livingSpace = value;
    }

    /**
     * Ruft den Wert der plotArea-Eigenschaft ab.
     * 
     */
    public double getPlotArea() {
        return plotArea;
    }

    /**
     * Legt den Wert der plotArea-Eigenschaft fest.
     * 
     */
    public void setPlotArea(double value) {
        this.plotArea = value;
    }

    /**
     * Ruft den Wert der numberOfRooms-Eigenschaft ab.
     * 
     */
    public double getNumberOfRooms() {
        return numberOfRooms;
    }

    /**
     * Legt den Wert der numberOfRooms-Eigenschaft fest.
     * 
     */
    public void setNumberOfRooms(double value) {
        this.numberOfRooms = value;
    }

    /**
     * Ruft den Wert der energyPerformanceCertificate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnergyPerformanceCertificate() {
        return energyPerformanceCertificate;
    }

    /**
     * Legt den Wert der energyPerformanceCertificate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnergyPerformanceCertificate(Boolean value) {
        this.energyPerformanceCertificate = value;
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

    /**
     * Ruft den Wert der builtInKitchen-Eigenschaft ab.
     * 
     */
    public boolean isBuiltInKitchen() {
        return builtInKitchen;
    }

    /**
     * Legt den Wert der builtInKitchen-Eigenschaft fest.
     * 
     */
    public void setBuiltInKitchen(boolean value) {
        this.builtInKitchen = value;
    }

    /**
     * Ruft den Wert der calculatedPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BudgetPrice }
     *     
     */
    public BudgetPrice getCalculatedPrice() {
        return calculatedPrice;
    }

    /**
     * Legt den Wert der calculatedPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BudgetPrice }
     *     
     */
    public void setCalculatedPrice(BudgetPrice value) {
        this.calculatedPrice = value;
    }

}
