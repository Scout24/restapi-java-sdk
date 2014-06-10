//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.04.11 um 01:54:30 PM CEST 
//

package de.immobilienscout24.rest.schema.common._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse f�r EnergyCertificateCreationDate.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="EnergyCertificateCreationDate">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOT_APPLICABLE"/>
 *     &lt;enumeration value="BEFORE_01_MAY_2014"/>
 *     &lt;enumeration value="FROM_01_MAY_2014"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnergyCertificateCreationDate")
@XmlEnum
public enum EnergyCertificateCreationDate {

	/**
	 * keine Angabe
	 * 
	 */
	NOT_APPLICABLE,

	/**
	 * Ausgestellt vor dem 01.05.2014
	 * 
	 */
	BEFORE_01_MAY_2014,

	/**
	 * Ausgestellt ab dem 01.05.2014
	 * 
	 */
	FROM_01_MAY_2014;

	public String value() {
		return name();
	}

	public static EnergyCertificateCreationDate fromValue(String v) {
		return valueOf(v);
	}

}
