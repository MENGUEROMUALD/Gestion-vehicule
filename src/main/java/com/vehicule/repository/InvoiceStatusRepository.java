package com.vehicule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehicule.models.InvoiceStatus;

public interface InvoiceStatusRepository extends JpaRepository<InvoiceStatus, Integer> {

}
