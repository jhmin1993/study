package net.wikiyo.rest.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Headers {
	@JsonProperty("Accept")
	private String accept;
	@JsonProperty("Accept-Encoding")
	private String acceptEncoding;
	@JsonProperty("Accept-Language")
	private String acceptLanguage;
	@JsonProperty("Connection")
	private String connection;
	@JsonProperty("Cookie")
	private String cookie;
	@JsonProperty("Host")
	private String host;
	@JsonProperty("Referer")
	private String referer;
	@JsonProperty("Upgarde-Insecure-Requests")
	private String upgradeInsecureRequests;
	@JsonProperty("User-Agent")
	private String userAgent;

	public String getAccept() {
		return accept;
	}

	public void setAccept(String accept) {
		this.accept = accept;
	}

	public String getAcceptEncoding() {
		return acceptEncoding;
	}

	public void setAcceptEncoding(String acceptEncoding) {
		this.acceptEncoding = acceptEncoding;
	}

	public String getAcceptLanguage() {
		return acceptLanguage;
	}

	public void setAcceptLanguage(String acceptLanguage) {
		this.acceptLanguage = acceptLanguage;
	}

	public String getConnection() {
		return connection;
	}

	public void setConnection(String connection) {
		this.connection = connection;
	}

	public String getCookie() {
		return cookie;
	}

	public void setCookie(String cookie) {
		this.cookie = cookie;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getReferer() {
		return referer;
	}

	public void setReferer(String referer) {
		this.referer = referer;
	}

	public String getUpgradeInsecureRequests() {
		return upgradeInsecureRequests;
	}

	public void setUpgradeInsecureRequests(String upgradeInsecureRequests) {
		this.upgradeInsecureRequests = upgradeInsecureRequests;
	}

	public String getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	@Override
	public String toString() {
		return "Headers [accept=" + accept + ", acceptEncoding=" + acceptEncoding + ", acceptLanguage=" + acceptLanguage
				+ ", connection=" + connection + ", cookie=" + cookie + ", host=" + host + ", referer=" + referer
				+ ", upgradeInsecureRequests=" + upgradeInsecureRequests + ", userAgent=" + userAgent + "]";
	}

}
