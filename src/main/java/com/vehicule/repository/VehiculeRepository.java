package com.vehicule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehicule.models.Vehicule;

public interface VehiculeRepository extends JpaRepository<Vehicule, Integer> {

}
