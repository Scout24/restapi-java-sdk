//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.11.05 um 11:03:21 AM CET 
//


package de.immobilienscout24.rest.schema.common._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;

import de.immobilienscout24.rest.schema.offer.listelement._1.OfferRealEstateForList;


/**
 * Allgemeine Elemente für alle Immobilienarten.
 * 
 * <p>Java-Klasse für AbstractRealEstateForList complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractRealEstateForList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="externalId" type="{http://rest.immobilienscout24.de/schema/common/1.0}TextField" minOccurs="0"/>
 *         &lt;element name="title">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastModificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="address" type="{http://rest.immobilienscout24.de/schema/common/1.0}Wgs84Address"/>
 *         &lt;element name="apiSearchData" type="{http://rest.immobilienscout24.de/schema/common/1.0}ApiSearchData" minOccurs="0"/>
 *         &lt;element name="realEstateState" type="{http://rest.immobilienscout24.de/schema/common/1.0}RealEstateState" minOccurs="0"/>
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
@XmlType(name = "AbstractRealEstateForList", propOrder = {
    "externalId",
    "title",
    "creationDate",
    "lastModificationDate",
    "address",
    "apiSearchData",
    "realEstateState"
})
@XmlSeeAlso({
    OfferRealEstateForList.class,
    AbstractRealEstate.class
})
public abstract class AbstractRealEstateForList {

    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String externalId;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String title;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModificationDate;
    @XmlElement(required = true)
    protected Wgs84Address address;
    protected ApiSearchData apiSearchData;
    protected RealEstateState realEstateState;
    @XmlAttribute(name = "id")
    protected Long id;

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
     * Ruft den Wert der creationDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Legt den Wert der creationDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Ruft den Wert der lastModificationDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModificationDate() {
        return lastModificationDate;
    }

    /**
     * Legt den Wert der lastModificationDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModificationDate(XMLGregorianCalendar value) {
        this.lastModificationDate = value;
    }

    /**
     * Ruft den Wert der address-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Wgs84Address }
     *     
     */
    public Wgs84Address getAddress() {
        return address;
    }

    /**
     * Legt den Wert der address-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Wgs84Address }
     *     
     */
    public void setAddress(Wgs84Address value) {
        this.address = value;
    }

    /**
     * Ruft den Wert der apiSearchData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ApiSearchData }
     *     
     */
    public ApiSearchData getApiSearchData() {
        return apiSearchData;
    }

    /**
     * Legt den Wert der apiSearchData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiSearchData }
     *     
     */
    public void setApiSearchData(ApiSearchData value) {
        this.apiSearchData = value;
    }

    /**
     * Ruft den Wert der realEstateState-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RealEstateState }
     *     
     */
    public RealEstateState getRealEstateState() {
        return realEstateState;
    }

    /**
     * Legt den Wert der realEstateState-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RealEstateState }
     *     
     */
    public void setRealEstateState(RealEstateState value) {
        this.realEstateState = value;
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
