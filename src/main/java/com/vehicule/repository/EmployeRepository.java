package com.vehicule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehicule.models.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Integer> {

}
