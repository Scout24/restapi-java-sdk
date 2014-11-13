package de.is24.rest.api.export.api;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import de.immobilienscout24.rest.schema.common._1.Attachment;
import de.immobilienscout24.rest.schema.common._1.PDFDocument;
import de.immobilienscout24.rest.schema.common._1.Picture;
import de.immobilienscout24.rest.schema.common._1.RealtorContactDetails;
import de.immobilienscout24.rest.schema.common._1.StreamingVideo;
import de.immobilienscout24.rest.schema.common._1.VideoFile;
import de.immobilienscout24.rest.schema.offer.placement.Placement;
import de.immobilienscout24.rest.schema.offer.realestateproject._1.RealEstateProject;
import de.immobilienscout24.rest.schema.offer.realestateproject._1.RealEstateProjectEntries;
import de.immobilienscout24.rest.schema.offer.realestates._1.RealEstate;
import de.is24.rest.api.export.api.impl.InternalId;
import de.is24.rest.api.export.api.impl.OnTopPlacement;

/**
 * @author Martin Fluegge
 * 
 */
public interface ObjectApi {

	/**
	 * Returns the consumer key
	 * 
	 * @return
	 */
	public String getApiConsumerKey();

	/**
	 * Returns the consumer secret
	 * 
	 * @return
	 */
	public String getApiConsumerSecret();

	/**
	 * Initializes the API object with the counsumer credentials. Musst be
	 * called first. TODO: Concider to move this to the constructor
	 * 
	 * @param apiConsumerKey
	 * @param apiConsumerSecret
	 * @param baseUrl
	 */
	public void init(String apiConsumerKey, String apiConsumerSecret, String baseUrl);

	/**
	 * Sends a request using the HTTP method POST.
	 * 
	 * @param request
	 * @param body
	 * @return
	 */
	public String sendPostRequest(URL request, String body);

	/**
	 * Sends a request using HTTP method GET.
	 * 
	 * @param request
	 * @return
	 */
	public String sendGetRequest(URL request);

	/**
	 * Sends a request using HTTP method DELETE.
	 * 
	 * @param request
	 * @return
	 */
	public String sendDeleteRequest(URL request);

	/**
	 * Return the username of a logged in user. Username is requested with the
	 * parameter value "me".
	 * 
	 * @return
	 */
	public String getUserName();

	/**
	 * Signs the request using OAuth.
	 * 
	 * @param apiRequest
	 */
	public void signRequest(HttpURLConnection apiRequest);

	/**
	 * Signs in to the API. This method must be called before any other request
	 * is send to the API.
	 * 
	 * @param accessToken
	 *            access token for a user
	 * @param accessSecret
	 *            access secret for a user
	 */
	public void signIn(String accessToken, String accessSecret);

	/**
	 * Adds an attachment to the give resource.
	 * 
	 * @see http 
	 *      ://developerwiki.immobilienscout24.de/wiki/User/Realestate/attachment
	 *      /POST
	 * 
	 * @param username
	 *            the login name of the user or "me" if the user is already
	 *            logged in
	 * @param realEstateId
	 *            the is 24 id of the real estate
	 * @param file
	 *            the file that should be uploaded
	 * @param title
	 *            name of the title
	 * @param isFloorplan
	 *            marks whether the image is a floorplan
	 * @param isTitlePicture
	 *            marks whether the image is a title picture
	 * @return
	 */
	public String addAttachmentToRealestate(String username, String realEstateId, IMultimediaObject object);

	/**
	 * Adds an attachment to the give resource.
	 * 
	 * @see http 
	 *      ://developerwiki.immobilienscout24.de/wiki/User/Realestate/attachment
	 *      /POST
	 * 
	 * @param username
	 *            the login name of the user or "me" if the user is already
	 *            logged in
	 * @param realEstateId
	 *            the is 24 id of the real estate
	 * @param file
	 *            the file that should be uploaded
	 * @param title
	 *            name of the title
	 * @param isFloorplan
	 *            marks whether the image is a floorplan
	 * @param isTitlePicture
	 *            marks whether the image is a title picture
	 * @return
	 */
	public String addAttachmentToRealestate(String realEstateId, IMultimediaObject object);

	/**
	 * Adds an attachment to the give resource.
	 * 
	 * @see http 
	 *      ://developerwiki.immobilienscout24.de/wiki/User/Realestate/attachment
	 *      /POST
	 * 
	 * @param username
	 *            the login name of the user or "me" if the user is already
	 *            logged in
	 * @param realEstateId
	 *            the is 24 id of the real estate
	 * @param file
	 *            the file that should be uploaded
	 * @param title
	 *            name of the title
	 * @param isFloorplan
	 *            marks whether the image is a floorplan
	 * @param isTitlePicture
	 *            marks whether the image is a title picture
	 * @return
	 */
	public String updateAttachment(String username, InternalId scoutId, String attachmentId, IMultimediaObject object);

	/**
	 * Adds an attachment to the give resource.
	 * 
	 * @see http 
	 *      ://developerwiki.immobilienscout24.de/wiki/User/Realestate/attachment
	 *      /POST
	 * 
	 * @param username
	 *            the login name of the user or "me" if the user is already
	 *            logged in
	 * @param realEstateId
	 *            the is 24 id of the real estate
	 * @param file
	 *            the file that should be uploaded
	 * @param title
	 *            name of the title
	 * @param isFloorplan
	 *            marks whether the image is a floorplan
	 * @param isTitlePicture
	 *            marks whether the image is a title picture
	 * @return
	 */
	public String updateAttachment(InternalId scoutId, String attachmentId, IMultimediaObject object);

	/**
	 * Return all publish channels in which the object is published.
	 * 
	 * @see http://developerwiki.immobilienscout24.de/wiki/Publish/GET
	 * @param username
	 * @param realestateId
	 * @return
	 */
	public List<PublishChannel> getPublishChannelsForRealestate(String realestateId);

	/**
	 * Return all publish channels ids in which the object is published.
	 * 
	 * @see http://developerwiki.immobilienscout24.de/wiki/Publish/GET
	 * @param username
	 * @param realestateId
	 * @return
	 */
	public List<String> getPublishChannelIdsForRealestate(String realestateId);

	/**
	 * Returns a publish channel in which the object is published
	 * 
	 * @see http://developerwiki.immobilienscout24.de/wiki/Publish/GETbyID
	 * @param realestateId
	 * @param publishChannelId
	 * @return
	 */
	public PublishChannel getPublishChannelForRealestate(String realestateId, String publishChannelId);

	/**
	 * This method hands out all attachments of a real estate object as a list.
	 * 
	 * @see http 
	 *      ://developerwiki.immobilienscout24.de/wiki/User/Realestate/attachment
	 *      /GETALL
	 * @param username
	 *            the username of the user
	 * @param objectId
	 *            the internal or external id of the object
	 * @return
	 */
	public List<Attachment> getAttachments(String username, ObjectId objectId);

	/**
	 * This method hands out all attachments of a real estate object as a list.
	 * 
	 * @see http 
	 *      ://developerwiki.immobilienscout24.de/wiki/User/Realestate/attachment
	 *      /GETALL
	 * @param username
	 *            the username of the user
	 * @param objectId
	 *            the internal or external id of the object
	 * @return
	 */
	public List<Attachment> getAttachments(ObjectId objectId);

	/**
	 * This method hands out all attachment-ids of a real estate object as a
	 * list.
	 * 
	 * @see http 
	 *      ://developerwiki.immobilienscout24.de/wiki/User/Realestate/attachment
	 * @param user
	 * @param realestateId
	 * @return
	 */
	public List<String> getAllAttachmentIds(String username, String realestateId);

	/**
	 * This method hands out all attachment-ids of a real estate object as a
	 * list.
	 * 
	 * @see http 
	 *      ://developerwiki.immobilienscout24.de/wiki/User/Realestate/attachment
	 * @param user
	 * @param realestateId
	 * @return
	 */
	public List<String> getAllAttachmentIds(String realestateId);

	/**
	 * This method hands out all attachments of a real estate object as a list
	 * in the current order.
	 * 
	 * @see http 
	 *      ://rest.immobilienscout24.de/restapi/api/offer/v1.0/user/{username
	 *      }/realestate/{id}/attachment/attachmentsorder
	 * @param user
	 * @param realestateId
	 * @return
	 */
	public List<Attachment> getAllAttachmentsOrdered(String username, String realestateId);

	/**
	 * This method hands out all attachments of a real estate object as a list
	 * in the current order.
	 * 
	 * @see http 
	 *      ://rest.immobilienscout24.de/restapi/api/offer/v1.0/user/{username
	 *      }/realestate/{id}/attachment/attachmentsorder
	 * @param user
	 * @param realestateId
	 * @return
	 */
	public List<Attachment> getAllAttachmentsOrdered(String realestateId);

	/**
	 * This method hands out all attachment-ids of a real estate object as a
	 * list in the current order.
	 * 
	 * @see http 
	 *      ://rest.immobilienscout24.de/restapi/api/offer/v1.0/user/{username
	 *      }/realestate/{id}/attachment/attachmentsorder
	 * @param user
	 * @param realestateId
	 * @return
	 */
	public List<String> getAllAttachmentIdsOrdered(String username, String realestateId);

	/**
	 * This method hands out all attachment-ids of a real estate object as a
	 * list in the current order.
	 * 
	 * @see http 
	 *      ://rest.immobilienscout24.de/restapi/api/offer/v1.0/user/{username
	 *      }/realestate/{id}/attachment/attachmentsorder
	 * @param user
	 * @param realestateId
	 * @return
	 */
	public List<String> getAllAttachmentIdsOrdered(String realestateId);

	/**
	 * Return an attachment for the given id.
	 * 
	 * @see http 
	 *      ://developerwiki.immobilienscout24.de/wiki/User/Realestate/attachment
	 *      /GETbyID
	 * @param user
	 * @param realestateId
	 * @param attachmentId
	 * @return the attachment found by the id or null if not found
	 */
	public Attachment getAttachment(String username, ObjectId objectId, String attachmentId);

	/**
	 * Return an attachment for the given id.
	 * 
	 * @see http 
	 *      ://developerwiki.immobilienscout24.de/wiki/User/Realestate/attachment
	 *      /GETbyID
	 * @param user
	 * @param realestateId
	 * @param attachmentId
	 * @return the attachment found by the id or null if not found
	 */
	public Attachment getAttachment(ObjectId objectId, String attachmentId);

	/**
	 * Deletes an attachment for the given id.
	 * 
	 * @see http 
	 *      ://developerwiki.immobilienscout24.de/wiki/User/Realestate/attachment
	 *      /DELETEbyID
	 * @param user
	 * @param realestateId
	 * @param attachmentId
	 */
	public void deleteAttachment(String username, String realestateId, String attachmentId);

	/**
	 * Deletes an attachment for the given id.
	 * 
	 * @see http 
	 *      ://developerwiki.immobilienscout24.de/wiki/User/Realestate/attachment
	 *      /DELETEbyID
	 * @param user
	 * @param realestateId
	 * @param attachmentId
	 */
	public void deleteAttachment(String realestateId, String attachmentId);

	/**
	 * Changes the metadata of an attachment
	 * 
	 * @see http 
	 *      ://developerwiki.immobilienscout24.de/wiki/User/Realestate/attachment
	 *      /PUTbyID
	 * @param username
	 * @param realestateId
	 * @param title
	 * @param osFloorplan
	 * @param isTitlePicture
	 * @return
	 */
	public void changeAttachment(String username, String realestateId, String attachmentId, IMultimediaObject object);

	/**
	 * Changes the metadata of an attachment
	 * 
	 * @see http 
	 *      ://developerwiki.immobilienscout24.de/wiki/User/Realestate/attachment
	 *      /PUTbyID
	 * @param username
	 * @param realestateId
	 * @param title
	 * @param osFloorplan
	 * @param isTitlePicture
	 * @return
	 */
	public void changeAttachment(String realestateId, String attachmentId, IMultimediaObject object);

	/**
	 * Changes the order of attachments provided by the given xml.
	 * 
	 * @see http 
	 *      ://developerwiki.immobilienscout24.de/wiki/User/Realestate/attachment
	 *      /attachmentsorder/PUT
	 * @param username
	 * @param realestateId
	 * @param xml
	 * @return
	 */
	public void changeAttachmentOrder(String username, String realestateId, String xml);

	/**
	 * Changes the order of attachments provided by the given xml.
	 * 
	 * @see http 
	 *      ://developerwiki.immobilienscout24.de/wiki/User/Realestate/attachment
	 *      /attachmentsorder/PUT
	 * @param username
	 * @param realestateId
	 * @param xml
	 * @return
	 */
	public void changeAttachmentOrder(String realestateId, String xml);

	/**
	 * Changes the order of attachments by the new order given by the list
	 * 
	 * @see http 
	 *      ://developerwiki.immobilienscout24.de/wiki/User/Realestate/attachment
	 *      /attachmentsorder/PUT
	 * @param username
	 * @param realestateId
	 * @param attachmentIds
	 *            the new order of the attachments.
	 * @return
	 */
	public String changeAttachmentOrder(String username, String realestateId, List<String> attachmentIds);

	/**
	 * Changes the order of attachments by the new order given by the list
	 * 
	 * @see http 
	 *      ://developerwiki.immobilienscout24.de/wiki/User/Realestate/attachment
	 *      /attachmentsorder/PUT
	 * @param username
	 * @param realestateId
	 * @param attachmentIds
	 *            the new order of the attachments.
	 * @return
	 */
	public String changeAttachmentOrder(String realestateId, List<String> attachmentIds);

	public String search(String realestateType, String geoCodes);

	/**
	 * Creates a real estate using the given XML to describe the object.
	 * 
	 * @see http 
	 *      ://developerwiki.immobilienscout24.de/wiki/User/Realestate/attachment
	 *      /POST
	 * @param username
	 * @param xml
	 * @return the id of the newly created object.
	 */
	public String createRealestate(String username, String xml);

	/**
	 * Creates a real estate using the given XML to describe the object.
	 * 
	 * @see http 
	 *      ://developerwiki.immobilienscout24.de/wiki/User/Realestate/attachment
	 *      /POST
	 * @param username
	 * @param xml
	 * @return the id of the newly created object.
	 */
	public String createRealestate(String username, RealEstate realestate);

	/**
	 * Creates a real estate using the given XML to describe the object.
	 * 
	 * @see http 
	 *      ://developerwiki.immobilienscout24.de/wiki/User/Realestate/attachment
	 *      /POST
	 * @param username
	 * @param xml
	 * @return the id of the newly created object.
	 */
	public String createRealestate(RealEstate realestate);

	/**
	 * Creates a real estate using the given XML to describe the object.
	 * 
	 * @see http 
	 *      ://developerwiki.immobilienscout24.de/wiki/User/Realestate/attachment
	 *      /POST
	 * @param username
	 * @param xml
	 * @return the id of the newly created object.
	 */
	public String createRealestate(String xml);

	/**
	 * Deactivates in the given channel a real estate using the given XML to
	 * describe the object.
	 * 
	 * @see http 
	 *      ://developerwiki.immobilienscout24.de/wiki/User/Realestate/attachment
	 *      /POST
	 * @param username
	 * @param xml
	 * @return the id of the newly created object.
	 */
	public String deactivateRealestate(String objectId, String channelId);

	/**
	 * Updates a real estate using the given XML to describe the object. An
	 * 
	 * @see <a href=
	 *      "http://developerwiki.immobilienscout24.de/wiki/User/Realestate/PUTbyID"
	 *      />
	 * 
	 * @param username
	 * @param xml
	 * @return the id of the newly created object.
	 */
	public String updateRealestate(String username, String realestateId, String xml);

	/**
	 * Updates a real estate using the given XML to describe the object. An
	 * 
	 * @see <a href=
	 *      "http://developerwiki.immobilienscout24.de/wiki/User/Realestate/PUTbyID"
	 *      />
	 * 
	 * @param username
	 * @param xml
	 * @return the id of the newly created object.
	 */
	public String updateRealestate(String realestateId, String xml);

	/**
	 * Updates a real estate using the given XML to describe the object. An
	 * 
	 * @see <a href=
	 *      "http://developerwiki.immobilienscout24.de/wiki/User/Realestate/PUTbyID"
	 *      />
	 * 
	 * @param username
	 * @param xml
	 * @return the id of the newly created object.
	 */
	public String updateRealestate(String username, String realestateId, String xml, boolean isExternalId);

	/**
	 * Updates a realestate using the given XML to describe the object. An
	 * 
	 * @see <a href=
	 *      "http://developerwiki.immobilienscout24.de/wiki/User/Realestate/PUTbyID"
	 *      />
	 * 
	 * @param username
	 * @param xml
	 * @return the id of the newly created object.
	 */
	public String updateRealestate(String realestateId, String xml, boolean isExternalId);

	/**
	 * Creates a realestate using the given XML to describe the object.
	 * 
	 * @see http 
	 *      ://developerwiki.immobilienscout24.de/wiki/User/Realestate/attachment
	 *      /POST
	 * @param username
	 * @param xml
	 * @return the id of the newly created object.
	 */
	public String updateRealestate(String username, ObjectId id, RealEstate realestate);

	/**
	 * Creates a real estate using the given XML to describe the object.
	 * 
	 * @see http 
	 *      ://developerwiki.immobilienscout24.de/wiki/User/Realestate/attachment
	 *      /POST
	 * @param username
	 * @param xml
	 * @return the id of the newly created object.
	 */
	public String updateRealestate(ObjectId id, RealEstate realestate);

	/**
	 * Returns a realestes for a given user.
	 * 
	 * @see http
	 *      ://developerwiki.immobilienscout24.de/wiki/User/Realestate/GETALL
	 * @param username
	 * @return
	 */
	public List<RealEstate> getAllRealestates(String username);

	/**
	 * Returns a realestes for a given user me.
	 * 
	 * @see http
	 *      ://developerwiki.immobilienscout24.de/wiki/User/Realestate/GETALL
	 * @param username
	 * @return
	 */
	public List<RealEstate> getAllRealestates();

	/**
	 * Returns a realestes for a given user me.
	 * 
	 * @see http
	 *      ://developerwiki.immobilienscout24.de/wiki/User/Realestate/GETALL
	 * @param username
	 * @return
	 */
	public List<RealEstate> getAllRealestates(int pagesize);

	/**
	 * Returns a realestes for a given user me.
	 * 
	 * @see http
	 *      ://developerwiki.immobilienscout24.de/wiki/User/Realestate/GETALL
	 * @param username
	 * @return
	 */
	public List<RealEstate> getAllRealestates(int pageSize, int pageNumber);

	/**
	 * Returns a realestes for a given user me.
	 * 
	 * @see http
	 *      ://developerwiki.immobilienscout24.de/wiki/User/Realestate/GETALL
	 * @param username
	 * @return
	 */
	public List<RealEstate> getAllRealestates(String username, int pageSize, int pageNumber);

	/**
	 * Returns a realestes for a given user me.
	 * 
	 * @see http
	 *      ://developerwiki.immobilienscout24.de/wiki/User/Realestate/GETALL
	 * @param username
	 * @return
	 */
	public List<RealEstate> getAllRealestates(String username, int pageSize);

	/**
	 * Returns a list of realeste-ids for a given user.
	 * 
	 * @see http
	 *      ://developerwiki.immobilienscout24.de/wiki/User/Realestate/GETALL
	 * @param username
	 * @return
	 */
	public List<String> getAllRealestateIds(String username);

	/**
	 * Returns a list of realeste-ids for a given user me.
	 * 
	 * @see http
	 *      ://developerwiki.immobilienscout24.de/wiki/User/Realestate/GETALL
	 * @param username
	 * @return
	 */
	public List<String> getAllRealestateIds();

	/**
	 * Returns a realestate
	 * 
	 * @see http
	 *      ://developerwiki.immobilienscout24.de/wiki/User/Realestate/GETbyID
	 * @param username
	 * @param realestateId
	 *            the internal or external id of the realestate.
	 * @param isExternal
	 *            It set to true the given Id will be treated as external id,
	 *            otherwise as internal id
	 * @return
	 */
	public RealEstate getRealestate(String username, ObjectId realestateId);

	/**
	 * Returns a realestate for user me.
	 * 
	 * @see http
	 *      ://developerwiki.immobilienscout24.de/wiki/User/Realestate/GETbyID
	 * @param username
	 * @param realestateId
	 *            the internal or external id of the realestate.
	 * @param isExternal
	 *            It set to true the given Id will be treated as external id,
	 *            otherwise as internal id
	 * @return
	 */
	public RealEstate getRealestate(ObjectId realestateId);

	/**
	 * Returns a realestate
	 * 
	 * @see http
	 *      ://developerwiki.immobilienscout24.de/wiki/User/Realestate/GETbyID
	 * @param username
	 * @param realestateId
	 *            the internal or external id of the realestate.
	 * @param isExternal
	 *            It set to true the given Id will be treated as external id,
	 *            otherwise as internal id
	 * @return
	 */
	public RealEstate getRealestate(String username, String realestateId, boolean isExternal);

	/**
	 * Returns a realestate for user me.
	 * 
	 * @see http
	 *      ://developerwiki.immobilienscout24.de/wiki/User/Realestate/GETbyID
	 * @param username
	 * @param realestateId
	 *            the internal or external id of the realestate.
	 * @param isExternal
	 *            It set to true the given Id will be treated as external id,
	 *            otherwise as internal id
	 * @return
	 */
	public RealEstate getRealestate(String realestateId, boolean isExternal);

	/**
	 * Returns a realestate
	 * 
	 * @see http
	 *      ://developerwiki.immobilienscout24.de/wiki/User/Realestate/GETbyID
	 * @param username
	 * @param realestateId
	 *            the internal id of the realestate.
	 * @return
	 */
	public RealEstate getRealestate(String username, String realestateId);

	/**
	 * Returns a realestate for user me.
	 * 
	 * @see http
	 *      ://developerwiki.immobilienscout24.de/wiki/User/Realestate/GETbyID
	 * @param username
	 * @param realestateId
	 *            the internal id of the realestate.
	 * @return
	 */
	public RealEstate getRealestate(String realestateId);

	/**
	 * Returns am xml reüpresentation of the realestate
	 * 
	 * @see http
	 *      ://developerwiki.immobilienscout24.de/wiki/User/Realestate/GETbyID
	 * @param username
	 * @param realestateId
	 *            the internal or external id of the realestate.
	 * @return
	 */
	public String getRealestateAsXml(String username, String realestateId);

	/**
	 * Returns am xml reüpresentation of the realestate for user me.
	 * 
	 * @see http
	 *      ://developerwiki.immobilienscout24.de/wiki/User/Realestate/GETbyID
	 * @param username
	 * @param realestateId
	 *            the internal or external id of the realestate.
	 * @return
	 */
	public String getRealestateAsXml(String realestateId);

	/**
	 * Creates a contact from the given XML.
	 * 
	 * @see http://developerwiki.immobilienscout24.de/wiki/User/Contact/POST
	 * @param user
	 * @param xml
	 * @return
	 */
	public String createContact(String username, String xml);

	/**
	 * Creates a contact from the given XML for user me.
	 * 
	 * @see http://developerwiki.immobilienscout24.de/wiki/User/Contact/POST
	 * @param user
	 * @param xml
	 * @return
	 */
	public String createContact(String xml);

	/**
	 * Creates a contact from the contact object.
	 * 
	 * @param user
	 * @param contact
	 * @return
	 */
	public String createContact(String username, RealtorContactDetails contact);

	/**
	 * Creates a contact from the contact object for user me.
	 * 
	 * @param user
	 * @param contact
	 * @return
	 */
	public String createContact(RealtorContactDetails contact);

	/**
	 * Returns a list of all contacts from the user.
	 * 
	 * @param user
	 * @return
	 */
	public List<RealtorContactDetails> getContacts(String user);

	/**
	 * Returns all publish channels for the user.
	 * 
	 * @see http://developerwiki.immobilienscout24.de/wiki/PublishChannel/GET
	 * @param username
	 * @return
	 */
	public List<PublishChannel> getPublishChannels(String username);

	/**
	 * Returns all publish channels for the user for user me
	 * 
	 * @see http://developerwiki.immobilienscout24.de/wiki/PublishChannel/GET
	 * @param username
	 * @return
	 */
	public List<PublishChannel> getPublishChannels();

	/**
	 * Publishes the realestate to the given channel id.
	 * 
	 * @see http://rest.immobilienscout24.de/restapi/api/offer/v1.0/publish/
	 * @param realestateId
	 * @param publishChannelId
	 */
	public void publishRealestate(String realestateId, String publishChannelId);

	/**
	 * Publishes the realestate to the given channel.
	 * 
	 * @see http://rest.immobilienscout24.de/restapi/api/offer/v1.0/publish/
	 * @param realestateId
	 * @param publishChannelId
	 */
	public void publishRealestate(String realestateId, PublishChannel publishChannel);

	/**
	 * Updates the contact with the given xml.
	 * 
	 * @param username
	 * @param contactId
	 * @param xml
	 * @return
	 */
	public String updateContact(String username, String contactId, String xml);

	/**
	 * Updates the contact with the given xml for user me
	 * 
	 * @param username
	 * @param contactId
	 * @param xml
	 * @return
	 */
	public String updateContact(String contactId, String xml);

	/**
	 * Updates the contact with the given contact object.
	 * 
	 * @param user
	 * @param contact
	 * @return
	 */
	public String updateContact(String username, Contact contact);

	/**
	 * Updates the contact with the given contact object for user me.
	 * 
	 * @param user
	 * @param contact
	 * @return
	 */
	public String updateContact(Contact contact);

	/**
	 * Returns the contact.
	 * 
	 * @param username
	 * @param contactId
	 * @return
	 */
	public RealtorContactDetails getContact(String username, ObjectId contactId);

	/**
	 * Returns the contact for user me.
	 * 
	 * @param username
	 * @param contactId
	 * @return
	 */
	public RealtorContactDetails getContact(ObjectId contactId);

	/**
	 * Checks if the contact exists.
	 * 
	 * @param username
	 * @param contactId
	 * @return
	 */
	public boolean existsContactById(String username, ObjectId contactId);

	/**
	 * Checks if the contact exists for user me.
	 * 
	 * @param username
	 * @param contactId
	 * @return
	 */
	public boolean existsContactById(ObjectId contactId);

	/**
	 * Checks if the realestae already exists.
	 * 
	 * @param username
	 * @param realestateId
	 * @return
	 */
	public boolean existsRealestateById(String username, String realestateId);

	/**
	 * Checks if the realestae already existsfor user me
	 * 
	 * @param username
	 * @param realestateId
	 * @return
	 */
	public boolean existsRealestateById(String realestateId);

	/**
	 * Checks if the realestae already exists.
	 * 
	 * @param username
	 * @param realestateId
	 * @return
	 */
	public boolean existsRealestate(String username, String realestateId, boolean isExternalId);

	/**
	 * Checks if the realestae already exists for user me.
	 * 
	 * @param username
	 * @param realestateId
	 * @return
	 */
	public boolean existsRealestate(String realestateId, boolean isExternalId);

	/**
	 * Checks if the realestate already exists.
	 * 
	 * @param username
	 * @param realestateId
	 * @return
	 */
	public boolean existsRealestate(String username, ObjectId realestateId);

	/**
	 * Checks if the realestate already exists for user me
	 * 
	 * @param username
	 * @param realestateId
	 * @return
	 */
	public boolean existsRealestate(ObjectId realestateId);

	/**
	 * List all realestate for ME
	 * 
	 * @return
	 */
	public RealEstateProject getRealestateProject(String username, String realestateProjectId);

	/**
	 * Lists all realestates for the user "username"
	 * 
	 * @param username
	 * @return
	 */
	public RealEstateProject getRealestateProject(String realestateProjectId);

	/**
	 * Updates the realestate project
	 * 
	 * @param username
	 * @param realestate
	 * @return the realestateProjektId
	 */
	public String updateRealestateProject(String username, RealEstateProject realestateProject);

	/**
	 * Updates the realestate project for the current user
	 * 
	 * @param username
	 * @param realestate
	 * @return the realestateProjektId
	 */
	public String updateRealestateProject(RealEstateProject realestateProject);

	public void addRealestatesToRealestateProject(String username, String realestateProjectId, RealEstateProjectEntries realEstateProjectEntries);

	public void addRealestatesToRealestateProject(String realestateProjectId, RealEstateProjectEntries realEstateProjectEntries);

	public void addRealestatesToRealestateProject(String username, String realestateProjectId, List<RealEstate> realEstates);

	public void addRealestatesToRealestateProject(String realestateProjectId, List<RealEstate> realEstates);

	public void addRealestateToRealestateProject(String username, String realestateProjectId, RealEstate realEstate);

	public void addRealestateToRealestateProject(String realestateProjectId, RealEstate realEstate);

	public void deleteRealestatesFromRealestateProject(String username, String realestateProjectId, List<RealEstate> realEstates);

	public void deleteRealestatesFromRealestateProject(String realestateProjectId, List<RealEstate> realEstates);

	public void deleteRealestateFromRealestateProject(String username, String realestateProjectId, RealEstate realEstate);

	public void deleteRealestateFromRealestateProject(String realestateProjectId, RealEstate realEstate);

	public void deleteRealestateFromRealestateProject(String username, String realestateProjectId, ObjectId id);

	public void deleteRealestateFromRealestateProject(String realestateProjectId, ObjectId id);

	public List<RealtorContactDetails> getContacts();

	public InputStream getAttachmentData(Picture picture);

	public InputStream getAttachmentData(PDFDocument pdf);

	public InputStream getAttachmentData(StreamingVideo pdf);

	public InputStream getAttachmentData(VideoFile video);

	public void placeOnTopProduct(String username, ObjectId id, OnTopPlacement placement);

	public void removeOnTopProduct(String username, ObjectId id, OnTopPlacement placement);

	public List<Placement> getOnTopProduct(String username, ObjectId id, OnTopPlacement placement);

	public List<Placement> getOnTopProducts(String username, OnTopPlacement placement);

	/**
	 * 
	 * @author Martin Fluegge
	 * 
	 */
	public static class PublishChannel {

		private String id;
		private String title;

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}
	}

	/**
	 * 
	 * @author Martin Fluegge
	 * 
	 */
	public static class Contact {
		// TODO implement me and connect this to the API objects
	}

	/**
	 * 
	 * @author Martin Fluegge
	 * 
	 */
	public static interface IResultParser {
		public String getResult(String response);

		public void handleException(Throwable throwable, String errorResponse);
	}

	/**
	 * 
	 * @author Martin Fluegge
	 * 
	 */
	public static interface ObjectId {
		public String getId();
	}

	public List<RealEstate> getAllRealestates(String username, int pageSize, int pageNumber, boolean includeArchived);

}
