//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.11.05 um 11:50:50 AM CET 
//


package de.immobilienscout24.rest.schema.common._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Ein Preis der für Budgets benutzt wird
 * 
 * <p>Java-Klasse für BudgetPrice complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BudgetPrice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/common/1.0}Price">
 *       &lt;sequence>
 *         &lt;element name="rentScope" type="{http://rest.immobilienscout24.de/schema/common/1.0}RentScopeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BudgetPrice", propOrder = {
    "rentScope"
})
public class BudgetPrice
    extends Price
{

    protected RentScopeType rentScope;

    /**
     * Ruft den Wert der rentScope-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RentScopeType }
     *     
     */
    public RentScopeType getRentScope() {
        return rentScope;
    }

    /**
     * Legt den Wert der rentScope-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RentScopeType }
     *     
     */
    public void setRentScope(RentScopeType value) {
        this.rentScope = value;
    }

}
