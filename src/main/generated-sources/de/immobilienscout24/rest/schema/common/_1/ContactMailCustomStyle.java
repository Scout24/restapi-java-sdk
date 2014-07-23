//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.06.23 um 09:51:43 AM CEST 
//


package de.immobilienscout24.rest.schema.common._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse fr ContactMailCustomStyle complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ContactMailCustomStyle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="header1Color" type="{http://rest.immobilienscout24.de/schema/common/1.0}HexadecimalColorCode"/>
 *         &lt;element name="header1FontColor" type="{http://rest.immobilienscout24.de/schema/common/1.0}HexadecimalColorCode"/>
 *         &lt;element name="header2Color" type="{http://rest.immobilienscout24.de/schema/common/1.0}HexadecimalColorCode"/>
 *         &lt;element name="header2FontColor" type="{http://rest.immobilienscout24.de/schema/common/1.0}HexadecimalColorCode"/>
 *         &lt;element name="header3Color" type="{http://rest.immobilienscout24.de/schema/common/1.0}HexadecimalColorCode"/>
 *         &lt;element name="header3FontColor" type="{http://rest.immobilienscout24.de/schema/common/1.0}HexadecimalColorCode"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactMailCustomStyle", propOrder = {
    "header1Color",
    "header1FontColor",
    "header2Color",
    "header2FontColor",
    "header3Color",
    "header3FontColor"
})
public class ContactMailCustomStyle {

    @XmlElement(required = true)
    protected String header1Color;
    @XmlElement(required = true)
    protected String header1FontColor;
    @XmlElement(required = true)
    protected String header2Color;
    @XmlElement(required = true)
    protected String header2FontColor;
    @XmlElement(required = true)
    protected String header3Color;
    @XmlElement(required = true)
    protected String header3FontColor;

    /**
     * Ruft den Wert der header1Color-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeader1Color() {
        return header1Color;
    }

    /**
     * Legt den Wert der header1Color-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeader1Color(String value) {
        this.header1Color = value;
    }

    /**
     * Ruft den Wert der header1FontColor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeader1FontColor() {
        return header1FontColor;
    }

    /**
     * Legt den Wert der header1FontColor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeader1FontColor(String value) {
        this.header1FontColor = value;
    }

    /**
     * Ruft den Wert der header2Color-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeader2Color() {
        return header2Color;
    }

    /**
     * Legt den Wert der header2Color-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeader2Color(String value) {
        this.header2Color = value;
    }

    /**
     * Ruft den Wert der header2FontColor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeader2FontColor() {
        return header2FontColor;
    }

    /**
     * Legt den Wert der header2FontColor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeader2FontColor(String value) {
        this.header2FontColor = value;
    }

    /**
     * Ruft den Wert der header3Color-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeader3Color() {
        return header3Color;
    }

    /**
     * Legt den Wert der header3Color-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeader3Color(String value) {
        this.header3Color = value;
    }

    /**
     * Ruft den Wert der header3FontColor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeader3FontColor() {
        return header3FontColor;
    }

    /**
     * Legt den Wert der header3FontColor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeader3FontColor(String value) {
        this.header3FontColor = value;
    }

}
