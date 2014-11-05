package de.immobilienscout24.rest.facades.offer.realestates._1;


import de.immobilienscout24.rest.schema.common._1.CommercializationType;
import de.immobilienscout24.rest.schema.common._1.CourtageInfo;
import de.immobilienscout24.rest.schema.common._1.LeaseIntervalType;
import de.immobilienscout24.rest.schema.common._1.Price;
import de.immobilienscout24.rest.schema.common._1.SiteConstructibleType;
import de.immobilienscout24.rest.schema.common._1.SiteDevelopmentType;
import de.immobilienscout24.rest.schema.offer.realestates._1.TradeSite;

public class TradeSiteFacade implements SiteFacade {
	final private TradeSite realestate;

	public TradeSiteFacade(TradeSite realestate) {
		this.realestate = realestate;
	}

	public TradeSite get() {
		return realestate;
	}

	public void setLeaseInterval(LeaseIntervalType value) {
		realestate.setLeaseInterval(value);
	}

	public CommercializationType getCommercializationType() {
		return realestate.getCommercializationType();
	}

	public void setCommercializationType(CommercializationType value) {
		realestate.setCommercializationType(value);
	}

	public Integer getTenancy() {
		return realestate.getTenancy();
	}

	public void setTenancy(Integer value) {
		realestate.setTenancy(value);
	}

	public Price getPrice() {
		return realestate.getPrice();
	}

	public void setPrice(Price value) {
		realestate.setPrice(value);
	}

	public double getPlotArea() {
		return realestate.getPlotArea();
	}

	public void setPlotArea(double value) {
		realestate.setPlotArea(value);
	}

	public Double getMinDivisible() {
		return realestate.getMinDivisible();
	}

	public void setMinDivisible(Double value) {
		realestate.setMinDivisible(value);
	}

	public CourtageInfo getCourtage() {
		return realestate.getCourtage();
	}

	public void setCourtage(CourtageInfo value) {
		realestate.setCourtage(value);
	}

	public String getFreeFrom() {
		return realestate.getFreeFrom();
	}

	public void setFreeFrom(String value) {
		realestate.setFreeFrom(value);
	}

	public Boolean isShortTermConstructible() {
		return realestate.isShortTermConstructible();
	}

	public void setShortTermConstructible(Boolean value) {
		realestate.setShortTermConstructible(value);
	}

	public Boolean isBuildingPermission() {
		return realestate.isBuildingPermission();
	}

	public void setBuildingPermission(Boolean value) {
		realestate.setBuildingPermission(value);
	}

	public Boolean isDemolition() {
		return realestate.isDemolition();
	}

	public void setDemolition(Boolean value) {
		realestate.setDemolition(value);
	}

	public SiteDevelopmentType getSiteDevelopmentType() {
		return realestate.getSiteDevelopmentType();
	}

	public void setSiteDevelopmentType(SiteDevelopmentType value) {
		realestate.setSiteDevelopmentType(value);
	}

	public SiteConstructibleType getSiteConstructibleType() {
		return realestate.getSiteConstructibleType();
	}

	public void setSiteConstructibleType(SiteConstructibleType value) {
		realestate.setSiteConstructibleType(value);
	}

	public Double getGrz() {
		return realestate.getGrz();
	}

	public void setGrz(Double value) {
		realestate.setGrz(value);
	}

	public Double getGfz() {
		return realestate.getGfz();
	}

	public void setGfz(Double value) {
		realestate.setGfz(value);
	}

	public LeaseIntervalType getLeaseInterval() {
		return realestate.getLeaseInterval();
	}
}
