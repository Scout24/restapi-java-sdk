//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.04.19 um 09:36:45 AM CEST 
//


package de.immobilienscout24.rest.schema.offer.toplisting._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.immobilienscout24.rest.schema.offer.toplisting._1 package. 
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

    private final static QName _Toplistings_QNAME = new QName("http://rest.immobilienscout24.de/schema/offer/toplisting/1.0", "toplistings");
    private final static QName _Toplisting_QNAME = new QName("http://rest.immobilienscout24.de/schema/offer/toplisting/1.0", "toplisting");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.immobilienscout24.rest.schema.offer.toplisting._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Toplisting }
     * 
     */
    public Toplisting createToplisting() {
        return new Toplisting();
    }

    /**
     * Create an instance of {@link Toplistings }
     * 
     */
    public Toplistings createToplistings() {
        return new Toplistings();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Toplistings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/offer/toplisting/1.0", name = "toplistings")
    public JAXBElement<Toplistings> createToplistings(Toplistings value) {
        return new JAXBElement<Toplistings>(_Toplistings_QNAME, Toplistings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Toplisting }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/offer/toplisting/1.0", name = "toplisting")
    public JAXBElement<Toplisting> createToplisting(Toplisting value) {
        return new JAXBElement<Toplisting>(_Toplisting_QNAME, Toplisting.class, null, value);
    }

}
