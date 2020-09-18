package com.vehicule.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicule.models.Supplier;
import com.vehicule.repository.SupplierRepository;

@Service
public class SupplierService {
	
	@Autowired private SupplierRepository sr;
	
	public List<Supplier> listSupplier(){
		return sr.findAll();
	}
	
	public Optional<Supplier> findById(Integer id){
		return sr.findById(id);
	}
	
	public void saveSupplier(Supplier supplier) {
		sr.save(supplier);
	}
	
	public void deleteSupplier(Integer id) {
		sr.deleteById(id);
	}
}
