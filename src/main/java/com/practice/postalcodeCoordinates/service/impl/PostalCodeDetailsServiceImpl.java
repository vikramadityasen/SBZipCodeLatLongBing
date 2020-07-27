package com.practice.postalcodeCoordinates.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.postalcodeCoordinates.client.BingMapClient;
import com.practice.postalcodeCoordinates.exception.RecordNotFoundException;
import com.practice.postalcodeCoordinates.model.Coordinates;
import com.practice.postalcodeCoordinates.model.PostalCodeCoordinate;
import com.practice.postalcodeCoordinates.model.PostalCodeDetails;
import com.practice.postalcodeCoordinates.repository.PostalCodeCoordinateRepository;
import com.practice.postalcodeCoordinates.repository.PostalCodeDetailsRepository;
import com.practice.postalcodeCoordinates.service.PostalCodeDetailsService;

@Service
public class PostalCodeDetailsServiceImpl implements PostalCodeDetailsService {
	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private PostalCodeDetailsRepository postalCodeDetailsRepository;

	@Autowired
	private PostalCodeCoordinateRepository postalCodeCoordinateRepository;

	@Autowired
	private BingMapClient bingMapClient;

	@Override
	public List<PostalCodeDetails> getAllPostalCodeDetails() {
		List<PostalCodeDetails> postalCodeDetails = postalCodeDetailsRepository.findAll();
		List<PostalCodeCoordinate> postalCodeCoordinates = new ArrayList<PostalCodeCoordinate>();
		try {
			for (PostalCodeDetails poDetails : postalCodeDetails) {
				Coordinates coordinates = bingMapClient.getCoordinate(poDetails.getCity().replaceAll("\\s", ""),
						poDetails.getPostalCode());

				List<Coordinates> CoordinateList = Arrays.asList(coordinates);
				for (Coordinates coordinates2 : CoordinateList) {
					PostalCodeCoordinate postCodeCrdnt = new PostalCodeCoordinate();
					postCodeCrdnt.setPostalCode(
							coordinates2.getResourceSets().get(0).getResources().get(0).getAddress().getPostalCode());
					postCodeCrdnt.setLatitude(coordinates2.getResourceSets().get(0).getResources().get(0)
							.getGeocodePoints().get(0).getCoordinates().get(0));
					postCodeCrdnt.setLongitude(coordinates2.getResourceSets().get(0).getResources().get(0)
							.getGeocodePoints().get(0).getCoordinates().get(1));

					postalCodeCoordinates.add(postCodeCrdnt);
				}

				logger.debug("Coordinates: {}", postalCodeCoordinates.get(0));
				if(postalCodeCoordinates.get(0).getPostalCode()==null || !postalCodeCoordinates.isEmpty()) {
				postalCodeCoordinateRepository.saveAll(postalCodeCoordinates);
				}
			}
		} catch (Exception e) {
			String message = String.format("Duplicate or invalid postal code: %s", e.getMessage());
			logger.error(message);
			throw new RecordNotFoundException(message);
		}
		return postalCodeDetails;
	}

}
