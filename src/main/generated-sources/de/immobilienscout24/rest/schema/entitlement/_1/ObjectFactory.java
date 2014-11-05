//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.11.05 um 11:50:50 AM CET 
//

package de.immobilienscout24.rest.schema.entitlement._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the
 * de.immobilienscout24.rest.schema.entitlement._1 package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _Entitlement_QNAME = new QName("http://rest.immobilienscout24.de/schema/entitlement/1.0", "entitlement");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package:
	 * de.immobilienscout24.rest.schema.entitlement._1
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link UserEntitlementResponse }
	 * 
	 */
	public UserEntitlementResponse createUserEntitlementResponse() {
		return new UserEntitlementResponse();
	}

	/**
	 * Create an instance of {@link Entitlement }
	 * 
	 */
	public Entitlement createEntitlement() {
		return new Entitlement();
	}

	/**
	 * Create an instance of {@link UserEntitlementsResponse }
	 * 
	 */
	public UserEntitlementsResponse createUserEntitlementsResponse() {
		return new UserEntitlementsResponse();
	}

	@XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/entitlement/1.0", name = "entitlement")
	public JAXBElement<Entitlement> createEntitlement(Entitlement value) {
		return new JAXBElement<Entitlement>(_Entitlement_QNAME, Entitlement.class, null, value);
	}
}
