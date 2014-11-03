package de.immobilienscout24.rest.facades.offer.realestates._1;

import de.immobilienscout24.rest.schema.common._1.CommercializationType;
import de.immobilienscout24.rest.schema.common._1.CourtageInfo;
import de.immobilienscout24.rest.schema.common._1.LeaseIntervalType;
import de.immobilienscout24.rest.schema.common._1.Price;
import de.immobilienscout24.rest.schema.common._1.SiteConstructibleType;
import de.immobilienscout24.rest.schema.common._1.SiteDevelopmentType;

public interface SiteFacade extends RealestateFacade {
	void setLeaseInterval(LeaseIntervalType value);

	CommercializationType getCommercializationType();

	void setCommercializationType(CommercializationType value);

	Integer getTenancy();

	void setTenancy(Integer value);

	Price getPrice();

	void setPrice(Price value);

	double getPlotArea();

	void setPlotArea(double value);

	Double getMinDivisible();

	void setMinDivisible(Double value);

	CourtageInfo getCourtage();

	void setCourtage(CourtageInfo value);

	String getFreeFrom();

	void setFreeFrom(String value);

	Boolean isShortTermConstructible();

	void setShortTermConstructible(Boolean value);

	Boolean isBuildingPermission();

	void setBuildingPermission(Boolean value);

	Boolean isDemolition();

	void setDemolition(Boolean value);

	SiteDevelopmentType getSiteDevelopmentType();

	void setSiteDevelopmentType(SiteDevelopmentType value);

	SiteConstructibleType getSiteConstructibleType();

	void setSiteConstructibleType(SiteConstructibleType value);

	Double getGrz();

	void setGrz(Double value);

	Double getGfz();

	void setGfz(Double value);

	LeaseIntervalType getLeaseInterval();
}
