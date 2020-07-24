package com.practice.postalcodeCoordinates.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.postalcodeCoordinates.client.BingMapClient;
import com.practice.postalcodeCoordinates.model.Coordinates;
import com.practice.postalcodeCoordinates.model.PostalCodeDetails;
import com.practice.postalcodeCoordinates.repository.PostalCodeDetailsRepository;
import com.practice.postalcodeCoordinates.service.PostalCodeDetailsService;

@Service
public class PostalCodeDetailsServiceImpl implements PostalCodeDetailsService {

	@Autowired
	private PostalCodeDetailsRepository postalCodeDetailsRepository;

	@Autowired
	private BingMapClient bingMapClient;

	@Override
	public List<PostalCodeDetails> getAllPostalCodeDetails() {
		List<PostalCodeDetails> postalCodeDetails = postalCodeDetailsRepository.findAll();

		for (PostalCodeDetails poDetails : postalCodeDetails) {
			Coordinates coordinates = bingMapClient.getCoordinate(poDetails.getCity(), poDetails.getPostalCode());
			System.out.println("Coordinates: " + coordinates.getResourceSets().get(0).getResources().get(0).getGeocodePoints().get(0).getCoordinates());

		}

		return postalCodeDetails;
	}

}
