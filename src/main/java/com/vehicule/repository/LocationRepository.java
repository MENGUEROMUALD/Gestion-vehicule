package com.vehicule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehicule.models.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
