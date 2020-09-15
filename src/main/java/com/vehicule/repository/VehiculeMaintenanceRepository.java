package com.vehicule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehicule.models.VehiculeMaintenance;

public interface VehiculeMaintenanceRepository extends JpaRepository<VehiculeMaintenance, Integer> {

}
