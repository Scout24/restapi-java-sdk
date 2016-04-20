package de.is24.utils;

import java.util.ArrayList;
import java.util.List;

import de.immobilienscout24.rest.schema.common._1.ApartmentType;
import de.immobilienscout24.rest.schema.common._1.Attachment;
import de.immobilienscout24.rest.schema.common._1.Attachments;
import de.immobilienscout24.rest.schema.common._1.BuildingEnergyRatingType;
import de.immobilienscout24.rest.schema.common._1.BuildingType;
import de.immobilienscout24.rest.schema.common._1.CommercializationType;
import de.immobilienscout24.rest.schema.common._1.CompulsoryAuctionType;
import de.immobilienscout24.rest.schema.common._1.CountyCourt;
import de.immobilienscout24.rest.schema.common._1.CourtageInfo;
import de.immobilienscout24.rest.schema.common._1.Currency;
import de.immobilienscout24.rest.schema.common._1.EnergyCertificateCreationDate;
import de.immobilienscout24.rest.schema.common._1.EnergyPerformanceCertificate;
import de.immobilienscout24.rest.schema.common._1.EnergySourceEnev2014;
import de.immobilienscout24.rest.schema.common._1.EnergySourcesEnev2014;
import de.immobilienscout24.rest.schema.common._1.GarageType;
import de.immobilienscout24.rest.schema.common._1.GastronomyType;
import de.immobilienscout24.rest.schema.common._1.HeatingTypeEnev2014;
import de.immobilienscout24.rest.schema.common._1.IndustryType;
import de.immobilienscout24.rest.schema.common._1.InteriorQuality;
import de.immobilienscout24.rest.schema.common._1.InvestmentType;
import de.immobilienscout24.rest.schema.common._1.Link;
import de.immobilienscout24.rest.schema.common._1.MarketingType;
import de.immobilienscout24.rest.schema.common._1.OfficeType;
import de.immobilienscout24.rest.schema.common._1.ParkingSpaceType;
import de.immobilienscout24.rest.schema.common._1.Picture;
import de.immobilienscout24.rest.schema.common._1.Picture.Urls;
import de.immobilienscout24.rest.schema.common._1.Picture.Urls.Url;
import de.immobilienscout24.rest.schema.common._1.PictureScaleType;
import de.immobilienscout24.rest.schema.common._1.Price;
import de.immobilienscout24.rest.schema.common._1.RealEstateCondition;
import de.immobilienscout24.rest.schema.common._1.RealtorContactDetails;
import de.immobilienscout24.rest.schema.common._1.ShortTermAccommodationType;
import de.immobilienscout24.rest.schema.common._1.SpecialPurposeType;
import de.immobilienscout24.rest.schema.common._1.UtilizationTradeSite;
import de.immobilienscout24.rest.schema.common._1.Wgs84Address;
import de.immobilienscout24.rest.schema.common._1.YesNoNotApplicableType;
import de.immobilienscout24.rest.schema.common._1.YesNotApplicableType;
import de.immobilienscout24.rest.schema.offer.realestates._1.RealEstate.Contact;

public class Is24ApiOfferGenerator {

	public static de.immobilienscout24.rest.schema.offer.realestates._1.ApartmentBuy createApartmentBuyTestObject() {
		return createApartmentBuyTestObject(false);
	}

	public static de.immobilienscout24.rest.schema.offer.realestates._1.ApartmentBuy createApartmentBuyTestObject(Boolean maxObject) {
		de.immobilienscout24.rest.schema.offer.realestates._1.ApartmentBuy realestate = new de.immobilienscout24.rest.schema.offer.realestates._1.ApartmentBuy();

		realestate.setId(12L);
		realestate.setTitle("TestAPI - Immobilienscout24 Testobjekt! +++BITTE+++ NICHT kontaktieren - " + realestate.getClass().getSimpleName());
		realestate.setExternalId("ApartmentBuy_Test");
		realestate.setAddress(fillAddress());
		realestate.setShowAddress(true);
		realestate.setPrice(fillPrice());
		realestate.setCourtage(fillCourtage());

		realestate.setLivingSpace(123.0);
		realestate.setNumberOfRooms(7);

		if (maxObject) {
			// AbstractRealEstate
			// realestate.setAttachments(Attachments);
			realestate.setDescriptionNote("ImmobilienScout24 Test Object - Description Note");
			realestate.setFurnishingNote("ImmobilienScout24 Test Object - Furnishing Note");
			realestate.setGroupNumber(123);
			realestate.setLocationNote("ImmobilienScout24 Test Object - Location Note");
			realestate.setOtherNote("ImmobilienScout24 Test Object - Other Note");
			// realestate.setReferencePriceApiCall(String);
			// realestate.setReferencePriceServiceCall(String);

			// RealEstate
			// realestate.setContact(Contact);
			// realestate.setPublishChannels(PublishChannels);

			// ApartmentBuy
			realestate.setApartmentType(ApartmentType.LOFT);
			realestate.setAssistedLiving(true);
			realestate.setBalcony(true);
			realestate.setBuildingEnergyRatingType(BuildingEnergyRatingType.ENERGY_CONSUMPTION);
			realestate.setBuiltInKitchen(true);
			realestate.setCellar(YesNotApplicableType.YES);
			realestate.setCertificateOfEligibilityNeeded(true);
			realestate.setCondition(RealEstateCondition.MINT_CONDITION);
			realestate.setConstructionYear(1966);
			realestate.setConstructionYearUnknown(false);
			realestate.setEnergyCertificate(fillEnergyPerformanceCertificate(false));
			// realestate.setEnergyConsumptionContainsWarmWater(YesNotApplicableType.NOT_APPLICABLE);
			realestate.setEnergyPerformanceCertificate(true);
			realestate.setEnergySourcesEnev2014(fillEnergySourcesEnev2014());
			// realestate.setFiringTypes(FiringTypes);
			realestate.setFloor(4);
			realestate.setFreeFrom("Sofort");
			realestate.setGarden(true);
			realestate.setGuestToilet(YesNotApplicableType.YES);
			realestate.setHandicappedAccessible(YesNotApplicableType.YES);
			// realestate.setHeatingType(HeatingType);
			realestate.setHeatingTypeEnev2014(HeatingTypeEnev2014.STOVE_HEATING);
			realestate.setInteriorQuality(InteriorQuality.SOPHISTICATED);
			realestate.setLastRefurbishment(1999);
			realestate.setLift(true);
			realestate.setListed(YesNotApplicableType.YES);
			realestate.setNumberOfBathRooms(1);
			realestate.setNumberOfBedRooms(1);
			realestate.setNumberOfFloors(6);
			realestate.setNumberOfParkingSpaces(1);
			realestate.setParkingSpacePrice(500.00);
			realestate.setParkingSpaceType(ParkingSpaceType.DUPLEX);
			realestate.setRentalIncome(123.33);
			realestate.setRented(YesNotApplicableType.YES);
			realestate.setServiceCharge(1212.99);
			realestate.setSummerResidencePractical(YesNotApplicableType.YES);
			realestate.setThermalCharacteristic(234.12);
			realestate.setUsableFloorSpace(1.11);
		}

		return realestate;
	}

	public static de.immobilienscout24.rest.schema.offer.realestates._1.ApartmentRent createApartmentRentTestObject() {
		de.immobilienscout24.rest.schema.offer.realestates._1.ApartmentRent realestate = new de.immobilienscout24.rest.schema.offer.realestates._1.ApartmentRent();

		realestate.setTitle("TestAPI - Immobilienscout24 Testobjekt! +++BITTE+++ NICHT kontaktieren - " + realestate.getClass().getSimpleName());

		realestate.setAddress(fillAddress());
		realestate.setShowAddress(true);
		realestate.setPrice(fillPrice());
		realestate.setCourtage(fillCourtage());

		realestate.setBaseRent(123.1);
		realestate.setLivingSpace(123.1);
		realestate.setNumberOfRooms(1);
		return realestate;
	}

	public static de.immobilienscout24.rest.schema.offer.realestates._1.CompulsoryAuction createCompulsoryAuctionTestObject() {
		de.immobilienscout24.rest.schema.offer.realestates._1.CompulsoryAuction realestate = new de.immobilienscout24.rest.schema.offer.realestates._1.CompulsoryAuction();

		realestate.setTitle("TestAPI - Immobilienscout24 Testobjekt! +++BITTE+++ NICHT kontaktieren - " + realestate.getClass().getSimpleName());

		realestate.setAddress(fillAddress());
		realestate.setShowAddress(true);
		realestate.setMarketValue(fillPrice());

		realestate.setDateOfAuction(TimeUtil.stringToXMLGregorianCalendar("2016-08-18", false));
		realestate.setRecordationDate(TimeUtil.stringToXMLGregorianCalendar("2016-04-23", false));
		realestate.setArea(123.45);
		realestate.setAuctionObjectType(CompulsoryAuctionType.FREEHOLD_FLAT);
		realestate.setFileReferenceAtCountyCourt("A-123");
		realestate.setNumberOfFolio("000009");
		realestate.setOwner("Wurst, Hans");

		CountyCourt countryCourt = new CountyCourt();
		countryCourt.setCourtNumber("123");
		countryCourt.setName("Amtsgericht Pankow");
		realestate.setCountyCourt(countryCourt);

		return realestate;
	}

	public static de.immobilienscout24.rest.schema.offer.realestates._1.GarageBuy createGarageBuyTestObject() {
		de.immobilienscout24.rest.schema.offer.realestates._1.GarageBuy realestate = new de.immobilienscout24.rest.schema.offer.realestates._1.GarageBuy();

		realestate.setTitle("TestAPI - Immobilienscout24 Testobjekt! +++BITTE+++ NICHT kontaktieren - " + realestate.getClass().getSimpleName());

		realestate.setAddress(fillAddress());
		realestate.setShowAddress(true);
		realestate.setPrice(fillPrice());
		realestate.setCourtage(fillCourtage());

		realestate.setGarageType(GarageType.CARPORT);
		return realestate;
	}

	public static de.immobilienscout24.rest.schema.offer.realestates._1.GarageRent createGarageRentTestObject() {
		de.immobilienscout24.rest.schema.offer.realestates._1.GarageRent realestate = new de.immobilienscout24.rest.schema.offer.realestates._1.GarageRent();

		realestate.setTitle("TestAPI - Immobilienscout24 Testobjekt! +++BITTE+++ NICHT kontaktieren - " + realestate.getClass().getSimpleName());
		realestate.setId(12L);
		realestate.setExternalId("GarageRent_Test");

		realestate.setAddress(fillAddress());
		realestate.setShowAddress(true);
		realestate.setPrice(fillPrice());
		realestate.setCourtage(fillCourtage());

		realestate.setGarageType(GarageType.CARPORT);
		realestate.setLengthGarage(7.0);
		realestate.setWidthGarage(67.0);
		realestate.setHeightGarage(66.0);
		realestate.setLastRefurbishment(1950);
		realestate.setOtherNote("otherNote");
		realestate.setLocationNote("locationNote");
		realestate.setFurnishingNote("furnishNote");

		// Attachments value = new Attachments();
		// Picture picture = new Picture();
		// picture.setHref("http://www.picsearch.com/images/logo.png");
		//
		// Link link = new Link();
		// link.setHref("http://www.google.de");
		//
		// value.getAttachment().add(picture);
		// value.getAttachment().add(link);
		//
		// realestate.setAttachments(value);

		return realestate;
	}

	public static de.immobilienscout24.rest.schema.offer.realestates._1.GarageRent createGarageRentTestObjectWithIncompleteCourtage(CourtageInfo courtage) {
		de.immobilienscout24.rest.schema.offer.realestates._1.GarageRent realestate = new de.immobilienscout24.rest.schema.offer.realestates._1.GarageRent();

		realestate.setCourtage(courtage);

		realestate.setId(1234L);

		realestate.setTitle("TestAPI - Immobilienscout24 Testobjekt! +++BITTE+++ NICHT kontaktieren - " + realestate.getClass().getSimpleName());
		realestate.setExternalId("GarageRent_Test_incomplete_courtage");
		realestate.setAddress(fillAddress());
		realestate.setShowAddress(true);
		realestate.setPrice(fillPrice());

		realestate.setGarageType(GarageType.CARPORT);
		realestate.setLengthGarage(7.0);
		realestate.setWidthGarage(67.0);
		realestate.setHeightGarage(66.0);
		realestate.setLastRefurbishment(1950);
		realestate.setOtherNote("otherNote");
		realestate.setLocationNote("locationNote");
		realestate.setFurnishingNote("furnishNote");

		return realestate;
	}

	public static de.immobilienscout24.rest.schema.offer.realestates._1.ApartmentBuy createApartmentBuyTestObjectWithManipulatedEnevData(EnergyCertificateCreationDate creationDate) {
		de.immobilienscout24.rest.schema.offer.realestates._1.ApartmentBuy realestate = new de.immobilienscout24.rest.schema.offer.realestates._1.ApartmentBuy();

		realestate.setId(1234567L);
		realestate.setTitle("TestAPI - Immobilienscout24 Testobjekt! +++BITTE+++ NICHT kontaktieren - " + realestate.getClass().getSimpleName());
		realestate.setExternalId("ApartmentBuy_Test");
		realestate.setAddress(fillAddress());
		realestate.setShowAddress(true);
		realestate.setPrice(fillPrice());
		realestate.setCourtage(fillCourtage());

		realestate.setLivingSpace(123.0);
		realestate.setNumberOfRooms(7);

		// AbstractRealEstate
		// realestate.setAttachments(Attachments);
		realestate.setDescriptionNote("ImmobilienScout24 Test Object - Description Note");
		realestate.setFurnishingNote("ImmobilienScout24 Test Object - Furnishing Note");
		realestate.setGroupNumber(123);
		realestate.setLocationNote("ImmobilienScout24 Test Object - Location Note");
		realestate.setOtherNote("ImmobilienScout24 Test Object - Other Note");

		realestate.setBuildingEnergyRatingType(BuildingEnergyRatingType.ENERGY_CONSUMPTION);
		realestate.setConstructionYear(1966);
		realestate.setConstructionYearUnknown(false);

		EnergyPerformanceCertificate energyPerformanceCertificate = new EnergyPerformanceCertificate();

		energyPerformanceCertificate.setEnergyCertificateCreationDate(creationDate);

		energyPerformanceCertificate.setEnergyEfficiencyClass("A");
		realestate.setEnergyCertificate(energyPerformanceCertificate);
		realestate.setEnergyPerformanceCertificate(true);

		realestate.setEnergySourcesEnev2014(fillEnergySourcesEnev2014());
		realestate.setHeatingTypeEnev2014(HeatingTypeEnev2014.STOVE_HEATING);
		realestate.setThermalCharacteristic(234.12);

		return realestate;
	}

	public static Picture picture() {
		Picture picture = new Picture();
		picture.setHref("http://www.picsearch.com/images/logo.png");
		Url url = new Url();
		url.setScale(PictureScaleType.SCALE);
		url.setHref("http://www.picsearch.com/images/logo.png");
		picture.setUrls(urls(url));
		picture.setId(666L);
		picture.setTitle("my test title");
		return picture;
	}

	public static Attachments attachments(Attachment... as) {
		Attachments result = new Attachments();
		for (Attachment a : as) {
			result.getAttachment().add(a);
		}
		return result;
	}

	public static Link link(String url, String title) {
		Link link = new Link();
		link.setUrl(url);
		link.setTitle(title);
		link.setId(223344L);
		return link;
	}

	public static Urls urls(Url... urls) {
		Urls result = new Urls();
		for (Url u : urls) {
			result.getUrl().add(u);
		}
		return result;
	}

	public static de.immobilienscout24.rest.schema.offer.realestates._1.Gastronomy createGastronomyTestObject() {
		de.immobilienscout24.rest.schema.offer.realestates._1.Gastronomy realestate = new de.immobilienscout24.rest.schema.offer.realestates._1.Gastronomy();

		realestate.setTitle("TestAPI - Immobilienscout24 Testobjekt! +++BITTE+++ NICHT kontaktieren - " + realestate.getClass().getSimpleName());

		realestate.setAddress(fillAddress());
		realestate.setShowAddress(true);
		realestate.setPrice(fillPrice(MarketingType.PURCHASE));
		realestate.setCourtage(fillCourtage());

		realestate.setGastronomyType(GastronomyType.BUNGALOW);
		realestate.setCommercializationType(CommercializationType.BUY);
		realestate.setTotalFloorSpace(123.45);
		return realestate;
	}

	public static de.immobilienscout24.rest.schema.offer.realestates._1.HouseBuy createHouseBuyTestObject() {
		de.immobilienscout24.rest.schema.offer.realestates._1.HouseBuy realestate = new de.immobilienscout24.rest.schema.offer.realestates._1.HouseBuy();

		realestate.setTitle("TestAPI - Immobilienscout24 Testobjekt! +++BITTE+++ NICHT kontaktieren - " + realestate.getClass().getSimpleName());
		realestate.setId(12L);
		realestate.setAddress(fillAddress());
		realestate.setShowAddress(true);
		realestate.setPrice(fillPrice());
		realestate.setCourtage(fillCourtage());

		realestate.setBuildingType(BuildingType.BUNGALOW);
		realestate.setLivingSpace(123.45);
		realestate.setPlotArea(666.66);
		realestate.setNumberOfRooms(123);
		realestate.setExternalId("HouseBuy_Test");

		realestate.setThermalCharacteristic(12.34);
		return realestate;
	}

	public static de.immobilienscout24.rest.schema.offer.realestates._1.HouseRent createHouseRentTestObject() {
		de.immobilienscout24.rest.schema.offer.realestates._1.HouseRent realestate = new de.immobilienscout24.rest.schema.offer.realestates._1.HouseRent();

		realestate.setTitle("TestAPI - Immobilienscout24 Testobjekt! +++BITTE+++ NICHT kontaktieren - " + realestate.getClass().getSimpleName());

		realestate.setAddress(fillAddress());
		realestate.setShowAddress(true);
		realestate.setCourtage(fillCourtage());

		realestate.setLivingSpace(123.45);
		realestate.setPlotArea(666.66);
		realestate.setNumberOfRooms(123);
		realestate.setBuildingType(BuildingType.BUNGALOW);
		realestate.setBaseRent(123.45);
		return realestate;
	}

	public static de.immobilienscout24.rest.schema.offer.realestates._1.Industry createIndustryTestObject() {
		de.immobilienscout24.rest.schema.offer.realestates._1.Industry realestate = new de.immobilienscout24.rest.schema.offer.realestates._1.Industry();

		realestate.setTitle("TestAPI - Immobilienscout24 Testobjekt! +++BITTE+++ NICHT kontaktieren - " + realestate.getClass().getSimpleName());

		realestate.setAddress(fillAddress());
		realestate.setShowAddress(true);
		realestate.setPrice(fillPrice(MarketingType.PURCHASE));
		realestate.setCourtage(fillCourtage());

		realestate.setIndustryType(IndustryType.INDUSTRY_HALL);
		realestate.setCommercializationType(CommercializationType.BUY);
		realestate.setTotalFloorSpace(3332.12);
		realestate.setNetFloorSpace(234.3);
		return realestate;
	}

	public static de.immobilienscout24.rest.schema.offer.realestates._1.Investment createInvestmentTestObject() {
		de.immobilienscout24.rest.schema.offer.realestates._1.Investment realestate = new de.immobilienscout24.rest.schema.offer.realestates._1.Investment();

		realestate.setTitle("TestAPI - Immobilienscout24 Testobjekt! +++BITTE+++ NICHT kontaktieren - " + realestate.getClass().getSimpleName());

		realestate.setAddress(fillAddress());
		realestate.setShowAddress(true);
		realestate.setPrice(fillPrice());
		realestate.setCourtage(fillCourtage());

		realestate.setIndustrialArea(2234.55);
		realestate.setNetFloorSpace(987.12);
		realestate.setInvestmentType(InvestmentType.COMMERCIAL_PROPERTY);
		realestate.setTotalFloorSpace(1646.987);
		realestate.setLivingSpace(876.0);
		realestate.setPriceMultiplier(3.4);
		realestate.setConstructionYear(1923);
		realestate.setPricePerSQM(fillPrice());
		realestate.setRentalIncomeActual(fillPrice());
		realestate.setRentalIncomeTarget(fillPrice());
		realestate.setOtherCosts(fillPrice());
		return realestate;
	}

	public static de.immobilienscout24.rest.schema.offer.realestates._1.LivingBuySite createLivingBuySiteTestObject() {
		de.immobilienscout24.rest.schema.offer.realestates._1.LivingBuySite realestate = new de.immobilienscout24.rest.schema.offer.realestates._1.LivingBuySite();

		realestate.setTitle("TestAPI - Immobilienscout24 Testobjekt! +++BITTE+++ NICHT kontaktieren - " + realestate.getClass().getSimpleName());

		realestate.setAddress(fillAddress());
		realestate.setShowAddress(true);
		realestate.setPrice(fillPrice());
		realestate.setCourtage(fillCourtage());

		realestate.setCommercializationType(CommercializationType.BUY);
		realestate.setPlotArea(123.45);
		return realestate;
	}

	public static de.immobilienscout24.rest.schema.offer.realestates._1.LivingRentSite createLivingRentSiteTestObject() {
		de.immobilienscout24.rest.schema.offer.realestates._1.LivingRentSite realestate = new de.immobilienscout24.rest.schema.offer.realestates._1.LivingRentSite();

		realestate.setTitle("TestAPI - Immobilienscout24 Testobjekt! +++BITTE+++ NICHT kontaktieren - " + realestate.getClass().getSimpleName());

		realestate.setAddress(fillAddress());
		realestate.setShowAddress(true);
		realestate.setPrice(fillPrice());
		realestate.setCourtage(fillCourtage());

		realestate.setCommercializationType(CommercializationType.RENT);
		realestate.setPlotArea(123.45);
		return realestate;
	}

	public static de.immobilienscout24.rest.schema.offer.realestates._1.Office createOfficeTestObject() {
		de.immobilienscout24.rest.schema.offer.realestates._1.Office realestate = new de.immobilienscout24.rest.schema.offer.realestates._1.Office();

		realestate.setTitle("TestAPI - Immobilienscout24 Testobjekt! +++BITTE+++ NICHT kontaktieren - " + realestate.getClass().getSimpleName());

		realestate.setAddress(fillAddress());
		realestate.setShowAddress(true);
		realestate.setPrice(fillPrice(MarketingType.RENT));
		realestate.setCourtage(fillCourtage());

		realestate.setOfficeType(OfficeType.LOFT);
		realestate.setCommercializationType(CommercializationType.RENT);
		realestate.setTotalFloorSpace(34636.34);
		realestate.setNetFloorSpace(555.223);
		return realestate;
	}

	public static de.immobilienscout24.rest.schema.offer.realestates._1.ShortTermAccommodation createShortTermAccommodationTestObject() {
		de.immobilienscout24.rest.schema.offer.realestates._1.ShortTermAccommodation realestate = new de.immobilienscout24.rest.schema.offer.realestates._1.ShortTermAccommodation();

		realestate.setTitle("TestAPI - Immobilienscout24 Testobjekt! +++BITTE+++ NICHT kontaktieren - " + realestate.getClass().getSimpleName());

		realestate.setAddress(fillAddress());
		realestate.setShowAddress(true);
		realestate.setPrice(fillPrice());
		realestate.setCourtage(fillCourtage());

		realestate.setTotalRent(754.7);
		realestate.setShortTermAccomodationType(ShortTermAccommodationType.APARTMENT);
		realestate.setStartRentalDate(TimeUtil.stringToXMLGregorianCalendar("2016-08-18", false));
		return realestate;
	}

	public static de.immobilienscout24.rest.schema.offer.realestates._1.SpecialPurpose createSpecialPurposeTestObject() {
		de.immobilienscout24.rest.schema.offer.realestates._1.SpecialPurpose realestate = new de.immobilienscout24.rest.schema.offer.realestates._1.SpecialPurpose();

		realestate.setTitle("TestAPI - Immobilienscout24 Testobjekt! +++BITTE+++ NICHT kontaktieren - " + realestate.getClass().getSimpleName());

		realestate.setAddress(fillAddress());
		realestate.setShowAddress(true);
		realestate.setPrice(fillPrice(MarketingType.PURCHASE));
		realestate.setCourtage(fillCourtage());

		realestate.setSpecialPurposePropertyType(SpecialPurposeType.FARM);
		realestate.setCommercializationType(CommercializationType.BUY);
		realestate.setTotalFloorSpace(396.6);
		realestate.setNetFloorSpace(671.44);
		return realestate;
	}

	public static de.immobilienscout24.rest.schema.offer.realestates._1.Store createStoreTestObject() {
		de.immobilienscout24.rest.schema.offer.realestates._1.Store realestate = new de.immobilienscout24.rest.schema.offer.realestates._1.Store();

		realestate.setTitle("TestAPI - Immobilienscout24 Testobjekt! +++BITTE+++ NICHT kontaktieren - " + realestate.getClass().getSimpleName());

		realestate.setAddress(fillAddress());
		realestate.setShowAddress(true);
		realestate.setPrice(fillPrice(MarketingType.RENT));
		realestate.setCourtage(fillCourtage());

		realestate.setCommercializationType(CommercializationType.RENT);
		realestate.setTotalFloorSpace(396.6);
		realestate.setNetFloorSpace(671.44);
		return realestate;
	}

	public static de.immobilienscout24.rest.schema.offer.realestates._1.TradeSite createTradeSiteTestObject() {
		de.immobilienscout24.rest.schema.offer.realestates._1.TradeSite realestate = new de.immobilienscout24.rest.schema.offer.realestates._1.TradeSite();

		realestate.setTitle("TestAPI - Immobilienscout24 Testobjekt! +++BITTE+++ NICHT kontaktieren - " + realestate.getClass().getSimpleName());

		realestate.setAddress(fillAddress());
		realestate.setShowAddress(true);
		realestate.setPrice(fillPrice(MarketingType.PURCHASE));
		realestate.setCourtage(fillCourtage());

		realestate.setCommercializationType(CommercializationType.BUY);
		realestate.setUtilizationTradeSite(UtilizationTradeSite.AGRICULTURE_FORESTRY);
		realestate.setPlotArea(4432.1);
		return realestate;
	}

	private static CourtageInfo fillCourtage() {
		CourtageInfo courtageInfo = new CourtageInfo();
		courtageInfo.setCourtage("324246245");
		courtageInfo.setCourtageNote("Fällig sofort. Keine Diskussion.");
		courtageInfo.setHasCourtage(YesNoNotApplicableType.YES);
		return courtageInfo;
	}

	public static CourtageInfo incompleteCourtageMissingHasCourtage() {
		CourtageInfo courtageInfo = new CourtageInfo();
		courtageInfo.setCourtage("324246245");
		courtageInfo.setCourtageNote("Fällig sofort. Keine Diskussion.");
		// courtageInfo.setHasCourtage(YesNoNotApplicableType.NO);
		courtageInfo.setHasCourtage(null);
		return courtageInfo;
	}

	public static CourtageInfo incompleteCourtageHasCourtageFalseWithSetCourtage() {
		CourtageInfo courtageInfo = new CourtageInfo();
		courtageInfo.setCourtage("324246245");
		courtageInfo.setCourtageNote("Fällig sofort. Keine Diskussion.");
		courtageInfo.setHasCourtage(YesNoNotApplicableType.NO);
		return courtageInfo;
	}

	public static CourtageInfo courtageHeightTooLong() {
		CourtageInfo courtageInfo = new CourtageInfo();
		courtageInfo.setCourtage("das hier ist ein langer Text, der 50 Zeichen übersteigt!!!!!");
		courtageInfo.setCourtageNote("Fällig sofort. Keine Diskussion. dieser Hinweis ist sehr lang");
		courtageInfo.setHasCourtage(YesNoNotApplicableType.YES);
		return courtageInfo;
	}

	public static Price createPrice(double value) {
		Price price = new Price();
		price.setCurrency(Currency.EUR);
		price.setValue(value);
		return price;
	}

	private static Price fillPrice() {
		Price price = new Price();
		price.setCurrency(Currency.EUR);
		price.setValue(555.0);
		return price;
	}

	private static Price fillPrice(MarketingType marketingType) {
		Price price = new Price();
		price.setCurrency(Currency.EUR);
		price.setValue(555.0);
		price.setMarketingType(marketingType);
		return price;
	}

	private static Wgs84Address fillAddress() {
		Wgs84Address address = new Wgs84Address();
		address.setCity("Berlin");
		address.setHouseNumber("10");
		address.setPostcode("10243");
		address.setStreet("Andreasstraße");
		return address;
	}

	private static EnergySourcesEnev2014 fillEnergySourcesEnev2014() {
		EnergySourcesEnev2014 energySourcesEnev2014 = new EnergySourcesEnev2014();
		energySourcesEnev2014.getEnergySourceEnev2014().add(EnergySourceEnev2014.COAL);
		energySourcesEnev2014.getEnergySourceEnev2014().add(EnergySourceEnev2014.COAL_COKE);
		energySourcesEnev2014.getEnergySourceEnev2014().add(EnergySourceEnev2014.OIL);
		return energySourcesEnev2014;
	}

	/**
	 * Generates a new (from May 2014) EnergyPerformanceCertificate of type
	 * required
	 * 
	 * @param realEstateIsCommercial
	 *            allowed object is Boolean
	 * 
	 */
	private static EnergyPerformanceCertificate fillEnergyPerformanceCertificate(Boolean realEstateIsCommercial) {
		EnergyPerformanceCertificate energyPerformanceCertificate = new EnergyPerformanceCertificate();
		energyPerformanceCertificate.setEnergyCertificateCreationDate(EnergyCertificateCreationDate.FROM_01_MAY_2014);
		energyPerformanceCertificate.setEnergyEfficiencyClass("A");
		if (realEstateIsCommercial) {
			energyPerformanceCertificate.setThermalCharacteristicElectricity(111.11);
			energyPerformanceCertificate.setThermalCharacteristicHeating(222.22);
		}
		return energyPerformanceCertificate;
	}

	public static Contact createContact() {
		Contact c = new Contact();
		c.setId(1L);
		return c;
	}

	public static List<RealtorContactDetails> createRealtorContactDetails() {
		List<RealtorContactDetails> contacts = new ArrayList<RealtorContactDetails>();
		RealtorContactDetails contact = new RealtorContactDetails();
		contact.setFirstname("Hans");
		contact.setLastname("Wurst");
		contact.setId(1L);
		contacts.add(contact);
		return contacts;
	}

}
