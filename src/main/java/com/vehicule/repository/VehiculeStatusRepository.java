package com.vehicule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehicule.models.VehiculeStatus;

public interface VehiculeStatusRepository extends JpaRepository<VehiculeStatus, Integer> {

}
