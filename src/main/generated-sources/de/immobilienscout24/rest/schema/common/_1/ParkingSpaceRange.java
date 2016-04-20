//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.04.19 um 09:36:45 AM CEST 
//


package de.immobilienscout24.rest.schema.common._1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Bereich des Parkplätze
 * 
 * <p>Java-Klasse für ParkingSpaceRange complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ParkingSpaceRange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="minimal" type="{http://rest.immobilienscout24.de/schema/common/1.0}Number4.0Type" minOccurs="0"/>
 *         &lt;element name="maximal" type="{http://rest.immobilienscout24.de/schema/common/1.0}Number4.0Type" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingSpaceRange", propOrder = {

})
public class ParkingSpaceRange {

    protected BigInteger minimal;
    protected BigInteger maximal;

    /**
     * Ruft den Wert der minimal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimal() {
        return minimal;
    }

    /**
     * Legt den Wert der minimal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimal(BigInteger value) {
        this.minimal = value;
    }

    /**
     * Ruft den Wert der maximal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximal() {
        return maximal;
    }

    /**
     * Legt den Wert der maximal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximal(BigInteger value) {
        this.maximal = value;
    }

}
