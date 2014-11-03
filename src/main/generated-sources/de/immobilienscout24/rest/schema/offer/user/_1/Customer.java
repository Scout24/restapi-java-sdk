//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.10.22 um 03:41:54 PM CEST 
//


package de.immobilienscout24.rest.schema.offer.user._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse fr customer complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="customer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contractContactDetails" type="{http://rest.immobilienscout24.de/schema/offer/user/1.0}contractContactDetails" minOccurs="0"/>
 *         &lt;element name="professional" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customer", propOrder = {
    "contractContactDetails",
    "professional"
})
public class Customer {

    protected ContractContactDetails contractContactDetails;
    protected boolean professional;

    /**
     * Ruft den Wert der contractContactDetails-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContractContactDetails }
     *     
     */
    public ContractContactDetails getContractContactDetails() {
        return contractContactDetails;
    }

    /**
     * Legt den Wert der contractContactDetails-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractContactDetails }
     *     
     */
    public void setContractContactDetails(ContractContactDetails value) {
        this.contractContactDetails = value;
    }

    /**
     * Ruft den Wert der professional-Eigenschaft ab.
     * 
     */
    public boolean isProfessional() {
        return professional;
    }

    /**
     * Legt den Wert der professional-Eigenschaft fest.
     * 
     */
    public void setProfessional(boolean value) {
        this.professional = value;
    }

}
