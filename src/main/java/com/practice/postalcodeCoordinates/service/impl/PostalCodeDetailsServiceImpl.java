package com.practice.postalcodeCoordinates.service.impl;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.postalcodeCoordinates.client.BingMapClient;
import com.practice.postalcodeCoordinates.model.Coordinates;
import com.practice.postalcodeCoordinates.model.PostalCodeCoordinate;
import com.practice.postalcodeCoordinates.model.PostalCodeDetails;
import com.practice.postalcodeCoordinates.repository.PostalCodeCoordinateRepository;
import com.practice.postalcodeCoordinates.repository.PostalCodeDetailsRepository;
import com.practice.postalcodeCoordinates.service.PostalCodeDetailsService;

@Service
public class PostalCodeDetailsServiceImpl implements PostalCodeDetailsService {
	private final Logger logger = LoggerFactory.getLogger(getClass());

	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	private PostalCodeDetailsRepository postalCodeDetailsRepository;
	
	@Autowired
	private PostalCodeCoordinateRepository postalCodeCoordinateRepository;

	
	@Autowired
	private BingMapClient bingMapClient;

	@Override
	@Transactional
	public List<PostalCodeDetails> getAllPostalCodeDetails() {
		List<PostalCodeDetails> postalCodeDetails = postalCodeDetailsRepository.findAll();
		PostalCodeCoordinate postCodeCrdnt = new PostalCodeCoordinate();
		for (PostalCodeDetails poDetails : postalCodeDetails) {
			Coordinates coordinates = bingMapClient.getCoordinate(poDetails.getCity(), poDetails.getPostalCode());
			logger.debug("Coordinates: {}" + coordinates.getResourceSets().get(0).getResources().get(0).getGeocodePoints().get(0).getCoordinates());
			
			List<Coordinates> CoordinateList = Arrays.asList(coordinates);
			for(Coordinates coordinates2 : CoordinateList) {
				postCodeCrdnt.setPostalCode(coordinates2.getResourceSets().get(0).getResources().get(0).getAddress().getPostalCode());
				postCodeCrdnt.setLatitude(coordinates2.getResourceSets().get(0).getResources().get(0).getGeocodePoints().get(0).getCoordinates().get(0));
				postCodeCrdnt.setLongitude(coordinates2.getResourceSets().get(0).getResources().get(0).getGeocodePoints().get(0).getCoordinates().get(1));
			}
			entityManager.persist(postalCodeCoordinateRepository.save(postCodeCrdnt));
		}
		return postalCodeDetails;
	}

}
