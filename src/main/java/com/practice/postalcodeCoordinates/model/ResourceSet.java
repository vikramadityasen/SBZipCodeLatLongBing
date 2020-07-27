package com.practice.postalcodeCoordinates.model;

import java.io.Serializable;
import java.util.List;

public class ResourceSet implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer estimatedTotal;
	private List<Resource> resources = null;

	public Integer getEstimatedTotal() {
		return estimatedTotal;
	}

	public void setEstimatedTotal(Integer estimatedTotal) {
		this.estimatedTotal = estimatedTotal;
	}

	public List<Resource> getResources() {
		return resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}

}
