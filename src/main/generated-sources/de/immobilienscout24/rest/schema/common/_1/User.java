//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.10.22 um 03:41:54 PM CEST 
//


package de.immobilienscout24.rest.schema.common._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse fr User complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="User">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactDetails" type="{http://rest.immobilienscout24.de/schema/common/1.0}ContactDetails"/>
 *         &lt;element name="password" type="{http://rest.immobilienscout24.de/schema/common/1.0}Password"/>
 *         &lt;element name="sharedShortlistGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://rest.immobilienscout24.de/schema/common/1.0}TextField" />
 *       &lt;attribute name="peid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User", propOrder = {
    "contactDetails",
    "password",
    "sharedShortlistGroupId"
})
public class User {

    @XmlElement(required = true)
    protected ContactDetails contactDetails;
    @XmlElement(required = true)
    protected String password;
    protected Long sharedShortlistGroupId;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String id;
    @XmlAttribute(name = "peid")
    protected Long peid;

    /**
     * Ruft den Wert der contactDetails-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContactDetails }
     *     
     */
    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    /**
     * Legt den Wert der contactDetails-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDetails }
     *     
     */
    public void setContactDetails(ContactDetails value) {
        this.contactDetails = value;
    }

    /**
     * Ruft den Wert der password-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Legt den Wert der password-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Ruft den Wert der sharedShortlistGroupId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSharedShortlistGroupId() {
        return sharedShortlistGroupId;
    }

    /**
     * Legt den Wert der sharedShortlistGroupId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSharedShortlistGroupId(Long value) {
        this.sharedShortlistGroupId = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der peid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPeid() {
        return peid;
    }

    /**
     * Legt den Wert der peid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPeid(Long value) {
        this.peid = value;
    }

}
