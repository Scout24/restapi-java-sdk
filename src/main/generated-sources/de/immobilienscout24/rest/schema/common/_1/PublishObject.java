//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.04.11 um 01:54:30 PM CEST 
//

package de.immobilienscout24.rest.schema.common._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * Objekt das den Zusammenhang zwischen einer Immobilie und einem
 * Ver�ffentlichungskanal beschreibt.
 * 
 * 
 * <p>
 * Java-Klasse f�r PublishObject complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PublishObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="realEstate">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *                 &lt;attribute name="title" type="{http://rest.immobilienscout24.de/schema/common/1.0}TextField" />
 *                 &lt;attribute name="firstActivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="publishChannel" type="{http://rest.immobilienscout24.de/schema/common/1.0}PublishChannel"/>
 *         &lt;element name="messageCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="0" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublishObject", propOrder = { "realEstate", "publishChannel" })
public class PublishObject {

	@XmlElement(required = true)
	protected PublishObject.RealEstate realEstate;
	@XmlElement(required = true)
	protected PublishChannel publishChannel;
	@XmlAttribute(name = "id")
	protected String id;

	/**
	 * Ruft den Wert der realEstate-Eigenschaft ab.
	 * 
	 * @return possible object is {@link PublishObject.RealEstate }
	 * 
	 */
	public PublishObject.RealEstate getRealEstate() {
		return realEstate;
	}

	/**
	 * Legt den Wert der realEstate-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link PublishObject.RealEstate }
	 * 
	 */
	public void setRealEstate(PublishObject.RealEstate value) {
		this.realEstate = value;
	}

	/**
	 * Ruft den Wert der publishChannel-Eigenschaft ab.
	 * 
	 * @return possible object is {@link PublishChannel }
	 * 
	 */
	public PublishChannel getPublishChannel() {
		return publishChannel;
	}

	/**
	 * Legt den Wert der publishChannel-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link PublishChannel }
	 * 
	 */
	public void setPublishChannel(PublishChannel value) {
		this.publishChannel = value;
	}

	/**
	 * Ruft den Wert der id-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getId() {
		return id;
	}

	/**
	 * Legt den Wert der id-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setId(String value) {
		this.id = value;
	}

	/**
	 * Verweis auf eine Immobilie.
	 * 
	 * <p>
	 * Java-Klasse f�r anonymous complex type.
	 * 
	 * <p>
	 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
	 * Klasse enthalten ist.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
	 *       &lt;attribute name="title" type="{http://rest.immobilienscout24.de/schema/common/1.0}TextField" />
	 *       &lt;attribute name="firstActivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "")
	public static class RealEstate {

		@XmlAttribute(name = "id")
		protected Long id;
		@XmlAttribute(name = "title")
		@XmlJavaTypeAdapter(Adapter1.class)
		protected String title;
		@XmlAttribute(name = "firstActivationDate")
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar firstActivationDate;

		/**
		 * Ruft den Wert der id-Eigenschaft ab.
		 * 
		 * @return possible object is {@link Long }
		 * 
		 */
		public Long getId() {
			return id;
		}

		/**
		 * Legt den Wert der id-Eigenschaft fest.
		 * 
		 * @param value
		 *            allowed object is {@link Long }
		 * 
		 */
		public void setId(Long value) {
			this.id = value;
		}

		/**
		 * Ruft den Wert der title-Eigenschaft ab.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getTitle() {
			return title;
		}

		/**
		 * Legt den Wert der title-Eigenschaft fest.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setTitle(String value) {
			this.title = value;
		}

		/**
		 * Ruft den Wert der firstActivationDate-Eigenschaft ab.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getFirstActivationDate() {
			return firstActivationDate;
		}

		/**
		 * Legt den Wert der firstActivationDate-Eigenschaft fest.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setFirstActivationDate(XMLGregorianCalendar value) {
			this.firstActivationDate = value;
		}

	}

}
