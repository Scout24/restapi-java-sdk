package de.immobilienscout24.rest.schema.offer.placement;

import de.immobilienscout24.rest.schema.common._1.DateRange;

/**
 * @author Martin Fluegge
 * 
 */
public interface Placement {

	public DateRange getServicePeriod();

	public void setServicePeriod(DateRange value);

	public String getRealestateid();

	public void setRealestateid(String value);

	public String getVoucher();
}
