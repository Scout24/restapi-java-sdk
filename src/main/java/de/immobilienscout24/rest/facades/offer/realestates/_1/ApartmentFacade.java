package de.immobilienscout24.rest.facades.offer.realestates._1;

import de.immobilienscout24.rest.schema.common._1.ApartmentType;
import de.immobilienscout24.rest.schema.common._1.InteriorQuality;
import de.immobilienscout24.rest.schema.common._1.ParkingSpaceType;
import de.immobilienscout24.rest.schema.common._1.RealEstateCondition;
import de.immobilienscout24.rest.schema.common._1.YesNotApplicableType;

public interface ApartmentFacade extends RealestateFacade, EnergyCertificateFacade {

	Boolean isAssistedLiving();

	void setAssistedLiving(Boolean value);

	ApartmentType getApartmentType();

	void setApartmentType(ApartmentType value);

	Integer getFloor();

	void setFloor(Integer value);

	Boolean isLift();

	void setLift(Boolean value);

	YesNotApplicableType getCellar();

	void setCellar(YesNotApplicableType value);

	YesNotApplicableType getHandicappedAccessible();

	void setHandicappedAccessible(YesNotApplicableType value);

	Integer getNumberOfParkingSpaces();

	void setNumberOfParkingSpaces(Integer value);

	RealEstateCondition getCondition();

	void setCondition(RealEstateCondition value);

	Integer getLastRefurbishment();

	void setLastRefurbishment(Integer value);

	InteriorQuality getInteriorQuality();

	void setInteriorQuality(InteriorQuality value);

	Integer getNumberOfFloors();

	void setNumberOfFloors(Integer value);

	Double getUsableFloorSpace();

	void setUsableFloorSpace(Double value);

	Integer getNumberOfBedRooms();

	void setNumberOfBedRooms(Integer value);

	Integer getNumberOfBathRooms();

	void setNumberOfBathRooms(Integer value);

	YesNotApplicableType getGuestToilet();

	void setGuestToilet(YesNotApplicableType value);

	ParkingSpaceType getParkingSpaceType();

	void setParkingSpaceType(ParkingSpaceType value);

	Double getParkingSpacePrice();

	void setParkingSpacePrice(Double value);

	// madatory field, not-nullable
	double getLivingSpace();

	void setLivingSpace(double value);

	// madatory field, not-nullable
	double getNumberOfRooms();

	void setNumberOfRooms(double value);

	Boolean isBuiltInKitchen();

	void setBuiltInKitchen(Boolean value);

	Boolean isBalcony();

	void setBalcony(Boolean value);

	Boolean isGarden();

	void setGarden(Boolean value);

	Double getServiceCharge();

	void setServiceCharge(Double value);

	String getFreeFrom();

	void setFreeFrom(String value);

	Boolean isCertificateOfEligibilityNeeded();

	void setCertificateOfEligibilityNeeded(Boolean value);
}
