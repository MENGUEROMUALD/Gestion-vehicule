package com.vehicule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehicule.models.VehiculeType;

public interface VehiculeTypeRepository extends JpaRepository<VehiculeType, Integer> {

}
