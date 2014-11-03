//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.10.22 um 03:41:54 PM CEST 
//


package de.immobilienscout24.rest.schema.customer._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import de.immobilienscout24.rest.schema.common._1.Adapter1;


/**
 * <p>Java-Klasse fr BillingDetailsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BillingDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taxNumber" type="{http://rest.immobilienscout24.de/schema/common/1.0}TextField" minOccurs="0"/>
 *         &lt;element name="paymentMethod" type="{http://rest.immobilienscout24.de/schema/customer/1.0}PaymentMethodType"/>
 *         &lt;element name="bankAccount" type="{http://rest.immobilienscout24.de/schema/customer/1.0}BankAccountType" minOccurs="0"/>
 *         &lt;element name="collectiveBilling" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="emailBilling" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingDetailsType", propOrder = {
    "taxNumber",
    "paymentMethod",
    "bankAccount",
    "collectiveBilling",
    "emailBilling"
})
public class BillingDetailsType {

    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String taxNumber;
    @XmlElement(required = true)
    protected PaymentMethodType paymentMethod;
    protected BankAccountType bankAccount;
    protected Boolean collectiveBilling;
    protected Boolean emailBilling;

    /**
     * Ruft den Wert der taxNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxNumber() {
        return taxNumber;
    }

    /**
     * Legt den Wert der taxNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxNumber(String value) {
        this.taxNumber = value;
    }

    /**
     * Ruft den Wert der paymentMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethodType }
     *     
     */
    public PaymentMethodType getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Legt den Wert der paymentMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethodType }
     *     
     */
    public void setPaymentMethod(PaymentMethodType value) {
        this.paymentMethod = value;
    }

    /**
     * Ruft den Wert der bankAccount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BankAccountType }
     *     
     */
    public BankAccountType getBankAccount() {
        return bankAccount;
    }

    /**
     * Legt den Wert der bankAccount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAccountType }
     *     
     */
    public void setBankAccount(BankAccountType value) {
        this.bankAccount = value;
    }

    /**
     * Ruft den Wert der collectiveBilling-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCollectiveBilling() {
        return collectiveBilling;
    }

    /**
     * Legt den Wert der collectiveBilling-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCollectiveBilling(Boolean value) {
        this.collectiveBilling = value;
    }

    /**
     * Ruft den Wert der emailBilling-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmailBilling() {
        return emailBilling;
    }

    /**
     * Legt den Wert der emailBilling-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailBilling(Boolean value) {
        this.emailBilling = value;
    }

}
