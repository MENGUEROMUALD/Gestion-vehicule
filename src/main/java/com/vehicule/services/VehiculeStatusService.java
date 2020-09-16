package com.vehicule.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicule.models.VehiculeStatus;
import com.vehicule.repository.VehiculeStatusRepository;

@Service
public class VehiculeStatusService {
	
	@Autowired private VehiculeStatusRepository vsr;
	
	public List<VehiculeStatus> ListStatusVehicule(){
		return vsr.findAll();
	}
	
	public Optional<VehiculeStatus> getById(Integer id){
		return vsr.findById(id);
	}
	
	public void saveStatusVehicule(VehiculeStatus vs) {
		vsr.save(vs);
	}
	
	public void deleteVehiculeStatus(Integer id) {
		vsr.deleteById(id);
	}
}
