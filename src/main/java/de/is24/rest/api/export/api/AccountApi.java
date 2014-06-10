package de.is24.rest.api.export.api;

import java.util.List;

import de.immobilienscout24.rest.schema.customer._1.CustomerType;

/**
 * @author Martin Fluegge
 * 
 */
public interface AccountApi {
	public String getCustomerNumber();

	public User getUser();

	public String getSsoId();

	public CustomerType getCustomer();

	public CustomerType getCustomer(String string);

	public String getUsername(String customerId);

	public List<String> getUsernames(String customerId);
}
