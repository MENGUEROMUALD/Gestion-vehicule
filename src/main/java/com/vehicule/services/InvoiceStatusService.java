package com.vehicule.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicule.models.InvoiceStatus;
import com.vehicule.repository.InvoiceStatusRepository;

@Service
public class InvoiceStatusService {
	
	@Autowired private InvoiceStatusRepository isr;
	
	public List<InvoiceStatus> listInvoiceStatut(){
		return isr.findAll();
	}
	
	public Optional<InvoiceStatus> InvoiceById(Integer id){
		return isr.findById(id);
	}
	
	public void saveInvoiceStatus(InvoiceStatus is) {
		isr.save(is);
	}
	
	public void deleteInvoiceStatus(Integer id) {
		isr.deleteById(id);
	}
}
