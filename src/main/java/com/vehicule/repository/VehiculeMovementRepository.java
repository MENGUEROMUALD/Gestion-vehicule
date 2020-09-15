package com.vehicule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehicule.models.VehiculeMovement;

public interface VehiculeMovementRepository extends JpaRepository<VehiculeMovement, Integer> {

}
