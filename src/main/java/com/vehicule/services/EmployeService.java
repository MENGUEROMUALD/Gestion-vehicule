package com.vehicule.services;

import java.util.List;

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
}
