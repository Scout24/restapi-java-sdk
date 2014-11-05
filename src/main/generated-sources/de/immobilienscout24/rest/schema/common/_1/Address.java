//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.11.05 um 11:50:50 AM CET 
//


package de.immobilienscout24.rest.schema.common._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Definition der Basisfelder einer Adresse.
 * 
 * <p>Java-Klasse für Address complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Address">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="street" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="houseNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="postcode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="city" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="internationalCountryRegion" type="{http://rest.immobilienscout24.de/schema/common/1.0}CountryRegion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", propOrder = {
    "street",
    "houseNumber",
    "postcode",
    "city",
    "internationalCountryRegion"
})
@XmlSeeAlso({
    Wgs84Address.class
})
public class Address {

    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String street;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String houseNumber;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String postcode;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String city;
    protected CountryRegion internationalCountryRegion;

    /**
     * Ruft den Wert der street-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Legt den Wert der street-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Ruft den Wert der houseNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * Legt den Wert der houseNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseNumber(String value) {
        this.houseNumber = value;
    }

    /**
     * Ruft den Wert der postcode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Legt den Wert der postcode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcode(String value) {
        this.postcode = value;
    }

    /**
     * Ruft den Wert der city-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Legt den Wert der city-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Ruft den Wert der internationalCountryRegion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CountryRegion }
     *     
     */
    public CountryRegion getInternationalCountryRegion() {
        return internationalCountryRegion;
    }

    /**
     * Legt den Wert der internationalCountryRegion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryRegion }
     *     
     */
    public void setInternationalCountryRegion(CountryRegion value) {
        this.internationalCountryRegion = value;
    }

}
