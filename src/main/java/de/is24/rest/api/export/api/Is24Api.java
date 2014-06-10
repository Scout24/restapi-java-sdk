package de.is24.rest.api.export.api;


/**
 * @author Martin Fluegge
 * 
 */
public interface Is24Api extends ObjectApi, SearchApi, AccountApi {

	public static final String ERROR_RESOURCE_NOT_FOUND = "ERROR_RESOURCE_NOT_FOUND";
	public static final String ERROR_COMMON_SCHEMA_VALIDATION_FAILED = "ERROR_COMMON_SCHEMA_VALIDATION_FAILED";
	public static final String ERROR_COMMON_REQUEST_CONFLICT = "ERROR_COMMON_REQUEST_CONFLICT";
	public static final String ERROR_GEOCODING_FAILED = "ERROR_GEOCODING_FAILED";
	public static final int ALL = -1;

	public String getProxyHost();

	public void setProxyHost(String proxyHost);

	public int getProxyPort();

	public void setProxyPort(int proxyPort);

}
