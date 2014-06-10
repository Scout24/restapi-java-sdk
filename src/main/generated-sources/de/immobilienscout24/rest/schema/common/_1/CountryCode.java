//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.04.11 um 01:54:30 PM CEST 
//

package de.immobilienscout24.rest.schema.common._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse f�r CountryCode.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="CountryCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ABW"/>
 *     &lt;enumeration value="AFG"/>
 *     &lt;enumeration value="AGO"/>
 *     &lt;enumeration value="AIA"/>
 *     &lt;enumeration value="ALB"/>
 *     &lt;enumeration value="AND"/>
 *     &lt;enumeration value="ANT"/>
 *     &lt;enumeration value="ARE"/>
 *     &lt;enumeration value="ARG"/>
 *     &lt;enumeration value="ARM"/>
 *     &lt;enumeration value="ASM"/>
 *     &lt;enumeration value="ATA"/>
 *     &lt;enumeration value="ATG"/>
 *     &lt;enumeration value="AUS"/>
 *     &lt;enumeration value="AUT"/>
 *     &lt;enumeration value="AZE"/>
 *     &lt;enumeration value="BDI"/>
 *     &lt;enumeration value="BEL"/>
 *     &lt;enumeration value="BEN"/>
 *     &lt;enumeration value="BFA"/>
 *     &lt;enumeration value="BGD"/>
 *     &lt;enumeration value="BGR"/>
 *     &lt;enumeration value="BHR"/>
 *     &lt;enumeration value="BHS"/>
 *     &lt;enumeration value="BIH"/>
 *     &lt;enumeration value="BLR"/>
 *     &lt;enumeration value="BLZ"/>
 *     &lt;enumeration value="BMU"/>
 *     &lt;enumeration value="BOL"/>
 *     &lt;enumeration value="BRA"/>
 *     &lt;enumeration value="BRB"/>
 *     &lt;enumeration value="BRN"/>
 *     &lt;enumeration value="BTN"/>
 *     &lt;enumeration value="BWA"/>
 *     &lt;enumeration value="CAF"/>
 *     &lt;enumeration value="CAN"/>
 *     &lt;enumeration value="CCK"/>
 *     &lt;enumeration value="CHE"/>
 *     &lt;enumeration value="CHL"/>
 *     &lt;enumeration value="CHN"/>
 *     &lt;enumeration value="CIV"/>
 *     &lt;enumeration value="CMR"/>
 *     &lt;enumeration value="COD"/>
 *     &lt;enumeration value="COG"/>
 *     &lt;enumeration value="COK"/>
 *     &lt;enumeration value="COL"/>
 *     &lt;enumeration value="COM"/>
 *     &lt;enumeration value="CPV"/>
 *     &lt;enumeration value="CRI"/>
 *     &lt;enumeration value="CUB"/>
 *     &lt;enumeration value="CXR"/>
 *     &lt;enumeration value="CYM"/>
 *     &lt;enumeration value="CYP"/>
 *     &lt;enumeration value="CZE"/>
 *     &lt;enumeration value="DEU"/>
 *     &lt;enumeration value="DJI"/>
 *     &lt;enumeration value="DMA"/>
 *     &lt;enumeration value="DNK"/>
 *     &lt;enumeration value="DOM"/>
 *     &lt;enumeration value="DZA"/>
 *     &lt;enumeration value="ECU"/>
 *     &lt;enumeration value="EGY"/>
 *     &lt;enumeration value="ERI"/>
 *     &lt;enumeration value="ESH"/>
 *     &lt;enumeration value="ESP"/>
 *     &lt;enumeration value="EST"/>
 *     &lt;enumeration value="ETH"/>
 *     &lt;enumeration value="FIN"/>
 *     &lt;enumeration value="FJI"/>
 *     &lt;enumeration value="FLK"/>
 *     &lt;enumeration value="FRA"/>
 *     &lt;enumeration value="FRO"/>
 *     &lt;enumeration value="FSM"/>
 *     &lt;enumeration value="GAB"/>
 *     &lt;enumeration value="GBR"/>
 *     &lt;enumeration value="GEO"/>
 *     &lt;enumeration value="GHA"/>
 *     &lt;enumeration value="GIB"/>
 *     &lt;enumeration value="GIN"/>
 *     &lt;enumeration value="GLP"/>
 *     &lt;enumeration value="GMB"/>
 *     &lt;enumeration value="GNB"/>
 *     &lt;enumeration value="GNQ"/>
 *     &lt;enumeration value="GRC"/>
 *     &lt;enumeration value="GRD"/>
 *     &lt;enumeration value="GRL"/>
 *     &lt;enumeration value="GTM"/>
 *     &lt;enumeration value="GUF"/>
 *     &lt;enumeration value="GUM"/>
 *     &lt;enumeration value="GUY"/>
 *     &lt;enumeration value="HKG"/>
 *     &lt;enumeration value="HMD"/>
 *     &lt;enumeration value="HND"/>
 *     &lt;enumeration value="HRV"/>
 *     &lt;enumeration value="HTI"/>
 *     &lt;enumeration value="HUN"/>
 *     &lt;enumeration value="IDN"/>
 *     &lt;enumeration value="IMN"/>
 *     &lt;enumeration value="IND"/>
 *     &lt;enumeration value="IRL"/>
 *     &lt;enumeration value="IRN"/>
 *     &lt;enumeration value="IRQ"/>
 *     &lt;enumeration value="ISL"/>
 *     &lt;enumeration value="ISR"/>
 *     &lt;enumeration value="ITA"/>
 *     &lt;enumeration value="JAM"/>
 *     &lt;enumeration value="JOR"/>
 *     &lt;enumeration value="JPN"/>
 *     &lt;enumeration value="KAZ"/>
 *     &lt;enumeration value="KEN"/>
 *     &lt;enumeration value="KGZ"/>
 *     &lt;enumeration value="KHM"/>
 *     &lt;enumeration value="KIR"/>
 *     &lt;enumeration value="KNA"/>
 *     &lt;enumeration value="KOR"/>
 *     &lt;enumeration value="KWT"/>
 *     &lt;enumeration value="LAO"/>
 *     &lt;enumeration value="LBN"/>
 *     &lt;enumeration value="LBR"/>
 *     &lt;enumeration value="LBY"/>
 *     &lt;enumeration value="LCA"/>
 *     &lt;enumeration value="LIE"/>
 *     &lt;enumeration value="LKA"/>
 *     &lt;enumeration value="LSO"/>
 *     &lt;enumeration value="LTU"/>
 *     &lt;enumeration value="LUX"/>
 *     &lt;enumeration value="LVA"/>
 *     &lt;enumeration value="MAC"/>
 *     &lt;enumeration value="MAR"/>
 *     &lt;enumeration value="MCO"/>
 *     &lt;enumeration value="MDA"/>
 *     &lt;enumeration value="MDG"/>
 *     &lt;enumeration value="MDV"/>
 *     &lt;enumeration value="MEX"/>
 *     &lt;enumeration value="MHL"/>
 *     &lt;enumeration value="MKD"/>
 *     &lt;enumeration value="MLI"/>
 *     &lt;enumeration value="MLT"/>
 *     &lt;enumeration value="MMR"/>
 *     &lt;enumeration value="MNE"/>
 *     &lt;enumeration value="MNG"/>
 *     &lt;enumeration value="MNP"/>
 *     &lt;enumeration value="MOZ"/>
 *     &lt;enumeration value="MRT"/>
 *     &lt;enumeration value="MSR"/>
 *     &lt;enumeration value="MTQ"/>
 *     &lt;enumeration value="MUS"/>
 *     &lt;enumeration value="MWI"/>
 *     &lt;enumeration value="MYS"/>
 *     &lt;enumeration value="MYT"/>
 *     &lt;enumeration value="NAM"/>
 *     &lt;enumeration value="NCL"/>
 *     &lt;enumeration value="NER"/>
 *     &lt;enumeration value="NFK"/>
 *     &lt;enumeration value="NGA"/>
 *     &lt;enumeration value="NIC"/>
 *     &lt;enumeration value="NIU"/>
 *     &lt;enumeration value="NLD"/>
 *     &lt;enumeration value="NOR"/>
 *     &lt;enumeration value="NPL"/>
 *     &lt;enumeration value="NRU"/>
 *     &lt;enumeration value="NZL"/>
 *     &lt;enumeration value="OMN"/>
 *     &lt;enumeration value="PAK"/>
 *     &lt;enumeration value="PAN"/>
 *     &lt;enumeration value="PCN"/>
 *     &lt;enumeration value="PER"/>
 *     &lt;enumeration value="PHL"/>
 *     &lt;enumeration value="PLW"/>
 *     &lt;enumeration value="PNG"/>
 *     &lt;enumeration value="POL"/>
 *     &lt;enumeration value="PRI"/>
 *     &lt;enumeration value="PRK"/>
 *     &lt;enumeration value="PRT"/>
 *     &lt;enumeration value="PRY"/>
 *     &lt;enumeration value="PYF"/>
 *     &lt;enumeration value="QAT"/>
 *     &lt;enumeration value="REU"/>
 *     &lt;enumeration value="ROU"/>
 *     &lt;enumeration value="RUS"/>
 *     &lt;enumeration value="RWA"/>
 *     &lt;enumeration value="SAU"/>
 *     &lt;enumeration value="SDN"/>
 *     &lt;enumeration value="SEN"/>
 *     &lt;enumeration value="SGP"/>
 *     &lt;enumeration value="SHN"/>
 *     &lt;enumeration value="SJM"/>
 *     &lt;enumeration value="SLB"/>
 *     &lt;enumeration value="SLE"/>
 *     &lt;enumeration value="SLV"/>
 *     &lt;enumeration value="SMR"/>
 *     &lt;enumeration value="SOM"/>
 *     &lt;enumeration value="SPM"/>
 *     &lt;enumeration value="SRB"/>
 *     &lt;enumeration value="STP"/>
 *     &lt;enumeration value="SUR"/>
 *     &lt;enumeration value="SVK"/>
 *     &lt;enumeration value="SVN"/>
 *     &lt;enumeration value="SWE"/>
 *     &lt;enumeration value="SWZ"/>
 *     &lt;enumeration value="SYC"/>
 *     &lt;enumeration value="SYR"/>
 *     &lt;enumeration value="TCA"/>
 *     &lt;enumeration value="TCD"/>
 *     &lt;enumeration value="TGO"/>
 *     &lt;enumeration value="THA"/>
 *     &lt;enumeration value="TJK"/>
 *     &lt;enumeration value="TKL"/>
 *     &lt;enumeration value="TKM"/>
 *     &lt;enumeration value="TMP"/>
 *     &lt;enumeration value="TON"/>
 *     &lt;enumeration value="TTO"/>
 *     &lt;enumeration value="TUN"/>
 *     &lt;enumeration value="TUR"/>
 *     &lt;enumeration value="TUV"/>
 *     &lt;enumeration value="TWN"/>
 *     &lt;enumeration value="TZA"/>
 *     &lt;enumeration value="UGA"/>
 *     &lt;enumeration value="UKR"/>
 *     &lt;enumeration value="URY"/>
 *     &lt;enumeration value="USA"/>
 *     &lt;enumeration value="UZB"/>
 *     &lt;enumeration value="VAT"/>
 *     &lt;enumeration value="VCT"/>
 *     &lt;enumeration value="VEN"/>
 *     &lt;enumeration value="VGB"/>
 *     &lt;enumeration value="VIR"/>
 *     &lt;enumeration value="VNM"/>
 *     &lt;enumeration value="VUT"/>
 *     &lt;enumeration value="WLF"/>
 *     &lt;enumeration value="WSM"/>
 *     &lt;enumeration value="YEM"/>
 *     &lt;enumeration value="ZAF"/>
 *     &lt;enumeration value="ZMB"/>
 *     &lt;enumeration value="ZWE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CountryCode")
@XmlEnum
public enum CountryCode {

	/**
	 * Aruba
	 * 
	 */
	ABW,

	/**
	 * Afghanistan
	 * 
	 */
	AFG,

	/**
	 * Angola
	 * 
	 */
	AGO,

	/**
	 * Anguilla
	 * 
	 */
	AIA,

	/**
	 * Albanien
	 * 
	 */
	ALB,

	/**
	 * Andorra
	 * 
	 */
	AND,

	/**
	 * Niederlaendische Antillen
	 * 
	 */
	ANT,

	/**
	 * Vereinigte Arabische Emirate
	 * 
	 */
	ARE,

	/**
	 * Argentinien
	 * 
	 */
	ARG,

	/**
	 * Armenien
	 * 
	 */
	ARM,

	/**
	 * Amerikanisch-Samoa
	 * 
	 */
	ASM,

	/**
	 * Antarktis (Sonderstatus durch Antarktis-Vertrag)
	 * 
	 * 
	 */
	ATA,

	/**
	 * Antigua und Barbuda
	 * 
	 */
	ATG,

	/**
	 * Australien
	 * 
	 */
	AUS,

	/**
	 * Oesterreich
	 * 
	 */
	AUT,

	/**
	 * Aserbaidschan
	 * 
	 */
	AZE,

	/**
	 * Burundi
	 * 
	 */
	BDI,

	/**
	 * Belgien
	 * 
	 */
	BEL,

	/**
	 * Benin
	 * 
	 */
	BEN,

	/**
	 * Burkina Faso
	 * 
	 */
	BFA,

	/**
	 * Bangladesch
	 * 
	 */
	BGD,

	/**
	 * Bulgarien
	 * 
	 */
	BGR,

	/**
	 * Bahrain
	 * 
	 */
	BHR,

	/**
	 * Bahamas
	 * 
	 */
	BHS,

	/**
	 * Bosnien und Herzegowina
	 * 
	 */
	BIH,

	/**
	 * Belarus (Weissrussland; BYS)
	 * 
	 */
	BLR,

	/**
	 * Belize
	 * 
	 */
	BLZ,

	/**
	 * Bermuda
	 * 
	 */
	BMU,

	/**
	 * Bolivien
	 * 
	 */
	BOL,

	/**
	 * Brasilien
	 * 
	 */
	BRA,

	/**
	 * Barbados
	 * 
	 */
	BRB,

	/**
	 * Brunei Darussalam
	 * 
	 */
	BRN,

	/**
	 * Bhutan
	 * 
	 */
	BTN,

	/**
	 * Botswana
	 * 
	 */
	BWA,

	/**
	 * Zentralafrikanische Republik
	 * 
	 */
	CAF,

	/**
	 * Kanada
	 * 
	 */
	CAN,

	/**
	 * Kokosinseln
	 * 
	 */
	CCK,

	/**
	 * Schweiz (Confoederatio Helvetica)
	 * 
	 */
	CHE,

	/**
	 * Chile
	 * 
	 */
	CHL,

	/**
	 * Volksrepublik China
	 * 
	 */
	CHN,

	/**
	 * Cote d'Ivoire (Elfenbeink�ste)
	 * 
	 */
	CIV,

	/**
	 * Kamerun
	 * 
	 */
	CMR,

	/**
	 * Demokratische Republik Kongo (ehem. Zaire)
	 * 
	 */
	COD,

	/**
	 * Republik Kongo
	 * 
	 */
	COG,

	/**
	 * Cookinseln
	 * 
	 */
	COK,

	/**
	 * Kolumbien
	 * 
	 */
	COL,

	/**
	 * Komoren
	 * 
	 */
	COM,

	/**
	 * Kap Verde
	 * 
	 */
	CPV,

	/**
	 * Costa Rica
	 * 
	 */
	CRI,

	/**
	 * Kuba
	 * 
	 */
	CUB,

	/**
	 * Weihnachtsinseln
	 * 
	 */
	CXR,

	/**
	 * Kaimaninseln
	 * 
	 */
	CYM,

	/**
	 * Zypern
	 * 
	 */
	CYP,

	/**
	 * Tschechische Republik
	 * 
	 */
	CZE,

	/**
	 * Deutschland
	 * 
	 */
	DEU,

	/**
	 * Dschibuti
	 * 
	 */
	DJI,

	/**
	 * Dominica
	 * 
	 */
	DMA,

	/**
	 * Daenemark
	 * 
	 */
	DNK,

	/**
	 * Dominikanische Republik
	 * 
	 */
	DOM,

	/**
	 * Algerien
	 * 
	 */
	DZA,

	/**
	 * Ecuador
	 * 
	 */
	ECU,

	/**
	 * Aegypten
	 * 
	 */
	EGY,

	/**
	 * Eritrea
	 * 
	 */
	ERI,

	/**
	 * Westsahara
	 * 
	 */
	ESH,

	/**
	 * Spanien
	 * 
	 */
	ESP,

	/**
	 * Estland
	 * 
	 */
	EST,

	/**
	 * Aethiopien
	 * 
	 */
	ETH,

	/**
	 * Finnland
	 * 
	 */
	FIN,

	/**
	 * Fidschi
	 * 
	 */
	FJI,

	/**
	 * Falklandinseln
	 * 
	 */
	FLK,

	/**
	 * Frankreich
	 * 
	 */
	FRA,

	/**
	 * Faroer
	 * 
	 */
	FRO,

	/**
	 * Mikronesien
	 * 
	 */
	FSM,

	/**
	 * Gabun
	 * 
	 */
	GAB,

	/**
	 * Vereinigtes Koenigreich Grossbritannien und Nordirland
	 * 
	 * 
	 */
	GBR,

	/**
	 * Georgien
	 * 
	 */
	GEO,

	/**
	 * Ghana
	 * 
	 */
	GHA,

	/**
	 * Gibraltar
	 * 
	 */
	GIB,

	/**
	 * Guinea
	 * 
	 */
	GIN,

	/**
	 * Guadeloupe
	 * 
	 */
	GLP,

	/**
	 * Gambia
	 * 
	 */
	GMB,

	/**
	 * Guinea-Bissau
	 * 
	 */
	GNB,

	/**
	 * Aequatorialguinea
	 * 
	 */
	GNQ,

	/**
	 * Griechenland
	 * 
	 */
	GRC,

	/**
	 * Grenada
	 * 
	 */
	GRD,

	/**
	 * Groenland
	 * 
	 */
	GRL,

	/**
	 * Guatemala
	 * 
	 */
	GTM,

	/**
	 * Franzoesisch-Guayana
	 * 
	 */
	GUF,

	/**
	 * Guam
	 * 
	 */
	GUM,

	/**
	 * Guyana
	 * 
	 */
	GUY,

	/**
	 * Hongkong
	 * 
	 */
	HKG,

	/**
	 * Heard und McDonaldinseln
	 * 
	 */
	HMD,

	/**
	 * Honduras
	 * 
	 */
	HND,

	/**
	 * Kroatien
	 * 
	 */
	HRV,

	/**
	 * Haiti
	 * 
	 */
	HTI,

	/**
	 * Ungarn
	 * 
	 */
	HUN,

	/**
	 * Indonesien
	 * 
	 */
	IDN,

	/**
	 * Insel Man
	 * 
	 */
	IMN,

	/**
	 * Indien
	 * 
	 */
	IND,

	/**
	 * Irland
	 * 
	 */
	IRL,

	/**
	 * Islamische Republik Iran
	 * 
	 */
	IRN,

	/**
	 * Irak
	 * 
	 */
	IRQ,

	/**
	 * Island
	 * 
	 */
	ISL,

	/**
	 * Israel
	 * 
	 */
	ISR,

	/**
	 * Italien
	 * 
	 */
	ITA,

	/**
	 * Jamaika
	 * 
	 */
	JAM,

	/**
	 * Jordanien
	 * 
	 */
	JOR,

	/**
	 * Japan
	 * 
	 */
	JPN,

	/**
	 * Kasachstan
	 * 
	 */
	KAZ,

	/**
	 * Kenia
	 * 
	 */
	KEN,

	/**
	 * Kirgisistan
	 * 
	 */
	KGZ,

	/**
	 * Kambodscha
	 * 
	 */
	KHM,

	/**
	 * Kiribati
	 * 
	 */
	KIR,

	/**
	 * St. Kitts und Nevis
	 * 
	 */
	KNA,

	/**
	 * Republik Korea (Suedkorea)
	 * 
	 */
	KOR,

	/**
	 * Kuwait
	 * 
	 */
	KWT,

	/**
	 * Laos
	 * 
	 */
	LAO,

	/**
	 * Libanon
	 * 
	 */
	LBN,

	/**
	 * Liberia
	 * 
	 */
	LBR,

	/**
	 * Libysch-Arabische Dschamahirija (Libyen)
	 * 
	 */
	LBY,

	/**
	 * St. Lucia
	 * 
	 */
	LCA,

	/**
	 * Liechtenstein
	 * 
	 */
	LIE,

	/**
	 * Sri Lanka
	 * 
	 */
	LKA,

	/**
	 * Lesotho
	 * 
	 */
	LSO,

	/**
	 * Litauen
	 * 
	 */
	LTU,

	/**
	 * Luxemburg
	 * 
	 */
	LUX,

	/**
	 * Lettland
	 * 
	 */
	LVA,

	/**
	 * Macao
	 * 
	 */
	MAC,

	/**
	 * Marokko
	 * 
	 */
	MAR,

	/**
	 * Monaco
	 * 
	 */
	MCO,

	/**
	 * Republik Moldau (Moldawien)
	 * 
	 */
	MDA,

	/**
	 * Madagaskar
	 * 
	 */
	MDG,

	/**
	 * Malediven
	 * 
	 */
	MDV,

	/**
	 * Mexiko
	 * 
	 */
	MEX,

	/**
	 * Marshallinseln
	 * 
	 */
	MHL,

	/**
	 * Mazedonien
	 * 
	 */
	MKD,

	/**
	 * Mali
	 * 
	 */
	MLI,

	/**
	 * Malta
	 * 
	 */
	MLT,

	/**
	 * Myanmar (Burma)
	 * 
	 */
	MMR,

	/**
	 * Montenegro
	 * 
	 */
	MNE,

	/**
	 * Mongolei
	 * 
	 */
	MNG,

	/**
	 * Noerdliche Marianen
	 * 
	 */
	MNP,

	/**
	 * Mosambik
	 * 
	 */
	MOZ,

	/**
	 * Mauretanien
	 * 
	 */
	MRT,

	/**
	 * Montserrat
	 * 
	 */
	MSR,

	/**
	 * Martinique
	 * 
	 */
	MTQ,

	/**
	 * Mauritius
	 * 
	 */
	MUS,

	/**
	 * Malawi
	 * 
	 */
	MWI,

	/**
	 * Malaysia
	 * 
	 */
	MYS,

	/**
	 * Mayotte
	 * 
	 */
	MYT,

	/**
	 * Namibia
	 * 
	 */
	NAM,

	/**
	 * Neukaledonien
	 * 
	 */
	NCL,

	/**
	 * Niger
	 * 
	 */
	NER,

	/**
	 * Norfolkinseln
	 * 
	 */
	NFK,

	/**
	 * Nigeria
	 * 
	 */
	NGA,

	/**
	 * Nicaragua
	 * 
	 */
	NIC,

	/**
	 * Niue
	 * 
	 */
	NIU,

	/**
	 * Niederlande
	 * 
	 */
	NLD,

	/**
	 * Norwegen
	 * 
	 */
	NOR,

	/**
	 * Nepal
	 * 
	 */
	NPL,

	/**
	 * Nauru
	 * 
	 */
	NRU,

	/**
	 * Neuseeland
	 * 
	 */
	NZL,

	/**
	 * Oman
	 * 
	 */
	OMN,

	/**
	 * Pakistan
	 * 
	 */
	PAK,

	/**
	 * Panama
	 * 
	 */
	PAN,

	/**
	 * Pitcairninseln
	 * 
	 */
	PCN,

	/**
	 * Peru
	 * 
	 */
	PER,

	/**
	 * Philippinen
	 * 
	 */
	PHL,

	/**
	 * Palau
	 * 
	 */
	PLW,

	/**
	 * Papua New Guinea
	 * 
	 */
	PNG,

	/**
	 * Polen
	 * 
	 */
	POL,

	/**
	 * Puerto Rico
	 * 
	 */
	PRI,

	/**
	 * Demokratische Volksrepublik Korea (Nordkorea)
	 * 
	 */
	PRK,

	/**
	 * Portugal
	 * 
	 */
	PRT,

	/**
	 * Paraguay
	 * 
	 */
	PRY,

	/**
	 * Franzoesisch-Polynesien
	 * 
	 */
	PYF,

	/**
	 * Katar
	 * 
	 */
	QAT,

	/**
	 * Reunion
	 * 
	 */
	REU,

	/**
	 * Rumaenien (ROM)
	 * 
	 */
	ROU,

	/**
	 * Russische Foederation
	 * 
	 */
	RUS,

	/**
	 * Ruanda
	 * 
	 */
	RWA,

	/**
	 * Saudi-Arabien
	 * 
	 */
	SAU,

	/**
	 * Sudan
	 * 
	 */
	SDN,

	/**
	 * Senegal
	 * 
	 */
	SEN,

	/**
	 * Singapur
	 * 
	 */
	SGP,

	/**
	 * St. Helena
	 * 
	 */
	SHN,

	/**
	 * Svalbard und Jan Mayen
	 * 
	 */
	SJM,

	/**
	 * Salomonen
	 * 
	 */
	SLB,

	/**
	 * Sierra Leone
	 * 
	 */
	SLE,

	/**
	 * El Salvador
	 * 
	 */
	SLV,

	/**
	 * San Marino
	 * 
	 */
	SMR,

	/**
	 * Somalia
	 * 
	 */
	SOM,

	/**
	 * St. Pierre und Miquelon
	 * 
	 */
	SPM,

	/**
	 * Serbien
	 * 
	 */
	SRB,

	/**
	 * Sao Tome und Principe
	 * 
	 */
	STP,

	/**
	 * Suriname
	 * 
	 */
	SUR,

	/**
	 * Slowakei
	 * 
	 */
	SVK,

	/**
	 * Slowenien
	 * 
	 */
	SVN,

	/**
	 * Schweden
	 * 
	 */
	SWE,

	/**
	 * Swasiland
	 * 
	 */
	SWZ,

	/**
	 * Seychellen
	 * 
	 */
	SYC,

	/**
	 * Arabische Republik Syrien
	 * 
	 */
	SYR,

	/**
	 * Turks- und Caicosinseln
	 * 
	 */
	TCA,

	/**
	 * Tschad
	 * 
	 */
	TCD,

	/**
	 * Togo
	 * 
	 */
	TGO,

	/**
	 * Thailand
	 * 
	 */
	THA,

	/**
	 * Tadschikistan
	 * 
	 */
	TJK,

	/**
	 * Tokelau
	 * 
	 */
	TKL,

	/**
	 * Turkmenistan
	 * 
	 */
	TKM,

	/**
	 * Osttimor (Timor-Leste; TLS)
	 * 
	 */
	TMP,

	/**
	 * Tonga
	 * 
	 */
	TON,

	/**
	 * Trinidad und Tobago
	 * 
	 */
	TTO,

	/**
	 * Tunesien
	 * 
	 */
	TUN,

	/**
	 * Tuerkei
	 * 
	 */
	TUR,

	/**
	 * Tuvalu
	 * 
	 */
	TUV,

	/**
	 * Republik China (Taiwan)
	 * 
	 */
	TWN,

	/**
	 * Vereinigte Republik Tansania
	 * 
	 */
	TZA,

	/**
	 * Uganda
	 * 
	 */
	UGA,

	/**
	 * Ukraine
	 * 
	 */
	UKR,

	/**
	 * Uruguay
	 * 
	 */
	URY,

	/**
	 * Vereinigte Staaten von Amerika
	 * 
	 */
	USA,

	/**
	 * Usbekistan
	 * 
	 */
	UZB,

	/**
	 * Vatikanstadt
	 * 
	 */
	VAT,

	/**
	 * St. Vincent und Grenadinen
	 * 
	 */
	VCT,

	/**
	 * Venezuela
	 * 
	 */
	VEN,

	/**
	 * Britische Jungferninseln
	 * 
	 */
	VGB,

	/**
	 * Amerikanische Jungferninseln
	 * 
	 */
	VIR,

	/**
	 * Vietnam
	 * 
	 */
	VNM,

	/**
	 * Vanuatu
	 * 
	 */
	VUT,

	/**
	 * Wallis und Futuna
	 * 
	 */
	WLF,

	/**
	 * Samoa
	 * 
	 */
	WSM,

	/**
	 * Jemen
	 * 
	 */
	YEM,

	/**
	 * Suedafrika
	 * 
	 */
	ZAF,

	/**
	 * Sambia
	 * 
	 */
	ZMB,

	/**
	 * Zimbabwe
	 * 
	 */
	ZWE;

	public String value() {
		return name();
	}

	public static CountryCode fromValue(String v) {
		return valueOf(v);
	}

}
