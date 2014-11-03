//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.10.22 um 03:41:54 PM CEST 
//


package de.immobilienscout24.rest.schema.offer.topplacement._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.immobilienscout24.rest.schema.offer.topplacement._1 package. 
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

    private final static QName _Topplacement_QNAME = new QName("http://rest.immobilienscout24.de/schema/offer/topplacement/1.0", "topplacement");
    private final static QName _Topplacements_QNAME = new QName("http://rest.immobilienscout24.de/schema/offer/topplacement/1.0", "topplacements");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.immobilienscout24.rest.schema.offer.topplacement._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Topplacements }
     * 
     */
    public Topplacements createTopplacements() {
        return new Topplacements();
    }

    /**
     * Create an instance of {@link Topplacement }
     * 
     */
    public Topplacement createTopplacement() {
        return new Topplacement();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Topplacement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/offer/topplacement/1.0", name = "topplacement")
    public JAXBElement<Topplacement> createTopplacement(Topplacement value) {
        return new JAXBElement<Topplacement>(_Topplacement_QNAME, Topplacement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Topplacements }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/offer/topplacement/1.0", name = "topplacements")
    public JAXBElement<Topplacements> createTopplacements(Topplacements value) {
        return new JAXBElement<Topplacements>(_Topplacements_QNAME, Topplacements.class, null, value);
    }

}
