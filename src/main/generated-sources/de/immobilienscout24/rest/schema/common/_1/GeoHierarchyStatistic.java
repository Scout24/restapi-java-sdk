//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.11.05 um 11:50:50 AM CET 
//


package de.immobilienscout24.rest.schema.common._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Enthält die Statistik (d.h. Anzahl der Objekte) für einen
 *                 Immobilientyp.
 *             
 * 
 * <p>Java-Klasse für GeoHierarchyStatistic complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GeoHierarchyStatistic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="realEstateType" use="required" type="{http://rest.immobilienscout24.de/schema/common/1.0}RealEstateType" />
 *       &lt;attribute name="count" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoHierarchyStatistic")
public class GeoHierarchyStatistic {

    @XmlAttribute(name = "realEstateType", required = true)
    protected RealEstateType realEstateType;
    @XmlAttribute(name = "count", required = true)
    protected int count;

    /**
     * Ruft den Wert der realEstateType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RealEstateType }
     *     
     */
    public RealEstateType getRealEstateType() {
        return realEstateType;
    }

    /**
     * Legt den Wert der realEstateType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RealEstateType }
     *     
     */
    public void setRealEstateType(RealEstateType value) {
        this.realEstateType = value;
    }

    /**
     * Ruft den Wert der count-Eigenschaft ab.
     * 
     */
    public int getCount() {
        return count;
    }

    /**
     * Legt den Wert der count-Eigenschaft fest.
     * 
     */
    public void setCount(int value) {
        this.count = value;
    }

}
