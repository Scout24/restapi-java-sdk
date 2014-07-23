//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.06.23 um 09:51:43 AM CEST 
//


package de.immobilienscout24.rest.schema.offer.realestates._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import de.immobilienscout24.rest.schema.common._1.Paging;
import de.immobilienscout24.rest.schema.offer.listelement._1.RealEstateList;


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
 *         &lt;element name="Paging" type="{http://rest.immobilienscout24.de/schema/common/1.0}Paging"/>
 *         &lt;element name="realEstateList" type="{http://rest.immobilienscout24.de/schema/offer/listelement/1.0}realEstateList"/>
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
    "paging",
    "realEstateList"
})
@XmlRootElement(name = "realEstates")
public class RealEstates {

    @XmlElement(name = "Paging", required = true)
    protected Paging paging;
    @XmlElement(required = true)
    protected RealEstateList realEstateList;

    /**
     * Ruft den Wert der paging-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Paging }
     *     
     */
    public Paging getPaging() {
        return paging;
    }

    /**
     * Legt den Wert der paging-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Paging }
     *     
     */
    public void setPaging(Paging value) {
        this.paging = value;
    }

    /**
     * Ruft den Wert der realEstateList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RealEstateList }
     *     
     */
    public RealEstateList getRealEstateList() {
        return realEstateList;
    }

    /**
     * Legt den Wert der realEstateList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RealEstateList }
     *     
     */
    public void setRealEstateList(RealEstateList value) {
        this.realEstateList = value;
    }

}
