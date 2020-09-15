package com.vehicule.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.vehicule.models.VehiculeMake;
import com.vehicule.repository.VehiculeMakeRepository;

@Service
public class VehiculeMakeService {

	@Autowired private VehiculeMakeRepository vmr;
	
	public List<VehiculeMake> getVehiculeMake() {
		return vmr.findAll();
	}
	
	public Optional<VehiculeMake> getVehiculeMakeById(Integer id){
		return vmr.findById(id);
	}
	
	public void saveVehiculeMake(VehiculeMake vm) {
		vmr.save(vm);
	}
	
	public void deleteById(Integer id) {
		vmr.deleteById(id);
	}
}
