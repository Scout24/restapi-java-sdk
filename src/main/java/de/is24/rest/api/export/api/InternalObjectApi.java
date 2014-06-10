package de.is24.rest.api.export.api;

import de.is24.rest.api.export.api.ObjectApi.ObjectId;

/**
 * @author Martin Fluegge
 * 
 */
public interface InternalObjectApi {

	/**
	 * Deletes a real estate using the given XML to describe the object. Only
	 * intented for internal use.
	 * 
	 * @see http 
	 *      ://developerwiki.immobilienscout24.de/wiki/User/Realestate/attachment
	 *      /POST
	 * @param username
	 * @param xml
	 * @return the id of the newly created object.
	 */
	public String deleteRealestate(String username, String objectIdStr);

	public String deleteRealestate(String objectIdStr);

	public String deleteRealestate(String username, ObjectId objectId);

	public String deleteRealestate(ObjectId objectId);

}
