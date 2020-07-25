package com.practice.postalcodeCoordinates.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "type", "coordinates", "calculationMethod", "usageTypes" })
public class GeocodePoint implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonProperty("type")
	private String type;
	@JsonProperty("coordinates")
	private List<Double> coordinates = null;
	@JsonProperty("calculationMethod")
	private String calculationMethod;
	@JsonProperty("usageTypes")
	private List<String> usageTypes = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	@JsonProperty("coordinates")
	public List<Double> getCoordinates() {
		return coordinates;
	}

	@JsonProperty("coordinates")
	public void setCoordinates(List<Double> coordinates) {
		this.coordinates = coordinates;
	}

	@JsonProperty("calculationMethod")
	public String getCalculationMethod() {
		return calculationMethod;
	}

	@JsonProperty("calculationMethod")
	public void setCalculationMethod(String calculationMethod) {
		this.calculationMethod = calculationMethod;
	}

	@JsonProperty("usageTypes")
	public List<String> getUsageTypes() {
		return usageTypes;
	}

	@JsonProperty("usageTypes")
	public void setUsageTypes(List<String> usageTypes) {
		this.usageTypes = usageTypes;
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