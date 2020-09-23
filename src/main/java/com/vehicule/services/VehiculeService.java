package com.vehicule.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicule.models.Vehicule;
import com.vehicule.repository.VehiculeRepository;

@Service
public class VehiculeService {
	@Autowired private VehiculeRepository vr;
	
	public List<Vehicule> listVehicule(){
		return vr.findAll();
	}
	
	public Optional<Vehicule> findByid(Integer id){
		return vr.findById(id);
	}
	
	public void savevehicule(Vehicule v) {
		vr.save(v);
	}
	
	public void delete(Integer id) {
		vr.deleteById(id);
	}
}
