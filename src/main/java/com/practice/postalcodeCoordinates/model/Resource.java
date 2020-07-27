package com.practice.postalcodeCoordinates.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Resource implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonProperty("__type")
	private String type;
	private List<Double> bbox = null;
	private String name;
	private Point point;
	private Address address;
	private String confidence;
	private String entityType;
	private List<GeocodePoint> geocodePoints = null;
	private List<String> matchCodes = null;

	@JsonProperty("__type")
	public String getType() {
		return type;
	}

	@JsonProperty("__type")
	public void setType(String type) {
		this.type = type;
	}

	public List<Double> getBbox() {
		return bbox;
	}

	public void setBbox(List<Double> bbox) {
		this.bbox = bbox;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getConfidence() {
		return confidence;
	}

	public void setConfidence(String confidence) {
		this.confidence = confidence;
	}

	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public List<GeocodePoint> getGeocodePoints() {
		return geocodePoints;
	}

	public void setGeocodePoints(List<GeocodePoint> geocodePoints) {
		this.geocodePoints = geocodePoints;
	}

	public List<String> getMatchCodes() {
		return matchCodes;
	}

	public void setMatchCodes(List<String> matchCodes) {
		this.matchCodes = matchCodes;
	}

}