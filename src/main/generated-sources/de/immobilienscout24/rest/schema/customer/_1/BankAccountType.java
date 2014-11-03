//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.10.22 um 03:41:54 PM CEST 
//


package de.immobilienscout24.rest.schema.customer._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import de.immobilienscout24.rest.schema.common._1.Adapter1;


/**
 * <p>Java-Klasse fr BankAccountType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BankAccountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountNumber" type="{http://rest.immobilienscout24.de/schema/common/1.0}TextField" minOccurs="0"/>
 *         &lt;element name="bankCode" type="{http://rest.immobilienscout24.de/schema/common/1.0}TextField" minOccurs="0"/>
 *         &lt;element name="iban" type="{http://rest.immobilienscout24.de/schema/common/1.0}TextField" minOccurs="0"/>
 *         &lt;element name="bic" type="{http://rest.immobilienscout24.de/schema/common/1.0}TextField" minOccurs="0"/>
 *         &lt;element name="accountHolder" type="{http://rest.immobilienscout24.de/schema/common/1.0}TextField" minOccurs="0"/>
 *         &lt;element name="bankName" type="{http://rest.immobilienscout24.de/schema/common/1.0}TextField" minOccurs="0"/>
 *         &lt;element name="validated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankAccountType", propOrder = {
    "accountNumber",
    "bankCode",
    "iban",
    "bic",
    "accountHolder",
    "bankName",
    "validated"
})
public class BankAccountType {

    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String accountNumber;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String bankCode;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String iban;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String bic;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String accountHolder;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String bankName;
    protected Boolean validated;

    /**
     * Ruft den Wert der accountNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Legt den Wert der accountNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Ruft den Wert der bankCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Legt den Wert der bankCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCode(String value) {
        this.bankCode = value;
    }

    /**
     * Ruft den Wert der iban-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIban() {
        return iban;
    }

    /**
     * Legt den Wert der iban-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIban(String value) {
        this.iban = value;
    }

    /**
     * Ruft den Wert der bic-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBic() {
        return bic;
    }

    /**
     * Legt den Wert der bic-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBic(String value) {
        this.bic = value;
    }

    /**
     * Ruft den Wert der accountHolder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountHolder() {
        return accountHolder;
    }

    /**
     * Legt den Wert der accountHolder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountHolder(String value) {
        this.accountHolder = value;
    }

    /**
     * Ruft den Wert der bankName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Legt den Wert der bankName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * Ruft den Wert der validated-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValidated() {
        return validated;
    }

    /**
     * Legt den Wert der validated-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidated(Boolean value) {
        this.validated = value;
    }

}
