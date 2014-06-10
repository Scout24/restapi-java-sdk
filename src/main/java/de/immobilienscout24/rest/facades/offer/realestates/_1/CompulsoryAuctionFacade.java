package de.immobilienscout24.rest.facades.offer.realestates._1;

import de.immobilienscout24.rest.schema.common._1.*;
import de.immobilienscout24.rest.schema.offer.realestates._1.CompulsoryAuction;


public class CompulsoryAuctionFacade implements RealestateFacade, EnergySavingFacade {
	final private CompulsoryAuction realestate;

	public CompulsoryAuctionFacade(CompulsoryAuction CompulsoryAuction) {
		realestate = CompulsoryAuction;
	}

	public CompulsoryAuction get() {
		return realestate;
	}

	@Override
	public Price getPrice() {
		return null;
	}

	@Override
	public void setPrice(Price value) {
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
