//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.04.19 um 09:36:45 AM CEST 
//


package de.immobilienscout24.rest.schema.common._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für BaseContactDetails complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BaseContactDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="email" type="{http://rest.immobilienscout24.de/schema/common/1.0}Email" minOccurs="0"/>
 *         &lt;element name="salutation" type="{http://rest.immobilienscout24.de/schema/common/1.0}SalutationType" minOccurs="0"/>
 *         &lt;element name="firstname" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="lastname" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="faxNumberCountryCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\+[1-9]\d{0,3}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="faxNumberAreaCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d{1,10}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="faxNumberSubscriber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[\d][\d \-]{0,24}[\d]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="faxNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="(\+[1-9]\d{0,3}) +\d{1,10} +([\d][\d \-]{0,24}[\d])"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="phoneNumberCountryCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\+[1-9]\d{0,3}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="phoneNumberAreaCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d{1,10}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="phoneNumberSubscriber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[\d][\d \-]{0,24}[\d]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="phoneNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="(\+[1-9]\d{0,3}) +\d{1,10} +([\d][\d \-]{0,24}[\d])"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cellPhoneNumberCountryCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\+[1-9]\d{0,3}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cellPhoneNumberAreaCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d{1,10}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cellPhoneNumberSubscriber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[\d][\d \-]{0,24}[\d]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cellPhoneNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="(\+[1-9]\d{0,3}) +\d{1,10} +([\d][\d \-]{0,24}[\d])"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="address" type="{http://rest.immobilienscout24.de/schema/common/1.0}Address" minOccurs="0"/>
 *         &lt;element name="countryCode" type="{http://rest.immobilienscout24.de/schema/common/1.0}CountryCode" minOccurs="0"/>
 *         &lt;element name="title" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="additionName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="company" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="homepageUrl" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyURI">
 *               &lt;maxLength value="300"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="portraitUrl" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyURI">
 *               &lt;maxLength value="300"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="position" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseContactDetails", propOrder = {
    "email",
    "salutation",
    "firstname",
    "lastname",
    "faxNumberCountryCode",
    "faxNumberAreaCode",
    "faxNumberSubscriber",
    "faxNumber",
    "phoneNumberCountryCode",
    "phoneNumberAreaCode",
    "phoneNumberSubscriber",
    "phoneNumber",
    "cellPhoneNumberCountryCode",
    "cellPhoneNumberAreaCode",
    "cellPhoneNumberSubscriber",
    "cellPhoneNumber",
    "address",
    "countryCode",
    "title",
    "additionName",
    "company",
    "homepageUrl",
    "portraitUrl",
    "position"
})
@XmlSeeAlso({
    ContactDetails.class,
    MasterDataContactDetailsType.class
})
public class BaseContactDetails {

    protected String email;
    protected SalutationType salutation;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String firstname;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String lastname;
    protected String faxNumberCountryCode;
    protected String faxNumberAreaCode;
    protected String faxNumberSubscriber;
    protected String faxNumber;
    protected String phoneNumberCountryCode;
    protected String phoneNumberAreaCode;
    protected String phoneNumberSubscriber;
    protected String phoneNumber;
    protected String cellPhoneNumberCountryCode;
    protected String cellPhoneNumberAreaCode;
    protected String cellPhoneNumberSubscriber;
    protected String cellPhoneNumber;
    protected Address address;
    protected CountryCode countryCode;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String title;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String additionName;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String company;
    protected String homepageUrl;
    protected String portraitUrl;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String position;

    /**
     * Ruft den Wert der email-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Legt den Wert der email-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Ruft den Wert der salutation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SalutationType }
     *     
     */
    public SalutationType getSalutation() {
        return salutation;
    }

    /**
     * Legt den Wert der salutation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SalutationType }
     *     
     */
    public void setSalutation(SalutationType value) {
        this.salutation = value;
    }

    /**
     * Ruft den Wert der firstname-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Legt den Wert der firstname-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstname(String value) {
        this.firstname = value;
    }

    /**
     * Ruft den Wert der lastname-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Legt den Wert der lastname-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastname(String value) {
        this.lastname = value;
    }

    /**
     * Ruft den Wert der faxNumberCountryCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxNumberCountryCode() {
        return faxNumberCountryCode;
    }

    /**
     * Legt den Wert der faxNumberCountryCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxNumberCountryCode(String value) {
        this.faxNumberCountryCode = value;
    }

    /**
     * Ruft den Wert der faxNumberAreaCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxNumberAreaCode() {
        return faxNumberAreaCode;
    }

    /**
     * Legt den Wert der faxNumberAreaCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxNumberAreaCode(String value) {
        this.faxNumberAreaCode = value;
    }

    /**
     * Ruft den Wert der faxNumberSubscriber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxNumberSubscriber() {
        return faxNumberSubscriber;
    }

    /**
     * Legt den Wert der faxNumberSubscriber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxNumberSubscriber(String value) {
        this.faxNumberSubscriber = value;
    }

    /**
     * Ruft den Wert der faxNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxNumber() {
        return faxNumber;
    }

    /**
     * Legt den Wert der faxNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxNumber(String value) {
        this.faxNumber = value;
    }

    /**
     * Ruft den Wert der phoneNumberCountryCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumberCountryCode() {
        return phoneNumberCountryCode;
    }

    /**
     * Legt den Wert der phoneNumberCountryCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumberCountryCode(String value) {
        this.phoneNumberCountryCode = value;
    }

    /**
     * Ruft den Wert der phoneNumberAreaCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumberAreaCode() {
        return phoneNumberAreaCode;
    }

    /**
     * Legt den Wert der phoneNumberAreaCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumberAreaCode(String value) {
        this.phoneNumberAreaCode = value;
    }

    /**
     * Ruft den Wert der phoneNumberSubscriber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumberSubscriber() {
        return phoneNumberSubscriber;
    }

    /**
     * Legt den Wert der phoneNumberSubscriber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumberSubscriber(String value) {
        this.phoneNumberSubscriber = value;
    }

    /**
     * Ruft den Wert der phoneNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Legt den Wert der phoneNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Ruft den Wert der cellPhoneNumberCountryCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellPhoneNumberCountryCode() {
        return cellPhoneNumberCountryCode;
    }

    /**
     * Legt den Wert der cellPhoneNumberCountryCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellPhoneNumberCountryCode(String value) {
        this.cellPhoneNumberCountryCode = value;
    }

    /**
     * Ruft den Wert der cellPhoneNumberAreaCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellPhoneNumberAreaCode() {
        return cellPhoneNumberAreaCode;
    }

    /**
     * Legt den Wert der cellPhoneNumberAreaCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellPhoneNumberAreaCode(String value) {
        this.cellPhoneNumberAreaCode = value;
    }

    /**
     * Ruft den Wert der cellPhoneNumberSubscriber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellPhoneNumberSubscriber() {
        return cellPhoneNumberSubscriber;
    }

    /**
     * Legt den Wert der cellPhoneNumberSubscriber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellPhoneNumberSubscriber(String value) {
        this.cellPhoneNumberSubscriber = value;
    }

    /**
     * Ruft den Wert der cellPhoneNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    /**
     * Legt den Wert der cellPhoneNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellPhoneNumber(String value) {
        this.cellPhoneNumber = value;
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
     * Ruft den Wert der countryCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CountryCode }
     *     
     */
    public CountryCode getCountryCode() {
        return countryCode;
    }

    /**
     * Legt den Wert der countryCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCode }
     *     
     */
    public void setCountryCode(CountryCode value) {
        this.countryCode = value;
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
     * Ruft den Wert der additionName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionName() {
        return additionName;
    }

    /**
     * Legt den Wert der additionName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionName(String value) {
        this.additionName = value;
    }

    /**
     * Ruft den Wert der company-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Legt den Wert der company-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
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
     * Ruft den Wert der portraitUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortraitUrl() {
        return portraitUrl;
    }

    /**
     * Legt den Wert der portraitUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortraitUrl(String value) {
        this.portraitUrl = value;
    }

    /**
     * Ruft den Wert der position-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        return position;
    }

    /**
     * Legt den Wert der position-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
    }

}
