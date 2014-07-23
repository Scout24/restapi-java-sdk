//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.06.23 um 09:51:43 AM CEST 
//


package de.immobilienscout24.rest.schema.offer.realestates._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import de.immobilienscout24.rest.schema.common._1.AbstractRealEstate;
import de.immobilienscout24.rest.schema.common._1.Adapter1;
import de.immobilienscout24.rest.schema.common._1.PublishChannels;


/**
 * Allgemeine Elemente fr
 * 				alle Immobilienarten.
 * 
 * <p>Java-Klasse fr RealEstate complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RealEstate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/common/1.0}AbstractRealEstate">
 *       &lt;sequence>
 *         &lt;element name="showAddress" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="contact" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *                 &lt;attribute name="externalId" type="{http://rest.immobilienscout24.de/schema/common/1.0}TextField" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://rest.immobilienscout24.de/schema/common/1.0}publishChannels" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RealEstate", propOrder = {
    "showAddress",
    "contact",
    "publishChannels"
})
@XmlSeeAlso({
    Office.class,
    SpecialPurpose.class,
    LivingRentSite.class,
    Store.class,
    GarageRent.class,
    Gastronomy.class,
    ApartmentBuy.class,
    HouseBuy.class,
    GarageBuy.class,
    Investment.class,
    FlatShareRoom.class,
    ApartmentRent.class,
    CompulsoryAuction.class,
    LivingBuySite.class,
    SeniorCare.class,
    HouseType.class,
    ShortTermAccommodation.class,
    Industry.class,
    AssistedLiving.class,
    TradeSite.class,
    HouseRent.class
})
public abstract class RealEstate
    extends AbstractRealEstate
{

    @XmlElement(defaultValue = "false")
    protected boolean showAddress;
    protected RealEstate.Contact contact;
    @XmlElement(namespace = "http://rest.immobilienscout24.de/schema/common/1.0")
    protected PublishChannels publishChannels;

    /**
     * Ruft den Wert der showAddress-Eigenschaft ab.
     * 
     */
    public boolean isShowAddress() {
        return showAddress;
    }

    /**
     * Legt den Wert der showAddress-Eigenschaft fest.
     * 
     */
    public void setShowAddress(boolean value) {
        this.showAddress = value;
    }

    /**
     * Ruft den Wert der contact-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RealEstate.Contact }
     *     
     */
    public RealEstate.Contact getContact() {
        return contact;
    }

    /**
     * Legt den Wert der contact-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RealEstate.Contact }
     *     
     */
    public void setContact(RealEstate.Contact value) {
        this.contact = value;
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
     * Verweis auf einen Anbieterkontakt.
     * 
     * <p>Java-Klasse fr anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
     *       &lt;attribute name="externalId" type="{http://rest.immobilienscout24.de/schema/common/1.0}TextField" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Contact {

        @XmlAttribute(name = "id")
        protected Long id;
        @XmlAttribute(name = "externalId")
        @XmlJavaTypeAdapter(Adapter1 .class)
        protected String externalId;

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

        /**
         * Ruft den Wert der externalId-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExternalId() {
            return externalId;
        }

        /**
         * Legt den Wert der externalId-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExternalId(String value) {
            this.externalId = value;
        }

    }

}
