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


/**
 * Ein PDF-Dokument
 * 
 * <p>Java-Klasse für PDFDocument complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PDFDocument">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/common/1.0}ExtendedAttachment">
 *       &lt;sequence>
 *         &lt;element name="floorplan" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PDFDocument", propOrder = {
    "floorplan"
})
public class PDFDocument
    extends ExtendedAttachment
{

    @XmlElement(defaultValue = "false")
    protected boolean floorplan;

    /**
     * Ruft den Wert der floorplan-Eigenschaft ab.
     * 
     */
    public boolean isFloorplan() {
        return floorplan;
    }

    /**
     * Legt den Wert der floorplan-Eigenschaft fest.
     * 
     */
    public void setFloorplan(boolean value) {
        this.floorplan = value;
    }

}
