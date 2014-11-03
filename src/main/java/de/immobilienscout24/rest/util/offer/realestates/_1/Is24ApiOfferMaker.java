package de.immobilienscout24.rest.util.offer.realestates._1;

import de.immobilienscout24.rest.schema.common._1.CourtageInfo;
import de.immobilienscout24.rest.schema.common._1.Currency;
import de.immobilienscout24.rest.schema.common._1.EnergySourceEnev2014;
import de.immobilienscout24.rest.schema.common._1.EnergySourcesEnev2014;
import de.immobilienscout24.rest.schema.common._1.MarketingType;
import de.immobilienscout24.rest.schema.common._1.Price;
import de.immobilienscout24.rest.schema.common._1.PriceIntervalType;
import de.immobilienscout24.rest.schema.common._1.YesNoNotApplicableType;

/**
 * 
 * @author Robert Will
 * 
 */
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
}
