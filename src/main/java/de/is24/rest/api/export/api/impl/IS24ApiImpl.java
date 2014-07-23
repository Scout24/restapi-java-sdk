package de.is24.rest.api.export.api.impl;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.adapters.XmlAdapter;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.basic.DefaultOAuthConsumer;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.multipart.FilePart;
import org.apache.commons.httpclient.methods.multipart.MultipartRequestEntity;
import org.apache.commons.httpclient.methods.multipart.Part;
import org.apache.commons.httpclient.methods.multipart.StringPart;
import org.apache.commons.httpclient.util.URIUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

import de.immobilienscout24.rest.schema.common._1.Attachment;
import de.immobilienscout24.rest.schema.common._1.Attachments;
import de.immobilienscout24.rest.schema.common._1.PDFDocument;
import de.immobilienscout24.rest.schema.common._1.Picture;
import de.immobilienscout24.rest.schema.common._1.Picture.Urls;
import de.immobilienscout24.rest.schema.common._1.Picture.Urls.Url;
import de.immobilienscout24.rest.schema.common._1.RealtorContactDetails;
import de.immobilienscout24.rest.schema.common._1.RealtorContactDetailsList;
import de.immobilienscout24.rest.schema.common._1.StreamingVideo;
import de.immobilienscout24.rest.schema.common._1.VideoFile;
import de.immobilienscout24.rest.schema.common.adapter.AttachmentsAdapter;
import de.immobilienscout24.rest.schema.customer._1.CustomerType;
import de.immobilienscout24.rest.schema.customer._1.CustomerType.Users;
import de.immobilienscout24.rest.schema.offer.realestates._1.RealEstate;
import de.is24.rest.api.export.api.IMultimediaObject;
import de.is24.rest.api.export.api.InternalObjectApi;
import de.is24.rest.api.export.api.Is24Api;
import de.is24.rest.api.export.api.ObjectApi;
import de.is24.rest.api.export.api.User;
import de.is24.rest.api.export.api.impl.video.VideoTicket;
import de.is24.rest.api.export.api.parser.impl.ContactResultParser;
import de.is24.rest.api.export.api.parser.impl.ContactResultParsingException;
import de.is24.rest.api.export.api.parser.impl.CreateAttachmentResultParser;
import de.is24.rest.api.export.api.parser.impl.CreateRealestateResultParser;
import de.is24.rest.api.export.api.parser.impl.DeactivateRealestateResultParser;
import de.is24.rest.api.export.api.parser.impl.DeleteAttachmentResultParser;
import de.is24.rest.api.export.api.parser.impl.DeleteRealestateResultParser;
import de.is24.rest.api.export.api.parser.impl.GetContactResultparser;
import de.is24.rest.api.export.api.parser.impl.GetContactResultparser.ContactDoesNotExistException;
import de.is24.rest.api.export.api.parser.impl.GetRealestateResultParser;
import de.is24.rest.api.export.api.parser.impl.PublishRealestateResultParser;
import de.is24.rest.api.export.api.parser.impl.UpdateRealestateResultParser;
import de.is24.rest.api.search.Searcher;

/**
 * @author Martin Fluegge
 * 
 */
public class IS24ApiImpl implements Is24Api, InternalObjectApi {

	private static final Log LOG = LogFactory.getLog(IS24ApiImpl.class);
	private static final String ME = "me";
	protected String NL = System.getProperty("line.separator");
	private String apiConsumerKey;;
	private String apiConsumerSecret;
	private String baseUrl;
	private String accessToken;
	private String accessSecret;
	private String proxyHost;
	private int proxyPort;

	public void init(String apiConsumerKey, String apiConsumerSecret, String baseUrl) {
		this.apiConsumerKey = apiConsumerKey;
		this.apiConsumerSecret = apiConsumerSecret;
		this.baseUrl = baseUrl;
	}

	public String search(String realestateType, String geoCodes) {

		URL url;
		url = createURL(baseUrl + "/search/v1.0/search/region?realestatetype=" + realestateType + "&geocodes=" + geoCodes);
		return sendGetRequest(url);
	}

	public String createRealestate(String username, String xml) {

		URL url = createURL(baseUrl + "/offer/v1.0/user/" + username + "/realestate/");

		return sendPostRequest(url, xml, new CreateRealestateResultParser());
	}

	public String createRealestate(String username, RealEstate realestate) {

		URL url = createURL(baseUrl + "/offer/v1.0/user/" + username + "/realestate/");

		String xml = marshall(realestate);

		return sendPostRequest(url, xml, new CreateRealestateResultParser());
	}

	public String createRealestate(RealEstate realestate) {

		return createRealestate(ME, realestate);
	}

	@Override
	public String deactivateRealestate(String objectId, String channelId) {

		URL url = createURL(baseUrl + "/offer/v1.0/publish/" + objectId + "_" + channelId);

		return sendDeleteRequest(url, new DeactivateRealestateResultParser());
	}

	@Override
	public String updateRealestate(String username, String realestateId, String xml) {

		URL url = createURL(baseUrl + "/offer/v1.0/user/" + username + "/realestate/" + encodeId(realestateId));
		return sendPutRequest(url, xml, new UpdateRealestateResultParser());
	}

	@Override
	public String updateRealestate(String username, String realestateId, String xml, boolean isExternalId) {
		realestateId = isExternalId ? "ext-" + realestateId : realestateId;
		return updateRealestate(username, realestateId, xml);
	}

	@Override
	public List<String> getAllAttachmentIds(String username, String realestateId) {

		List<String> ret = new ArrayList<String>();
		URL url = createURL(baseUrl + "/offer/v1.0/user/" + username + "/realestate/" + encodeId(realestateId) + "/attachment");

		LOG.info("url.toExternalForm(): " + url.toExternalForm());
		String response = sendGetRequest(url);
		LOG.info("getAllAttachmentIds - response: " + response);
		Element xmlRootElement = getXMLRootElement(response);
		@SuppressWarnings("unchecked")
		List<Element> children = xmlRootElement.getChildren("attachment");

		for (Element element : children) {
			ret.add(element.getAttributeValue("id"));
		}

		return ret;
	}

	@Override
	public void deleteAttachment(String username, String realestateId, String attachmentId) {
		URL url = createURL(baseUrl + "/offer/v1.0/user/" + username + "/realestate/" + encodeId(realestateId) + "/attachment/" + encodeId(attachmentId));

		sendDeleteRequest(url, new DeleteAttachmentResultParser());
	}

	@Override
	public void changeAttachment(String username, String realestateId, String attachmentId, IMultimediaObject object) {

		URL url = createURL(baseUrl + "/offer/v1.0/user/" + username + "/realestate/" + encodeId(realestateId) + "/attachment/" + encodeId(attachmentId));
		// String value = getAttachmentXMLPicture(title, isFloorplan,
		// isTitlePicture);
		String value = object.getAttachmentXml();
		sendPutRequest(url, value, new CreateRealestateResultParser());
	}

	@Override
	public List<RealEstate> getAllRealestates(String username, int pageSize) {
		return getAllRealestates(username, pageSize, 1);
	}

	@Override
	public List<RealEstate> getAllRealestates(String username) {

		// List<RealEstate> ret = new ArrayList<>();
		int pageNumber = 1;
		int pageSize = 100;
		List<RealEstate> allRealestates = new ArrayList<>();
		int size = 100;

		Map<Long, RealEstate> ret = new HashMap<Long, RealEstate>();

		while (size == 100) {
			allRealestates = getAllRealestates(username, pageSize, pageNumber++);

			for (RealEstate realEstate : allRealestates) {

				ret.put(realEstate.getId(), realEstate);
			}

			// ret.addAll(allRealestates);
			size = allRealestates.size();
		}

		return new ArrayList<>(ret.values());
	}

	private String encodeUserName(String username) {

		try {
			return URIUtil.encodeQuery(username, "UTF-8");
			// return URIUtil.encodeQuery(username, "ISO-8859-1");

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public List<RealEstate> getAllRealestates(String username, int pageSize, int pageNumber) {
		return getAllRealestates(username, pageSize, pageNumber, true);
	}

	@Override
	public List<RealEstate> getAllRealestates(String username, int pageSize, int pageNumber, boolean includeArchived) {
		List<RealEstate> ret = new ArrayList<RealEstate>();

		URL url = createURL(baseUrl + "/offer/v1.0/user/" + encodeUserName(username) + "/realestate?pagesize=" + pageSize + "&pagenumber=" + pageNumber + "&archivedobjectsincluded="
				+ (includeArchived ? "true" : "false"));

		LOG.info(url);

		String response = sendGetRequest(url);
		Element xmlRootElement = getXMLRootElement(response);

		@SuppressWarnings("unchecked")
		List<Element> children = ((Element) xmlRootElement.getChildren("realEstateList").get(0)).getChildren("realEstateElement");

		for (Element element : children) {
			String attributeValue = element.getAttributeValue("id");
			RealEstate realestate = getRealestate(username, attributeValue);
			ret.add(realestate);
		}

		return ret;
	}

	@Override
	public List<String> getAllRealestateIds(String username) {

		List<String> ret = new ArrayList<String>();
		URL url = createURL(baseUrl + "/offer/v1.0/user/" + username + "/realestate");

		String response = sendGetRequest(url);
		LOG.info("getAllRealestateIds response" + response);
		Element xmlRootElement = getXMLRootElement(response);

		@SuppressWarnings("unchecked")
		List<Element> children = ((Element) xmlRootElement.getChildren("realEstateList").get(0)).getChildren("realEstateElement");

		for (Element element : children) {
			ret.add(element.getAttributeValue("id"));
		}

		return ret;
	}

	@Override
	public List<PublishChannel> getPublishChannelsForRealestate(String realestateId) {

		List<PublishChannel> ret = new ArrayList<ObjectApi.PublishChannel>();

		URL url = createURL(baseUrl + "/offer/v1.0/publish?realestate=" + encodeId(realestateId));
		String response = sendGetRequest(url);

		Element rootElement = getXMLRootElement(response);

		@SuppressWarnings("unchecked")
		List<Element> children = rootElement.getChildren("publishObject");

		for (Element child : children) {

			Element channelElement = child.getChild("publishChannel");
			PublishChannel channel = createPublishChannel(channelElement);
			ret.add(channel);
		}

		return ret;
	}

	private PublishChannel createPublishChannel(Element channelElement) {
		PublishChannel channel = new PublishChannel();
		channel.setId(channelElement.getAttributeValue("id"));
		channel.setTitle(channelElement.getAttributeValue("title") + "");
		return channel;
	}

	@Override
	public List<String> getPublishChannelIdsForRealestate(String realestateId) {

		List<String> ret = new ArrayList<String>();

		URL url = createURL(baseUrl + "/offer/v1.0/publish?realestate=" + encodeId(realestateId));
		String response = sendGetRequest(url);

		Element rootElement = getXMLRootElement(response);

		@SuppressWarnings("unchecked")
		List<Element> children = rootElement.getChildren("publishObject");

		for (Element child : children) {
			Element channelElement = child.getChild("publishChannel");
			ret.add(channelElement.getAttributeValue("id"));
		}

		return ret;
	}

	@Override
	public PublishChannel getPublishChannelForRealestate(String realestateId, String publishChannelId) {

		URL url = createURL(baseUrl + "/offer/v1.0/publish/" + encodeId(realestateId + "_" + publishChannelId));
		String response = sendGetRequest(url);
		Element rootElement = getXMLRootElement(response);

		@SuppressWarnings("unchecked")
		List<Element> children = rootElement.getChildren("publishChannel");
		if (children.size() > 0) {
			return createPublishChannel(children.get(0));
		} else {
			return null;
		}
	}

	@Override
	public List<String> getAllAttachmentIdsOrdered(String user, String realestateId) {
		throw new UnsupportedOperationException("Not yet implemented");
	}

	@Override
	public void changeAttachmentOrder(String username, String realestateId, String xml) {
		throw new UnsupportedOperationException("Not yet implemented");
	}

	@Override
	public String changeAttachmentOrder(String username, String realestateId, List<String> attachmentIds) {
		throw new UnsupportedOperationException("Not yet implemented");
	}

	@Override
	public String createContact(String user, RealtorContactDetails contact) {
		return createContact(user, marshall(contact));
	}

	@Override
	public String updateContact(String user, Contact contact) {
		throw new UnsupportedOperationException("Not yet implemented");
	}

	@Override
	public String updateRealestate(String username, ObjectId id, RealEstate realestate) {

		String xml = marshall(realestate);

		return updateRealestate(username, id.getId(), xml);
	}

	@Override
	public List<Attachment> getAttachments(String username, ObjectId objectId) {
		RealEstate realestate = getRealestate(username, objectId);

		return realestate.getAttachments().getAttachment();
	}

	@Override
	public List<Attachment> getAllAttachmentsOrdered(String user, String realestateId) {
		throw new UnsupportedOperationException("Not yet implemented");
	}

	@Override
	public Attachment getAttachment(String username, ObjectId objectId, String attachmentId) {

		RealEstate realestate = getRealestate(username, objectId);

		for (Attachment attachment : realestate.getAttachments().getAttachment()) {
			if (attachment.getId().toString().equals(attachmentId)) {
				return attachment;
			}
		}
		return null;
	}

	@Override
	public RealEstate getRealestate(String username, String realestateIdStr, boolean isExternal) {
		ObjectId id = null;
		if (isExternal) {
			id = new ExternalId(realestateIdStr);
		} else {
			id = new InternalId(realestateIdStr);
		}
		return getRealestate(username, id);
	}

	// TODO This implementation is very inperformant. We should improve it to
	// use RealastesList directly. This is rather a quick implementation be
	// there curretnly no time :(
	@Override
	public RealEstate getRealestate(String username, ObjectId realestateId) {

		username = encodeUserName(username);
		String realestateAsXml = getRealestateAsXml(username, realestateId.getId());
		// LOG.info("getRealestate from api: " + realestateAsXml);

		RealEstate realestate = unmarshall(RealEstate.class, realestateAsXml);
		String href = realestate.getAttachments().getHref();

		String id = getid(href);
		String decodedId = decodeId(id.replace("+", "%2B"));

		String encodedId = encodeId(decodedId);
		href = href.replace(id, encodedId);

		Attachments attachments = getAttachments(href);
		realestate.setAttachments(attachments);

		return realestate;
	}

	public Attachments getAttachments(String href) {

		try {
			String attachmentsXML = sendGetRequest(new URL(href));

			return unmarshall(Attachments.class, attachmentsXML, new AttachmentsAdapter());
		} catch (MalformedURLException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public RealEstate getRealestate(String username, String realestateId) {
		return getRealestate(username, realestateId, false);
	}

	@Override
	public String getRealestateAsXml(String username, String realestateId) {
		URL url = createURL(baseUrl + "/offer/v1.0/user/" + username + "/realestate/" + encodeId(realestateId));
		LOG.info("getRealestateAsXml " + url);

		return sendGetRequest(url, new GetRealestateResultParser());
	}

	@Override
	public boolean existsRealestateById(String username, String realestateId) {
		// TODO provide a more elegant implementation
		try {
			String realestateAsXml = getRealestateAsXml(username, realestateId);
			return (realestateAsXml != null && realestateAsXml.contains("<externalId>"));
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean existsRealestate(String username, String realestateId, boolean isExternalId) {
		realestateId = isExternalId ? "ext-" + realestateId : realestateId;
		return existsRealestateById(username, realestateId);
	}

	@Override
	public boolean existsRealestate(String username, ObjectId realestateId) {
		return existsRealestateById(username, realestateId.getId());
	}

	@Override
	public List<RealtorContactDetails> getContacts(String username) {

		username = encodeUserName(username);

		System.out.println(username);

		URL url = createURL(baseUrl + "/offer/v1.0/user/" + username + "/contact");
		String xml = sendGetRequest(url);
		LOG.info("getContacts xml: " + xml);
		RealtorContactDetailsList realtorContactDetailsList = unmarshall(RealtorContactDetailsList.class, xml);
		return realtorContactDetailsList.getRealtorContactDetails();
	}

	@Override
	public List<RealtorContactDetails> getContacts() {
		return getContacts(ME);
	}

	@Override
	public RealtorContactDetails getContact(String username, ObjectId contactId) {

		URL url = createURL(baseUrl + "/offer/v1.0/user/" + username + "/contact/" + encodeId(contactId.getId()));

		String xml = sendGetRequest(url, new GetContactResultparser());

		LOG.info(xml);

		return unmarshall(RealtorContactDetails.class, xml);
	}

	@Override
	public boolean existsContactById(String username, ObjectId contactId) {
		// TODO provide a more elegant implementation
		try {
			RealtorContactDetails contact = getContact(username, contactId);
			return contact != null;
		} catch (ContactDoesNotExistException e) {
			return false;
		}
	}

	public String addAttachmentToRealestate(String username, String realEstateId, IMultimediaObject object) {

		IResultParser resultParser = new CreateAttachmentResultParser();

		try {
			URL url = createURL(baseUrl + "/offer/v1.0/user/" + username + "/realestate/" + encodeId(realEstateId) + "/attachment/");

			if (object instanceof LinkMultimediaObject) {

				return resultParser.getResult(sendPostRequest(url, object.getAttachmentXml()));

			} else if (object instanceof VideoMultimediaObject) {

				return resultParser.getResult(uploadVideo(username, realEstateId, object));

			} else if (object instanceof FileMultimediaObject) {

				return resultParser.getResult(uploadFile(object, url));

			} else {
				throw new RuntimeException("Unsupported object type " + object);
			}

		} catch (IOException e) {
			throw new AddAttachmentException(object, e);
		}
	}

	private String uploadFile(IMultimediaObject object, URL url) throws IOException {
		MultipartHelper utility = new MultipartHelper(url, "UTF-8", this);
		String value = object.getAttachmentXml();

		utility.addFormField("metadata", value);
		utility.addFilePart("attachment", ((FileMultimediaObject) object).getFile());
		String response = utility.finish();
		return response;
	}

	private String uploadVideo(String username, String realEstateId, IMultimediaObject object) throws FileNotFoundException, IOException, HttpException {

		URL videoUrl = createURL(baseUrl + "/offer/v1.0/user/" + username + "/videouploadticket");
		String ticketXml = sendGetRequest(videoUrl);
		VideoTicket ticket = unmarshall(VideoTicket.class, ticketXml);

		LOG.info("uploadVideo response " + ticket.getAuth());

		LOG.info("Uploading video to " + ticket.getUploadUrl());
		PostMethod filePost = new PostMethod(ticket.getUploadUrl());
		StringPart part1 = new StringPart("auth", ticket.getAuth());
		FilePart part2 = new FilePart("videofile", object.getTitle(), ((FileMultimediaObject) object).getFile(), "multipart/form-data", null);
		Part[] parts = { part1, part2 };
		filePost.setRequestEntity(new MultipartRequestEntity(parts, filePost.getParams()));
		HttpClient client = new HttpClient();

		if (proxyHost != null && proxyHost.length() > 0) {
			LOG.info("Using proxy " + proxyHost + ":" + proxyPort);

			client.getHostConfiguration().setProxy(proxyHost, proxyPort);
		}
		// int retryCount = 0;
		// int retryMax = 5;
		// while (retryCount <= retryMax) {
		//
		// try {
		client.executeMethod(filePost);
		// break;
		// } catch (java.net.ConnectException e) {
		// sleep(5000);
		// LOG.warn("Connection problems during video upload. Going for retry "
		// + (++retryCount), e);
		//
		// if (retryCount == retryMax) {
		// throw e;
		// }
		//
		// continue;
		// }
		// }

		String responseVideoUpload = filePost.getResponseBodyAsString();
		LOG.info("uploadVideo resp: " + responseVideoUpload);

		((VideoMultimediaObject) object).setVideoId(ticket.getVideoId());

		LOG.info("uploadVideo response " + object.getAttachmentXml());

		// Upload videolink to is24

		URL is24Upload = createURL(baseUrl + "/offer/v1.0/user/" + username + "/realestate/" + encodeId(realEstateId) + "/attachment");

		return sendPostRequest(is24Upload, object.getAttachmentXml());
	}

	private void sleep(int milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public String createContact(String username, String xml) {
		URL url = createURL(baseUrl + "/offer/v1.0/user/" + username + "/contact/");
		String ret = sendPostRequest(url, xml, new ContactResultParser());

		return ret;
	}

	@Override
	public String updateContact(String username, String contactId, String xml) {
		URL url = createURL(baseUrl + "/offer/v1.0/user/" + username + "/contact/" + contactId + "/");
		String ret = sendPutRequest(url, xml, new ContactResultParser());

		return ret;
	}

	@Override
	public void publishRealestate(String realestateId, String publishChannelId) {
		String xml = "<common:publishObject xmlns:xlink=\"http://www.w3.org/1999/xlink\" xmlns:common=\"http://rest.immobilienscout24.de/schema/common/1.0\">" + NL + "<realEstate id=\""
				+ realestateId + "\"/><publishChannel id=\"" + publishChannelId + "\"/></common:publishObject>";
		System.out.println(xml);
		URL url;
		url = createURL(baseUrl + "/offer/v1.0/publish/");
		System.out.println(url);
		sendPostRequest(url, xml, new PublishRealestateResultParser());
	}

	@Override
	public void publishRealestate(String realestateId, PublishChannel publishChannel) {
		publishRealestate(realestateId, publishChannel.getId());
	}

	@Override
	public String sendPostRequest(URL request, String body) {
		return sendPostRequest(request, body, null);
	}

	/**
	 * Sends a PUT request. The return result and the exception handling can be
	 * influenced using an {@link IResultParser} implementation.
	 * 
	 * @param request
	 * @param resultParser
	 * @return
	 */
	private String sendPutRequest(URL request, String body, IResultParser resultParser) {
		return sendBodyRequest(request, body, resultParser, "PUT");
	}

	/**
	 * Sends a POST request. The return result and the exception handling can be
	 * influenced using an {@link IResultParser} implementation.
	 * 
	 * @param request
	 * @param resultParser
	 * @return
	 */
	private String sendPostRequest(URL request, String body, IResultParser resultParser) {
		return sendBodyRequest(request, body, resultParser, "POST");
	}

	private String sendBodyRequest(URL request, String body, IResultParser resultParser, String requestMethod) {
		HttpURLConnection connection = null;
		try {
			// body = new String(body.getBytes("utf-8"), "utf-8");
			Charset.forName("UTF-8").encode(body);
			connection = (HttpURLConnection) request.openConnection();

			connection.setRequestMethod(requestMethod);
			connection.setRequestProperty("Content-Type", "application/xml; charset=utf-8");
			connection.setRequestProperty("Content-Length", "" + Integer.toString(body.getBytes().length));
			connection.setRequestProperty("Content-Language", "en-US");
			connection.setRequestProperty("Accept", "application/xml");

			connection.setUseCaches(false);
			connection.setDoInput(true);
			connection.setDoOutput(true);

			signRequest(connection);
			// Send request
			DataOutputStream wr = new DataOutputStream(connection.getOutputStream());

			byte[] buf = body.getBytes("UTF-8");
			wr.write(buf, 0, buf.length);
			wr.flush();
			wr.close();

			connection.connect();

			String response = getResponse(connection.getInputStream());
			String ret = response;
			if (resultParser != null) {
				ret = resultParser.getResult(response);
			}

			return ret;
		} catch (IOException e) {

			String response = getResponse(connection.getErrorStream());

			if (resultParser != null) {
				resultParser.handleException(e, response);
			} else {

				throw new RuntimeException(response, e);
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return null;
	}

	/**
	 * Sends a GET request. The return result and the exception handling can be
	 * influenced using an {@link IResultParser} implementation.
	 * 
	 * @param request
	 * @param resultParser
	 * @return
	 */
	protected String sendGetRequest(URL request, IResultParser resultParser) {

		HttpURLConnection connection = null;
		try {
			connection = (HttpURLConnection) request.openConnection();
			connection.setRequestProperty("Accept", "application/xml");

			signRequest(connection);

			connection.connect();

			// //LOG.info("Get request response: " +
			// connection.getResponseCode()
			// + " " + connection.getResponseMessage());

			String response = getResponse(connection.getInputStream());
			String ret = response;
			if (resultParser != null) {
				ret = resultParser.getResult(response);
			}

			return ret;

		} catch (Exception e) {
			String response = getResponse(connection.getErrorStream());

			if (resultParser != null) {
				resultParser.handleException(e, response);
			} else {

				throw new RuntimeException(response, e);
			}

			throw new RuntimeException(e);
		}
	}

	protected InputStream getInputStream(URL request) {

		try {
			HttpURLConnection connection = null;
			connection = (HttpURLConnection) request.openConnection();
			// connection.setRequestProperty("Accept", "application/xml");

			signRequest(connection);

			connection.connect();

			return connection.getInputStream();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public String sendGetRequest(URL request) {
		return sendGetRequest(request, null);
	}

	/**
	 * Sends a DELETE request. The return result and the exception handling can
	 * be influenced using an {@link IResultParser} implementation.
	 * 
	 * @param request
	 * @param resultParser
	 * @return
	 */
	protected String sendDeleteRequest(URL request, IResultParser resultParser) {

		HttpURLConnection connection = null;
		try {
			connection = (HttpURLConnection) request.openConnection();
			connection.setRequestProperty("Accept", "application/xml");
			connection.setRequestMethod("DELETE");
			signRequest(connection);

			connection.connect();

			LOG.info("Delete request response: " + connection.getResponseCode() + " " + connection.getResponseMessage());

			String response = getResponse(connection.getInputStream());
			String ret = response;

			if (resultParser != null) {
				ret = resultParser.getResult(response);
			}

			return ret;

		} catch (ContactResultParsingException e) {
			// indicates a problem in the parser and not the api
			throw e;
		} catch (Exception e) {
			String response = getResponse(connection.getErrorStream());

			if (resultParser != null) {
				resultParser.handleException(e, response);
			} else {

				throw new RuntimeException(response, e);
			}

			throw new RuntimeException(e);
		}
	}

	private String encodeId(String realestateId) {
		try {
			return URLEncoder.encode(realestateId, "UTF-8").replace("+", "%20");
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}

	private String decodeId(String realestateId) {
		try {
			return URLDecoder.decode(realestateId, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public String sendDeleteRequest(URL request) {
		return sendDeleteRequest(request, null);
	}

	private String getResponse(InputStream is) {

		if (is != null) {
			Writer writer = new StringWriter();

			char[] buffer = new char[1024];
			try {
				Reader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
				int n;
				while ((n = reader.read(buffer)) != -1) {
					writer.write(buffer, 0, n);
				}
			} catch (IOException e) {
				throw new RuntimeException(e);
			} finally {
				try {
					is.close();
				} catch (IOException e) {
					LOG.warn("Could not close input stream ", e);
				}
			}
			return writer.toString();
		}
		return null;
	}

	public void signRequest(HttpURLConnection apiRequest) {
		OAuthConsumer consumer = new DefaultOAuthConsumer(apiConsumerKey, apiConsumerSecret);

		consumer.setTokenWithSecret(accessToken, accessSecret);
		try {
			consumer.sign(apiRequest);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public String getApiConsumerKey() {
		return apiConsumerKey;
	}

	public String getApiConsumerSecret() {
		return apiConsumerSecret;
	}

	@Override
	public void signIn(String accessToken, String accessSecret) {
		this.accessToken = accessToken;
		this.accessSecret = accessSecret;
	}

	@Override
	public List<PublishChannel> getPublishChannels(String username) {

		List<PublishChannel> ret = new ArrayList<ObjectApi.PublishChannel>();

		try {
			URL url = new URL(baseUrl + "/offer/v1.0/user/" + username + "/publishchannel");
			String response = sendGetRequest(url);

			Element rootElement = getXMLRootElement(response);

			@SuppressWarnings("unchecked")
			List<Element> children = rootElement.getChildren("publishChannel");

			for (Element child : children) {

				PublishChannel channel = new PublishChannel();
				channel.setId(child.getAttributeValue("id"));
				channel.setTitle(child.getAttributeValue("title"));
				ret.add(channel);
			}

		} catch (MalformedURLException e) {
			throw new RuntimeException(e);
		}

		return ret;
	}

	private URL createURL(String url) {
		try {
			return new URL(url);
		} catch (MalformedURLException e) {
			throw new RuntimeException(e);
		}
	}

	private Element getXMLRootElement(String response) {
		try {
			SAXBuilder builder = new SAXBuilder();
			org.jdom.Document doc = builder.build(new StringReader(response));

			return doc.getRootElement();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public String deleteRealestate(String username, String objectIdStr) {
		URL url = createURL(baseUrl + "/offer/v1.0/user/" + username + "/realestate/" + encodeId(objectIdStr));
		LOG.info("Delete url: " + url);
		return sendDeleteRequest(url, new DeleteRealestateResultParser());
	}

	@Override
	public String deleteRealestate(String username, ObjectId objectId) {
		return deleteRealestate(username, objectId.getId());
	}

	@Override
	public Searcher getSearcher(String username) {
		URL url = createURL(baseUrl + "/search/v1.0/searcher/me");
		LOG.info("getSearcher=" + url);
		String xml = sendGetRequest(url);

		return (Searcher) unmarshall(Searcher.class, xml);
	}

	@SuppressWarnings("unchecked")
	protected <T> T unmarshall(Class<T> clazz, String xml) {
		return unmarshall(clazz, xml, null);
	}

	@SuppressWarnings("unchecked")
	protected <T> T unmarshall(Class<T> clazz, String xml, XmlAdapter adapter) {
		try {

			UniversalObjectFactory universalObjectFactory = new UniversalObjectFactory();

			Object objectFactory = universalObjectFactory.getObjectFactory(clazz);
			JAXBContext context;
			if (objectFactory == null) {
				context = JAXBContext.newInstance(clazz);
			} else {
				context = JAXBContext.newInstance(clazz.getPackage().getName());
			}

			Unmarshaller unmarshaller = context.createUnmarshaller();

			if (adapter != null) {
				unmarshaller.setAdapter(adapter);
			}

			StringReader reader = new StringReader(xml);

			Object ret = unmarshaller.unmarshal(reader);

			if (ret instanceof JAXBElement) {
				ret = ((JAXBElement<T>) ret).getValue();
			}

			return (T) ret;
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}

	protected <T> String marshall(T o) {
		try {

			UniversalObjectFactory universalObjectFactory = new UniversalObjectFactory();
			Object objectFactory = universalObjectFactory.getObjectFactory(o.getClass());
			JAXBContext context;

			Object toBeMarshalled = o;

			if (objectFactory == null) {
				LOG.info("Could not find ObjectFactory. Trying without.");
				context = JAXBContext.newInstance(o.getClass());
			} else {

				context = JAXBContext.newInstance(o.getClass().getPackage().getName());

				toBeMarshalled = universalObjectFactory.getJaxBElement(o, objectFactory);
			}

			Marshaller is24Marshaller = context.createMarshaller();
			is24Marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

			StringWriter writer = new StringWriter();

			is24Marshaller.marshal(toBeMarshalled, writer);
			return writer.toString();

		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 
	 * @author Martin Fluegge
	 * 
	 */
	public enum MultimediaType {

		PICTURE("Picture"), PDF("PDFDocument"), VIDEO("StreamingVideo"), LINK("Link");

		private String value;

		private MultimediaType(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}
	}

	@Override
	public String updateAttachment(String username, InternalId scoutId, String attachmentId, IMultimediaObject object) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public String addAttachmentToRealestate(String realEstateId, IMultimediaObject object) {
		return addAttachmentToRealestate(ME, realEstateId, object);
	}

	@Override
	public String updateAttachment(InternalId scoutId, String attachmentId, IMultimediaObject object) {
		return updateAttachment(ME, scoutId, attachmentId, object);
	}

	@Override
	public List<Attachment> getAttachments(ObjectId objectId) {
		return getAttachments(ME, objectId);
	}

	@Override
	public List<String> getAllAttachmentIds(String realestateId) {
		return getAllAttachmentIds(ME, realestateId);
	}

	@Override
	public List<Attachment> getAllAttachmentsOrdered(String realestateId) {
		return getAllAttachmentsOrdered(ME, realestateId);
	}

	@Override
	public List<String> getAllAttachmentIdsOrdered(String realestateId) {
		return getAllAttachmentIdsOrdered(ME, realestateId);
	}

	@Override
	public Attachment getAttachment(ObjectId objectId, String attachmentId) {
		return getAttachment(ME, objectId, attachmentId);
	}

	@Override
	public void deleteAttachment(String realestateId, String attachmentId) {
		deleteAttachment(ME, realestateId, attachmentId);
	}

	@Override
	public void changeAttachment(String realestateId, String attachmentId, IMultimediaObject object) {
		changeAttachment(ME, realestateId, attachmentId, object);
	}

	@Override
	public void changeAttachmentOrder(String realestateId, String xml) {
		changeAttachmentOrder(ME, realestateId, xml);
	}

	@Override
	public String changeAttachmentOrder(String realestateId, List<String> attachmentIds) {
		return changeAttachmentOrder(ME, realestateId, attachmentIds);
	}

	@Override
	public String createRealestate(String xml) {
		return createRealestate(ME, xml);
	}

	@Override
	public String updateRealestate(String realestateId, String xml) {
		return updateRealestate(ME, realestateId, xml);
	}

	@Override
	public String updateRealestate(String realestateId, String xml, boolean isExternalId) {
		return updateRealestate(ME, realestateId, xml, isExternalId);
	}

	@Override
	public String updateRealestate(ObjectId id, RealEstate realestate) {
		return updateRealestate(ME, id, realestate);
	}

	@Override
	public List<RealEstate> getAllRealestates() {
		return getAllRealestates(ME);
	}

	@Override
	public List<RealEstate> getAllRealestates(int pageSize) {
		return getAllRealestates(ME, pageSize);
	}

	@Override
	public List<RealEstate> getAllRealestates(int pageSize, int pageNumber) {
		return getAllRealestates(ME, pageSize, pageNumber);
	}

	@Override
	public List<String> getAllRealestateIds() {
		return getAllRealestateIds(ME);
	}

	@Override
	public RealEstate getRealestate(ObjectId realestateId) {
		return getRealestate(ME, realestateId);
	}

	@Override
	public RealEstate getRealestate(String realestateId, boolean isExternal) {
		return getRealestate(ME, realestateId, isExternal);
	}

	@Override
	public RealEstate getRealestate(String realestateId) {
		return getRealestate(ME, realestateId);
	}

	@Override
	public String getRealestateAsXml(String realestateId) {
		return getRealestateAsXml(ME, realestateId);
	}

	@Override
	public String createContact(String xml) {
		return createContact(ME, xml);
	}

	@Override
	public String createContact(RealtorContactDetails contact) {
		return createContact(ME, contact);
	}

	@Override
	public List<PublishChannel> getPublishChannels() {
		return getPublishChannels(ME);
	}

	@Override
	public String updateContact(String contactId, String xml) {
		return updateContact(ME, contactId, xml);
	}

	@Override
	public String updateContact(Contact contact) {
		return updateContact(ME, contact);
	}

	@Override
	public RealtorContactDetails getContact(ObjectId contactId) {
		return getContact(ME, contactId);
	}

	@Override
	public boolean existsContactById(ObjectId contactId) {
		return existsContactById(ME, contactId);
	}

	@Override
	public boolean existsRealestateById(String realestateId) {
		return existsRealestateById(ME, realestateId);
	}

	@Override
	public boolean existsRealestate(String realestateId, boolean isExternalId) {
		return existsRealestate(ME, isExternalId);
	}

	@Override
	public boolean existsRealestate(ObjectId realestateId) {
		return existsRealestate(ME, realestateId);
	}

	@Override
	public String deleteRealestate(String objectIdStr) {
		return deleteRealestate(ME, objectIdStr);
	}

	@Override
	public String deleteRealestate(ObjectId objectId) {
		return deleteRealestate(ME, objectId);
	}

	@Override
	public String getCustomerNumber() {

		return getCustomer().getCustomerNumber();
	}

	@Override
	public CustomerType getCustomer() {
		String ssoId = getSsoId();
		URL url = createURL(baseUrl + "/account/v1.0/customer?ssoid=" + ssoId);
		String result = sendGetRequest(url);

		LOG.info("Customer=" + result);

		return unmarshall(CustomerType.class, result);
	}

	@Override
	public InputStream getAttachmentData(Picture picture) {
		Urls urls = picture.getUrls();

		Url url = urls.getUrl().get(0);
		String href = url.getHref();

		href = href.substring(0, href.indexOf("ORIG") + 5);
		System.out.println(href);

		try {

			return getInputStream(new URL(href));
		} catch (MalformedURLException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public InputStream getAttachmentData(PDFDocument pdf) {
		try {

			return getInputStream(new URL(pdf.getUrl()));
		} catch (MalformedURLException e) {
			throw new RuntimeException(e);
		}
	}

	public InputStream getAttachmentData(StreamingVideo video) {
		try {

			String id = video.getVideoId();

			URL url = createURL(baseUrl + "/search/v1.0/expose/62484060/video/" + id);

			String xml = sendGetRequest(url);

			System.out.println(xml);

			return getInputStream(new URL(video.getHref()));
		} catch (MalformedURLException e) {
			throw new RuntimeException(e);
		}
	}

	public InputStream getAttachmentData(VideoFile video) {
		try {

			return getInputStream(new URL(video.getUrl()));
		} catch (MalformedURLException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public CustomerType getCustomer(String customerId) {
		URL url = createURL(baseUrl + "/account/v1.0/customer/" + customerId);
		String result = sendGetRequest(url);

		return unmarshall(CustomerType.class, result);
	}

	@Override
	public List<String> getUsernames(String customerId) {
		CustomerType customer = getCustomer(customerId);
		Users users = customer.getUsers();
		if (users != null) {

			LOG.info("Usernames for customerId=" + customerId + " " + users.toString());

			return users.getUsername();
		}
		return null;
	}

	@Override
	public String getUsername(String customerId) {
		List<String> usernames = getUsernames(customerId);

		if (usernames != null && usernames.size() > 0) {
			return usernames.get(0);
		}
		return null;
	}

	public String getUserName() {

		// Searcher searcher = getSearcher("me");
		// return searcher.getId();
		User user = getUser();

		if (user != null) {
			return user.getUsername();
		}
		return null;
	}

	@Override
	public User getUser() {
		URL url = createURL(baseUrl + "/account/v2.0/user/me");
		String xml = sendGetRequest(url);
		LOG.info(xml);
		return unmarshall(User.class, xml);
	}

	@Override
	public String getSsoId() {
		User user = getUser();
		return user.getSsoId();
	}

	public String getProxyHost() {
		return proxyHost;
	}

	public void setProxyHost(String proxyHost) {
		this.proxyHost = proxyHost;
	}

	public int getProxyPort() {
		return proxyPort;
	}

	public void setProxyPort(int proxyPort) {
		this.proxyPort = proxyPort;
	}

	private String getid(String href) {
		String id = href.substring(0, href.lastIndexOf("/"));
		id = id.substring(id.indexOf("/realestate/"), id.length()).replace("/realestate/", "");
		return id;
	}

	/**
	 * 
	 * @author Martin Fluegge
	 * 
	 */
	public static class AddAttachmentException extends RuntimeException {

		private static final long serialVersionUID = 1L;
		private IMultimediaObject object;

		public AddAttachmentException(Throwable e) {
			super(e);
		}

		public AddAttachmentException(IMultimediaObject object, Throwable e) {
			super(e);
			this.setObject(object);
		}

		public IMultimediaObject getObject() {
			return object;
		}

		public void setObject(IMultimediaObject object) {
			this.object = object;
		}
	}
}
