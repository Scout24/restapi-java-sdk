//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.11.05 um 11:50:50 AM CET 
//


package de.immobilienscout24.rest.schema.common._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für CourtageInfo complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CourtageInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="hasCourtage" type="{http://rest.immobilienscout24.de/schema/common/1.0}YesNoNotApplicableType"/>
 *         &lt;element name="courtage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="courtageNote" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField">
 *               &lt;maxLength value="1800"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CourtageInfo", propOrder = {

})
public class CourtageInfo {

    @XmlElement(required = true)
    protected YesNoNotApplicableType hasCourtage;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String courtage;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String courtageNote;

    /**
     * Ruft den Wert der hasCourtage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YesNoNotApplicableType }
     *     
     */
    public YesNoNotApplicableType getHasCourtage() {
        return hasCourtage;
    }

    /**
     * Legt den Wert der hasCourtage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoNotApplicableType }
     *     
     */
    public void setHasCourtage(YesNoNotApplicableType value) {
        this.hasCourtage = value;
    }

    /**
     * Ruft den Wert der courtage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourtage() {
        return courtage;
    }

    /**
     * Legt den Wert der courtage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourtage(String value) {
        this.courtage = value;
    }

    /**
     * Ruft den Wert der courtageNote-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourtageNote() {
        return courtageNote;
    }

    /**
     * Legt den Wert der courtageNote-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourtageNote(String value) {
        this.courtageNote = value;
    }

}
