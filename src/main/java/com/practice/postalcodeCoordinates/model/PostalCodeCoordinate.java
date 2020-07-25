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
	private String latitude;
	@Column
	private String longitude;
	
	public PostalCodeCoordinate() {
		super();
	}

	public PostalCodeCoordinate(int id, String postalCode, String latitude, String longitude) {
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

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
}
