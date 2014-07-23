//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.06.23 um 09:51:43 AM CEST 
//


package de.immobilienscout24.rest.schema.common._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import de.immobilienscout24.rest.schema.offer.realestates._1.RealEstate;


/**
 * Allgemeine Elemente fr alle Immobilienarten im Expose.
 *             
 * 
 * <p>Java-Klasse fr AbstractRealEstate complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractRealEstate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/common/1.0}AbstractRealEstateForList">
 *       &lt;sequence>
 *         &lt;element name="groupNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="2147483647"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="descriptionNote" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="furnishingNote" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="locationNote" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="otherNote" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="attachments" type="{http://rest.immobilienscout24.de/schema/common/1.0}Attachments" minOccurs="0"/>
 *         &lt;element name="referencePriceServiceCall" type="{http://rest.immobilienscout24.de/schema/common/1.0}uri" minOccurs="0"/>
 *         &lt;element name="referencePriceApiCall" type="{http://rest.immobilienscout24.de/schema/common/1.0}uri" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractRealEstate", propOrder = {
    "groupNumber",
    "descriptionNote",
    "furnishingNote",
    "locationNote",
    "otherNote",
    "attachments",
    "referencePriceServiceCall",
    "referencePriceApiCall"
})
@XmlSeeAlso({
    RealEstate.class
})
public abstract class AbstractRealEstate
    extends AbstractRealEstateForList
{

    protected Integer groupNumber;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String descriptionNote;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String furnishingNote;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String locationNote;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String otherNote;
    protected Attachments attachments;
    protected String referencePriceServiceCall;
    protected String referencePriceApiCall;

    /**
     * Ruft den Wert der groupNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGroupNumber() {
        return groupNumber;
    }

    /**
     * Legt den Wert der groupNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGroupNumber(Integer value) {
        this.groupNumber = value;
    }

    /**
     * Ruft den Wert der descriptionNote-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionNote() {
        return descriptionNote;
    }

    /**
     * Legt den Wert der descriptionNote-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionNote(String value) {
        this.descriptionNote = value;
    }

    /**
     * Ruft den Wert der furnishingNote-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFurnishingNote() {
        return furnishingNote;
    }

    /**
     * Legt den Wert der furnishingNote-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFurnishingNote(String value) {
        this.furnishingNote = value;
    }

    /**
     * Ruft den Wert der locationNote-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationNote() {
        return locationNote;
    }

    /**
     * Legt den Wert der locationNote-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationNote(String value) {
        this.locationNote = value;
    }

    /**
     * Ruft den Wert der otherNote-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherNote() {
        return otherNote;
    }

    /**
     * Legt den Wert der otherNote-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherNote(String value) {
        this.otherNote = value;
    }

    /**
     * Ruft den Wert der attachments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Attachments }
     *     
     */
    public Attachments getAttachments() {
        return attachments;
    }

    /**
     * Legt den Wert der attachments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachments }
     *     
     */
    public void setAttachments(Attachments value) {
        this.attachments = value;
    }

    /**
     * Ruft den Wert der referencePriceServiceCall-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencePriceServiceCall() {
        return referencePriceServiceCall;
    }

    /**
     * Legt den Wert der referencePriceServiceCall-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencePriceServiceCall(String value) {
        this.referencePriceServiceCall = value;
    }

    /**
     * Ruft den Wert der referencePriceApiCall-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencePriceApiCall() {
        return referencePriceApiCall;
    }

    /**
     * Legt den Wert der referencePriceApiCall-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencePriceApiCall(String value) {
        this.referencePriceApiCall = value;
    }

}
