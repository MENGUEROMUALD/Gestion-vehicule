package com.vehicule.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicule.models.VehiculeType;
import com.vehicule.repository.VehiculeTypeRepository;

@Service
public class VehiculeTypeService {
	
	@Autowired private VehiculeTypeRepository vtr;
	
	public List<VehiculeType> listVehiculeType(){
		return vtr.findAll();
	}
	
	public Optional<VehiculeType> ElementById(Integer id){
		return vtr.findById(id);
	}
	
	public void saveVt(VehiculeType vt) {
		vtr.save(vt);
	}
	
	public void deleteVt(Integer id) {
		vtr.deleteById(id);
	}
}
