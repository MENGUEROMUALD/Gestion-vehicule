package com.vehicule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehicule.models.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}
