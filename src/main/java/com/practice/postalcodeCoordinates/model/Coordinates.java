package com.practice.postalcodeCoordinates.model;

import java.io.Serializable;
import java.util.List;

public class Coordinates implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String authenticationResultCode;
	private String brandLogoUri;
	private String copyright;
	private List<ResourceSet> resourceSets = null;
	private Integer statusCode;
	private String statusDescription;
	private String traceId;

	public String getAuthenticationResultCode() {
		return authenticationResultCode;
	}

	public void setAuthenticationResultCode(String authenticationResultCode) {
		this.authenticationResultCode = authenticationResultCode;
	}

	public String getBrandLogoUri() {
		return brandLogoUri;
	}

	public void setBrandLogoUri(String brandLogoUri) {
		this.brandLogoUri = brandLogoUri;
	}

	public String getCopyright() {
		return copyright;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	public List<ResourceSet> getResourceSets() {
		return resourceSets;
	}

	public void setResourceSets(List<ResourceSet> resourceSets) {
		this.resourceSets = resourceSets;
	}

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusDescription() {
		return statusDescription;
	}

	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

	public String getTraceId() {
		return traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

}