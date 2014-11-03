//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.10.22 um 03:41:54 PM CEST 
//


package de.immobilienscout24.rest.schema.offer.listelement._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import de.immobilienscout24.rest.schema.common._1.AbstractRealEstateForList;
import de.immobilienscout24.rest.schema.common._1.Picture;
import de.immobilienscout24.rest.schema.common._1.PublishChannels;
import de.immobilienscout24.rest.schema.common._1.RealEstateState;


/**
 * Allgemeine Elemente fr alle Immobilienarten.
 * 
 * <p>Java-Klasse fr OfferRealEstateForList complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OfferRealEstateForList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/common/1.0}AbstractRealEstateForList">
 *       &lt;sequence>
 *         &lt;element name="state" type="{http://rest.immobilienscout24.de/schema/common/1.0}RealEstateState"/>
 *         &lt;element name="titlePicture" type="{http://rest.immobilienscout24.de/schema/common/1.0}Picture"/>
 *         &lt;element name="floorplan" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;sequence>
 *           &lt;element ref="{http://rest.immobilienscout24.de/schema/common/1.0}publishChannels" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://rest.immobilienscout24.de/schema/offer/listelement/1.0}Reference"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferRealEstateForList", propOrder = {
    "state",
    "titlePicture",
    "floorplan",
    "publishChannels"
})
@XmlSeeAlso({
    OfferTradeSite.class,
    OfferHouseBuy.class,
    OfferGarageRent.class,
    OfferSpecialPurpose.class,
    OfferLivingRentSite.class,
    OfferGarageBuy.class,
    OfferApartmentBuy.class,
    OfferStore.class,
    OfferApartmentRent.class,
    OfferFlatShareRoom.class,
    OfferIndustry.class,
    OfferCompulsoryAuction.class,
    OfferSeniorCare.class,
    OfferAssistedLiving.class,
    OfferHouseType.class,
    OfferInvestment.class,
    OfferHouseRent.class,
    OfferGastronomy.class,
    OfferShortTermAccommodation.class,
    OfferOffice.class,
    OfferLivingBuySite.class
})
public abstract class OfferRealEstateForList
    extends AbstractRealEstateForList
{

    @XmlElement(required = true)
    protected RealEstateState state;
    @XmlElement(required = true)
    protected Picture titlePicture;
    protected Boolean floorplan;
    @XmlElement(namespace = "http://rest.immobilienscout24.de/schema/common/1.0")
    protected PublishChannels publishChannels;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anyURI")
    protected String href;
    @XmlAttribute(name = "modification")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modification;
    @XmlAttribute(name = "creation")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creation;
    @XmlAttribute(name = "publishDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publishDate;

    /**
     * Ruft den Wert der state-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RealEstateState }
     *     
     */
    public RealEstateState getState() {
        return state;
    }

    /**
     * Legt den Wert der state-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RealEstateState }
     *     
     */
    public void setState(RealEstateState value) {
        this.state = value;
    }

    /**
     * Ruft den Wert der titlePicture-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Picture }
     *     
     */
    public Picture getTitlePicture() {
        return titlePicture;
    }

    /**
     * Legt den Wert der titlePicture-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Picture }
     *     
     */
    public void setTitlePicture(Picture value) {
        this.titlePicture = value;
    }

    /**
     * Ruft den Wert der floorplan-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFloorplan() {
        return floorplan;
    }

    /**
     * Legt den Wert der floorplan-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFloorplan(Boolean value) {
        this.floorplan = value;
    }

    /**
     * Ruft den Wert der publishChannels-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PublishChannels }
     *     
     */
    public PublishChannels getPublishChannels() {
        return publishChannels;
    }

    /**
     * Legt den Wert der publishChannels-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PublishChannels }
     *     
     */
    public void setPublishChannels(PublishChannels value) {
        this.publishChannels = value;
    }

    /**
     * Link zum Element.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Legt den Wert der href-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Ruft den Wert der modification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModification() {
        return modification;
    }

    /**
     * Legt den Wert der modification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModification(XMLGregorianCalendar value) {
        this.modification = value;
    }

    /**
     * Ruft den Wert der creation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreation() {
        return creation;
    }

    /**
     * Legt den Wert der creation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreation(XMLGregorianCalendar value) {
        this.creation = value;
    }

    /**
     * Ruft den Wert der publishDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublishDate() {
        return publishDate;
    }

    /**
     * Legt den Wert der publishDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublishDate(XMLGregorianCalendar value) {
        this.publishDate = value;
    }

}
