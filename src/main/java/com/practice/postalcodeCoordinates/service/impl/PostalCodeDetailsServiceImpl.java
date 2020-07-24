package com.practice.postalcodeCoordinates.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.postalcodeCoordinates.client.BingMapClient;
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
			String coordinates = bingMapClient.getCoordinate(poDetails.getCity(), poDetails.getPostalCode());
			System.out.println("Coordinates: " + coordinates);
			
		}

		return postalCodeDetails;
	}

}
