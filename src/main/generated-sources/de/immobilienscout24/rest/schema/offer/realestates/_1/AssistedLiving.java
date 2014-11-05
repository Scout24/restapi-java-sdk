//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.11.05 um 11:50:50 AM CET 
//


package de.immobilienscout24.rest.schema.offer.realestates._1;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import de.immobilienscout24.rest.schema.common._1.Adapter1;
import de.immobilienscout24.rest.schema.common._1.BalconyAvailableType;
import de.immobilienscout24.rest.schema.common._1.BuildingEnergyRatingType;
import de.immobilienscout24.rest.schema.common._1.EnergyPerformanceCertificate;
import de.immobilienscout24.rest.schema.common._1.EnergySourcesEnev2014;
import de.immobilienscout24.rest.schema.common._1.FacilityType;
import de.immobilienscout24.rest.schema.common._1.HeatingTypeEnev2014;
import de.immobilienscout24.rest.schema.common._1.MarketingType;
import de.immobilienscout24.rest.schema.common._1.PetsAllowedType;
import de.immobilienscout24.rest.schema.common._1.Price;
import de.immobilienscout24.rest.schema.common._1.YesNotApplicableType;


/**
 * Eigenschaften für den Immobilientyp "Seniorenwohnen"
 * 
 * <p>Java-Klasse für AssistedLiving complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AssistedLiving">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/offer/realestates/1.0}RealEstate">
 *       &lt;sequence>
 *         &lt;group ref="{http://rest.immobilienscout24.de/schema/common/1.0}ExtendedAssistedLivingGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssistedLiving", propOrder = {
    "shortDescription",
    "petsAllowed",
    "trialLivingPossible",
    "marketingType",
    "facilityType",
    "minBaseRent",
    "minPurchasePrice",
    "constructionYear",
    "constructionYearUnknown",
    "roomAvailableFrom",
    "roomAvailableTo",
    "cookingPossibilty",
    "parkingAvailable",
    "commonRoomsAvailable",
    "gardenAvailable",
    "fitnessAvailable",
    "poolAvailable",
    "publicTransportationAvailable",
    "ambulantNursingServiceAvailable",
    "emergencyCallInRoomAvailable",
    "receptionManned",
    "medicalAssistanceAvailable",
    "homeHelpAvailable",
    "counselingAvailable",
    "loansAvailable",
    "numberOfRoomsFrom",
    "numberOfRoomsTo",
    "energyCertificate",
    "heatingTypeEnev2014",
    "energySourcesEnev2014",
    "buildingEnergyRatingType",
    "thermalCharacteristic",
    "energyConsumptionContainsWarmWater",
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
public class AssistedLiving
    extends RealEstate
{

    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String shortDescription;
    @XmlElement(required = true)
    protected PetsAllowedType petsAllowed;
    @XmlElement(required = true)
    protected YesNotApplicableType trialLivingPossible;
    @XmlElement(required = true)
    protected MarketingType marketingType;
    @XmlElement(required = true)
    protected FacilityType facilityType;
    protected Price minBaseRent;
    protected Price minPurchasePrice;
    protected Integer constructionYear;
    protected Boolean constructionYearUnknown;
    protected Double roomAvailableFrom;
    protected Double roomAvailableTo;
    protected YesNotApplicableType cookingPossibilty;
    protected YesNotApplicableType parkingAvailable;
    protected YesNotApplicableType commonRoomsAvailable;
    protected YesNotApplicableType gardenAvailable;
    protected YesNotApplicableType fitnessAvailable;
    protected YesNotApplicableType poolAvailable;
    protected YesNotApplicableType publicTransportationAvailable;
    protected YesNotApplicableType ambulantNursingServiceAvailable;
    protected YesNotApplicableType emergencyCallInRoomAvailable;
    protected YesNotApplicableType receptionManned;
    protected YesNotApplicableType medicalAssistanceAvailable;
    protected YesNotApplicableType homeHelpAvailable;
    protected YesNotApplicableType counselingAvailable;
    protected YesNotApplicableType loansAvailable;
    protected BigDecimal numberOfRoomsFrom;
    protected BigDecimal numberOfRoomsTo;
    protected EnergyPerformanceCertificate energyCertificate;
    protected HeatingTypeEnev2014 heatingTypeEnev2014;
    protected EnergySourcesEnev2014 energySourcesEnev2014;
    protected BuildingEnergyRatingType buildingEnergyRatingType;
    protected Double thermalCharacteristic;
    protected YesNotApplicableType energyConsumptionContainsWarmWater;
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
     * Ruft den Wert der minBaseRent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getMinBaseRent() {
        return minBaseRent;
    }

    /**
     * Legt den Wert der minBaseRent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setMinBaseRent(Price value) {
        this.minBaseRent = value;
    }

    /**
     * Ruft den Wert der minPurchasePrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getMinPurchasePrice() {
        return minPurchasePrice;
    }

    /**
     * Legt den Wert der minPurchasePrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setMinPurchasePrice(Price value) {
        this.minPurchasePrice = value;
    }

    /**
     * Ruft den Wert der constructionYear-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConstructionYear() {
        return constructionYear;
    }

    /**
     * Legt den Wert der constructionYear-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConstructionYear(Integer value) {
        this.constructionYear = value;
    }

    /**
     * Ruft den Wert der constructionYearUnknown-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConstructionYearUnknown() {
        return constructionYearUnknown;
    }

    /**
     * Legt den Wert der constructionYearUnknown-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConstructionYearUnknown(Boolean value) {
        this.constructionYearUnknown = value;
    }

    /**
     * Ruft den Wert der roomAvailableFrom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRoomAvailableFrom() {
        return roomAvailableFrom;
    }

    /**
     * Legt den Wert der roomAvailableFrom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRoomAvailableFrom(Double value) {
        this.roomAvailableFrom = value;
    }

    /**
     * Ruft den Wert der roomAvailableTo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRoomAvailableTo() {
        return roomAvailableTo;
    }

    /**
     * Legt den Wert der roomAvailableTo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRoomAvailableTo(Double value) {
        this.roomAvailableTo = value;
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
     * Ruft den Wert der parkingAvailable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getParkingAvailable() {
        return parkingAvailable;
    }

    /**
     * Legt den Wert der parkingAvailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setParkingAvailable(YesNotApplicableType value) {
        this.parkingAvailable = value;
    }

    /**
     * Ruft den Wert der commonRoomsAvailable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getCommonRoomsAvailable() {
        return commonRoomsAvailable;
    }

    /**
     * Legt den Wert der commonRoomsAvailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setCommonRoomsAvailable(YesNotApplicableType value) {
        this.commonRoomsAvailable = value;
    }

    /**
     * Ruft den Wert der gardenAvailable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getGardenAvailable() {
        return gardenAvailable;
    }

    /**
     * Legt den Wert der gardenAvailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setGardenAvailable(YesNotApplicableType value) {
        this.gardenAvailable = value;
    }

    /**
     * Ruft den Wert der fitnessAvailable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getFitnessAvailable() {
        return fitnessAvailable;
    }

    /**
     * Legt den Wert der fitnessAvailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setFitnessAvailable(YesNotApplicableType value) {
        this.fitnessAvailable = value;
    }

    /**
     * Ruft den Wert der poolAvailable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getPoolAvailable() {
        return poolAvailable;
    }

    /**
     * Legt den Wert der poolAvailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setPoolAvailable(YesNotApplicableType value) {
        this.poolAvailable = value;
    }

    /**
     * Ruft den Wert der publicTransportationAvailable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getPublicTransportationAvailable() {
        return publicTransportationAvailable;
    }

    /**
     * Legt den Wert der publicTransportationAvailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setPublicTransportationAvailable(YesNotApplicableType value) {
        this.publicTransportationAvailable = value;
    }

    /**
     * Ruft den Wert der ambulantNursingServiceAvailable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getAmbulantNursingServiceAvailable() {
        return ambulantNursingServiceAvailable;
    }

    /**
     * Legt den Wert der ambulantNursingServiceAvailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setAmbulantNursingServiceAvailable(YesNotApplicableType value) {
        this.ambulantNursingServiceAvailable = value;
    }

    /**
     * Ruft den Wert der emergencyCallInRoomAvailable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getEmergencyCallInRoomAvailable() {
        return emergencyCallInRoomAvailable;
    }

    /**
     * Legt den Wert der emergencyCallInRoomAvailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setEmergencyCallInRoomAvailable(YesNotApplicableType value) {
        this.emergencyCallInRoomAvailable = value;
    }

    /**
     * Ruft den Wert der receptionManned-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getReceptionManned() {
        return receptionManned;
    }

    /**
     * Legt den Wert der receptionManned-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setReceptionManned(YesNotApplicableType value) {
        this.receptionManned = value;
    }

    /**
     * Ruft den Wert der medicalAssistanceAvailable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getMedicalAssistanceAvailable() {
        return medicalAssistanceAvailable;
    }

    /**
     * Legt den Wert der medicalAssistanceAvailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setMedicalAssistanceAvailable(YesNotApplicableType value) {
        this.medicalAssistanceAvailable = value;
    }

    /**
     * Ruft den Wert der homeHelpAvailable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getHomeHelpAvailable() {
        return homeHelpAvailable;
    }

    /**
     * Legt den Wert der homeHelpAvailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setHomeHelpAvailable(YesNotApplicableType value) {
        this.homeHelpAvailable = value;
    }

    /**
     * Ruft den Wert der counselingAvailable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getCounselingAvailable() {
        return counselingAvailable;
    }

    /**
     * Legt den Wert der counselingAvailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setCounselingAvailable(YesNotApplicableType value) {
        this.counselingAvailable = value;
    }

    /**
     * Ruft den Wert der loansAvailable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getLoansAvailable() {
        return loansAvailable;
    }

    /**
     * Legt den Wert der loansAvailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setLoansAvailable(YesNotApplicableType value) {
        this.loansAvailable = value;
    }

    /**
     * Ruft den Wert der numberOfRoomsFrom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumberOfRoomsFrom() {
        return numberOfRoomsFrom;
    }

    /**
     * Legt den Wert der numberOfRoomsFrom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumberOfRoomsFrom(BigDecimal value) {
        this.numberOfRoomsFrom = value;
    }

    /**
     * Ruft den Wert der numberOfRoomsTo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumberOfRoomsTo() {
        return numberOfRoomsTo;
    }

    /**
     * Legt den Wert der numberOfRoomsTo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumberOfRoomsTo(BigDecimal value) {
        this.numberOfRoomsTo = value;
    }

    /**
     * Ruft den Wert der energyCertificate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EnergyPerformanceCertificate }
     *     
     */
    public EnergyPerformanceCertificate getEnergyCertificate() {
        return energyCertificate;
    }

    /**
     * Legt den Wert der energyCertificate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyPerformanceCertificate }
     *     
     */
    public void setEnergyCertificate(EnergyPerformanceCertificate value) {
        this.energyCertificate = value;
    }

    /**
     * Ruft den Wert der heatingTypeEnev2014-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HeatingTypeEnev2014 }
     *     
     */
    public HeatingTypeEnev2014 getHeatingTypeEnev2014() {
        return heatingTypeEnev2014;
    }

    /**
     * Legt den Wert der heatingTypeEnev2014-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HeatingTypeEnev2014 }
     *     
     */
    public void setHeatingTypeEnev2014(HeatingTypeEnev2014 value) {
        this.heatingTypeEnev2014 = value;
    }

    /**
     * Ruft den Wert der energySourcesEnev2014-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EnergySourcesEnev2014 }
     *     
     */
    public EnergySourcesEnev2014 getEnergySourcesEnev2014() {
        return energySourcesEnev2014;
    }

    /**
     * Legt den Wert der energySourcesEnev2014-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergySourcesEnev2014 }
     *     
     */
    public void setEnergySourcesEnev2014(EnergySourcesEnev2014 value) {
        this.energySourcesEnev2014 = value;
    }

    /**
     * Ruft den Wert der buildingEnergyRatingType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BuildingEnergyRatingType }
     *     
     */
    public BuildingEnergyRatingType getBuildingEnergyRatingType() {
        return buildingEnergyRatingType;
    }

    /**
     * Legt den Wert der buildingEnergyRatingType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildingEnergyRatingType }
     *     
     */
    public void setBuildingEnergyRatingType(BuildingEnergyRatingType value) {
        this.buildingEnergyRatingType = value;
    }

    /**
     * Ruft den Wert der thermalCharacteristic-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getThermalCharacteristic() {
        return thermalCharacteristic;
    }

    /**
     * Legt den Wert der thermalCharacteristic-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setThermalCharacteristic(Double value) {
        this.thermalCharacteristic = value;
    }

    /**
     * Ruft den Wert der energyConsumptionContainsWarmWater-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getEnergyConsumptionContainsWarmWater() {
        return energyConsumptionContainsWarmWater;
    }

    /**
     * Legt den Wert der energyConsumptionContainsWarmWater-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setEnergyConsumptionContainsWarmWater(YesNotApplicableType value) {
        this.energyConsumptionContainsWarmWater = value;
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
