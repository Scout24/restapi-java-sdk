package de.immobilienscout24.rest.facades.offer.realestates._1;

import de.immobilienscout24.rest.schema.common._1.BuildingEnergyRatingType;
import de.immobilienscout24.rest.schema.common._1.EnergyPerformanceCertificate;
import de.immobilienscout24.rest.schema.common._1.EnergySourcesEnev2014;
import de.immobilienscout24.rest.schema.common._1.FiringTypes;
import de.immobilienscout24.rest.schema.common._1.HeatingTypeEnev2014;
import de.immobilienscout24.rest.schema.common._1.YesNotApplicableType;


public interface EnergySavingFacade extends RealestateFacade {
	Integer getConstructionYear();

	void setConstructionYear(Integer value);

	Boolean isConstructionYearUnknown();

	void setConstructionYearUnknown(Boolean value);

	Double getThermalCharacteristic();

	void setThermalCharacteristic(Double value);

	BuildingEnergyRatingType getBuildingEnergyRatingType();

	void setBuildingEnergyRatingType(BuildingEnergyRatingType ratingType);

	EnergyPerformanceCertificate getEnergyCertificate();

	void setEnergyCertificate(EnergyPerformanceCertificate performanceCertificate);

	EnergySourcesEnev2014 getEnergySourcesEnev2014();

	void setEnergySourcesEnev2014(EnergySourcesEnev2014 energySources);

	HeatingTypeEnev2014 getHeatingTypeEnev2014();

	void setHeatingTypeEnev2014(HeatingTypeEnev2014 heatingType);

	FiringTypes getFiringTypes();

	void setFiringTypes(FiringTypes firingTypes);

	YesNotApplicableType getEnergyConsumptionContainsWarmWater();

	void setEnergyConsumptionContainsWarmWater(YesNotApplicableType value);

	// isResidential / isCommercial --> RealestateFacade?
}
