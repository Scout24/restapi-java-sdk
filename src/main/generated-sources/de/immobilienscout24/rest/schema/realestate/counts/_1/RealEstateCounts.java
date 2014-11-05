//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.11.05 um 11:50:50 AM CET 
//


package de.immobilienscout24.rest.schema.realestate.counts._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="is24publishedRealEstatesCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="is24notPublishedRealEstatesCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "realEstateCounts")
public class RealEstateCounts {

    @XmlElement(name = "is24publishedRealEstatesCount")
    protected long is24PublishedRealEstatesCount;
    @XmlElement(name = "is24notPublishedRealEstatesCount")
    protected long is24NotPublishedRealEstatesCount;

    /**
     * Ruft den Wert der is24PublishedRealEstatesCount-Eigenschaft ab.
     * 
     */
    public long getIs24PublishedRealEstatesCount() {
        return is24PublishedRealEstatesCount;
    }

    /**
     * Legt den Wert der is24PublishedRealEstatesCount-Eigenschaft fest.
     * 
     */
    public void setIs24PublishedRealEstatesCount(long value) {
        this.is24PublishedRealEstatesCount = value;
    }

    /**
     * Ruft den Wert der is24NotPublishedRealEstatesCount-Eigenschaft ab.
     * 
     */
    public long getIs24NotPublishedRealEstatesCount() {
        return is24NotPublishedRealEstatesCount;
    }

    /**
     * Legt den Wert der is24NotPublishedRealEstatesCount-Eigenschaft fest.
     * 
     */
    public void setIs24NotPublishedRealEstatesCount(long value) {
        this.is24NotPublishedRealEstatesCount = value;
    }

}
