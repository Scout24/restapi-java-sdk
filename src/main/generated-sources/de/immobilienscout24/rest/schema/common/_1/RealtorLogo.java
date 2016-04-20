//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.04.19 um 09:36:45 AM CEST 
//


package de.immobilienscout24.rest.schema.common._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RealtorLogo complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RealtorLogo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="urls" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="url" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="scale" type="{http://rest.immobilienscout24.de/schema/common/1.0}PictureScaleType" />
 *                           &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="realtorLogoUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RealtorLogo", propOrder = {
    "urls",
    "realtorLogoUrl"
})
public class RealtorLogo {

    protected RealtorLogo.Urls urls;
    @XmlSchemaType(name = "anyURI")
    protected String realtorLogoUrl;

    /**
     * Ruft den Wert der urls-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RealtorLogo.Urls }
     *     
     */
    public RealtorLogo.Urls getUrls() {
        return urls;
    }

    /**
     * Legt den Wert der urls-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RealtorLogo.Urls }
     *     
     */
    public void setUrls(RealtorLogo.Urls value) {
        this.urls = value;
    }

    /**
     * Ruft den Wert der realtorLogoUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRealtorLogoUrl() {
        return realtorLogoUrl;
    }

    /**
     * Legt den Wert der realtorLogoUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRealtorLogoUrl(String value) {
        this.realtorLogoUrl = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="url" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="scale" type="{http://rest.immobilienscout24.de/schema/common/1.0}PictureScaleType" />
     *                 &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
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
    @XmlType(name = "", propOrder = {
        "url"
    })
    public static class Urls {

        @XmlElement(required = true)
        protected List<RealtorLogo.Urls.Url> url;

        /**
         * Gets the value of the url property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the url property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUrl().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RealtorLogo.Urls.Url }
         * 
         * 
         */
        public List<RealtorLogo.Urls.Url> getUrl() {
            if (url == null) {
                url = new ArrayList<RealtorLogo.Urls.Url>();
            }
            return this.url;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="scale" type="{http://rest.immobilienscout24.de/schema/common/1.0}PictureScaleType" />
         *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Url {

            @XmlAttribute(name = "scale")
            protected PictureScaleType scale;
            @XmlAttribute(name = "href")
            @XmlSchemaType(name = "anyURI")
            protected String href;

            /**
             * Ruft den Wert der scale-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link PictureScaleType }
             *     
             */
            public PictureScaleType getScale() {
                return scale;
            }

            /**
             * Legt den Wert der scale-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link PictureScaleType }
             *     
             */
            public void setScale(PictureScaleType value) {
                this.scale = value;
            }

            /**
             * Ruft den Wert der href-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHref() {
                return href;
            }

            /**
             * Legt den Wert der href-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHref(String value) {
                this.href = value;
            }

        }

    }

}
