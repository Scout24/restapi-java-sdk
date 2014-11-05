//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.11.05 um 11:50:50 AM CET 
//


package de.immobilienscout24.rest.schema.offer.realestateproject._1;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import de.immobilienscout24.rest.schema.common._1.Address;
import de.immobilienscout24.rest.schema.common._1.AreaRangeMandatory;
import de.immobilienscout24.rest.schema.common._1.InteriorQuality;
import de.immobilienscout24.rest.schema.common._1.PriceRangeMandatory;


/**
 * realestateproject
 * 
 * <p>Java-Klasse für RealEstateProject complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RealEstateProject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="price" type="{http://rest.immobilienscout24.de/schema/common/1.0}PriceRangeMandatory"/>
 *         &lt;element name="space" type="{http://rest.immobilienscout24.de/schema/common/1.0}AreaRangeMandatory"/>
 *         &lt;element name="minPriceProQm" type="{http://rest.immobilienscout24.de/schema/common/1.0}Number13.2Type" minOccurs="0"/>
 *         &lt;element name="numberOfHousingUnit">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="interiorQuality" type="{http://rest.immobilienscout24.de/schema/common/1.0}InteriorQuality"/>
 *         &lt;element name="freeFrom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="address" type="{http://rest.immobilienscout24.de/schema/common/1.0}Address"/>
 *         &lt;element name="relaEstateProjectEntries" type="{http://rest.immobilienscout24.de/schema/offer/realestateproject/1.0}RealEstateProjectEntries" minOccurs="0"/>
 *         &lt;element name="homepageUrl" type="{http://rest.immobilienscout24.de/schema/common/1.0}uri" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RealEstateProject", propOrder = {
    "title",
    "price",
    "space",
    "minPriceProQm",
    "numberOfHousingUnit",
    "interiorQuality",
    "freeFrom",
    "address",
    "relaEstateProjectEntries",
    "homepageUrl"
})
public class RealEstateProject {

    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected PriceRangeMandatory price;
    @XmlElement(required = true)
    protected AreaRangeMandatory space;
    protected BigDecimal minPriceProQm;
    protected int numberOfHousingUnit;
    @XmlElement(required = true)
    protected InteriorQuality interiorQuality;
    @XmlElement(required = true)
    protected String freeFrom;
    @XmlElement(required = true)
    protected Address address;
    protected RealEstateProjectEntries relaEstateProjectEntries;
    protected String homepageUrl;
    @XmlAttribute(name = "id")
    protected Long id;

    /**
     * Ruft den Wert der title-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Legt den Wert der title-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Ruft den Wert der price-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PriceRangeMandatory }
     *     
     */
    public PriceRangeMandatory getPrice() {
        return price;
    }

    /**
     * Legt den Wert der price-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRangeMandatory }
     *     
     */
    public void setPrice(PriceRangeMandatory value) {
        this.price = value;
    }

    /**
     * Ruft den Wert der space-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AreaRangeMandatory }
     *     
     */
    public AreaRangeMandatory getSpace() {
        return space;
    }

    /**
     * Legt den Wert der space-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaRangeMandatory }
     *     
     */
    public void setSpace(AreaRangeMandatory value) {
        this.space = value;
    }

    /**
     * Ruft den Wert der minPriceProQm-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinPriceProQm() {
        return minPriceProQm;
    }

    /**
     * Legt den Wert der minPriceProQm-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinPriceProQm(BigDecimal value) {
        this.minPriceProQm = value;
    }

    /**
     * Ruft den Wert der numberOfHousingUnit-Eigenschaft ab.
     * 
     */
    public int getNumberOfHousingUnit() {
        return numberOfHousingUnit;
    }

    /**
     * Legt den Wert der numberOfHousingUnit-Eigenschaft fest.
     * 
     */
    public void setNumberOfHousingUnit(int value) {
        this.numberOfHousingUnit = value;
    }

    /**
     * Ruft den Wert der interiorQuality-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InteriorQuality }
     *     
     */
    public InteriorQuality getInteriorQuality() {
        return interiorQuality;
    }

    /**
     * Legt den Wert der interiorQuality-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InteriorQuality }
     *     
     */
    public void setInteriorQuality(InteriorQuality value) {
        this.interiorQuality = value;
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
     * Ruft den Wert der address-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Legt den Wert der address-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Ruft den Wert der relaEstateProjectEntries-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RealEstateProjectEntries }
     *     
     */
    public RealEstateProjectEntries getRelaEstateProjectEntries() {
        return relaEstateProjectEntries;
    }

    /**
     * Legt den Wert der relaEstateProjectEntries-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RealEstateProjectEntries }
     *     
     */
    public void setRelaEstateProjectEntries(RealEstateProjectEntries value) {
        this.relaEstateProjectEntries = value;
    }

    /**
     * Ruft den Wert der homepageUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomepageUrl() {
        return homepageUrl;
    }

    /**
     * Legt den Wert der homepageUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomepageUrl(String value) {
        this.homepageUrl = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

}
