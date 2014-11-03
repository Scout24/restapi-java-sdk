package de.immobilienscout24.rest.facades.offer.realestates._1;

import de.immobilienscout24.rest.schema.common._1.CommercializationType;
import de.immobilienscout24.rest.schema.common._1.InteriorQuality;
import de.immobilienscout24.rest.schema.common._1.Price;
import de.immobilienscout24.rest.schema.common._1.RealEstateCondition;
import de.immobilienscout24.rest.schema.common._1.YesNotApplicableType;

/**
 * Created by rwill on 6/3/14.
 */
public interface CommercialFacade extends RealestateFacade, EnergyCertificateFacade {
	InteriorQuality getInteriorQuality();

	void setInteriorQuality(InteriorQuality value);

	void setLastRefurbishment(Integer value);

	Integer getLastRefurbishment();

	Integer getDistanceToMRS();

	void setDistanceToMRS(Integer value);

	Integer getDistanceToFM();

	void setDistanceToFM(Integer value);

	Integer getDistanceToPT();

	void setDistanceToPT(Integer value);

	Integer getDistanceToAirport();

	void setDistanceToAirport(Integer value);

	void setCalculatedPrice(Price value);

	Price getCalculatedPrice();

	Double getTotalFloorSpace();

	void setTotalFloorSpace(Double value);

	void setCondition(RealEstateCondition value);

	RealEstateCondition getCondition();

	Integer getNumberOfParkingSpaces();

	void setNumberOfParkingSpaces(Integer value);

	void setParkingSpacePrice(Double value);

	Double getParkingSpacePrice();

	Double getAdditionalArea();

	void setAdditionalArea(Double value);

	String getNumberOfFloors();

	void setNumberOfFloors(String value);

	Price getAdditionalCosts();

	void setAdditionalCosts(Price value);

	String getDeposit();

	void setDeposit(String value);

	void setLift(YesNotApplicableType value);

	YesNotApplicableType getLift();

	String getFreeFrom();

	void setFreeFrom(String value);

	CommercializationType getCommercializationType();

	void setCommercializationType(CommercializationType value);

	void setPrice(Price price);

	Price getPrice();
}
