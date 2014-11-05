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
 * Enthält die Informationen für die API Suche einer Immobilie.
 *             
 * 
 * <p>Java-Klasse für ApiSearchData complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ApiSearchData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="searchField1" type="{http://rest.immobilienscout24.de/schema/common/1.0}searchField" minOccurs="0"/>
 *         &lt;element name="searchField2" type="{http://rest.immobilienscout24.de/schema/common/1.0}searchField" minOccurs="0"/>
 *         &lt;element name="searchField3" type="{http://rest.immobilienscout24.de/schema/common/1.0}searchField" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApiSearchData", propOrder = {
    "searchField1",
    "searchField2",
    "searchField3"
})
public class ApiSearchData {

    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String searchField1;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String searchField2;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String searchField3;

    /**
     * Ruft den Wert der searchField1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchField1() {
        return searchField1;
    }

    /**
     * Legt den Wert der searchField1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchField1(String value) {
        this.searchField1 = value;
    }

    /**
     * Ruft den Wert der searchField2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchField2() {
        return searchField2;
    }

    /**
     * Legt den Wert der searchField2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchField2(String value) {
        this.searchField2 = value;
    }

    /**
     * Ruft den Wert der searchField3-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchField3() {
        return searchField3;
    }

    /**
     * Legt den Wert der searchField3-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchField3(String value) {
        this.searchField3 = value;
    }

}
