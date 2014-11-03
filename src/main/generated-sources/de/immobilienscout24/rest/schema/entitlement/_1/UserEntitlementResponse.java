//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.10.22 um 03:41:54 PM CEST 
//


package de.immobilienscout24.rest.schema.entitlement._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="entitlement" type="{http://rest.immobilienscout24.de/schema/entitlement/1.0}entitlement" minOccurs="0"/>
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
    "entitlement"
})
@XmlRootElement(name = "userEntitlementResponse")
public class UserEntitlementResponse {

    protected Entitlement entitlement;

    /**
     * Ruft den Wert der entitlement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Entitlement }
     *     
     */
    public Entitlement getEntitlement() {
        return entitlement;
    }

    /**
     * Legt den Wert der entitlement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Entitlement }
     *     
     */
    public void setEntitlement(Entitlement value) {
        this.entitlement = value;
    }

}
