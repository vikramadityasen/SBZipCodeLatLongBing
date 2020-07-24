package com.practice.postalcodeCoordinates.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.postalcodeCoordinates.model.PostalCodeDetails;
import com.practice.postalcodeCoordinates.repository.PostalCodeDetailsRepository;
import com.practice.postalcodeCoordinates.service.PostalCodeDetailsService;

@Service
public class PostalCodeDetailsServiceImpl implements PostalCodeDetailsService {

	@Autowired
	private PostalCodeDetailsRepository postalCodeDetailsRepository;
	
	@Override
	public List<PostalCodeDetails> getAllPostalCodeDetails() {
		return postalCodeDetailsRepository.findAll();
	}

}
