//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.11.05 um 11:50:50 AM CET 
//


package de.immobilienscout24.rest.schema.common._1;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Empfohlene Nutzungsarten eines Wohngrundstuecks
 * 
 * <p>Java-Klasse für SiteRecommendedUseTypes complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SiteRecommendedUseTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="siteRecommendedUseType" type="{http://rest.immobilienscout24.de/schema/common/1.0}SiteRecommendedUseType" maxOccurs="13" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteRecommendedUseTypes", propOrder = {
    "siteRecommendedUseType"
})
public class SiteRecommendedUseTypes {

    protected List<SiteRecommendedUseType> siteRecommendedUseType;

    /**
     * Gets the value of the siteRecommendedUseType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the siteRecommendedUseType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSiteRecommendedUseType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteRecommendedUseType }
     * 
     * 
     */
    public List<SiteRecommendedUseType> getSiteRecommendedUseType() {
        if (siteRecommendedUseType == null) {
            siteRecommendedUseType = new ArrayList<SiteRecommendedUseType>();
        }
        return this.siteRecommendedUseType;
    }

}
