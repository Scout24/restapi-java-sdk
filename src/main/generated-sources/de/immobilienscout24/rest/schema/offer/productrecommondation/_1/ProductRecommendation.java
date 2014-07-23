//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.06.23 um 09:51:43 AM CEST 
//


package de.immobilienscout24.rest.schema.offer.productrecommondation._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse fr productRecommendation complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="productRecommendation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="product" type="{http://rest.immobilienscout24.de/schema/offer/productrecommondation/1.0}product" maxOccurs="unbounded"/>
 *         &lt;element name="recommendedProduct" type="{http://rest.immobilienscout24.de/schema/offer/productrecommondation/1.0}product"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productRecommendation", propOrder = {
    "product",
    "recommendedProduct"
})
public class ProductRecommendation {

    @XmlElement(required = true)
    protected List<Product> product;
    @XmlElement(required = true, nillable = true)
    protected Product recommendedProduct;

    /**
     * Gets the value of the product property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the product property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Product }
     * 
     * 
     */
    public List<Product> getProduct() {
        if (product == null) {
            product = new ArrayList<Product>();
        }
        return this.product;
    }

    /**
     * Ruft den Wert der recommendedProduct-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getRecommendedProduct() {
        return recommendedProduct;
    }

    /**
     * Legt den Wert der recommendedProduct-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setRecommendedProduct(Product value) {
        this.recommendedProduct = value;
    }

}
