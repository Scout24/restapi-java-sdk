//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.11.05 um 11:50:50 AM CET 
//


package de.immobilienscout24.rest.schema.common._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Die Kontaktdaten eines Exposes
 * 
 * <p>Java-Klasse für ExposeContactDetails complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ExposeContactDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/common/1.0}ContactDetails">
 *       &lt;sequence>
 *         &lt;element name="realtorLogo" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExposeContactDetails", propOrder = {
    "realtorLogo"
})
public class ExposeContactDetails
    extends ContactDetails
{

    @XmlSchemaType(name = "anyURI")
    protected String realtorLogo;

    /**
     * Ruft den Wert der realtorLogo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRealtorLogo() {
        return realtorLogo;
    }

    /**
     * Legt den Wert der realtorLogo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRealtorLogo(String value) {
        this.realtorLogo = value;
    }

}
