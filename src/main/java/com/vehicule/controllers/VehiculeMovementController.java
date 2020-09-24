package com.vehicule.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vehicule.models.VehiculeMovement;
import com.vehicule.services.LocationService;
import com.vehicule.services.SupplierService;
import com.vehicule.services.VehiculeMovementService;
import com.vehicule.services.VehiculeService;

@Controller
public class VehiculeMovementController {

	@Autowired private VehiculeMovementService vms;
	@Autowired private LocationService ls;
	@Autowired private VehiculeService vs;
	
	@GetMapping("/vehicule_movement")
	public String getVehiculeMovement(Model model) {
		model.addAttribute("list_vm", vms.listVehiculeMovement());
		model.addAttribute("list_location", ls.getLocation());
		model.addAttribute("list_vehicule", vs.listVehicule());
		return "vehicule_movement";
	}
	
	@GetMapping("vehicule_movement/findById/")
	@ResponseBody
	public Optional<VehiculeMovement> byId(Integer id){
		return vms.findByid(id);
	}
	
	@PostMapping("vehicule_movement/add")
	public String save(VehiculeMovement vm) {
		this.vms.saveVehiculeMovement(vm);
		return "redirect:/vehicule_movement";
	}
	
	@RequestMapping(value = "vehicule_movement/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(VehiculeMovement vm) {
		this.vms.saveVehiculeMovement(vm);
		return "redirect:/vehicule_movement";
	}
	
	@RequestMapping(value = "vehicule_movement/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		this.vms.delete(id);
		return "redirect:/vehicule_movement";
	}
}
