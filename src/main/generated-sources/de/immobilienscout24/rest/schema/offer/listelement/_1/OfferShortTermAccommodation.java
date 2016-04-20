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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import de.immobilienscout24.rest.schema.common._1.CourtageInfo;
import de.immobilienscout24.rest.schema.common._1.Price;
import de.immobilienscout24.rest.schema.common._1.ShortTermAccommodationType;


/**
 * Eigenschaften für den Wohnen auf Zeit Immobilientyp.
 *             
 * 
 * <p>Java-Klasse für OfferShortTermAccommodation complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OfferShortTermAccommodation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/offer/listelement/1.0}OfferRealEstateForList">
 *       &lt;group ref="{http://rest.immobilienscout24.de/schema/common/1.0}BaseShortTermAccommodationGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferShortTermAccommodation", propOrder = {
    "price",
    "livingSpace",
    "numberOfRooms",
    "startRentalDate",
    "balcony",
    "garden",
    "nonSmoker",
    "shortTermAccomodationType",
    "courtage"
})
public class OfferShortTermAccommodation
    extends OfferRealEstateForList
{

    @XmlElement(required = true)
    protected Price price;
    protected Double livingSpace;
    protected Double numberOfRooms;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startRentalDate;
    protected Boolean balcony;
    protected Boolean garden;
    protected Boolean nonSmoker;
    @XmlElement(required = true)
    protected ShortTermAccommodationType shortTermAccomodationType;
    @XmlElement(required = true)
    protected CourtageInfo courtage;

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
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLivingSpace() {
        return livingSpace;
    }

    /**
     * Legt den Wert der livingSpace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLivingSpace(Double value) {
        this.livingSpace = value;
    }

    /**
     * Ruft den Wert der numberOfRooms-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNumberOfRooms() {
        return numberOfRooms;
    }

    /**
     * Legt den Wert der numberOfRooms-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNumberOfRooms(Double value) {
        this.numberOfRooms = value;
    }

    /**
     * Ruft den Wert der startRentalDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartRentalDate() {
        return startRentalDate;
    }

    /**
     * Legt den Wert der startRentalDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartRentalDate(XMLGregorianCalendar value) {
        this.startRentalDate = value;
    }

    /**
     * Ruft den Wert der balcony-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBalcony() {
        return balcony;
    }

    /**
     * Legt den Wert der balcony-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBalcony(Boolean value) {
        this.balcony = value;
    }

    /**
     * Ruft den Wert der garden-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGarden() {
        return garden;
    }

    /**
     * Legt den Wert der garden-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGarden(Boolean value) {
        this.garden = value;
    }

    /**
     * Ruft den Wert der nonSmoker-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonSmoker() {
        return nonSmoker;
    }

    /**
     * Legt den Wert der nonSmoker-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonSmoker(Boolean value) {
        this.nonSmoker = value;
    }

    /**
     * Ruft den Wert der shortTermAccomodationType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ShortTermAccommodationType }
     *     
     */
    public ShortTermAccommodationType getShortTermAccomodationType() {
        return shortTermAccomodationType;
    }

    /**
     * Legt den Wert der shortTermAccomodationType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ShortTermAccommodationType }
     *     
     */
    public void setShortTermAccomodationType(ShortTermAccommodationType value) {
        this.shortTermAccomodationType = value;
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
