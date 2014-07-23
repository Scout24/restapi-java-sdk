//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.06.23 um 09:51:43 AM CEST 
//


package de.immobilienscout24.rest.schema.common._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * wesentliche Energietrger
 * 
 * <p>Java-Klasse fr EnergySourcesEnev2014 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EnergySourcesEnev2014">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="energySourceEnev2014" type="{http://rest.immobilienscout24.de/schema/common/1.0}EnergySourceEnev2014" maxOccurs="20" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergySourcesEnev2014", propOrder = {
    "energySourceEnev2014"
})
public class EnergySourcesEnev2014 {

    protected List<EnergySourceEnev2014> energySourceEnev2014;

    /**
     * Gets the value of the energySourceEnev2014 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the energySourceEnev2014 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnergySourceEnev2014().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnergySourceEnev2014 }
     * 
     * 
     */
    public List<EnergySourceEnev2014> getEnergySourceEnev2014() {
        if (energySourceEnev2014 == null) {
            energySourceEnev2014 = new ArrayList<EnergySourceEnev2014>();
        }
        return this.energySourceEnev2014;
    }

}
