package de.immobilienscout24.rest.facades.offer.realestates._1;

import de.immobilienscout24.rest.schema.common._1.CourtageInfo;
import de.immobilienscout24.rest.schema.common._1.GarageType;
import de.immobilienscout24.rest.schema.common._1.Price;
import de.immobilienscout24.rest.schema.common._1.RealEstateCondition;
import de.immobilienscout24.rest.schema.offer.realestates._1.GarageBuy;


public class GarageBuyFacade implements GarageFacade {
	final private GarageBuy realestate;

	public GarageBuyFacade(GarageBuy realestate) {
		this.realestate = realestate;
	}

	public GarageBuy get() {
		return realestate;
	}

	@Override
	public Integer getConstructionYear() {
		return realestate.getConstructionYear();
	}

	@Override
	public void setConstructionYear(Integer value) {
		realestate.setConstructionYear(value);
	}

	@Override
	public Double getLengthGarage() {
		return realestate.getLengthGarage();
	}

	@Override
	public void setLengthGarage(Double value) {
		realestate.setLengthGarage(value);
	}

	@Override
	public Double getWidthGarage() {
		return realestate.getWidthGarage();
	}

	@Override
	public void setWidthGarage(Double value) {
		realestate.setWidthGarage(value);
	}

	@Override
	public Double getHeightGarage() {
		return realestate.getHeightGarage();
	}

	@Override
	public void setHeightGarage(Double value) {
		realestate.setHeightGarage(value);
	}

	@Override
	public RealEstateCondition getCondition() {
		return realestate.getCondition();
	}

	@Override
	public void setCondition(RealEstateCondition condition) {
		realestate.setCondition(condition);
	}

	@Override
	public GarageType getGarageType() {
		return realestate.getGarageType();
	}

	@Override
	public void setGarageType(GarageType garageType) {
		realestate.setGarageType(garageType);
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
	public Integer getLastRefurbishment() {
		return realestate.getLastRefurbishment();
	}

	@Override
	public void setLastRefurbishment(Integer year) {
		realestate.setLastRefurbishment(year);
	}

	@Override
	public Price getPrice() {
		return realestate.getPrice();
	}

	@Override
	public void setPrice(Price price) {
		realestate.setPrice(price);
	}

	@Override
	public CourtageInfo getCourtage() {
		return realestate.getCourtage();
	}

	@Override
	public void setCourtage(CourtageInfo courtageInfo) {
		realestate.setCourtage(courtageInfo);
	}
}
