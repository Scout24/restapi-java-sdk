//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.10.22 um 03:41:54 PM CEST 
//


package de.immobilienscout24.rest.schema.offer.realestateproject._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Liste von Bauprojekte
 * 
 * <p>Java-Klasse fr RealEstateProjects complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RealEstateProjects">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="realEstateProject" type="{http://rest.immobilienscout24.de/schema/offer/realestateproject/1.0}RealEstateProject" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RealEstateProjects", propOrder = {
    "realEstateProject"
})
public class RealEstateProjects {

    protected List<RealEstateProject> realEstateProject;

    /**
     * Gets the value of the realEstateProject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the realEstateProject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRealEstateProject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RealEstateProject }
     * 
     * 
     */
    public List<RealEstateProject> getRealEstateProject() {
        if (realEstateProject == null) {
            realEstateProject = new ArrayList<RealEstateProject>();
        }
        return this.realEstateProject;
    }

}
