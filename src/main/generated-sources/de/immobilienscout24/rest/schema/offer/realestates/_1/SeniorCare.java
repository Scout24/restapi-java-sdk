//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.04.19 um 09:36:45 AM CEST 
//


package de.immobilienscout24.rest.schema.offer.realestates._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import de.immobilienscout24.rest.schema.common._1.Adapter1;
import de.immobilienscout24.rest.schema.common._1.BalconyAvailableType;
import de.immobilienscout24.rest.schema.common._1.CareLevelExpose;
import de.immobilienscout24.rest.schema.common._1.CareTypes;
import de.immobilienscout24.rest.schema.common._1.PetsAllowedType;
import de.immobilienscout24.rest.schema.common._1.Price;
import de.immobilienscout24.rest.schema.common._1.RoomType;
import de.immobilienscout24.rest.schema.common._1.YesNotApplicableType;


/**
 * Eigenschaften fr den Immobilientyp Altenpflege
 * 
 * <p>Java-Klasse fr SeniorCare complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SeniorCare">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/offer/realestates/1.0}RealEstate">
 *       &lt;sequence>
 *         &lt;group ref="{http://rest.immobilienscout24.de/schema/common/1.0}ExtendedSeniorCareGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeniorCare", propOrder = {
    "shortDescription",
    "petsAllowed",
    "trialLivingPossible",
    "careTypes",
    "careLevel",
    "price",
    "numberOfBeds",
    "opening",
    "careOfDementia",
    "careOfArtificialRespiration",
    "careOfComaVigil",
    "careOfStroke",
    "careOfParkinson",
    "careOfAlzheimer",
    "careOfMultipleSclerosis",
    "kitchenAvailable",
    "roomType",
    "therapyOfferingsAvailable",
    "barrierFree",
    "numberOfLookedAfterApartments",
    "numberOfNursingPlaces",
    "livingSpaceFrom",
    "livingSpaceTo",
    "handicappedAccessible",
    "guestApartmentsAvailable",
    "restaurantAvailable",
    "cookingFacilitiesAvailable",
    "ownFurniturePossible",
    "cleaningServiceAvailable",
    "shoppingFacilitiesAvailable",
    "security24Hours",
    "culturalProgramAvailable",
    "leisureActivitiesAvailable",
    "religiousOfferingsAvailable",
    "balconyAvailable",
    "branchEntry"
})
public class SeniorCare
    extends RealEstate
{

    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String shortDescription;
    @XmlElement(required = true)
    protected PetsAllowedType petsAllowed;
    @XmlElement(required = true)
    protected YesNotApplicableType trialLivingPossible;
    @XmlElement(required = true)
    protected CareTypes careTypes;
    @XmlElement(required = true)
    protected CareLevelExpose careLevel;
    protected Price price;
    protected Integer numberOfBeds;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar opening;
    protected YesNotApplicableType careOfDementia;
    protected YesNotApplicableType careOfArtificialRespiration;
    protected YesNotApplicableType careOfComaVigil;
    protected YesNotApplicableType careOfStroke;
    protected YesNotApplicableType careOfParkinson;
    protected YesNotApplicableType careOfAlzheimer;
    protected YesNotApplicableType careOfMultipleSclerosis;
    protected YesNotApplicableType kitchenAvailable;
    protected RoomType roomType;
    protected YesNotApplicableType therapyOfferingsAvailable;
    protected YesNotApplicableType barrierFree;
    protected Integer numberOfLookedAfterApartments;
    protected Integer numberOfNursingPlaces;
    protected Double livingSpaceFrom;
    protected Double livingSpaceTo;
    protected YesNotApplicableType handicappedAccessible;
    protected YesNotApplicableType guestApartmentsAvailable;
    protected YesNotApplicableType restaurantAvailable;
    protected YesNotApplicableType cookingFacilitiesAvailable;
    protected YesNotApplicableType ownFurniturePossible;
    protected YesNotApplicableType cleaningServiceAvailable;
    protected YesNotApplicableType shoppingFacilitiesAvailable;
    protected YesNotApplicableType security24Hours;
    protected YesNotApplicableType culturalProgramAvailable;
    protected YesNotApplicableType leisureActivitiesAvailable;
    protected YesNotApplicableType religiousOfferingsAvailable;
    protected BalconyAvailableType balconyAvailable;
    @XmlElement(defaultValue = "false")
    protected Boolean branchEntry;

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
     * Ruft den Wert der careLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CareLevelExpose }
     *     
     */
    public CareLevelExpose getCareLevel() {
        return careLevel;
    }

    /**
     * Legt den Wert der careLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CareLevelExpose }
     *     
     */
    public void setCareLevel(CareLevelExpose value) {
        this.careLevel = value;
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
     * Ruft den Wert der numberOfBeds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfBeds() {
        return numberOfBeds;
    }

    /**
     * Legt den Wert der numberOfBeds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfBeds(Integer value) {
        this.numberOfBeds = value;
    }

    /**
     * Ruft den Wert der opening-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOpening() {
        return opening;
    }

    /**
     * Legt den Wert der opening-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOpening(XMLGregorianCalendar value) {
        this.opening = value;
    }

    /**
     * Ruft den Wert der careOfDementia-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getCareOfDementia() {
        return careOfDementia;
    }

    /**
     * Legt den Wert der careOfDementia-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setCareOfDementia(YesNotApplicableType value) {
        this.careOfDementia = value;
    }

    /**
     * Ruft den Wert der careOfArtificialRespiration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getCareOfArtificialRespiration() {
        return careOfArtificialRespiration;
    }

    /**
     * Legt den Wert der careOfArtificialRespiration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setCareOfArtificialRespiration(YesNotApplicableType value) {
        this.careOfArtificialRespiration = value;
    }

    /**
     * Ruft den Wert der careOfComaVigil-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getCareOfComaVigil() {
        return careOfComaVigil;
    }

    /**
     * Legt den Wert der careOfComaVigil-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setCareOfComaVigil(YesNotApplicableType value) {
        this.careOfComaVigil = value;
    }

    /**
     * Ruft den Wert der careOfStroke-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getCareOfStroke() {
        return careOfStroke;
    }

    /**
     * Legt den Wert der careOfStroke-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setCareOfStroke(YesNotApplicableType value) {
        this.careOfStroke = value;
    }

    /**
     * Ruft den Wert der careOfParkinson-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getCareOfParkinson() {
        return careOfParkinson;
    }

    /**
     * Legt den Wert der careOfParkinson-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setCareOfParkinson(YesNotApplicableType value) {
        this.careOfParkinson = value;
    }

    /**
     * Ruft den Wert der careOfAlzheimer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getCareOfAlzheimer() {
        return careOfAlzheimer;
    }

    /**
     * Legt den Wert der careOfAlzheimer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setCareOfAlzheimer(YesNotApplicableType value) {
        this.careOfAlzheimer = value;
    }

    /**
     * Ruft den Wert der careOfMultipleSclerosis-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getCareOfMultipleSclerosis() {
        return careOfMultipleSclerosis;
    }

    /**
     * Legt den Wert der careOfMultipleSclerosis-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setCareOfMultipleSclerosis(YesNotApplicableType value) {
        this.careOfMultipleSclerosis = value;
    }

    /**
     * Ruft den Wert der kitchenAvailable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getKitchenAvailable() {
        return kitchenAvailable;
    }

    /**
     * Legt den Wert der kitchenAvailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setKitchenAvailable(YesNotApplicableType value) {
        this.kitchenAvailable = value;
    }

    /**
     * Ruft den Wert der roomType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RoomType }
     *     
     */
    public RoomType getRoomType() {
        return roomType;
    }

    /**
     * Legt den Wert der roomType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomType }
     *     
     */
    public void setRoomType(RoomType value) {
        this.roomType = value;
    }

    /**
     * Ruft den Wert der therapyOfferingsAvailable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getTherapyOfferingsAvailable() {
        return therapyOfferingsAvailable;
    }

    /**
     * Legt den Wert der therapyOfferingsAvailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setTherapyOfferingsAvailable(YesNotApplicableType value) {
        this.therapyOfferingsAvailable = value;
    }

    /**
     * Ruft den Wert der barrierFree-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getBarrierFree() {
        return barrierFree;
    }

    /**
     * Legt den Wert der barrierFree-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setBarrierFree(YesNotApplicableType value) {
        this.barrierFree = value;
    }

    /**
     * Ruft den Wert der numberOfLookedAfterApartments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfLookedAfterApartments() {
        return numberOfLookedAfterApartments;
    }

    /**
     * Legt den Wert der numberOfLookedAfterApartments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfLookedAfterApartments(Integer value) {
        this.numberOfLookedAfterApartments = value;
    }

    /**
     * Ruft den Wert der numberOfNursingPlaces-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfNursingPlaces() {
        return numberOfNursingPlaces;
    }

    /**
     * Legt den Wert der numberOfNursingPlaces-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfNursingPlaces(Integer value) {
        this.numberOfNursingPlaces = value;
    }

    /**
     * Ruft den Wert der livingSpaceFrom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLivingSpaceFrom() {
        return livingSpaceFrom;
    }

    /**
     * Legt den Wert der livingSpaceFrom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLivingSpaceFrom(Double value) {
        this.livingSpaceFrom = value;
    }

    /**
     * Ruft den Wert der livingSpaceTo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLivingSpaceTo() {
        return livingSpaceTo;
    }

    /**
     * Legt den Wert der livingSpaceTo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLivingSpaceTo(Double value) {
        this.livingSpaceTo = value;
    }

    /**
     * Ruft den Wert der handicappedAccessible-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getHandicappedAccessible() {
        return handicappedAccessible;
    }

    /**
     * Legt den Wert der handicappedAccessible-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setHandicappedAccessible(YesNotApplicableType value) {
        this.handicappedAccessible = value;
    }

    /**
     * Ruft den Wert der guestApartmentsAvailable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getGuestApartmentsAvailable() {
        return guestApartmentsAvailable;
    }

    /**
     * Legt den Wert der guestApartmentsAvailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setGuestApartmentsAvailable(YesNotApplicableType value) {
        this.guestApartmentsAvailable = value;
    }

    /**
     * Ruft den Wert der restaurantAvailable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getRestaurantAvailable() {
        return restaurantAvailable;
    }

    /**
     * Legt den Wert der restaurantAvailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setRestaurantAvailable(YesNotApplicableType value) {
        this.restaurantAvailable = value;
    }

    /**
     * Ruft den Wert der cookingFacilitiesAvailable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getCookingFacilitiesAvailable() {
        return cookingFacilitiesAvailable;
    }

    /**
     * Legt den Wert der cookingFacilitiesAvailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setCookingFacilitiesAvailable(YesNotApplicableType value) {
        this.cookingFacilitiesAvailable = value;
    }

    /**
     * Ruft den Wert der ownFurniturePossible-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getOwnFurniturePossible() {
        return ownFurniturePossible;
    }

    /**
     * Legt den Wert der ownFurniturePossible-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setOwnFurniturePossible(YesNotApplicableType value) {
        this.ownFurniturePossible = value;
    }

    /**
     * Ruft den Wert der cleaningServiceAvailable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getCleaningServiceAvailable() {
        return cleaningServiceAvailable;
    }

    /**
     * Legt den Wert der cleaningServiceAvailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setCleaningServiceAvailable(YesNotApplicableType value) {
        this.cleaningServiceAvailable = value;
    }

    /**
     * Ruft den Wert der shoppingFacilitiesAvailable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getShoppingFacilitiesAvailable() {
        return shoppingFacilitiesAvailable;
    }

    /**
     * Legt den Wert der shoppingFacilitiesAvailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setShoppingFacilitiesAvailable(YesNotApplicableType value) {
        this.shoppingFacilitiesAvailable = value;
    }

    /**
     * Ruft den Wert der security24Hours-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getSecurity24Hours() {
        return security24Hours;
    }

    /**
     * Legt den Wert der security24Hours-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setSecurity24Hours(YesNotApplicableType value) {
        this.security24Hours = value;
    }

    /**
     * Ruft den Wert der culturalProgramAvailable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getCulturalProgramAvailable() {
        return culturalProgramAvailable;
    }

    /**
     * Legt den Wert der culturalProgramAvailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setCulturalProgramAvailable(YesNotApplicableType value) {
        this.culturalProgramAvailable = value;
    }

    /**
     * Ruft den Wert der leisureActivitiesAvailable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getLeisureActivitiesAvailable() {
        return leisureActivitiesAvailable;
    }

    /**
     * Legt den Wert der leisureActivitiesAvailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setLeisureActivitiesAvailable(YesNotApplicableType value) {
        this.leisureActivitiesAvailable = value;
    }

    /**
     * Ruft den Wert der religiousOfferingsAvailable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getReligiousOfferingsAvailable() {
        return religiousOfferingsAvailable;
    }

    /**
     * Legt den Wert der religiousOfferingsAvailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setReligiousOfferingsAvailable(YesNotApplicableType value) {
        this.religiousOfferingsAvailable = value;
    }

    /**
     * Ruft den Wert der balconyAvailable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BalconyAvailableType }
     *     
     */
    public BalconyAvailableType getBalconyAvailable() {
        return balconyAvailable;
    }

    /**
     * Legt den Wert der balconyAvailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BalconyAvailableType }
     *     
     */
    public void setBalconyAvailable(BalconyAvailableType value) {
        this.balconyAvailable = value;
    }

    /**
     * Ruft den Wert der branchEntry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBranchEntry() {
        return branchEntry;
    }

    /**
     * Legt den Wert der branchEntry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBranchEntry(Boolean value) {
        this.branchEntry = value;
    }

}
