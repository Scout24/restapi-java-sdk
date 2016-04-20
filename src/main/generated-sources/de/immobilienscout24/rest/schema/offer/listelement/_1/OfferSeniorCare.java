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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import de.immobilienscout24.rest.schema.common._1.Adapter1;
import de.immobilienscout24.rest.schema.common._1.CareTypes;
import de.immobilienscout24.rest.schema.common._1.PetsAllowedType;
import de.immobilienscout24.rest.schema.common._1.YesNotApplicableType;


/**
 * Altenpflegeeinrichtungen.
 * 
 * <p>Java-Klasse für OfferSeniorCare complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OfferSeniorCare">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/offer/listelement/1.0}OfferRealEstateForList">
 *       &lt;sequence>
 *         &lt;group ref="{http://rest.immobilienscout24.de/schema/common/1.0}BaseSeniorCareGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferSeniorCare", propOrder = {
    "shortDescription",
    "petsAllowed",
    "trialLivingPossible",
    "careTypes",
    "balcony"
})
public class OfferSeniorCare
    extends OfferRealEstateForList
{

    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String shortDescription;
    @XmlElement(required = true)
    protected PetsAllowedType petsAllowed;
    @XmlElement(required = true)
    protected YesNotApplicableType trialLivingPossible;
    @XmlElement(required = true)
    protected CareTypes careTypes;
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
     * Ruft den Wert der careTypes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CareTypes }
     *     
     */
    public CareTypes getCareTypes() {
        return careTypes;
    }

    /**
     * Legt den Wert der careTypes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CareTypes }
     *     
     */
    public void setCareTypes(CareTypes value) {
        this.careTypes = value;
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
