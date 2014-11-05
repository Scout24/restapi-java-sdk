//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.11.05 um 11:50:50 AM CET 
//


package de.immobilienscout24.rest.schema.common._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Die Kontaktdaten eines Anbieters
 * 
 * <p>Java-Klasse für RealtorContactDetails complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RealtorContactDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/common/1.0}ContactDetails">
 *       &lt;sequence>
 *         &lt;element name="defaultContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="localPartnerContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="businessCardContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="realEstateReferenceCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="externalId" type="{http://rest.immobilienscout24.de/schema/common/1.0}TextField" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RealtorContactDetails", propOrder = {
    "defaultContact",
    "localPartnerContact",
    "businessCardContact",
    "realEstateReferenceCount",
    "externalId"
})
public class RealtorContactDetails
    extends ContactDetails
{

    protected Boolean defaultContact;
    protected Boolean localPartnerContact;
    protected Boolean businessCardContact;
    protected Long realEstateReferenceCount;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String externalId;

    /**
     * Ruft den Wert der defaultContact-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultContact() {
        return defaultContact;
    }

    /**
     * Legt den Wert der defaultContact-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultContact(Boolean value) {
        this.defaultContact = value;
    }

    /**
     * Ruft den Wert der localPartnerContact-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalPartnerContact() {
        return localPartnerContact;
    }

    /**
     * Legt den Wert der localPartnerContact-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalPartnerContact(Boolean value) {
        this.localPartnerContact = value;
    }

    /**
     * Ruft den Wert der businessCardContact-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBusinessCardContact() {
        return businessCardContact;
    }

    /**
     * Legt den Wert der businessCardContact-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBusinessCardContact(Boolean value) {
        this.businessCardContact = value;
    }

    /**
     * Ruft den Wert der realEstateReferenceCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRealEstateReferenceCount() {
        return realEstateReferenceCount;
    }

    /**
     * Legt den Wert der realEstateReferenceCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRealEstateReferenceCount(Long value) {
        this.realEstateReferenceCount = value;
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
