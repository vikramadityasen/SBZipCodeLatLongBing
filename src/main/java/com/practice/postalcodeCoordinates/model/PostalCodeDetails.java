package com.practice.postalcodeCoordinates.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ca_postal_mstr")
public class PostalCodeDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	private String postalCode;
	@Column
	private String city;
	@Column
	private String province;
	@Column
	private String country;
	@Column
	private String isDeleted;
	@Column
	private Date createDateTimestamp;
	@Column
	private Date updateDateTimestamp;

	public PostalCodeDetails() {
		super();
	}

	public PostalCodeDetails(String postalCode, String city, String province, String country, String isDeleted,
			Date createDateTimestamp, Date updateDateTimestamp) {
		super();
		this.postalCode = postalCode;
		this.city = city;
		this.province = province;
		this.country = country;
		this.isDeleted = isDeleted;
		this.createDateTimestamp = createDateTimestamp;
		this.updateDateTimestamp = updateDateTimestamp;
	}

	@Override
	public String toString() {
		return "PostalCodeDetails [postalCode=" + postalCode + ", city=" + city + ", province="
				+ province + ", country=" + country + ", isDeleted=" + isDeleted + ", createDateTimestamp="
				+ createDateTimestamp + ", updateDateTimestamp=" + updateDateTimestamp + "]";
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String isDeleted() {
		return isDeleted;
	}

	public void setDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Date getCreateDateTimestamp() {
		return createDateTimestamp;
	}

	public void setCreateDateTimestamp(Date createDateTimestamp) {
		this.createDateTimestamp = createDateTimestamp;
	}

	public Date getUpdateDateTimestamp() {
		return updateDateTimestamp;
	}

	public void setUpdateDateTimestamp(Date updateDateTimestamp) {
		this.updateDateTimestamp = updateDateTimestamp;
	}

}
