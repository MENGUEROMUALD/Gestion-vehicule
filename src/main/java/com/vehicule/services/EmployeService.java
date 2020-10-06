package com.vehicule.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicule.models.Employe;
import com.vehicule.repository.EmployeRepository;

@Service
public class EmployeService {

	@Autowired private EmployeRepository er;
	
	public List<Employe> listEmploye(){
		return er.findAll();
	}
	
	public Optional<Employe> findById(Integer id){
		return er.findById(id);
	}
	
	public void SaveEmploye(Employe empl) {
		er.save(empl);
	}
	
	public void DeleteEmploye(Integer id) {
		er.deleteById(id);
	}
}
