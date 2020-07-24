package com.practice.postalcodeCoordinates.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.postalcodeCoordinates.model.PostalCodeDetails;
import com.practice.postalcodeCoordinates.service.PostalCodeDetailsService;

@RequestMapping("/api")
@RestController
public class PostalCodeCoordinatesRestController {

	@Autowired
	private PostalCodeDetailsService postalCodeDetailsService;

	@GetMapping(value = "/allPostalCodeDetails", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<PostalCodeDetails> getAllPostalCodeDetails() {
		return postalCodeDetailsService.getAllPostalCodeDetails();
	}
}
