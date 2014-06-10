//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.04.11 um 01:54:30 PM CEST 
//

package de.immobilienscout24.rest.schema.offer.user._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse f�r offerUser complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="offerUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customer" type="{http://rest.immobilienscout24.de/schema/offer/user/1.0}customer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "offerUser", propOrder = { "customer" })
public class OfferUser {

	@XmlElement(required = true)
	protected Customer customer;

	/**
	 * Ruft den Wert der customer-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Customer }
	 * 
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * Legt den Wert der customer-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Customer }
	 * 
	 */
	public void setCustomer(Customer value) {
		this.customer = value;
	}

}
