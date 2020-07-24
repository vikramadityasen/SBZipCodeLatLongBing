package com.practice.postalcodeCoordinates.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.practice.postalcodeCoordinates.model.Coordinates;

@Component
public class BingMapClient {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	private String bingMapUrl = "http://dev.virtualearth.net/REST/v1/Locations?key=As0-HEovk-6vNjJ_WPcMuq5KP_XiIswWwYsI-4zJ7Wq0fLsEO3mFVcgpNUZp_pqJ";

	public Coordinates getCoordinate(String city, String postalCode) {
		ResponseEntity<Coordinates> response = null;
		long start = System.currentTimeMillis();
		try {

			UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(bingMapUrl).queryParam("locality", city)
					.queryParam("postalCode", postalCode);

			RestTemplate restTemplate = new RestTemplate();

			response = restTemplate.getForEntity(builder.toUriString(), Coordinates.class);

		} catch (Exception e) {
			String message = String.format("Invalid response: %s", e.getMessage());
			logger.error(message);
		} finally {
			logger.debug("getCoordinate:{}{} ", System.currentTimeMillis() - start, "ms");
		}
		return response.getBody();
	}
}
