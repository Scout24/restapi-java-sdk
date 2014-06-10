package de.immobilienscout24.rest.facades.offer.realestates._1;

import de.immobilienscout24.rest.schema.common._1.*;
import de.immobilienscout24.rest.schema.offer.realestates._1.HouseRent;

public class HouseRentFacade implements HouseFacade {
	final private HouseRent realestate;

	public HouseRentFacade(HouseRent realestate) {
		this.realestate = realestate;
	}

	public HouseRent get() {
		return realestate;
	}

	public EnergySourcesEnev2014 getEnergySourcesEnev2014() {
		return realestate.getEnergySourcesEnev2014();
	}

	public void setEnergySourcesEnev2014(EnergySourcesEnev2014 value) {
		realestate.setEnergySourcesEnev2014(value);
	}

	public void setEnergyPerformanceCertificate(Boolean value) {
		realestate.setEnergyPerformanceCertificate(value);
	}

	public Boolean isEnergyPerformanceCertificate() {
		return realestate.isEnergyPerformanceCertificate();
	}

	public Double getThermalCharacteristic() {
		return realestate.getThermalCharacteristic();
	}

	public void setThermalCharacteristic(Double value) {
		realestate.setThermalCharacteristic(value);
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
	public String getFreeFrom() {
		return realestate.getFreeFrom();
	}

	@Override
	public void setFreeFrom(String value) {
		realestate.setFreeFrom(value);
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
	public BuildingType getBuildingType() {
		return realestate.getBuildingType();
	}

	@Override
	public void setBuildingType(BuildingType value) {
		realestate.setBuildingType(value);
	}

	public CourtageInfo getCourtage() {
		return realestate.getCourtage();
	}

	public void setCourtage(CourtageInfo value) {
		realestate.setCourtage(value);
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
	public Double getParkingSpacePrice() {
		return realestate.getParkingSpacePrice();
	}

	@Override
	public void setParkingSpacePrice(Double value) {
		realestate.setParkingSpacePrice(value);
	}

	public FiringTypes getFiringTypes() {
		return realestate.getFiringTypes();
	}

	public void setFiringTypes(FiringTypes value) {
		realestate.setFiringTypes(value);
	}

	public void setConstructionYearUnknown(Boolean value) {
		realestate.setConstructionYearUnknown(value);
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
	public YesNotApplicableType getHandicappedAccessible() {
		return realestate.getHandicappedAccessible();
	}

	@Override
	public void setHandicappedAccessible(YesNotApplicableType value) {
		realestate.setHandicappedAccessible(value);
	}

	@Override
	public double getPlotArea() {
		return realestate.getPlotArea();
	}

	@Override
	public void setPlotArea(double value) {
		realestate.setPlotArea(value);
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
	public double getLivingSpace() {
		return realestate.getLivingSpace();
	}

	@Override
	public void setLivingSpace(double value) {
		realestate.setLivingSpace(value);
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
	public HeatingType getHeatingType() {
		return realestate.getHeatingType();
	}

	@Override
	public void setHeatingType(HeatingType value) {
		realestate.setHeatingType(value);
	}

	public HeatingTypeEnev2014 getHeatingTypeEnev2014() {
		return realestate.getHeatingTypeEnev2014();
	}

	public void setHeatingTypeEnev2014(HeatingTypeEnev2014 value) {
		realestate.setHeatingTypeEnev2014(value);
	}

	@Override
	public Integer getNumberOfParkingSpaces() {
		return realestate.getNumberOfParkingSpaces();
	}

	@Override
	public void setNumberOfParkingSpaces(Integer value) {
		realestate.setNumberOfParkingSpaces(value);
	}

	public Boolean isConstructionYearUnknown() {
		return realestate.isConstructionYearUnknown();
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
	public YesNotApplicableType getEnergyConsumptionContainsWarmWater() {
		return realestate.getEnergyConsumptionContainsWarmWater();
	}

	@Override
	public void setEnergyConsumptionContainsWarmWater(YesNotApplicableType value) {
		realestate.setEnergyConsumptionContainsWarmWater(value);
	}

	@Override
	public YesNotApplicableType getGuestToilet() {
		return realestate.getGuestToilet();
	}

	@Override
	public void setGuestToilet(YesNotApplicableType value) {
		realestate.setGuestToilet(value);
	}

	public EnergyPerformanceCertificate getEnergyCertificate() {
		return realestate.getEnergyCertificate();
	}

	public void setEnergyCertificate(EnergyPerformanceCertificate value) {
		realestate.setEnergyCertificate(value);
	}

	public Price getPrice() {
		return realestate.getPrice();
	}

	public void setPrice(Price value) {
		realestate.setPrice(value);
	}

	public BuildingEnergyRatingType getBuildingEnergyRatingType() {
		return realestate.getBuildingEnergyRatingType();
	}

	public void setBuildingEnergyRatingType(BuildingEnergyRatingType value) {
		realestate.setBuildingEnergyRatingType(value);
	}

	public Integer getConstructionYear() {
		return realestate.getConstructionYear();
	}

	public void setConstructionYear(Integer value) {
		realestate.setConstructionYear(value);
	}

	@Override
	public YesNotApplicableType getCellar() {
		return realestate.getCellar();
	}

	@Override
	public void setCellar(YesNotApplicableType value) {
		realestate.setCellar(value);
	}
}
