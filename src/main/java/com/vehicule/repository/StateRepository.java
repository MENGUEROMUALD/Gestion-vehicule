package com.vehicule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehicule.models.State;

public interface StateRepository extends JpaRepository<State, Integer> {

}
