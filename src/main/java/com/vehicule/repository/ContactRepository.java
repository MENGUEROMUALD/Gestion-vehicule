package com.vehicule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehicule.models.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
