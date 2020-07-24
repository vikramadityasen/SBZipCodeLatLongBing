package com.practice.postalcodeCoordinates.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "adminDistrict", "countryRegion", "formattedAddress", "locality", "postalCode" })
public class Address {

	@JsonProperty("adminDistrict")
	private String adminDistrict;
	@JsonProperty("countryRegion")
	private String countryRegion;
	@JsonProperty("formattedAddress")
	private String formattedAddress;
	@JsonProperty("locality")
	private String locality;
	@JsonProperty("postalCode")
	private String postalCode;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("adminDistrict")
	public String getAdminDistrict() {
		return adminDistrict;
	}

	@JsonProperty("adminDistrict")
	public void setAdminDistrict(String adminDistrict) {
		this.adminDistrict = adminDistrict;
	}

	@JsonProperty("countryRegion")
	public String getCountryRegion() {
		return countryRegion;
	}

	@JsonProperty("countryRegion")
	public void setCountryRegion(String countryRegion) {
		this.countryRegion = countryRegion;
	}

	@JsonProperty("formattedAddress")
	public String getFormattedAddress() {
		return formattedAddress;
	}

	@JsonProperty("formattedAddress")
	public void setFormattedAddress(String formattedAddress) {
		this.formattedAddress = formattedAddress;
	}

	@JsonProperty("locality")
	public String getLocality() {
		return locality;
	}

	@JsonProperty("locality")
	public void setLocality(String locality) {
		this.locality = locality;
	}

	@JsonProperty("postalCode")
	public String getPostalCode() {
		return postalCode;
	}

	@JsonProperty("postalCode")
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}