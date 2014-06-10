package de.immobilienscout24.rest.facades.offer.realestates._1;


import de.immobilienscout24.rest.schema.common._1.*;
import de.immobilienscout24.rest.schema.offer.realestates._1.LivingRentSite;

public class LivingRentSiteFacade implements SiteFacade {
	final private LivingRentSite realestate;

	public LivingRentSiteFacade(LivingRentSite realestate) {
		this.realestate = realestate;
	}

	public LivingRentSite get() {
		return realestate;
	}

	@Override
	public void setLeaseInterval(LeaseIntervalType value) {
		realestate.setLeaseInterval(value);
	}

	@Override
	public CommercializationType getCommercializationType() {
		return realestate.getCommercializationType();
	}

	@Override
	public void setCommercializationType(CommercializationType value) {
		realestate.setCommercializationType(value);
	}

	@Override
	public Integer getTenancy() {
		return realestate.getTenancy();
	}

	@Override
	public void setTenancy(Integer value) {
		realestate.setTenancy(value);
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
	public double getPlotArea() {
		return realestate.getPlotArea();
	}

	@Override
	public void setPlotArea(double value) {
		realestate.setPlotArea(value);
	}

	@Override
	public Double getMinDivisible() {
		return realestate.getMinDivisible();
	}

	@Override
	public void setMinDivisible(Double value) {
		realestate.setMinDivisible(value);
	}

	@Override
	public CourtageInfo getCourtage() {
		return realestate.getCourtage();
	}

	@Override
	public void setCourtage(CourtageInfo value) {
		realestate.setCourtage(value);
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
	public Boolean isShortTermConstructible() {
		return realestate.isShortTermConstructible();
	}

	@Override
	public void setShortTermConstructible(Boolean value) {
		realestate.setShortTermConstructible(value);
	}

	@Override
	public Boolean isBuildingPermission() {
		return realestate.isBuildingPermission();
	}

	@Override
	public void setBuildingPermission(Boolean value) {
		realestate.setBuildingPermission(value);
	}

	@Override
	public Boolean isDemolition() {
		return realestate.isDemolition();
	}

	@Override
	public void setDemolition(Boolean value) {
		realestate.setDemolition(value);
	}

	@Override
	public SiteDevelopmentType getSiteDevelopmentType() {
		return realestate.getSiteDevelopmentType();
	}

	@Override
	public void setSiteDevelopmentType(SiteDevelopmentType value) {
		realestate.setSiteDevelopmentType(value);
	}

	@Override
	public SiteConstructibleType getSiteConstructibleType() {
		return realestate.getSiteConstructibleType();
	}

	@Override
	public void setSiteConstructibleType(SiteConstructibleType value) {
		realestate.setSiteConstructibleType(value);
	}

	@Override
	public Double getGrz() {
		return realestate.getGrz();
	}

	@Override
	public void setGrz(Double value) {
		realestate.setGrz(value);
	}

	@Override
	public Double getGfz() {
		return realestate.getGfz();
	}

	@Override
	public void setGfz(Double value) {
		realestate.setGfz(value);
	}

	@Override
	public LeaseIntervalType getLeaseInterval() {
		return realestate.getLeaseInterval();
	}
}
