package com.vehicule.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicule.models.Supplier;
import com.vehicule.repository.SupplierRepository;

@Service
public class SupplierService {
	
	@Autowired private SupplierRepository repository;
	
	public List<Supplier> getListSupplier(){
		return repository.findAll();
	}
	
	public Optional<Supplier> getById(Integer id){
		return repository.findById(id);
	}
	
	public void saveSupplier(Supplier suppl) {
		repository.save(suppl);
	}
	
	public void deleteSupplier(Integer id) {
		repository.deleteById(id);
	}
	
}
