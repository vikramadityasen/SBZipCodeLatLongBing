package com.practice.postalcodeCoordinates.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.postalcodeCoordinates.model.PostalCodeDetails;

@Repository
public interface PostalCodeDetailsRepository extends JpaRepository<PostalCodeDetails, String> {

}
