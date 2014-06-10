package de.is24.rest.api.export.api.impl.video;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Martin Fluegge
 * 
 */
@XmlRootElement(name = "videoUploadTicket")
public class VideoTicket {
	private String uploadUrl;
	private String validUntil;
	private String videoId;
	private String auth;

	@XmlElement(name = "uploadUrl")
	public String getUploadUrl() {
		return uploadUrl;
	}

	public void setUploadUrl(String uploadUrl) {
		this.uploadUrl = uploadUrl;
	}

	@XmlElement(name = "validUntil")
	public String getValidUntil() {
		return validUntil;
	}

	public void setValidUntil(String validUntil) {
		this.validUntil = validUntil;
	}

	@XmlElement(name = "videoId")
	public String getVideoId() {
		return videoId;
	}

	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}

	@XmlElement(name = "auth")
	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}
}
