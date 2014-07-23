package de.immobilienscout24.rest.util.offer.realestates._1;

import de.immobilienscout24.rest.facades.offer.realestates._1.GarageBuyFacade;
import de.immobilienscout24.rest.facades.offer.realestates._1.GarageFacade;
import de.immobilienscout24.rest.facades.offer.realestates._1.GarageRentFacade;
import de.immobilienscout24.rest.facades.offer.realestates._1.RealestateFacade;
import de.immobilienscout24.rest.schema.common._1.*;
import de.immobilienscout24.rest.schema.offer.realestates._1.GarageBuy;
import de.immobilienscout24.rest.schema.offer.realestates._1.GarageRent;

import java.util.Arrays;

public class Is24ApiOfferMaker {
	public static CourtageInfo noCourtage() {
		CourtageInfo courtageInfo = new CourtageInfo();
		courtageInfo.setHasCourtage(YesNoNotApplicableType.NO);
		return courtageInfo;
	}

	public static CourtageInfo makeCourtage(String value) {
		CourtageInfo courtageInfo = new CourtageInfo();
		courtageInfo.setCourtage(value);
		courtageInfo.setHasCourtage(YesNoNotApplicableType.YES);
		return courtageInfo;
	}

	public static Price rentPricePerMonth(double value) {
		Price price = new Price();
		price.setCurrency(Currency.EUR);
		price.setValue(value);
		price.setMarketingType(MarketingType.RENT);
		price.setPriceIntervalType(PriceIntervalType.MONTH);
		return price;
	}

	public static Price simplePrice(double value) {
		Price price = new Price();
		price.setValue(value);
		return price;
	}

	public static EnergySourcesEnev2014 makeEnergySources(EnergySourceEnev2014... sources) {
		EnergySourcesEnev2014 energySources = new EnergySourcesEnev2014();
		for (EnergySourceEnev2014 source : sources) {
			energySources.getEnergySourceEnev2014().add(source);
		}
		return energySources;
	}

	public static void setRealestateDefaults(RealestateFacade facade) {
		facade.setPrice(simplePrice(0.0));
	}

	public static void setRealestateMinimalFields(RealestateFacade facade) {
		facade.setPrice(new Price());
		facade.setCourtage(new CourtageInfo());
	}

}
