package de.is24.rest.api.export.api.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import de.is24.rest.api.export.api.ObjectApi;

/**
 * This utility class provides an abstraction layer for sending multipart HTTP
 * POST requests to a web server.
 * 
 * @author www.codejava.net
 * 
 */
public class MultipartHelper {
	private final String boundary;
	private static final String LF = "\r\n";
	private HttpURLConnection httpConnection = null;
	private String charset = null;
	private OutputStream outputStream = null;
	private PrintWriter writer = null;

	/**
	 * This constructor initializes a new HTTP POST request with content type is
	 * set to multipart/form-data
	 * 
	 * @param requestURL
	 * @param charset
	 * @param objectApi
	 * @throws IOException
	 */
	public MultipartHelper(URL requestURL, String charset, ObjectApi objectApi) throws IOException {
		this.charset = charset;

		// creates a unique boundary based on time stamp
		boundary = "===" + System.currentTimeMillis() + "===";

		httpConnection = (HttpURLConnection) requestURL.openConnection();
		httpConnection.setDoOutput(true); // indicates POST method
		httpConnection.setDoInput(true);
		httpConnection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundary);

		httpConnection.setRequestMethod("POST");
		httpConnection.setRequestProperty("Content-Language", "en-US");
		httpConnection.setRequestProperty("Accept-Encoding", "gzip,deflate");

		objectApi.signRequest(httpConnection);

		outputStream = httpConnection.getOutputStream();

		writer = new PrintWriter(new OutputStreamWriter(outputStream, charset), true);
	}

	/**
	 * Adds a form field to the request
	 * 
	 * @param name
	 *            field name
	 * @param value
	 *            field value
	 */
	public void addFormField(String name, String value) {
		writer.append("--" + boundary).append(LF);
		writer.append("Content-Type: application/xml; name=body.xml; charset=" + charset).append(LF);
		writer.append("Content-Transfer-Encoding: binary").append(LF);
		writer.append("Content-Disposition: form-data; name=\"" + name + "\"; filename=\"body.xml\"").append(LF);
		writer.append(LF);
		writer.append(value).append(LF);
		writer.flush();
	}

	/**
	 * Adds a upload file section to the request
	 * 
	 * @param fieldName
	 *            name attribute in <input type="file" name="..." />
	 * @param uploadFile
	 *            a File to be uploaded
	 * @throws IOException
	 */
	public void addFilePart(String fieldName, File uploadFile) throws IOException {
		String fileName = uploadFile.getName();
		writer.append("--" + boundary).append(LF);
		writer.append("Content-Type: " + URLConnection.guessContentTypeFromName(fileName) + "; name=\"" + fileName + "\"").append(LF);
		writer.append("Content-Transfer-Encoding: binary").append(LF);
		writer.append("Content-Disposition: form-data; name=\"" + fieldName + "\"; filename=\"" + fileName + "\"").append(LF);
		writer.append(LF);
		writer.flush();

		FileInputStream inputStream = new FileInputStream(uploadFile);
		byte[] buffer = new byte[4096];
		int bytesRead = -1;
		while ((bytesRead = inputStream.read(buffer)) != -1) {
			outputStream.write(buffer, 0, bytesRead);
		}
		outputStream.flush();
		inputStream.close();

		writer.append(LF);
		writer.flush();
	}

	public HttpURLConnection getHttpConnection() {
		return httpConnection;
	}

	/**
	 * Completes the request and receives response from the server.
	 * 
	 * @return a list of Strings as response in case the server returned status
	 *         OK, otherwise an exception is thrown.
	 * @throws IOException
	 */
	public String finish() throws IOException {

		List<String> response = new ArrayList<String>();

		writer.append(LF).flush();
		writer.append("--" + boundary + "--").append(LF);
		writer.close();

		BufferedReader reader = new BufferedReader(new InputStreamReader(httpConnection.getInputStream()));
		String line = null;
		StringBuffer buff = new StringBuffer();

		while ((line = reader.readLine()) != null) {
			response.add(line);
			buff.append(line);
		}
		return buff.toString();
	}
}
