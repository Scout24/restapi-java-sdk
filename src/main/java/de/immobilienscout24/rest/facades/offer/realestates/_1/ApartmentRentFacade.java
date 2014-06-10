package de.immobilienscout24.rest.facades.offer.realestates._1;

import de.immobilienscout24.rest.schema.common._1.*;
import de.immobilienscout24.rest.schema.offer.realestates._1.ApartmentRent;


public class ApartmentRentFacade implements ApartmentFacade {
	ApartmentRent realestate;

	public ApartmentRentFacade(ApartmentRent estate) {
		realestate = estate;
	}

	@Override
	public ApartmentRent get() {
		return realestate;
	}

	@Override
	public Boolean isAssistedLiving() {
		return realestate.isAssistedLiving();
	}

	@Override
	public void setAssistedLiving(Boolean value) {
		realestate.setAssistedLiving(value);
	}

	@Override
	public ApartmentType getApartmentType() {
		return realestate.getApartmentType();
	}

	@Override
	public void setApartmentType(ApartmentType value) {
		realestate.setApartmentType(value);
	}

	@Override
	public Integer getFloor() {
		return realestate.getFloor();
	}

	@Override
	public void setFloor(Integer value) {
		realestate.setFloor(value);
	}

	@Override
	public Boolean isLift() {
		return realestate.isLift();
	}

	@Override
	public void setLift(Boolean value) {
		realestate.setLift(value);
	}

	@Override
	public YesNotApplicableType getCellar() {
		return realestate.getCellar();
	}

	@Override
	public void setCellar(YesNotApplicableType value) {
		realestate.setCellar(value);
	}

	@Override
	public YesNotApplicableType getHandicappedAccessible() {
		return realestate.getHandicappedAccessible();
	}

	@Override
	public void setHandicappedAccessible(YesNotApplicableType value) {
		realestate.setHandicappedAccessible(value);
	}

	@Override
	public Integer getNumberOfParkingSpaces() {
		return realestate.getNumberOfParkingSpaces();
	}

	@Override
	public void setNumberOfParkingSpaces(Integer value) {
		realestate.setNumberOfParkingSpaces(value);
	}

	@Override
	public RealEstateCondition getCondition() {
		return realestate.getCondition();
	}

	@Override
	public void setCondition(RealEstateCondition value) {
		realestate.setCondition(value);
	}

	@Override
	public Integer getLastRefurbishment() {
		return realestate.getLastRefurbishment();
	}

	@Override
	public void setLastRefurbishment(Integer value) {
		realestate.setLastRefurbishment(value);
	}

	@Override
	public InteriorQuality getInteriorQuality() {
		return realestate.getInteriorQuality();
	}

	@Override
	public void setInteriorQuality(InteriorQuality value) {
		realestate.setInteriorQuality(value);
	}

	@Override
	public Integer getNumberOfFloors() {
		return realestate.getNumberOfFloors();
	}

	@Override
	public void setNumberOfFloors(Integer value) {
		realestate.setNumberOfFloors(value);
	}

	@Override
	public Double getUsableFloorSpace() {
		return realestate.getUsableFloorSpace();
	}

	@Override
	public void setUsableFloorSpace(Double value) {
		realestate.setUsableFloorSpace(value);
	}

	@Override
	public Integer getNumberOfBedRooms() {
		return realestate.getNumberOfBedRooms();
	}

	@Override
	public void setNumberOfBedRooms(Integer value) {
		realestate.setNumberOfBedRooms(value);
	}

	@Override
	public Integer getNumberOfBathRooms() {
		return realestate.getNumberOfBathRooms();
	}

	@Override
	public void setNumberOfBathRooms(Integer value) {
		realestate.setNumberOfBathRooms(value);
	}

	@Override
	public YesNotApplicableType getGuestToilet() {
		return realestate.getGuestToilet();
	}

	@Override
	public void setGuestToilet(YesNotApplicableType value) {
		realestate.setGuestToilet(value);
	}

	@Override
	public ParkingSpaceType getParkingSpaceType() {
		return realestate.getParkingSpaceType();
	}

	@Override
	public void setParkingSpaceType(ParkingSpaceType value) {
		realestate.setParkingSpaceType(value);
	}

	@Override
	public Double getParkingSpacePrice() {
		return realestate.getParkingSpacePrice();
	}

	@Override
	public void setParkingSpacePrice(Double value) {
		realestate.setParkingSpacePrice(value);
	}

	@Override
	public CourtageInfo getCourtage() {
		return realestate.getCourtage();
	}

	@Override
	public void setCourtage(CourtageInfo courtageInfo) {
		realestate.setCourtage(courtageInfo);
	}

	@Override
	public Price getPrice() {
		return realestate.getPrice();
	}

	@Override
	public void setPrice(Price value) {
		realestate.setPrice(value);
	}

	@Override
	public double getLivingSpace() {
		return realestate.getLivingSpace();
	}

	@Override
	public void setLivingSpace(double value) {
		realestate.setLivingSpace(value);
	}

	@Override
	public double getNumberOfRooms() {
		return realestate.getNumberOfRooms();
	}

	@Override
	public void setNumberOfRooms(double value) {
		realestate.setNumberOfRooms(value);
	}

	@Override
	public Boolean isBuiltInKitchen() {
		return realestate.isBuiltInKitchen();
	}

	@Override
	public void setBuiltInKitchen(Boolean value) {
		realestate.setBuiltInKitchen(value);
	}

	@Override
	public Boolean isBalcony() {
		return realestate.isBalcony();
	}

	@Override
	public void setBalcony(Boolean value) {
		realestate.setBalcony(value);
	}

	@Override
	public Boolean isGarden() {
		return realestate.isGarden();
	}

	@Override
	public void setGarden(Boolean value) {
		realestate.setGarden(value);
	}

	@Override
	public Double getServiceCharge() {
		return realestate.getServiceCharge();
	}

	@Override
	public void setServiceCharge(Double value) {
		realestate.setServiceCharge(value);
	}

	public void setEnergyPerformanceCertificate(Boolean value) {
		realestate.setEnergyPerformanceCertificate(value);
	}

	public Boolean isEnergyPerformanceCertificate() {
		return realestate.isEnergyPerformanceCertificate();
	}

	/*******************************************************************************************************
	 ********************************         Energy Stuff           ***************************************
	 *******************************************************************************************************/

	@Override
	public EnergySourcesEnev2014 getEnergySourcesEnev2014() {
		return realestate.getEnergySourcesEnev2014();
	}

	@Override
	public void setEnergySourcesEnev2014(EnergySourcesEnev2014 value) {
		realestate.setEnergySourcesEnev2014(value);
	}

	@Override
	public Double getThermalCharacteristic() {
		return realestate.getThermalCharacteristic();
	}

	@Override
	public void setThermalCharacteristic(Double value) {
		realestate.setThermalCharacteristic(value);
	}

	@Override
	public FiringTypes getFiringTypes() {
		return realestate.getFiringTypes();
	}

	@Override
	public void setFiringTypes(FiringTypes value) {
		realestate.setFiringTypes(value);
	}

	@Override
	public Boolean isConstructionYearUnknown() {
		return realestate.isConstructionYearUnknown();
	}

	@Override
	public void setConstructionYearUnknown(Boolean value) {
		realestate.setConstructionYearUnknown(value);
	}

	@Override
	public HeatingTypeEnev2014 getHeatingTypeEnev2014() {
		return realestate.getHeatingTypeEnev2014();
	}

	@Override
	public void setHeatingTypeEnev2014(HeatingTypeEnev2014 value) {
		realestate.setHeatingTypeEnev2014(value);
	}

	@Override
	public YesNotApplicableType getEnergyConsumptionContainsWarmWater() {
		return realestate.getEnergyConsumptionContainsWarmWater();
	}

	@Override
	public void setEnergyConsumptionContainsWarmWater(YesNotApplicableType value) {
		realestate.setEnergyConsumptionContainsWarmWater(value);
	}

	@Override
	public EnergyPerformanceCertificate getEnergyCertificate() {
		return realestate.getEnergyCertificate();
	}

	@Override
	public void setEnergyCertificate(EnergyPerformanceCertificate value) {
		realestate.setEnergyCertificate(value);
	}

	@Override
	public BuildingEnergyRatingType getBuildingEnergyRatingType() {
		return realestate.getBuildingEnergyRatingType();
	}

	@Override
	public void setBuildingEnergyRatingType(BuildingEnergyRatingType value) {
		realestate.setBuildingEnergyRatingType(value);
	}

	@Override
	public Integer getConstructionYear() {
		return realestate.getConstructionYear();
	}

	@Override
	public void setConstructionYear(Integer value) {
		realestate.setConstructionYear(value);
	}


}
