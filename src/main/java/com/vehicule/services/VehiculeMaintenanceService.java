package com.vehicule.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicule.models.VehiculeMaintenance;
import com.vehicule.repository.VehiculeMaintenanceRepository;

@Service
public class VehiculeMaintenanceService {
	
	@Autowired private VehiculeMaintenanceRepository vmr;
	
	public List<VehiculeMaintenance> listVehiculeMaintenance(){
		return vmr.findAll();
	}
	
	public Optional<VehiculeMaintenance> vmrById(Integer id){
		return vmr.findById(id);
	}
	
	public void saveVMR(VehiculeMaintenance vmrs) {
		vmr.save(vmrs);
	}
	
	public void deleteVMR(Integer id) {
		vmr.deleteById(id);
	}
}
