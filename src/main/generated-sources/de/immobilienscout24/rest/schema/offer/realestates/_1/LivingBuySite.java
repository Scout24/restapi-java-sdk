//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.04.19 um 09:36:45 AM CEST 
//


package de.immobilienscout24.rest.schema.offer.realestates._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import de.immobilienscout24.rest.schema.common._1.Adapter1;
import de.immobilienscout24.rest.schema.common._1.CommercializationType;
import de.immobilienscout24.rest.schema.common._1.CourtageInfo;
import de.immobilienscout24.rest.schema.common._1.LeaseIntervalType;
import de.immobilienscout24.rest.schema.common._1.Price;
import de.immobilienscout24.rest.schema.common._1.SiteConstructibleType;
import de.immobilienscout24.rest.schema.common._1.SiteDevelopmentType;
import de.immobilienscout24.rest.schema.common._1.SiteRecommendedUseTypes;


/**
 * Eigenschaften für den Immobilientyp "Wohngrundstück zum Kauf"
 * 
 * <p>Java-Klasse für LivingBuySite complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LivingBuySite">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/offer/realestates/1.0}RealEstate">
 *       &lt;sequence>
 *         &lt;group ref="{http://rest.immobilienscout24.de/schema/common/1.0}ExtendedLivingBuySiteGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LivingBuySite", propOrder = {
    "commercializationType",
    "recommendedUseTypes",
    "tenancy",
    "price",
    "plotArea",
    "minDivisible",
    "courtage",
    "freeFrom",
    "shortTermConstructible",
    "buildingPermission",
    "demolition",
    "siteDevelopmentType",
    "siteConstructibleType",
    "grz",
    "gfz",
    "leaseInterval"
})
public class LivingBuySite
    extends RealEstate
{

    @XmlElement(required = true)
    protected CommercializationType commercializationType;
    protected SiteRecommendedUseTypes recommendedUseTypes;
    protected Integer tenancy;
    @XmlElement(required = true)
    protected Price price;
    protected double plotArea;
    protected Double minDivisible;
    @XmlElement(required = true)
    protected CourtageInfo courtage;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String freeFrom;
    protected Boolean shortTermConstructible;
    protected Boolean buildingPermission;
    protected Boolean demolition;
    protected SiteDevelopmentType siteDevelopmentType;
    protected SiteConstructibleType siteConstructibleType;
    protected Double grz;
    protected Double gfz;
    protected LeaseIntervalType leaseInterval;

    /**
     * Ruft den Wert der commercializationType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CommercializationType }
     *     
     */
    public CommercializationType getCommercializationType() {
        return commercializationType;
    }

    /**
     * Legt den Wert der commercializationType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CommercializationType }
     *     
     */
    public void setCommercializationType(CommercializationType value) {
        this.commercializationType = value;
    }

    /**
     * Ruft den Wert der recommendedUseTypes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SiteRecommendedUseTypes }
     *     
     */
    public SiteRecommendedUseTypes getRecommendedUseTypes() {
        return recommendedUseTypes;
    }

    /**
     * Legt den Wert der recommendedUseTypes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteRecommendedUseTypes }
     *     
     */
    public void setRecommendedUseTypes(SiteRecommendedUseTypes value) {
        this.recommendedUseTypes = value;
    }

    /**
     * Ruft den Wert der tenancy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTenancy() {
        return tenancy;
    }

    /**
     * Legt den Wert der tenancy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTenancy(Integer value) {
        this.tenancy = value;
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
     * Ruft den Wert der minDivisible-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinDivisible() {
        return minDivisible;
    }

    /**
     * Legt den Wert der minDivisible-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinDivisible(Double value) {
        this.minDivisible = value;
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
     * Ruft den Wert der freeFrom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeFrom() {
        return freeFrom;
    }

    /**
     * Legt den Wert der freeFrom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeFrom(String value) {
        this.freeFrom = value;
    }

    /**
     * Ruft den Wert der shortTermConstructible-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShortTermConstructible() {
        return shortTermConstructible;
    }

    /**
     * Legt den Wert der shortTermConstructible-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShortTermConstructible(Boolean value) {
        this.shortTermConstructible = value;
    }

    /**
     * Ruft den Wert der buildingPermission-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBuildingPermission() {
        return buildingPermission;
    }

    /**
     * Legt den Wert der buildingPermission-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBuildingPermission(Boolean value) {
        this.buildingPermission = value;
    }

    /**
     * Ruft den Wert der demolition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDemolition() {
        return demolition;
    }

    /**
     * Legt den Wert der demolition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDemolition(Boolean value) {
        this.demolition = value;
    }

    /**
     * Ruft den Wert der siteDevelopmentType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SiteDevelopmentType }
     *     
     */
    public SiteDevelopmentType getSiteDevelopmentType() {
        return siteDevelopmentType;
    }

    /**
     * Legt den Wert der siteDevelopmentType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteDevelopmentType }
     *     
     */
    public void setSiteDevelopmentType(SiteDevelopmentType value) {
        this.siteDevelopmentType = value;
    }

    /**
     * Ruft den Wert der siteConstructibleType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SiteConstructibleType }
     *     
     */
    public SiteConstructibleType getSiteConstructibleType() {
        return siteConstructibleType;
    }

    /**
     * Legt den Wert der siteConstructibleType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteConstructibleType }
     *     
     */
    public void setSiteConstructibleType(SiteConstructibleType value) {
        this.siteConstructibleType = value;
    }

    /**
     * Ruft den Wert der grz-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGrz() {
        return grz;
    }

    /**
     * Legt den Wert der grz-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGrz(Double value) {
        this.grz = value;
    }

    /**
     * Ruft den Wert der gfz-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGfz() {
        return gfz;
    }

    /**
     * Legt den Wert der gfz-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGfz(Double value) {
        this.gfz = value;
    }

    /**
     * Ruft den Wert der leaseInterval-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LeaseIntervalType }
     *     
     */
    public LeaseIntervalType getLeaseInterval() {
        return leaseInterval;
    }

    /**
     * Legt den Wert der leaseInterval-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LeaseIntervalType }
     *     
     */
    public void setLeaseInterval(LeaseIntervalType value) {
        this.leaseInterval = value;
    }

}
