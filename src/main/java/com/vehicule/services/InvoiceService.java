package com.vehicule.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicule.models.Invoice;
import com.vehicule.repository.InvoiceRepository;

@Service
public class InvoiceService {
	
	@Autowired private InvoiceRepository ir;
	
	public List<Invoice> listInvoice(){
		return ir.findAll();
	}
	
	public Optional<Invoice> InvoiceById(Integer id){
		return ir.findById(id);
	}
	
	public void saveInvoice(Invoice invoice) {
		ir.save(invoice);
	}
	
	public void deleteInvoice(Integer id) {
		ir.deleteById(id);
	}
}
