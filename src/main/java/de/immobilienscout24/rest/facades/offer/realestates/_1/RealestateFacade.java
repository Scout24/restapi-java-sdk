package de.immobilienscout24.rest.facades.offer.realestates._1;

import de.immobilienscout24.rest.schema.common._1.CourtageInfo;
import de.immobilienscout24.rest.schema.common._1.Price;
import de.immobilienscout24.rest.schema.offer.realestates._1.RealEstate;

public interface RealestateFacade {
	RealEstate get();

	void setCourtage(CourtageInfo courtageInfo);

	CourtageInfo getCourtage();

	void setPrice(Price price);

	Price getPrice();
}
