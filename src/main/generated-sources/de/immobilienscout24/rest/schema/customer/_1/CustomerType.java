//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.06.23 um 09:51:43 AM CEST 
//


package de.immobilienscout24.rest.schema.customer._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import de.immobilienscout24.rest.schema.common._1.Adapter1;
import de.immobilienscout24.rest.schema.common._1.MasterDataContactDetailsType;


/**
 * <p>Java-Klasse fr CustomerType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CustomerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contractContactDetails" type="{http://rest.immobilienscout24.de/schema/common/1.0}MasterDataContactDetailsType" minOccurs="0"/>
 *         &lt;element name="differingBillingContactDetails" type="{http://rest.immobilienscout24.de/schema/common/1.0}MasterDataContactDetailsType" minOccurs="0"/>
 *         &lt;element name="billingDetails" type="{http://rest.immobilienscout24.de/schema/customer/1.0}BillingDetailsType"/>
 *         &lt;element name="customerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commercial" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="professional" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="companyWideId" type="{http://rest.immobilienscout24.de/schema/common/1.0}OIDType" minOccurs="0"/>
 *         &lt;element name="accountManager" type="{http://rest.immobilienscout24.de/schema/customer/1.0}AccountManagerType" minOccurs="0"/>
 *         &lt;element name="users">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="username" type="{http://rest.immobilienscout24.de/schema/common/1.0}TextField" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerType", propOrder = {
    "contractContactDetails",
    "differingBillingContactDetails",
    "billingDetails",
    "customerNumber",
    "commercial",
    "professional",
    "companyWideId",
    "accountManager",
    "users"
})
public class CustomerType {

    protected MasterDataContactDetailsType contractContactDetails;
    protected MasterDataContactDetailsType differingBillingContactDetails;
    @XmlElement(required = true)
    protected BillingDetailsType billingDetails;
    protected String customerNumber;
    protected boolean commercial;
    protected Boolean professional;
    protected String companyWideId;
    protected AccountManagerType accountManager;
    @XmlElement(required = true)
    protected CustomerType.Users users;

    /**
     * Ruft den Wert der contractContactDetails-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MasterDataContactDetailsType }
     *     
     */
    public MasterDataContactDetailsType getContractContactDetails() {
        return contractContactDetails;
    }

    /**
     * Legt den Wert der contractContactDetails-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterDataContactDetailsType }
     *     
     */
    public void setContractContactDetails(MasterDataContactDetailsType value) {
        this.contractContactDetails = value;
    }

    /**
     * Ruft den Wert der differingBillingContactDetails-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MasterDataContactDetailsType }
     *     
     */
    public MasterDataContactDetailsType getDifferingBillingContactDetails() {
        return differingBillingContactDetails;
    }

    /**
     * Legt den Wert der differingBillingContactDetails-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterDataContactDetailsType }
     *     
     */
    public void setDifferingBillingContactDetails(MasterDataContactDetailsType value) {
        this.differingBillingContactDetails = value;
    }

    /**
     * Ruft den Wert der billingDetails-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BillingDetailsType }
     *     
     */
    public BillingDetailsType getBillingDetails() {
        return billingDetails;
    }

    /**
     * Legt den Wert der billingDetails-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingDetailsType }
     *     
     */
    public void setBillingDetails(BillingDetailsType value) {
        this.billingDetails = value;
    }

    /**
     * Ruft den Wert der customerNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerNumber() {
        return customerNumber;
    }

    /**
     * Legt den Wert der customerNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerNumber(String value) {
        this.customerNumber = value;
    }

    /**
     * Ruft den Wert der commercial-Eigenschaft ab.
     * 
     */
    public boolean isCommercial() {
        return commercial;
    }

    /**
     * Legt den Wert der commercial-Eigenschaft fest.
     * 
     */
    public void setCommercial(boolean value) {
        this.commercial = value;
    }

    /**
     * Ruft den Wert der professional-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProfessional() {
        return professional;
    }

    /**
     * Legt den Wert der professional-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProfessional(Boolean value) {
        this.professional = value;
    }

    /**
     * Ruft den Wert der companyWideId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyWideId() {
        return companyWideId;
    }

    /**
     * Legt den Wert der companyWideId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyWideId(String value) {
        this.companyWideId = value;
    }

    /**
     * Ruft den Wert der accountManager-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccountManagerType }
     *     
     */
    public AccountManagerType getAccountManager() {
        return accountManager;
    }

    /**
     * Legt den Wert der accountManager-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountManagerType }
     *     
     */
    public void setAccountManager(AccountManagerType value) {
        this.accountManager = value;
    }

    /**
     * Ruft den Wert der users-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CustomerType.Users }
     *     
     */
    public CustomerType.Users getUsers() {
        return users;
    }

    /**
     * Legt den Wert der users-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerType.Users }
     *     
     */
    public void setUsers(CustomerType.Users value) {
        this.users = value;
    }


    /**
     * <p>Java-Klasse fr anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="username" type="{http://rest.immobilienscout24.de/schema/common/1.0}TextField" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "username"
    })
    public static class Users {

        @XmlElement(required = true)
        @XmlJavaTypeAdapter(Adapter1 .class)
        protected List<String> username;

        /**
         * Gets the value of the username property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the username property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUsername().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getUsername() {
            if (username == null) {
                username = new ArrayList<String>();
            }
            return this.username;
        }

    }

}
