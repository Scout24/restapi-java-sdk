//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.11.05 um 11:50:50 AM CET 
//


package de.immobilienscout24.rest.schema.offer.listelement._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import de.immobilienscout24.rest.schema.common._1.Adapter1;
import de.immobilienscout24.rest.schema.common._1.FacilityType;
import de.immobilienscout24.rest.schema.common._1.MarketingType;
import de.immobilienscout24.rest.schema.common._1.PetsAllowedType;
import de.immobilienscout24.rest.schema.common._1.YesNotApplicableType;


/**
 * Seniorenwohnen
 * 
 * <p>Java-Klasse für OfferAssistedLiving complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OfferAssistedLiving">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/offer/listelement/1.0}OfferRealEstateForList">
 *       &lt;sequence>
 *         &lt;group ref="{http://rest.immobilienscout24.de/schema/common/1.0}BaseAssistedLivingGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferAssistedLiving", propOrder = {
    "shortDescription",
    "petsAllowed",
    "trialLivingPossible",
    "cookingPossibilty",
    "marketingType",
    "facilityType",
    "balcony"
})
public class OfferAssistedLiving
    extends OfferRealEstateForList
{

    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String shortDescription;
    @XmlElement(required = true)
    protected PetsAllowedType petsAllowed;
    @XmlElement(required = true)
    protected YesNotApplicableType trialLivingPossible;
    @XmlElement(required = true)
    protected YesNotApplicableType cookingPossibilty;
    @XmlElement(required = true)
    protected MarketingType marketingType;
    @XmlElement(required = true)
    protected FacilityType facilityType;
    protected boolean balcony;

    /**
     * Ruft den Wert der shortDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Legt den Wert der shortDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortDescription(String value) {
        this.shortDescription = value;
    }

    /**
     * Ruft den Wert der petsAllowed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PetsAllowedType }
     *     
     */
    public PetsAllowedType getPetsAllowed() {
        return petsAllowed;
    }

    /**
     * Legt den Wert der petsAllowed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PetsAllowedType }
     *     
     */
    public void setPetsAllowed(PetsAllowedType value) {
        this.petsAllowed = value;
    }

    /**
     * Ruft den Wert der trialLivingPossible-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getTrialLivingPossible() {
        return trialLivingPossible;
    }

    /**
     * Legt den Wert der trialLivingPossible-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setTrialLivingPossible(YesNotApplicableType value) {
        this.trialLivingPossible = value;
    }

    /**
     * Ruft den Wert der cookingPossibilty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getCookingPossibilty() {
        return cookingPossibilty;
    }

    /**
     * Legt den Wert der cookingPossibilty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setCookingPossibilty(YesNotApplicableType value) {
        this.cookingPossibilty = value;
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
     * Ruft den Wert der facilityType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FacilityType }
     *     
     */
    public FacilityType getFacilityType() {
        return facilityType;
    }

    /**
     * Legt den Wert der facilityType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityType }
     *     
     */
    public void setFacilityType(FacilityType value) {
        this.facilityType = value;
    }

    /**
     * Ruft den Wert der balcony-Eigenschaft ab.
     * 
     */
    public boolean isBalcony() {
        return balcony;
    }

    /**
     * Legt den Wert der balcony-Eigenschaft fest.
     * 
     */
    public void setBalcony(boolean value) {
        this.balcony = value;
    }

}
