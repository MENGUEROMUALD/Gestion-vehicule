package com.vehicule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehicule.models.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
