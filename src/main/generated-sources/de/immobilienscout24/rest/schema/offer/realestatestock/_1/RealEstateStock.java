//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.10.22 um 03:41:54 PM CEST 
//


package de.immobilienscout24.rest.schema.offer.realestatestock._1;

import java.util.ArrayList;
import java.util.List;
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
 *       &lt;sequence maxOccurs="unbounded" minOccurs="4">
 *         &lt;element ref="{http://rest.immobilienscout24.de/schema/offer/realestatestock/1.0}priceRegionRealEstateStock"/>
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
    "priceRegionRealEstateStock"
})
@XmlRootElement(name = "realEstateStock")
public class RealEstateStock {

    @XmlElement(required = true)
    protected List<PriceRegionRealEstateStock> priceRegionRealEstateStock;

    /**
     * Gets the value of the priceRegionRealEstateStock property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceRegionRealEstateStock property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceRegionRealEstateStock().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceRegionRealEstateStock }
     * 
     * 
     */
    public List<PriceRegionRealEstateStock> getPriceRegionRealEstateStock() {
        if (priceRegionRealEstateStock == null) {
            priceRegionRealEstateStock = new ArrayList<PriceRegionRealEstateStock>();
        }
        return this.priceRegionRealEstateStock;
    }

}
