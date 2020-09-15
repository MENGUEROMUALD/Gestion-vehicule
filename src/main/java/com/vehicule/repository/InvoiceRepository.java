package com.vehicule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehicule.models.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {

}
