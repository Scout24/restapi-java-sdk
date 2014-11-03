//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.10.22 um 03:41:54 PM CEST 
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
 * Ein Bild
 * 
 * <p>Java-Klasse fr Picture complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Picture">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/common/1.0}Attachment">
 *       &lt;sequence>
 *         &lt;element name="floorplan" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="titlePicture" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Picture", propOrder = {
    "floorplan",
    "titlePicture",
    "urls"
})
public class Picture
    extends Attachment
{

    @XmlElement(defaultValue = "false")
    protected boolean floorplan;
    @XmlElement(defaultValue = "false")
    protected boolean titlePicture;
    protected Picture.Urls urls;

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

    /**
     * Ruft den Wert der titlePicture-Eigenschaft ab.
     * 
     */
    public boolean isTitlePicture() {
        return titlePicture;
    }

    /**
     * Legt den Wert der titlePicture-Eigenschaft fest.
     * 
     */
    public void setTitlePicture(boolean value) {
        this.titlePicture = value;
    }

    /**
     * Ruft den Wert der urls-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Picture.Urls }
     *     
     */
    public Picture.Urls getUrls() {
        return urls;
    }

    /**
     * Legt den Wert der urls-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Picture.Urls }
     *     
     */
    public void setUrls(Picture.Urls value) {
        this.urls = value;
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
        protected List<Picture.Urls.Url> url;

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
         * {@link Picture.Urls.Url }
         * 
         * 
         */
        public List<Picture.Urls.Url> getUrl() {
            if (url == null) {
                url = new ArrayList<Picture.Urls.Url>();
            }
            return this.url;
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
