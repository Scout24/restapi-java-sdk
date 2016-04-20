//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.04.19 um 09:36:45 AM CEST 
//


package de.immobilienscout24.rest.schema.common._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * streaming video urls von screen9
 * 
 * <p>Java-Klasse fr VideoInfo complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VideoInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="videoUrlList" type="{http://rest.immobilienscout24.de/schema/common/1.0}videoUrlList" maxOccurs="2"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="teaserUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="title" type="{http://rest.immobilienscout24.de/schema/common/1.0}TextField" minOccurs="0"/>
 *         &lt;element name="processingProgress" type="{http://rest.immobilienscout24.de/schema/common/1.0}percentType" minOccurs="0"/>
 *         &lt;element name="processingStatus" type="{http://rest.immobilienscout24.de/schema/common/1.0}videoProcessingStatusType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoInfo", propOrder = {
    "videoUrlList",
    "duration",
    "teaserUrl",
    "title",
    "processingProgress",
    "processingStatus"
})
public class VideoInfo {

    @XmlElement(required = true)
    protected List<VideoUrlList> videoUrlList;
    protected Integer duration;
    @XmlSchemaType(name = "anyURI")
    protected String teaserUrl;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String title;
    protected Integer processingProgress;
    protected VideoProcessingStatusType processingStatus;

    /**
     * Gets the value of the videoUrlList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videoUrlList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideoUrlList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoUrlList }
     * 
     * 
     */
    public List<VideoUrlList> getVideoUrlList() {
        if (videoUrlList == null) {
            videoUrlList = new ArrayList<VideoUrlList>();
        }
        return this.videoUrlList;
    }

    /**
     * Ruft den Wert der duration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * Legt den Wert der duration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDuration(Integer value) {
        this.duration = value;
    }

    /**
     * Ruft den Wert der teaserUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeaserUrl() {
        return teaserUrl;
    }

    /**
     * Legt den Wert der teaserUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeaserUrl(String value) {
        this.teaserUrl = value;
    }

    /**
     * Ruft den Wert der title-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Legt den Wert der title-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Ruft den Wert der processingProgress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProcessingProgress() {
        return processingProgress;
    }

    /**
     * Legt den Wert der processingProgress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProcessingProgress(Integer value) {
        this.processingProgress = value;
    }

    /**
     * Ruft den Wert der processingStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VideoProcessingStatusType }
     *     
     */
    public VideoProcessingStatusType getProcessingStatus() {
        return processingStatus;
    }

    /**
     * Legt den Wert der processingStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoProcessingStatusType }
     *     
     */
    public void setProcessingStatus(VideoProcessingStatusType value) {
        this.processingStatus = value;
    }

}
