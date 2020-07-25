package com.practice.postalcodeCoordinates.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PostalCodeCoordinate implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(unique = true)
	@GeneratedValue(strategy = GenerationType.AUTO)
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PostalCodeCoordinate other = (PostalCodeCoordinate) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
