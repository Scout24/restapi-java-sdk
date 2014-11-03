//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.10.22 um 03:41:54 PM CEST 
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
import de.immobilienscout24.rest.schema.common._1.ApartmentType;
import de.immobilienscout24.rest.schema.common._1.BuildingEnergyRatingType;
import de.immobilienscout24.rest.schema.common._1.CourtageInfo;
import de.immobilienscout24.rest.schema.common._1.EnergyPerformanceCertificate;
import de.immobilienscout24.rest.schema.common._1.EnergySourcesEnev2014;
import de.immobilienscout24.rest.schema.common._1.FlatMateGenderType;
import de.immobilienscout24.rest.schema.common._1.FlooringType;
import de.immobilienscout24.rest.schema.common._1.HeatingType;
import de.immobilienscout24.rest.schema.common._1.HeatingTypeEnev2014;
import de.immobilienscout24.rest.schema.common._1.InternetConnectionType;
import de.immobilienscout24.rest.schema.common._1.ParkingSituationType;
import de.immobilienscout24.rest.schema.common._1.PetsAllowedType;
import de.immobilienscout24.rest.schema.common._1.SmokingAllowedType;
import de.immobilienscout24.rest.schema.common._1.TelephoneConnectionType;
import de.immobilienscout24.rest.schema.common._1.TvConnectionType;
import de.immobilienscout24.rest.schema.common._1.YesNoNotApplicableType;
import de.immobilienscout24.rest.schema.common._1.YesNotApplicableType;


/**
 * Eigenschaften fr den Immobilientyp "WG-Zimmer"
 * 
 * <p>Java-Klasse fr FlatShareRoom complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FlatShareRoom">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/offer/realestates/1.0}RealEstate">
 *       &lt;sequence>
 *         &lt;group ref="{http://rest.immobilienscout24.de/schema/common/1.0}ExtendedFlatShareRoomGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlatShareRoom", propOrder = {
    "roomSize",
    "flooringType",
    "numberOfRooms",
    "apartmentType",
    "cellar",
    "heatingType",
    "heatingTypeEnev2014",
    "barrierFree",
    "courtage",
    "energyCertificate",
    "energySourcesEnev2014",
    "buildingEnergyRatingType",
    "thermalCharacteristic",
    "energyConsumptionContainsWarmWater",
    "constructionYear",
    "constructionYearUnknown",
    "baseRent",
    "totalRent",
    "serviceCharge",
    "deposit",
    "heatingCosts",
    "heatingCostsInServiceCharge",
    "freeFrom",
    "freeUntil",
    "minimumTermOfLease",
    "totalSpace",
    "numberOfMaleFlatMates",
    "numberOfFemaleFlatMates",
    "ageOfFlatMatesFrom",
    "ageOfFlatMatesTo",
    "ageOfRequestedFrom",
    "ageOfRequestedTo",
    "numberOfRequestedFlatMates",
    "floor",
    "numberOfFloors",
    "numberOfBathRooms",
    "balcony",
    "garden",
    "lift",
    "oven",
    "refrigerator",
    "stove",
    "dishwasher",
    "washingMachine",
    "bathHasWc",
    "bathHasShower",
    "bathHasTub",
    "guestToilet",
    "petsAllowed",
    "internetConnection",
    "smokingAllowed",
    "requestedGender",
    "furnishing",
    "tvConnection",
    "telephoneConnection",
    "parkingSituation",
    "flatShareSize"
})
public class FlatShareRoom
    extends RealEstate
{

    protected double roomSize;
    protected FlooringType flooringType;
    protected Double numberOfRooms;
    protected ApartmentType apartmentType;
    protected YesNotApplicableType cellar;
    protected HeatingType heatingType;
    protected HeatingTypeEnev2014 heatingTypeEnev2014;
    protected YesNotApplicableType barrierFree;
    @XmlElement(required = true)
    protected CourtageInfo courtage;
    protected EnergyPerformanceCertificate energyCertificate;
    protected EnergySourcesEnev2014 energySourcesEnev2014;
    protected BuildingEnergyRatingType buildingEnergyRatingType;
    protected Double thermalCharacteristic;
    protected YesNotApplicableType energyConsumptionContainsWarmWater;
    protected Integer constructionYear;
    protected Boolean constructionYearUnknown;
    protected double baseRent;
    protected Double totalRent;
    protected Double serviceCharge;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String deposit;
    protected Double heatingCosts;
    protected YesNoNotApplicableType heatingCostsInServiceCharge;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar freeFrom;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar freeUntil;
    protected Integer minimumTermOfLease;
    protected Double totalSpace;
    protected Integer numberOfMaleFlatMates;
    protected Integer numberOfFemaleFlatMates;
    protected Integer ageOfFlatMatesFrom;
    protected Integer ageOfFlatMatesTo;
    protected Integer ageOfRequestedFrom;
    protected Integer ageOfRequestedTo;
    protected Integer numberOfRequestedFlatMates;
    protected Integer floor;
    protected Integer numberOfFloors;
    protected Integer numberOfBathRooms;
    protected YesNotApplicableType balcony;
    protected YesNotApplicableType garden;
    protected YesNotApplicableType lift;
    protected YesNotApplicableType oven;
    protected YesNotApplicableType refrigerator;
    protected YesNotApplicableType stove;
    protected YesNotApplicableType dishwasher;
    protected YesNotApplicableType washingMachine;
    protected YesNotApplicableType bathHasWc;
    protected YesNotApplicableType bathHasShower;
    protected YesNotApplicableType bathHasTub;
    protected YesNotApplicableType guestToilet;
    @XmlElement(required = true)
    protected PetsAllowedType petsAllowed;
    @XmlElement(required = true)
    protected InternetConnectionType internetConnection;
    @XmlElement(required = true)
    protected SmokingAllowedType smokingAllowed;
    @XmlElement(required = true)
    protected FlatMateGenderType requestedGender;
    @XmlElement(required = true)
    protected YesNoNotApplicableType furnishing;
    @XmlElement(required = true)
    protected TvConnectionType tvConnection;
    @XmlElement(required = true)
    protected TelephoneConnectionType telephoneConnection;
    @XmlElement(required = true)
    protected ParkingSituationType parkingSituation;
    protected int flatShareSize;

    /**
     * Ruft den Wert der roomSize-Eigenschaft ab.
     * 
     */
    public double getRoomSize() {
        return roomSize;
    }

    /**
     * Legt den Wert der roomSize-Eigenschaft fest.
     * 
     */
    public void setRoomSize(double value) {
        this.roomSize = value;
    }

    /**
     * Ruft den Wert der flooringType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FlooringType }
     *     
     */
    public FlooringType getFlooringType() {
        return flooringType;
    }

    /**
     * Legt den Wert der flooringType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FlooringType }
     *     
     */
    public void setFlooringType(FlooringType value) {
        this.flooringType = value;
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
     * Ruft den Wert der apartmentType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ApartmentType }
     *     
     */
    public ApartmentType getApartmentType() {
        return apartmentType;
    }

    /**
     * Legt den Wert der apartmentType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ApartmentType }
     *     
     */
    public void setApartmentType(ApartmentType value) {
        this.apartmentType = value;
    }

    /**
     * Ruft den Wert der cellar-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getCellar() {
        return cellar;
    }

    /**
     * Legt den Wert der cellar-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setCellar(YesNotApplicableType value) {
        this.cellar = value;
    }

    /**
     * Ruft den Wert der heatingType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HeatingType }
     *     
     */
    public HeatingType getHeatingType() {
        return heatingType;
    }

    /**
     * Legt den Wert der heatingType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HeatingType }
     *     
     */
    public void setHeatingType(HeatingType value) {
        this.heatingType = value;
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
     * Ruft den Wert der baseRent-Eigenschaft ab.
     * 
     */
    public double getBaseRent() {
        return baseRent;
    }

    /**
     * Legt den Wert der baseRent-Eigenschaft fest.
     * 
     */
    public void setBaseRent(double value) {
        this.baseRent = value;
    }

    /**
     * Ruft den Wert der totalRent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalRent() {
        return totalRent;
    }

    /**
     * Legt den Wert der totalRent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalRent(Double value) {
        this.totalRent = value;
    }

    /**
     * Ruft den Wert der serviceCharge-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getServiceCharge() {
        return serviceCharge;
    }

    /**
     * Legt den Wert der serviceCharge-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setServiceCharge(Double value) {
        this.serviceCharge = value;
    }

    /**
     * Ruft den Wert der deposit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeposit() {
        return deposit;
    }

    /**
     * Legt den Wert der deposit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeposit(String value) {
        this.deposit = value;
    }

    /**
     * Ruft den Wert der heatingCosts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHeatingCosts() {
        return heatingCosts;
    }

    /**
     * Legt den Wert der heatingCosts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHeatingCosts(Double value) {
        this.heatingCosts = value;
    }

    /**
     * Ruft den Wert der heatingCostsInServiceCharge-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNoNotApplicableType }
     *     
     */
    public YesNoNotApplicableType getHeatingCostsInServiceCharge() {
        return heatingCostsInServiceCharge;
    }

    /**
     * Legt den Wert der heatingCostsInServiceCharge-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoNotApplicableType }
     *     
     */
    public void setHeatingCostsInServiceCharge(YesNoNotApplicableType value) {
        this.heatingCostsInServiceCharge = value;
    }

    /**
     * Ruft den Wert der freeFrom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFreeFrom() {
        return freeFrom;
    }

    /**
     * Legt den Wert der freeFrom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFreeFrom(XMLGregorianCalendar value) {
        this.freeFrom = value;
    }

    /**
     * Ruft den Wert der freeUntil-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFreeUntil() {
        return freeUntil;
    }

    /**
     * Legt den Wert der freeUntil-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFreeUntil(XMLGregorianCalendar value) {
        this.freeUntil = value;
    }

    /**
     * Ruft den Wert der minimumTermOfLease-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinimumTermOfLease() {
        return minimumTermOfLease;
    }

    /**
     * Legt den Wert der minimumTermOfLease-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinimumTermOfLease(Integer value) {
        this.minimumTermOfLease = value;
    }

    /**
     * Ruft den Wert der totalSpace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalSpace() {
        return totalSpace;
    }

    /**
     * Legt den Wert der totalSpace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalSpace(Double value) {
        this.totalSpace = value;
    }

    /**
     * Ruft den Wert der numberOfMaleFlatMates-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfMaleFlatMates() {
        return numberOfMaleFlatMates;
    }

    /**
     * Legt den Wert der numberOfMaleFlatMates-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfMaleFlatMates(Integer value) {
        this.numberOfMaleFlatMates = value;
    }

    /**
     * Ruft den Wert der numberOfFemaleFlatMates-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfFemaleFlatMates() {
        return numberOfFemaleFlatMates;
    }

    /**
     * Legt den Wert der numberOfFemaleFlatMates-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfFemaleFlatMates(Integer value) {
        this.numberOfFemaleFlatMates = value;
    }

    /**
     * Ruft den Wert der ageOfFlatMatesFrom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAgeOfFlatMatesFrom() {
        return ageOfFlatMatesFrom;
    }

    /**
     * Legt den Wert der ageOfFlatMatesFrom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAgeOfFlatMatesFrom(Integer value) {
        this.ageOfFlatMatesFrom = value;
    }

    /**
     * Ruft den Wert der ageOfFlatMatesTo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAgeOfFlatMatesTo() {
        return ageOfFlatMatesTo;
    }

    /**
     * Legt den Wert der ageOfFlatMatesTo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAgeOfFlatMatesTo(Integer value) {
        this.ageOfFlatMatesTo = value;
    }

    /**
     * Ruft den Wert der ageOfRequestedFrom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAgeOfRequestedFrom() {
        return ageOfRequestedFrom;
    }

    /**
     * Legt den Wert der ageOfRequestedFrom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAgeOfRequestedFrom(Integer value) {
        this.ageOfRequestedFrom = value;
    }

    /**
     * Ruft den Wert der ageOfRequestedTo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAgeOfRequestedTo() {
        return ageOfRequestedTo;
    }

    /**
     * Legt den Wert der ageOfRequestedTo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAgeOfRequestedTo(Integer value) {
        this.ageOfRequestedTo = value;
    }

    /**
     * Ruft den Wert der numberOfRequestedFlatMates-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfRequestedFlatMates() {
        return numberOfRequestedFlatMates;
    }

    /**
     * Legt den Wert der numberOfRequestedFlatMates-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfRequestedFlatMates(Integer value) {
        this.numberOfRequestedFlatMates = value;
    }

    /**
     * Ruft den Wert der floor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFloor() {
        return floor;
    }

    /**
     * Legt den Wert der floor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFloor(Integer value) {
        this.floor = value;
    }

    /**
     * Ruft den Wert der numberOfFloors-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfFloors() {
        return numberOfFloors;
    }

    /**
     * Legt den Wert der numberOfFloors-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfFloors(Integer value) {
        this.numberOfFloors = value;
    }

    /**
     * Ruft den Wert der numberOfBathRooms-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfBathRooms() {
        return numberOfBathRooms;
    }

    /**
     * Legt den Wert der numberOfBathRooms-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfBathRooms(Integer value) {
        this.numberOfBathRooms = value;
    }

    /**
     * Ruft den Wert der balcony-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getBalcony() {
        return balcony;
    }

    /**
     * Legt den Wert der balcony-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setBalcony(YesNotApplicableType value) {
        this.balcony = value;
    }

    /**
     * Ruft den Wert der garden-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getGarden() {
        return garden;
    }

    /**
     * Legt den Wert der garden-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setGarden(YesNotApplicableType value) {
        this.garden = value;
    }

    /**
     * Ruft den Wert der lift-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getLift() {
        return lift;
    }

    /**
     * Legt den Wert der lift-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setLift(YesNotApplicableType value) {
        this.lift = value;
    }

    /**
     * Ruft den Wert der oven-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getOven() {
        return oven;
    }

    /**
     * Legt den Wert der oven-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setOven(YesNotApplicableType value) {
        this.oven = value;
    }

    /**
     * Ruft den Wert der refrigerator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getRefrigerator() {
        return refrigerator;
    }

    /**
     * Legt den Wert der refrigerator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setRefrigerator(YesNotApplicableType value) {
        this.refrigerator = value;
    }

    /**
     * Ruft den Wert der stove-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getStove() {
        return stove;
    }

    /**
     * Legt den Wert der stove-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setStove(YesNotApplicableType value) {
        this.stove = value;
    }

    /**
     * Ruft den Wert der dishwasher-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getDishwasher() {
        return dishwasher;
    }

    /**
     * Legt den Wert der dishwasher-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setDishwasher(YesNotApplicableType value) {
        this.dishwasher = value;
    }

    /**
     * Ruft den Wert der washingMachine-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getWashingMachine() {
        return washingMachine;
    }

    /**
     * Legt den Wert der washingMachine-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setWashingMachine(YesNotApplicableType value) {
        this.washingMachine = value;
    }

    /**
     * Ruft den Wert der bathHasWc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getBathHasWc() {
        return bathHasWc;
    }

    /**
     * Legt den Wert der bathHasWc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setBathHasWc(YesNotApplicableType value) {
        this.bathHasWc = value;
    }

    /**
     * Ruft den Wert der bathHasShower-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getBathHasShower() {
        return bathHasShower;
    }

    /**
     * Legt den Wert der bathHasShower-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setBathHasShower(YesNotApplicableType value) {
        this.bathHasShower = value;
    }

    /**
     * Ruft den Wert der bathHasTub-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getBathHasTub() {
        return bathHasTub;
    }

    /**
     * Legt den Wert der bathHasTub-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setBathHasTub(YesNotApplicableType value) {
        this.bathHasTub = value;
    }

    /**
     * Ruft den Wert der guestToilet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getGuestToilet() {
        return guestToilet;
    }

    /**
     * Legt den Wert der guestToilet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setGuestToilet(YesNotApplicableType value) {
        this.guestToilet = value;
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
     * Ruft den Wert der internetConnection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InternetConnectionType }
     *     
     */
    public InternetConnectionType getInternetConnection() {
        return internetConnection;
    }

    /**
     * Legt den Wert der internetConnection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InternetConnectionType }
     *     
     */
    public void setInternetConnection(InternetConnectionType value) {
        this.internetConnection = value;
    }

    /**
     * Ruft den Wert der smokingAllowed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SmokingAllowedType }
     *     
     */
    public SmokingAllowedType getSmokingAllowed() {
        return smokingAllowed;
    }

    /**
     * Legt den Wert der smokingAllowed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SmokingAllowedType }
     *     
     */
    public void setSmokingAllowed(SmokingAllowedType value) {
        this.smokingAllowed = value;
    }

    /**
     * Ruft den Wert der requestedGender-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FlatMateGenderType }
     *     
     */
    public FlatMateGenderType getRequestedGender() {
        return requestedGender;
    }

    /**
     * Legt den Wert der requestedGender-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FlatMateGenderType }
     *     
     */
    public void setRequestedGender(FlatMateGenderType value) {
        this.requestedGender = value;
    }

    /**
     * Ruft den Wert der furnishing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNoNotApplicableType }
     *     
     */
    public YesNoNotApplicableType getFurnishing() {
        return furnishing;
    }

    /**
     * Legt den Wert der furnishing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoNotApplicableType }
     *     
     */
    public void setFurnishing(YesNoNotApplicableType value) {
        this.furnishing = value;
    }

    /**
     * Ruft den Wert der tvConnection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TvConnectionType }
     *     
     */
    public TvConnectionType getTvConnection() {
        return tvConnection;
    }

    /**
     * Legt den Wert der tvConnection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TvConnectionType }
     *     
     */
    public void setTvConnection(TvConnectionType value) {
        this.tvConnection = value;
    }

    /**
     * Ruft den Wert der telephoneConnection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneConnectionType }
     *     
     */
    public TelephoneConnectionType getTelephoneConnection() {
        return telephoneConnection;
    }

    /**
     * Legt den Wert der telephoneConnection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneConnectionType }
     *     
     */
    public void setTelephoneConnection(TelephoneConnectionType value) {
        this.telephoneConnection = value;
    }

    /**
     * Ruft den Wert der parkingSituation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ParkingSituationType }
     *     
     */
    public ParkingSituationType getParkingSituation() {
        return parkingSituation;
    }

    /**
     * Legt den Wert der parkingSituation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingSituationType }
     *     
     */
    public void setParkingSituation(ParkingSituationType value) {
        this.parkingSituation = value;
    }

    /**
     * Ruft den Wert der flatShareSize-Eigenschaft ab.
     * 
     */
    public int getFlatShareSize() {
        return flatShareSize;
    }

    /**
     * Legt den Wert der flatShareSize-Eigenschaft fest.
     * 
     */
    public void setFlatShareSize(int value) {
        this.flatShareSize = value;
    }

}
