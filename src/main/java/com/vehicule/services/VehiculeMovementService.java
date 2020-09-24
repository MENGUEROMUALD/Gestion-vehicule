package com.vehicule.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicule.models.VehiculeMovement;
import com.vehicule.repository.VehiculeMovementRepository;

@Service
public class VehiculeMovementService {
	
@Autowired private VehiculeMovementRepository vmr;
	
	public List<VehiculeMovement> listVehiculeMovement(){
		return vmr.findAll();
	}
	
	public Optional<VehiculeMovement> findByid(Integer id){
		return vmr.findById(id);
	}
	
	public void saveVehiculeMovement(VehiculeMovement v) {
		vmr.save(v);
	}
	
	public void delete(Integer id) {
		vmr.deleteById(id);
	}
	
}
