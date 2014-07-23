//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.06.23 um 09:51:43 AM CEST 
//


package de.immobilienscout24.rest.schema.offer.realestates._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import de.immobilienscout24.rest.schema.common._1.Adapter1;
import de.immobilienscout24.rest.schema.common._1.CourtageInfo;
import de.immobilienscout24.rest.schema.common._1.HouseTypeBuildingType;
import de.immobilienscout24.rest.schema.common._1.HouseTypeConstructionMethodType;
import de.immobilienscout24.rest.schema.common._1.HouseTypeEnergyStandardType;
import de.immobilienscout24.rest.schema.common._1.HouseTypeStageOfCompletionType;
import de.immobilienscout24.rest.schema.common._1.Price;


/**
 * Eigenschaften fr den Immobilientyp "Typenhuser"
 * 
 * <p>Java-Klasse fr HouseType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="HouseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/offer/realestates/1.0}RealEstate">
 *       &lt;sequence>
 *         &lt;group ref="{http://rest.immobilienscout24.de/schema/common/1.0}ExtendedHouseTypeGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HouseType", propOrder = {
    "price",
    "livingSpace",
    "totalArea",
    "baseArea",
    "numberOfRooms",
    "courtage",
    "constructionMethod",
    "buildingType",
    "stageOfCompletionType",
    "energyStandardType",
    "uValue",
    "typeInformationNote",
    "modelInformationNote",
    "contructionPriceInformationNote",
    "floorInformationNote",
    "roofInformationNote"
})
public class HouseType
    extends RealEstate
{

    @XmlElement(required = true)
    protected Price price;
    protected double livingSpace;
    protected Double totalArea;
    protected Double baseArea;
    protected Double numberOfRooms;
    protected CourtageInfo courtage;
    protected HouseTypeConstructionMethodType constructionMethod;
    @XmlElement(required = true)
    protected HouseTypeBuildingType buildingType;
    protected HouseTypeStageOfCompletionType stageOfCompletionType;
    protected HouseTypeEnergyStandardType energyStandardType;
    protected Double uValue;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String typeInformationNote;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String modelInformationNote;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String contructionPriceInformationNote;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String floorInformationNote;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String roofInformationNote;

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
     * Ruft den Wert der totalArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalArea() {
        return totalArea;
    }

    /**
     * Legt den Wert der totalArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalArea(Double value) {
        this.totalArea = value;
    }

    /**
     * Ruft den Wert der baseArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBaseArea() {
        return baseArea;
    }

    /**
     * Legt den Wert der baseArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBaseArea(Double value) {
        this.baseArea = value;
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
     * Ruft den Wert der constructionMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HouseTypeConstructionMethodType }
     *     
     */
    public HouseTypeConstructionMethodType getConstructionMethod() {
        return constructionMethod;
    }

    /**
     * Legt den Wert der constructionMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseTypeConstructionMethodType }
     *     
     */
    public void setConstructionMethod(HouseTypeConstructionMethodType value) {
        this.constructionMethod = value;
    }

    /**
     * Ruft den Wert der buildingType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HouseTypeBuildingType }
     *     
     */
    public HouseTypeBuildingType getBuildingType() {
        return buildingType;
    }

    /**
     * Legt den Wert der buildingType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseTypeBuildingType }
     *     
     */
    public void setBuildingType(HouseTypeBuildingType value) {
        this.buildingType = value;
    }

    /**
     * Ruft den Wert der stageOfCompletionType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HouseTypeStageOfCompletionType }
     *     
     */
    public HouseTypeStageOfCompletionType getStageOfCompletionType() {
        return stageOfCompletionType;
    }

    /**
     * Legt den Wert der stageOfCompletionType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseTypeStageOfCompletionType }
     *     
     */
    public void setStageOfCompletionType(HouseTypeStageOfCompletionType value) {
        this.stageOfCompletionType = value;
    }

    /**
     * Ruft den Wert der energyStandardType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HouseTypeEnergyStandardType }
     *     
     */
    public HouseTypeEnergyStandardType getEnergyStandardType() {
        return energyStandardType;
    }

    /**
     * Legt den Wert der energyStandardType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseTypeEnergyStandardType }
     *     
     */
    public void setEnergyStandardType(HouseTypeEnergyStandardType value) {
        this.energyStandardType = value;
    }

    /**
     * Ruft den Wert der uValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUValue() {
        return uValue;
    }

    /**
     * Legt den Wert der uValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUValue(Double value) {
        this.uValue = value;
    }

    /**
     * Ruft den Wert der typeInformationNote-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeInformationNote() {
        return typeInformationNote;
    }

    /**
     * Legt den Wert der typeInformationNote-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeInformationNote(String value) {
        this.typeInformationNote = value;
    }

    /**
     * Ruft den Wert der modelInformationNote-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelInformationNote() {
        return modelInformationNote;
    }

    /**
     * Legt den Wert der modelInformationNote-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelInformationNote(String value) {
        this.modelInformationNote = value;
    }

    /**
     * Ruft den Wert der contructionPriceInformationNote-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContructionPriceInformationNote() {
        return contructionPriceInformationNote;
    }

    /**
     * Legt den Wert der contructionPriceInformationNote-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContructionPriceInformationNote(String value) {
        this.contructionPriceInformationNote = value;
    }

    /**
     * Ruft den Wert der floorInformationNote-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloorInformationNote() {
        return floorInformationNote;
    }

    /**
     * Legt den Wert der floorInformationNote-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloorInformationNote(String value) {
        this.floorInformationNote = value;
    }

    /**
     * Ruft den Wert der roofInformationNote-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoofInformationNote() {
        return roofInformationNote;
    }

    /**
     * Legt den Wert der roofInformationNote-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoofInformationNote(String value) {
        this.roofInformationNote = value;
    }

}
