package com.vehicule.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicule.models.EmployeType;
import com.vehicule.repository.EmployeTypeRepository;

@Service
public class EmployeTypeService {
	
	@Autowired private EmployeTypeRepository etp;
	
	public List<EmployeType> listEmployeType(){
		return etp.findAll();
	}
	
	public Optional<EmployeType> employeTypeById(Integer id){
		return etp.findById(id);
	}
	
	public void saveEmployeType(EmployeType et) {
		etp.save(et);
	}
	
	public void deleteEmployeType(Integer id) {
		etp.deleteById(id);
	}
}
