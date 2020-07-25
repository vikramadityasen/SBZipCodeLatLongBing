package com.practice.postalcodeCoordinates.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PostalCodeCoordinate {

	@Id
	@Column
	private int id;
	@Column
	private String postalCode;
	@Column
	private Double latitude;
	@Column
	private Double longitude;
	
	public PostalCodeCoordinate() {
		super();
	}

	public PostalCodeCoordinate(int id, String postalCode, Double latitude, Double longitude) {
		super();
		this.id = id;
		this.postalCode = postalCode;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return "PostalCodeCoordinate [id=" + id + ", postalCode=" + postalCode + ", latitude=" + latitude
				+ ", longitude=" + longitude + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

}
