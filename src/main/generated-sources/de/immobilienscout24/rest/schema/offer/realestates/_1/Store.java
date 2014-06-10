//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.04.11 um 01:54:30 PM CEST 
//

package de.immobilienscout24.rest.schema.offer.realestates._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import de.immobilienscout24.rest.schema.common._1.Adapter1;
import de.immobilienscout24.rest.schema.common._1.BuildingEnergyRatingType;
import de.immobilienscout24.rest.schema.common._1.CommercializationType;
import de.immobilienscout24.rest.schema.common._1.CourtageInfo;
import de.immobilienscout24.rest.schema.common._1.EnergyPerformanceCertificate;
import de.immobilienscout24.rest.schema.common._1.EnergySourcesEnev2014;
import de.immobilienscout24.rest.schema.common._1.FiringTypes;
import de.immobilienscout24.rest.schema.common._1.FlooringType;
import de.immobilienscout24.rest.schema.common._1.HeatingType;
import de.immobilienscout24.rest.schema.common._1.HeatingTypeEnev2014;
import de.immobilienscout24.rest.schema.common._1.InteriorQuality;
import de.immobilienscout24.rest.schema.common._1.LocationClassificationType;
import de.immobilienscout24.rest.schema.common._1.Price;
import de.immobilienscout24.rest.schema.common._1.RealEstateCondition;
import de.immobilienscout24.rest.schema.common._1.StoreType;
import de.immobilienscout24.rest.schema.common._1.SupplyType;
import de.immobilienscout24.rest.schema.common._1.YesNotApplicableType;

/**
 * Eigenschaften f�r den Immobilientyp "Einzelhandel"
 * 
 * <p>
 * Java-Klasse f�r Store complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Store">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/offer/realestates/1.0}RealEstate">
 *       &lt;sequence>
 *         &lt;group ref="{http://rest.immobilienscout24.de/schema/common/1.0}ExtendedStoreGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Store", propOrder = { "storeType", "locationClassificationType", "areaDivisibleFrom", "shopWindowLength", "listed", "lift", "goodsLift", "goodsLiftLoad", "floorLoad", "ramp",
		"cellar", "supplyType", "flooringType", "deposit", "energyCertificate", "commercializationType", "price", "calculatedPrice", "totalFloorSpace", "netFloorSpace", "minDivisible", "courtage",
		"distanceToMRS", "distanceToFM", "distanceToPT", "distanceToAirport", "condition", "numberOfParkingSpaces", "parkingSpacePrice", "lastRefurbishment", "interiorQuality", "constructionYear",
		"constructionYearUnknown", "freeFrom", "heatingType", "heatingTypeEnev2014", "firingTypes", "energySourcesEnev2014", "thermalCharacteristic", "energyConsumptionContainsWarmWater",
		"buildingEnergyRatingType", "additionalArea", "numberOfFloors", "additionalCosts" })
public class Store extends RealEstate {

	protected StoreType storeType;
	protected LocationClassificationType locationClassificationType;
	protected Double areaDivisibleFrom;
	protected Double shopWindowLength;
	protected YesNotApplicableType listed;
	protected YesNotApplicableType lift;
	protected YesNotApplicableType goodsLift;
	protected Double goodsLiftLoad;
	protected Double floorLoad;
	protected YesNotApplicableType ramp;
	protected YesNotApplicableType cellar;
	protected SupplyType supplyType;
	protected FlooringType flooringType;
	@XmlJavaTypeAdapter(Adapter1.class)
	protected String deposit;
	protected EnergyPerformanceCertificate energyCertificate;
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
	protected Integer distanceToMRS;
	protected Integer distanceToFM;
	protected Integer distanceToPT;
	protected Integer distanceToAirport;
	protected RealEstateCondition condition;
	protected Integer numberOfParkingSpaces;
	protected Double parkingSpacePrice;
	protected Integer lastRefurbishment;
	protected InteriorQuality interiorQuality;
	protected Integer constructionYear;
	protected Boolean constructionYearUnknown;
	@XmlJavaTypeAdapter(Adapter1.class)
	protected String freeFrom;
	protected HeatingType heatingType;
	protected HeatingTypeEnev2014 heatingTypeEnev2014;
	protected FiringTypes firingTypes;
	protected EnergySourcesEnev2014 energySourcesEnev2014;
	protected Double thermalCharacteristic;
	protected YesNotApplicableType energyConsumptionContainsWarmWater;
	protected BuildingEnergyRatingType buildingEnergyRatingType;
	protected Double additionalArea;
	@XmlJavaTypeAdapter(Adapter1.class)
	protected String numberOfFloors;
	protected Price additionalCosts;

	/**
	 * Ruft den Wert der storeType-Eigenschaft ab.
	 * 
	 * @return possible object is {@link StoreType }
	 * 
	 */
	public StoreType getStoreType() {
		return storeType;
	}

	/**
	 * Legt den Wert der storeType-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link StoreType }
	 * 
	 */
	public void setStoreType(StoreType value) {
		this.storeType = value;
	}

	/**
	 * Ruft den Wert der locationClassificationType-Eigenschaft ab.
	 * 
	 * @return possible object is {@link LocationClassificationType }
	 * 
	 */
	public LocationClassificationType getLocationClassificationType() {
		return locationClassificationType;
	}

	/**
	 * Legt den Wert der locationClassificationType-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link LocationClassificationType }
	 * 
	 */
	public void setLocationClassificationType(LocationClassificationType value) {
		this.locationClassificationType = value;
	}

	/**
	 * Ruft den Wert der areaDivisibleFrom-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getAreaDivisibleFrom() {
		return areaDivisibleFrom;
	}

	/**
	 * Legt den Wert der areaDivisibleFrom-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setAreaDivisibleFrom(Double value) {
		this.areaDivisibleFrom = value;
	}

	/**
	 * Ruft den Wert der shopWindowLength-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getShopWindowLength() {
		return shopWindowLength;
	}

	/**
	 * Legt den Wert der shopWindowLength-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setShopWindowLength(Double value) {
		this.shopWindowLength = value;
	}

	/**
	 * Ruft den Wert der listed-Eigenschaft ab.
	 * 
	 * @return possible object is {@link YesNotApplicableType }
	 * 
	 */
	public YesNotApplicableType getListed() {
		return listed;
	}

	/**
	 * Legt den Wert der listed-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link YesNotApplicableType }
	 * 
	 */
	public void setListed(YesNotApplicableType value) {
		this.listed = value;
	}

	/**
	 * Ruft den Wert der lift-Eigenschaft ab.
	 * 
	 * @return possible object is {@link YesNotApplicableType }
	 * 
	 */
	public YesNotApplicableType getLift() {
		return lift;
	}

	/**
	 * Legt den Wert der lift-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link YesNotApplicableType }
	 * 
	 */
	public void setLift(YesNotApplicableType value) {
		this.lift = value;
	}

	/**
	 * Ruft den Wert der goodsLift-Eigenschaft ab.
	 * 
	 * @return possible object is {@link YesNotApplicableType }
	 * 
	 */
	public YesNotApplicableType getGoodsLift() {
		return goodsLift;
	}

	/**
	 * Legt den Wert der goodsLift-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link YesNotApplicableType }
	 * 
	 */
	public void setGoodsLift(YesNotApplicableType value) {
		this.goodsLift = value;
	}

	/**
	 * Ruft den Wert der goodsLiftLoad-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getGoodsLiftLoad() {
		return goodsLiftLoad;
	}

	/**
	 * Legt den Wert der goodsLiftLoad-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setGoodsLiftLoad(Double value) {
		this.goodsLiftLoad = value;
	}

	/**
	 * Ruft den Wert der floorLoad-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getFloorLoad() {
		return floorLoad;
	}

	/**
	 * Legt den Wert der floorLoad-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setFloorLoad(Double value) {
		this.floorLoad = value;
	}

	/**
	 * Ruft den Wert der ramp-Eigenschaft ab.
	 * 
	 * @return possible object is {@link YesNotApplicableType }
	 * 
	 */
	public YesNotApplicableType getRamp() {
		return ramp;
	}

	/**
	 * Legt den Wert der ramp-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link YesNotApplicableType }
	 * 
	 */
	public void setRamp(YesNotApplicableType value) {
		this.ramp = value;
	}

	/**
	 * Ruft den Wert der cellar-Eigenschaft ab.
	 * 
	 * @return possible object is {@link YesNotApplicableType }
	 * 
	 */
	public YesNotApplicableType getCellar() {
		return cellar;
	}

	/**
	 * Legt den Wert der cellar-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link YesNotApplicableType }
	 * 
	 */
	public void setCellar(YesNotApplicableType value) {
		this.cellar = value;
	}

	/**
	 * Ruft den Wert der supplyType-Eigenschaft ab.
	 * 
	 * @return possible object is {@link SupplyType }
	 * 
	 */
	public SupplyType getSupplyType() {
		return supplyType;
	}

	/**
	 * Legt den Wert der supplyType-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link SupplyType }
	 * 
	 */
	public void setSupplyType(SupplyType value) {
		this.supplyType = value;
	}

	/**
	 * Ruft den Wert der flooringType-Eigenschaft ab.
	 * 
	 * @return possible object is {@link FlooringType }
	 * 
	 */
	public FlooringType getFlooringType() {
		return flooringType;
	}

	/**
	 * Legt den Wert der flooringType-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link FlooringType }
	 * 
	 */
	public void setFlooringType(FlooringType value) {
		this.flooringType = value;
	}

	/**
	 * Ruft den Wert der deposit-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeposit() {
		return deposit;
	}

	/**
	 * Legt den Wert der deposit-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDeposit(String value) {
		this.deposit = value;
	}

	/**
	 * Ruft den Wert der energyCertificate-Eigenschaft ab.
	 * 
	 * @return possible object is {@link EnergyPerformanceCertificate }
	 * 
	 */
	public EnergyPerformanceCertificate getEnergyCertificate() {
		return energyCertificate;
	}

	/**
	 * Legt den Wert der energyCertificate-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link EnergyPerformanceCertificate }
	 * 
	 */
	public void setEnergyCertificate(EnergyPerformanceCertificate value) {
		this.energyCertificate = value;
	}

	/**
	 * Ruft den Wert der commercializationType-Eigenschaft ab.
	 * 
	 * @return possible object is {@link CommercializationType }
	 * 
	 */
	public CommercializationType getCommercializationType() {
		return commercializationType;
	}

	/**
	 * Legt den Wert der commercializationType-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link CommercializationType }
	 * 
	 */
	public void setCommercializationType(CommercializationType value) {
		this.commercializationType = value;
	}

	/**
	 * Ruft den Wert der price-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Price }
	 * 
	 */
	public Price getPrice() {
		return price;
	}

	/**
	 * Legt den Wert der price-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Price }
	 * 
	 */
	public void setPrice(Price value) {
		this.price = value;
	}

	/**
	 * Ruft den Wert der calculatedPrice-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Price }
	 * 
	 */
	public Price getCalculatedPrice() {
		return calculatedPrice;
	}

	/**
	 * Legt den Wert der calculatedPrice-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Price }
	 * 
	 */
	public void setCalculatedPrice(Price value) {
		this.calculatedPrice = value;
	}

	/**
	 * Ruft den Wert der totalFloorSpace-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getTotalFloorSpace() {
		return totalFloorSpace;
	}

	/**
	 * Legt den Wert der totalFloorSpace-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setTotalFloorSpace(Double value) {
		this.totalFloorSpace = value;
	}

	/**
	 * Ruft den Wert der netFloorSpace-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getNetFloorSpace() {
		return netFloorSpace;
	}

	/**
	 * Legt den Wert der netFloorSpace-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setNetFloorSpace(Double value) {
		this.netFloorSpace = value;
	}

	/**
	 * Ruft den Wert der minDivisible-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getMinDivisible() {
		return minDivisible;
	}

	/**
	 * Legt den Wert der minDivisible-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setMinDivisible(Double value) {
		this.minDivisible = value;
	}

	/**
	 * Ruft den Wert der courtage-Eigenschaft ab.
	 * 
	 * @return possible object is {@link CourtageInfo }
	 * 
	 */
	public CourtageInfo getCourtage() {
		return courtage;
	}

	/**
	 * Legt den Wert der courtage-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link CourtageInfo }
	 * 
	 */
	public void setCourtage(CourtageInfo value) {
		this.courtage = value;
	}

	/**
	 * Ruft den Wert der distanceToMRS-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getDistanceToMRS() {
		return distanceToMRS;
	}

	/**
	 * Legt den Wert der distanceToMRS-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setDistanceToMRS(Integer value) {
		this.distanceToMRS = value;
	}

	/**
	 * Ruft den Wert der distanceToFM-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getDistanceToFM() {
		return distanceToFM;
	}

	/**
	 * Legt den Wert der distanceToFM-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setDistanceToFM(Integer value) {
		this.distanceToFM = value;
	}

	/**
	 * Ruft den Wert der distanceToPT-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getDistanceToPT() {
		return distanceToPT;
	}

	/**
	 * Legt den Wert der distanceToPT-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setDistanceToPT(Integer value) {
		this.distanceToPT = value;
	}

	/**
	 * Ruft den Wert der distanceToAirport-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getDistanceToAirport() {
		return distanceToAirport;
	}

	/**
	 * Legt den Wert der distanceToAirport-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setDistanceToAirport(Integer value) {
		this.distanceToAirport = value;
	}

	/**
	 * Ruft den Wert der condition-Eigenschaft ab.
	 * 
	 * @return possible object is {@link RealEstateCondition }
	 * 
	 */
	public RealEstateCondition getCondition() {
		return condition;
	}

	/**
	 * Legt den Wert der condition-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link RealEstateCondition }
	 * 
	 */
	public void setCondition(RealEstateCondition value) {
		this.condition = value;
	}

	/**
	 * Ruft den Wert der numberOfParkingSpaces-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getNumberOfParkingSpaces() {
		return numberOfParkingSpaces;
	}

	/**
	 * Legt den Wert der numberOfParkingSpaces-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setNumberOfParkingSpaces(Integer value) {
		this.numberOfParkingSpaces = value;
	}

	/**
	 * Ruft den Wert der parkingSpacePrice-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getParkingSpacePrice() {
		return parkingSpacePrice;
	}

	/**
	 * Legt den Wert der parkingSpacePrice-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setParkingSpacePrice(Double value) {
		this.parkingSpacePrice = value;
	}

	/**
	 * Ruft den Wert der lastRefurbishment-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getLastRefurbishment() {
		return lastRefurbishment;
	}

	/**
	 * Legt den Wert der lastRefurbishment-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setLastRefurbishment(Integer value) {
		this.lastRefurbishment = value;
	}

	/**
	 * Ruft den Wert der interiorQuality-Eigenschaft ab.
	 * 
	 * @return possible object is {@link InteriorQuality }
	 * 
	 */
	public InteriorQuality getInteriorQuality() {
		return interiorQuality;
	}

	/**
	 * Legt den Wert der interiorQuality-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link InteriorQuality }
	 * 
	 */
	public void setInteriorQuality(InteriorQuality value) {
		this.interiorQuality = value;
	}

	/**
	 * Ruft den Wert der constructionYear-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getConstructionYear() {
		return constructionYear;
	}

	/**
	 * Legt den Wert der constructionYear-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setConstructionYear(Integer value) {
		this.constructionYear = value;
	}

	/**
	 * Ruft den Wert der constructionYearUnknown-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isConstructionYearUnknown() {
		return constructionYearUnknown;
	}

	/**
	 * Legt den Wert der constructionYearUnknown-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setConstructionYearUnknown(Boolean value) {
		this.constructionYearUnknown = value;
	}

	/**
	 * Ruft den Wert der freeFrom-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFreeFrom() {
		return freeFrom;
	}

	/**
	 * Legt den Wert der freeFrom-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFreeFrom(String value) {
		this.freeFrom = value;
	}

	/**
	 * Ruft den Wert der heatingType-Eigenschaft ab.
	 * 
	 * @return possible object is {@link HeatingType }
	 * 
	 */
	public HeatingType getHeatingType() {
		return heatingType;
	}

	/**
	 * Legt den Wert der heatingType-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link HeatingType }
	 * 
	 */
	public void setHeatingType(HeatingType value) {
		this.heatingType = value;
	}

	/**
	 * Ruft den Wert der heatingTypeEnev2014-Eigenschaft ab.
	 * 
	 * @return possible object is {@link HeatingTypeEnev2014 }
	 * 
	 */
	public HeatingTypeEnev2014 getHeatingTypeEnev2014() {
		return heatingTypeEnev2014;
	}

	/**
	 * Legt den Wert der heatingTypeEnev2014-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link HeatingTypeEnev2014 }
	 * 
	 */
	public void setHeatingTypeEnev2014(HeatingTypeEnev2014 value) {
		this.heatingTypeEnev2014 = value;
	}

	/**
	 * Ruft den Wert der firingTypes-Eigenschaft ab.
	 * 
	 * @return possible object is {@link FiringTypes }
	 * 
	 */
	public FiringTypes getFiringTypes() {
		return firingTypes;
	}

	/**
	 * Legt den Wert der firingTypes-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link FiringTypes }
	 * 
	 */
	public void setFiringTypes(FiringTypes value) {
		this.firingTypes = value;
	}

	/**
	 * Ruft den Wert der energySourcesEnev2014-Eigenschaft ab.
	 * 
	 * @return possible object is {@link EnergySourcesEnev2014 }
	 * 
	 */
	public EnergySourcesEnev2014 getEnergySourcesEnev2014() {
		return energySourcesEnev2014;
	}

	/**
	 * Legt den Wert der energySourcesEnev2014-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link EnergySourcesEnev2014 }
	 * 
	 */
	public void setEnergySourcesEnev2014(EnergySourcesEnev2014 value) {
		this.energySourcesEnev2014 = value;
	}

	/**
	 * Ruft den Wert der thermalCharacteristic-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getThermalCharacteristic() {
		return thermalCharacteristic;
	}

	/**
	 * Legt den Wert der thermalCharacteristic-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setThermalCharacteristic(Double value) {
		this.thermalCharacteristic = value;
	}

	/**
	 * Ruft den Wert der energyConsumptionContainsWarmWater-Eigenschaft ab.
	 * 
	 * @return possible object is {@link YesNotApplicableType }
	 * 
	 */
	public YesNotApplicableType getEnergyConsumptionContainsWarmWater() {
		return energyConsumptionContainsWarmWater;
	}

	/**
	 * Legt den Wert der energyConsumptionContainsWarmWater-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link YesNotApplicableType }
	 * 
	 */
	public void setEnergyConsumptionContainsWarmWater(YesNotApplicableType value) {
		this.energyConsumptionContainsWarmWater = value;
	}

	/**
	 * Ruft den Wert der buildingEnergyRatingType-Eigenschaft ab.
	 * 
	 * @return possible object is {@link BuildingEnergyRatingType }
	 * 
	 */
	public BuildingEnergyRatingType getBuildingEnergyRatingType() {
		return buildingEnergyRatingType;
	}

	/**
	 * Legt den Wert der buildingEnergyRatingType-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link BuildingEnergyRatingType }
	 * 
	 */
	public void setBuildingEnergyRatingType(BuildingEnergyRatingType value) {
		this.buildingEnergyRatingType = value;
	}

	/**
	 * Ruft den Wert der additionalArea-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getAdditionalArea() {
		return additionalArea;
	}

	/**
	 * Legt den Wert der additionalArea-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setAdditionalArea(Double value) {
		this.additionalArea = value;
	}

	/**
	 * Ruft den Wert der numberOfFloors-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNumberOfFloors() {
		return numberOfFloors;
	}

	/**
	 * Legt den Wert der numberOfFloors-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNumberOfFloors(String value) {
		this.numberOfFloors = value;
	}

	/**
	 * Ruft den Wert der additionalCosts-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Price }
	 * 
	 */
	public Price getAdditionalCosts() {
		return additionalCosts;
	}

	/**
	 * Legt den Wert der additionalCosts-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Price }
	 * 
	 */
	public void setAdditionalCosts(Price value) {
		this.additionalCosts = value;
	}

}
