//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.04.11 um 01:54:30 PM CEST 
//

package de.immobilienscout24.rest.schema.common._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Erm�glicht die seitenweise Iteration �ber Daten(1-basiert).
 * 
 * 
 * <p>
 * Java-Klasse f�r Paging complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Paging">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="next" type="{http://rest.immobilienscout24.de/schema/common/1.0}ReferenceLink" minOccurs="0"/>
 *         &lt;element name="previous" type="{http://rest.immobilienscout24.de/schema/common/1.0}ReferenceLink" minOccurs="0"/>
 *         &lt;element name="pageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numberOfPages" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numberOfHits" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Paging", propOrder = { "next", "previous", "pageNumber", "pageSize", "numberOfPages", "numberOfHits" })
public class Paging {

	protected ReferenceLink next;
	protected ReferenceLink previous;
	protected Integer pageNumber;
	protected Integer pageSize;
	protected Integer numberOfPages;
	@XmlElement(defaultValue = "0")
	protected int numberOfHits;

	/**
	 * Ruft den Wert der next-Eigenschaft ab.
	 * 
	 * @return possible object is {@link ReferenceLink }
	 * 
	 */
	public ReferenceLink getNext() {
		return next;
	}

	/**
	 * Legt den Wert der next-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link ReferenceLink }
	 * 
	 */
	public void setNext(ReferenceLink value) {
		this.next = value;
	}

	/**
	 * Ruft den Wert der previous-Eigenschaft ab.
	 * 
	 * @return possible object is {@link ReferenceLink }
	 * 
	 */
	public ReferenceLink getPrevious() {
		return previous;
	}

	/**
	 * Legt den Wert der previous-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link ReferenceLink }
	 * 
	 */
	public void setPrevious(ReferenceLink value) {
		this.previous = value;
	}

	/**
	 * Ruft den Wert der pageNumber-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getPageNumber() {
		return pageNumber;
	}

	/**
	 * Legt den Wert der pageNumber-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setPageNumber(Integer value) {
		this.pageNumber = value;
	}

	/**
	 * Ruft den Wert der pageSize-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getPageSize() {
		return pageSize;
	}

	/**
	 * Legt den Wert der pageSize-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setPageSize(Integer value) {
		this.pageSize = value;
	}

	/**
	 * Ruft den Wert der numberOfPages-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getNumberOfPages() {
		return numberOfPages;
	}

	/**
	 * Legt den Wert der numberOfPages-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setNumberOfPages(Integer value) {
		this.numberOfPages = value;
	}

	/**
	 * Ruft den Wert der numberOfHits-Eigenschaft ab.
	 * 
	 */
	public int getNumberOfHits() {
		return numberOfHits;
	}

	/**
	 * Legt den Wert der numberOfHits-Eigenschaft fest.
	 * 
	 */
	public void setNumberOfHits(int value) {
		this.numberOfHits = value;
	}

}
