//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.10.22 um 03:41:54 PM CEST 
//


package de.immobilienscout24.rest.schema.offer.user._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.immobilienscout24.rest.schema.offer.user._1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OfferUser_QNAME = new QName("http://rest.immobilienscout24.de/schema/offer/user/1.0", "offerUser");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.immobilienscout24.rest.schema.offer.user._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OfferUser }
     * 
     */
    public OfferUser createOfferUser() {
        return new OfferUser();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link ContractContactDetails }
     * 
     */
    public ContractContactDetails createContractContactDetails() {
        return new ContractContactDetails();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfferUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/offer/user/1.0", name = "offerUser")
    public JAXBElement<OfferUser> createOfferUser(OfferUser value) {
        return new JAXBElement<OfferUser>(_OfferUser_QNAME, OfferUser.class, null, value);
    }

}
