//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.04.19 um 09:36:45 AM CEST 
//


package de.immobilienscout24.rest.schema.common._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Energieausweis
 * 
 * <p>Java-Klasse fr EnergyPerformanceCertificate complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EnergyPerformanceCertificate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="energyCertificateAvailability" type="{http://rest.immobilienscout24.de/schema/common/1.0}EnergyCertificateAvailability" minOccurs="0"/>
 *         &lt;element name="energyCertificateCreationDate" type="{http://rest.immobilienscout24.de/schema/common/1.0}EnergyCertificateCreationDate" minOccurs="0"/>
 *         &lt;element name="energyEfficiencyClass" type="{http://rest.immobilienscout24.de/schema/common/1.0}EnergyEfficiencyClass" minOccurs="0"/>
 *         &lt;element name="electricityConsumption" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1999.99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="heatingConsumption" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1999.99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="energyConsumptionElectricity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1999.99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="energyConsumptionHeating" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1999.99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="thermalCharacteristicElectricity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1999.99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="thermalCharacteristicHeating" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1999.99"/>
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
@XmlType(name = "EnergyPerformanceCertificate", propOrder = {

})
public class EnergyPerformanceCertificate {

    protected EnergyCertificateAvailability energyCertificateAvailability;
    protected EnergyCertificateCreationDate energyCertificateCreationDate;
    protected String energyEfficiencyClass;
    protected Double electricityConsumption;
    protected Double heatingConsumption;
    protected Double energyConsumptionElectricity;
    protected Double energyConsumptionHeating;
    protected Double thermalCharacteristicElectricity;
    protected Double thermalCharacteristicHeating;

    /**
     * Ruft den Wert der energyCertificateAvailability-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCertificateAvailability }
     *     
     */
    public EnergyCertificateAvailability getEnergyCertificateAvailability() {
        return energyCertificateAvailability;
    }

    /**
     * Legt den Wert der energyCertificateAvailability-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCertificateAvailability }
     *     
     */
    public void setEnergyCertificateAvailability(EnergyCertificateAvailability value) {
        this.energyCertificateAvailability = value;
    }

    /**
     * Ruft den Wert der energyCertificateCreationDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCertificateCreationDate }
     *     
     */
    public EnergyCertificateCreationDate getEnergyCertificateCreationDate() {
        return energyCertificateCreationDate;
    }

    /**
     * Legt den Wert der energyCertificateCreationDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCertificateCreationDate }
     *     
     */
    public void setEnergyCertificateCreationDate(EnergyCertificateCreationDate value) {
        this.energyCertificateCreationDate = value;
    }

    /**
     * Ruft den Wert der energyEfficiencyClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnergyEfficiencyClass() {
        return energyEfficiencyClass;
    }

    /**
     * Legt den Wert der energyEfficiencyClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnergyEfficiencyClass(String value) {
        this.energyEfficiencyClass = value;
    }

    /**
     * Ruft den Wert der electricityConsumption-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getElectricityConsumption() {
        return electricityConsumption;
    }

    /**
     * Legt den Wert der electricityConsumption-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setElectricityConsumption(Double value) {
        this.electricityConsumption = value;
    }

    /**
     * Ruft den Wert der heatingConsumption-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHeatingConsumption() {
        return heatingConsumption;
    }

    /**
     * Legt den Wert der heatingConsumption-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHeatingConsumption(Double value) {
        this.heatingConsumption = value;
    }

    /**
     * Ruft den Wert der energyConsumptionElectricity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEnergyConsumptionElectricity() {
        return energyConsumptionElectricity;
    }

    /**
     * Legt den Wert der energyConsumptionElectricity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEnergyConsumptionElectricity(Double value) {
        this.energyConsumptionElectricity = value;
    }

    /**
     * Ruft den Wert der energyConsumptionHeating-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEnergyConsumptionHeating() {
        return energyConsumptionHeating;
    }

    /**
     * Legt den Wert der energyConsumptionHeating-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEnergyConsumptionHeating(Double value) {
        this.energyConsumptionHeating = value;
    }

    /**
     * Ruft den Wert der thermalCharacteristicElectricity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getThermalCharacteristicElectricity() {
        return thermalCharacteristicElectricity;
    }

    /**
     * Legt den Wert der thermalCharacteristicElectricity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setThermalCharacteristicElectricity(Double value) {
        this.thermalCharacteristicElectricity = value;
    }

    /**
     * Ruft den Wert der thermalCharacteristicHeating-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getThermalCharacteristicHeating() {
        return thermalCharacteristicHeating;
    }

    /**
     * Legt den Wert der thermalCharacteristicHeating-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setThermalCharacteristicHeating(Double value) {
        this.thermalCharacteristicHeating = value;
    }

}
