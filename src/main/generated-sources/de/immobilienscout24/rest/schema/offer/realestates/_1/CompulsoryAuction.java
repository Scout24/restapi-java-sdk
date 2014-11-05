//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.11.05 um 11:50:50 AM CET 
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
import de.immobilienscout24.rest.schema.common._1.BuildingEnergyRatingType;
import de.immobilienscout24.rest.schema.common._1.CompulsoryAuctionType;
import de.immobilienscout24.rest.schema.common._1.CountyCourt;
import de.immobilienscout24.rest.schema.common._1.EnergyPerformanceCertificate;
import de.immobilienscout24.rest.schema.common._1.EnergySourcesEnev2014;
import de.immobilienscout24.rest.schema.common._1.HeatingTypeEnev2014;
import de.immobilienscout24.rest.schema.common._1.Price;
import de.immobilienscout24.rest.schema.common._1.YesNotApplicableType;


/**
 * Eigenschaften für den Immobilientyp "Zwangsversteigerungsobjekte"
 * 
 * <p>Java-Klasse für CompulsoryAuction complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CompulsoryAuction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/offer/realestates/1.0}RealEstate">
 *       &lt;sequence>
 *         &lt;group ref="{http://rest.immobilienscout24.de/schema/common/1.0}ExtendedCompulsoryAuctionGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompulsoryAuction", propOrder = {
    "marketValue",
    "lowestBid",
    "recurrenceAppointment",
    "dateOfAuction",
    "lastChangeDate",
    "cancellationDate",
    "recordationDate",
    "area",
    "auctionObjectType",
    "countyCourt",
    "fileReferenceAtCountyCourt",
    "numberOfFolio",
    "splittingAuction",
    "owner",
    "energyCertificate",
    "heatingTypeEnev2014",
    "energySourcesEnev2014",
    "buildingEnergyRatingType",
    "thermalCharacteristic",
    "energyConsumptionContainsWarmWater",
    "constructionYear",
    "constructionYearUnknown"
})
public class CompulsoryAuction
    extends RealEstate
{

    @XmlElement(required = true)
    protected Price marketValue;
    protected Price lowestBid;
    @XmlElement(defaultValue = "false")
    protected Boolean recurrenceAppointment;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfAuction;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastChangeDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cancellationDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar recordationDate;
    protected double area;
    @XmlElement(required = true)
    protected CompulsoryAuctionType auctionObjectType;
    protected CountyCourt countyCourt;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String fileReferenceAtCountyCourt;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String numberOfFolio;
    @XmlElement(defaultValue = "false")
    protected Boolean splittingAuction;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String owner;
    protected EnergyPerformanceCertificate energyCertificate;
    protected HeatingTypeEnev2014 heatingTypeEnev2014;
    protected EnergySourcesEnev2014 energySourcesEnev2014;
    protected BuildingEnergyRatingType buildingEnergyRatingType;
    protected Double thermalCharacteristic;
    protected YesNotApplicableType energyConsumptionContainsWarmWater;
    protected Integer constructionYear;
    protected Boolean constructionYearUnknown;

    /**
     * Ruft den Wert der marketValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getMarketValue() {
        return marketValue;
    }

    /**
     * Legt den Wert der marketValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setMarketValue(Price value) {
        this.marketValue = value;
    }

    /**
     * Ruft den Wert der lowestBid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getLowestBid() {
        return lowestBid;
    }

    /**
     * Legt den Wert der lowestBid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setLowestBid(Price value) {
        this.lowestBid = value;
    }

    /**
     * Ruft den Wert der recurrenceAppointment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecurrenceAppointment() {
        return recurrenceAppointment;
    }

    /**
     * Legt den Wert der recurrenceAppointment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecurrenceAppointment(Boolean value) {
        this.recurrenceAppointment = value;
    }

    /**
     * Ruft den Wert der dateOfAuction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfAuction() {
        return dateOfAuction;
    }

    /**
     * Legt den Wert der dateOfAuction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfAuction(XMLGregorianCalendar value) {
        this.dateOfAuction = value;
    }

    /**
     * Ruft den Wert der lastChangeDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastChangeDate() {
        return lastChangeDate;
    }

    /**
     * Legt den Wert der lastChangeDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastChangeDate(XMLGregorianCalendar value) {
        this.lastChangeDate = value;
    }

    /**
     * Ruft den Wert der cancellationDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancellationDate() {
        return cancellationDate;
    }

    /**
     * Legt den Wert der cancellationDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancellationDate(XMLGregorianCalendar value) {
        this.cancellationDate = value;
    }

    /**
     * Ruft den Wert der recordationDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecordationDate() {
        return recordationDate;
    }

    /**
     * Legt den Wert der recordationDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecordationDate(XMLGregorianCalendar value) {
        this.recordationDate = value;
    }

    /**
     * Ruft den Wert der area-Eigenschaft ab.
     * 
     */
    public double getArea() {
        return area;
    }

    /**
     * Legt den Wert der area-Eigenschaft fest.
     * 
     */
    public void setArea(double value) {
        this.area = value;
    }

    /**
     * Ruft den Wert der auctionObjectType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CompulsoryAuctionType }
     *     
     */
    public CompulsoryAuctionType getAuctionObjectType() {
        return auctionObjectType;
    }

    /**
     * Legt den Wert der auctionObjectType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CompulsoryAuctionType }
     *     
     */
    public void setAuctionObjectType(CompulsoryAuctionType value) {
        this.auctionObjectType = value;
    }

    /**
     * Ruft den Wert der countyCourt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CountyCourt }
     *     
     */
    public CountyCourt getCountyCourt() {
        return countyCourt;
    }

    /**
     * Legt den Wert der countyCourt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CountyCourt }
     *     
     */
    public void setCountyCourt(CountyCourt value) {
        this.countyCourt = value;
    }

    /**
     * Ruft den Wert der fileReferenceAtCountyCourt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileReferenceAtCountyCourt() {
        return fileReferenceAtCountyCourt;
    }

    /**
     * Legt den Wert der fileReferenceAtCountyCourt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileReferenceAtCountyCourt(String value) {
        this.fileReferenceAtCountyCourt = value;
    }

    /**
     * Ruft den Wert der numberOfFolio-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfFolio() {
        return numberOfFolio;
    }

    /**
     * Legt den Wert der numberOfFolio-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfFolio(String value) {
        this.numberOfFolio = value;
    }

    /**
     * Ruft den Wert der splittingAuction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSplittingAuction() {
        return splittingAuction;
    }

    /**
     * Legt den Wert der splittingAuction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSplittingAuction(Boolean value) {
        this.splittingAuction = value;
    }

    /**
     * Ruft den Wert der owner-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Legt den Wert der owner-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
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

}
