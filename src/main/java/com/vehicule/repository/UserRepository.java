package com.vehicule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehicule.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
