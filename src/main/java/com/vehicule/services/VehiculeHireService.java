package com.vehicule.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicule.models.VehiculeHire;
import com.vehicule.repository.VehiculeHireRepository;

@Service
public class VehiculeHireService {

	@Autowired private VehiculeHireRepository vhr;
	
	public List<VehiculeHire> getVehiculeHire() {
		return vhr.findAll();
	}
	
	public Optional<VehiculeHire> getVehiculeHireById(Integer id){
		return vhr.findById(id);
	}
	
	public void saveVehiculeHire(VehiculeHire vh) {
		vhr.save(vh);
	}
	
	public void deleteById(Integer id) {
		vhr.deleteById(id);
	}
}
