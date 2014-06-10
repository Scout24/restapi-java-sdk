package de.immobilienscout24.rest.facades.offer.realestates._1;

import de.immobilienscout24.rest.schema.common._1.GarageType;
import de.immobilienscout24.rest.schema.common._1.RealEstateCondition;


public interface GarageFacade extends RealestateFacade {
	Integer getConstructionYear();

	void setConstructionYear(Integer value);

	Double getLengthGarage();

	void setLengthGarage(Double value);

	Double getWidthGarage();

	void setWidthGarage(Double value);

	Double getHeightGarage();

	void setHeightGarage(Double value);

	RealEstateCondition getCondition();

	void setCondition(RealEstateCondition condition);

	GarageType getGarageType();

	void setGarageType(GarageType garageType);

	Double getUsableFloorSpace();

	void setUsableFloorSpace(Double value);

	Integer getLastRefurbishment();

	void setLastRefurbishment(Integer year);
}
