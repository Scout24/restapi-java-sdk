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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse fr anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parent" type="{http://rest.immobilienscout24.de/schema/common/1.0}GeoHierarchyElement"/>
 *         &lt;element name="children" type="{http://rest.immobilienscout24.de/schema/common/1.0}GeoHierarchyElements"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "parent",
    "children"
})
@XmlRootElement(name = "geoHierarchyElementsStatistic")
public class GeoHierarchyElementsStatistic {

    @XmlElement(required = true)
    protected GeoHierarchyElement parent;
    @XmlElement(required = true)
    protected GeoHierarchyElements children;

    /**
     * Ruft den Wert der parent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeoHierarchyElement }
     *     
     */
    public GeoHierarchyElement getParent() {
        return parent;
    }

    /**
     * Legt den Wert der parent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoHierarchyElement }
     *     
     */
    public void setParent(GeoHierarchyElement value) {
        this.parent = value;
    }

    /**
     * Ruft den Wert der children-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeoHierarchyElements }
     *     
     */
    public GeoHierarchyElements getChildren() {
        return children;
    }

    /**
     * Legt den Wert der children-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoHierarchyElements }
     *     
     */
    public void setChildren(GeoHierarchyElements value) {
        this.children = value;
    }

}
