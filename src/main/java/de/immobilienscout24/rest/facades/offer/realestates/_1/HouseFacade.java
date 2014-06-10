package de.immobilienscout24.rest.facades.offer.realestates._1;

import de.immobilienscout24.rest.schema.common._1.*;

/**
 * Created by rwill on 6/4/14.
 */
public interface HouseFacade extends EnergySavingFacade {
	RealEstateCondition getCondition();

	void setCondition(RealEstateCondition value);

	String getFreeFrom();

	void setFreeFrom(String value);

	double getNumberOfRooms();

	void setNumberOfRooms(double value);

	BuildingType getBuildingType();

	void setBuildingType(BuildingType value);

	Integer getNumberOfFloors();

	void setNumberOfFloors(Integer value);

	Double getParkingSpacePrice();

	void setParkingSpacePrice(Double value);

	Double getUsableFloorSpace();

	void setUsableFloorSpace(Double value);

	Integer getNumberOfBedRooms();

	void setNumberOfBedRooms(Integer value);

	YesNotApplicableType getHandicappedAccessible();

	void setHandicappedAccessible(YesNotApplicableType value);

	double getPlotArea();

	void setPlotArea(double value);

	Integer getLastRefurbishment();

	void setLastRefurbishment(Integer value);

	InteriorQuality getInteriorQuality();

	void setInteriorQuality(InteriorQuality value);

	double getLivingSpace();

	void setLivingSpace(double value);

	ParkingSpaceType getParkingSpaceType();

	void setParkingSpaceType(ParkingSpaceType value);

	HeatingType getHeatingType();

	void setHeatingType(HeatingType value);

	Integer getNumberOfParkingSpaces();

	void setNumberOfParkingSpaces(Integer value);

	Integer getNumberOfBathRooms();

	void setNumberOfBathRooms(Integer value);

	YesNotApplicableType getGuestToilet();

	void setGuestToilet(YesNotApplicableType value);

	YesNotApplicableType getCellar();

	void setCellar(YesNotApplicableType value);
}
