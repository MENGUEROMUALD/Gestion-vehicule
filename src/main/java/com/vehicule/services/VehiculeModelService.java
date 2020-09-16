package com.vehicule.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicule.models.VehiculeModel;
import com.vehicule.repository.VehiculeModelRepository;

@Service
public class VehiculeModelService {

	@Autowired private VehiculeModelRepository vmr;
	
	public List<VehiculeModel> listVehiculeModel(){
		return vmr.findAll();
	}
	
	public Optional<VehiculeModel> VehiculeModelById(Integer id){
		return vmr.findById(id);
	}
	
	public void saveVm(VehiculeModel vm) {
		vmr.save(vm);
	}
	
	public void deleteVm(Integer id) {
		vmr.deleteById(id); 
	}
}
