package com.practice.postalcodeCoordinates.model;

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
@JsonPropertyOrder({ "estimatedTotal", "resources" })
public class ResourceSet {

	@JsonProperty("estimatedTotal")
	private Integer estimatedTotal;
	@JsonProperty("resources")
	private List<Resource> resources = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("estimatedTotal")
	public Integer getEstimatedTotal() {
		return estimatedTotal;
	}

	@JsonProperty("estimatedTotal")
	public void setEstimatedTotal(Integer estimatedTotal) {
		this.estimatedTotal = estimatedTotal;
	}

	@JsonProperty("resources")
	public List<Resource> getResources() {
		return resources;
	}

	@JsonProperty("resources")
	public void setResources(List<Resource> resources) {
		this.resources = resources;
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
