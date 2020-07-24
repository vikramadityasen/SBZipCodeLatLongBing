package com.practice.postalcodeCoordinates.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.postalcodeCoordinates.model.Coordinates;

@Repository
public interface CoordinatesRepository extends JpaRepository<Coordinates, String> {

}
