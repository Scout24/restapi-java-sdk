//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.04.19 um 09:36:45 AM CEST 
//


package de.immobilienscout24.rest.schema.common._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * To be done
 * 
 * <p>Java-Klasse für StrictEntry complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="StrictEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wgs84Coordinate" type="{http://rest.immobilienscout24.de/schema/common/1.0}Wgs84Coordinate"/>
 *         &lt;element name="preciseHouseNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="publishedAfterRequestedDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://rest.immobilienscout24.de/schema/common/1.0}Reference"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrictEntry", propOrder = {
    "wgs84Coordinate",
    "preciseHouseNumber",
    "publishedAfterRequestedDate"
})
public class StrictEntry {

    @XmlElement(required = true)
    protected Wgs84Coordinate wgs84Coordinate;
    protected Boolean preciseHouseNumber;
    protected Boolean publishedAfterRequestedDate;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anyURI")
    protected String href;
    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "label")
    protected String label;
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
     * Ruft den Wert der wgs84Coordinate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Wgs84Coordinate }
     *     
     */
    public Wgs84Coordinate getWgs84Coordinate() {
        return wgs84Coordinate;
    }

    /**
     * Legt den Wert der wgs84Coordinate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Wgs84Coordinate }
     *     
     */
    public void setWgs84Coordinate(Wgs84Coordinate value) {
        this.wgs84Coordinate = value;
    }

    /**
     * Ruft den Wert der preciseHouseNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreciseHouseNumber() {
        return preciseHouseNumber;
    }

    /**
     * Legt den Wert der preciseHouseNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreciseHouseNumber(Boolean value) {
        this.preciseHouseNumber = value;
    }

    /**
     * Ruft den Wert der publishedAfterRequestedDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPublishedAfterRequestedDate() {
        return publishedAfterRequestedDate;
    }

    /**
     * Legt den Wert der publishedAfterRequestedDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPublishedAfterRequestedDate(Boolean value) {
        this.publishedAfterRequestedDate = value;
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
     * Ruft den Wert der label-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Legt den Wert der label-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
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
