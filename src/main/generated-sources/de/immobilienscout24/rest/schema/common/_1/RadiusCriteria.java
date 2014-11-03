//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.10.22 um 03:41:54 PM CEST 
//


package de.immobilienscout24.rest.schema.common._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Kriterien fr die Umkreissuche
 * 
 * Generelles Element fr die Geo Criterias
 * 
 * <p>Java-Klasse fr RadiusCriteria complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RadiusCriteria">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/common/1.0}AbstractGeoCriteria">
 *       &lt;all>
 *         &lt;element name="wgs84" type="{http://rest.immobilienscout24.de/schema/common/1.0}Wgs84Coordinate"/>
 *         &lt;element name="radiusKm">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minExclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="label" type="{http://rest.immobilienscout24.de/schema/common/1.0}TextField" minOccurs="0"/>
 *         &lt;element name="address" type="{http://rest.immobilienscout24.de/schema/common/1.0}Address" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RadiusCriteria", propOrder = {
    "wgs84",
    "radiusKm",
    "label",
    "address"
})
public class RadiusCriteria
    extends AbstractGeoCriteria
{

    @XmlElement(required = true)
    protected Wgs84Coordinate wgs84;
    protected double radiusKm;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String label;
    protected Address address;

    /**
     * Ruft den Wert der wgs84-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Wgs84Coordinate }
     *     
     */
    public Wgs84Coordinate getWgs84() {
        return wgs84;
    }

    /**
     * Legt den Wert der wgs84-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Wgs84Coordinate }
     *     
     */
    public void setWgs84(Wgs84Coordinate value) {
        this.wgs84 = value;
    }

    /**
     * Ruft den Wert der radiusKm-Eigenschaft ab.
     * 
     */
    public double getRadiusKm() {
        return radiusKm;
    }

    /**
     * Legt den Wert der radiusKm-Eigenschaft fest.
     * 
     */
    public void setRadiusKm(double value) {
        this.radiusKm = value;
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

}
