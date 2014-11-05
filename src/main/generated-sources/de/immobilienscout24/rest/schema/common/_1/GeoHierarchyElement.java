//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.11.05 um 11:03:21 AM CET 
//


package de.immobilienscout24.rest.schema.common._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Definiert eine Region mit allen verfügbaren Informationen.
 *             
 * 
 * <p>Java-Klasse für GeoHierarchyElement complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GeoHierarchyElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geoCodeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="fullGeoCodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statistics" type="{http://rest.immobilienscout24.de/schema/common/1.0}GeoHierarchyStatistics" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoHierarchyElement", propOrder = {
    "name",
    "geoCodeId",
    "fullGeoCodeId",
    "statistics"
})
@XmlSeeAlso({
    Neighbourhood.class,
    Country.class,
    City.class,
    Continent.class,
    Region.class,
    Quarter.class
})
public class GeoHierarchyElement {

    protected String name;
    protected long geoCodeId;
    protected String fullGeoCodeId;
    protected GeoHierarchyStatistics statistics;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der geoCodeId-Eigenschaft ab.
     * 
     */
    public long getGeoCodeId() {
        return geoCodeId;
    }

    /**
     * Legt den Wert der geoCodeId-Eigenschaft fest.
     * 
     */
    public void setGeoCodeId(long value) {
        this.geoCodeId = value;
    }

    /**
     * Ruft den Wert der fullGeoCodeId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullGeoCodeId() {
        return fullGeoCodeId;
    }

    /**
     * Legt den Wert der fullGeoCodeId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullGeoCodeId(String value) {
        this.fullGeoCodeId = value;
    }

    /**
     * Ruft den Wert der statistics-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeoHierarchyStatistics }
     *     
     */
    public GeoHierarchyStatistics getStatistics() {
        return statistics;
    }

    /**
     * Legt den Wert der statistics-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoHierarchyStatistics }
     *     
     */
    public void setStatistics(GeoHierarchyStatistics value) {
        this.statistics = value;
    }

}
