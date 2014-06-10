package de.immobilienscout24.rest.facades.offer.realestates._1;

import de.immobilienscout24.rest.schema.common._1.*;
import de.immobilienscout24.rest.schema.offer.realestates._1.Gastronomy;


public class GastronomyFacade implements CommercialFacade {
	final private Gastronomy realestate;

	public GastronomyFacade(Gastronomy Gastronomy) {
		realestate = Gastronomy;
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
	public void setLastRefurbishment(Integer value) {
		realestate.setLastRefurbishment(value);
	}

	@Override
	public Integer getLastRefurbishment() {
		return realestate.getLastRefurbishment();
	}

	@Override
	public Integer getDistanceToMRS() {
		return realestate.getDistanceToMRS();
	}

	@Override
	public void setDistanceToMRS(Integer value) {
		realestate.setDistanceToMRS(value);
	}

	@Override
	public Integer getDistanceToFM() {
		return realestate.getDistanceToFM();
	}

	@Override
	public void setDistanceToFM(Integer value) {
		realestate.setDistanceToFM(value);
	}

	@Override
	public Integer getDistanceToPT() {
		return realestate.getDistanceToPT();
	}

	@Override
	public void setDistanceToPT(Integer value) {
		realestate.setDistanceToPT(value);
	}

	@Override
	public Integer getDistanceToAirport() {
		return realestate.getDistanceToAirport();
	}

	@Override
	public void setDistanceToAirport(Integer value) {
		realestate.setDistanceToAirport(value);
	}

	@Override
	public void setCalculatedPrice(Price value) {
		realestate.setCalculatedPrice(value);
	}

	@Override
	public Price getCalculatedPrice() {
		return realestate.getCalculatedPrice();
	}

	@Override
	public Double getTotalFloorSpace() {
		return realestate.getTotalFloorSpace();
	}

	@Override
	public void setTotalFloorSpace(Double value) {
		realestate.setTotalFloorSpace(value);
	}

	@Override
	public void setCondition(RealEstateCondition value) {
		realestate.setCondition(value);
	}

	@Override
	public RealEstateCondition getCondition() {
		return realestate.getCondition();
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
	public void setParkingSpacePrice(Double value) {
		realestate.setParkingSpacePrice(value);
	}

	@Override
	public Double getParkingSpacePrice() {
		return realestate.getParkingSpacePrice();
	}

	@Override
	public Double getAdditionalArea() {
		return realestate.getAdditionalArea();
	}

	@Override
	public void setAdditionalArea(Double value) {
		realestate.setAdditionalArea(value);
	}

	@Override
	public String getNumberOfFloors() {
		return realestate.getNumberOfFloors();
	}

	@Override
	public void setNumberOfFloors(String value) {
		realestate.setNumberOfFloors(value);
	}

	@Override
	public Price getAdditionalCosts() {
		return realestate.getAdditionalCosts();
	}

	@Override
	public void setAdditionalCosts(Price value) {
		realestate.setAdditionalCosts(value);
	}

	@Override
	public String getDeposit() {
		return realestate.getDeposit();
	}

	@Override
	public void setDeposit(String value) {
		realestate.setDeposit(value);
	}

	@Override
	public void setLift(YesNotApplicableType value) {
		realestate.setLift(value);
	}

	@Override
	public YesNotApplicableType getLift() {
		return realestate.getLift();
	}

	public Gastronomy get() {
		return realestate;
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
	public CourtageInfo getCourtage() {
		return realestate.getCourtage();
	}

	@Override
	public void setCourtage(CourtageInfo value) {
		realestate.setCourtage(value);
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
