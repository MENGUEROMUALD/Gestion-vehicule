package com.vehicule.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.vehicule.services.VehiculeMakeService;
import com.vehicule.services.VehiculeModelService;
import com.vehicule.services.VehiculeService;

@Controller
public class VehiculeController {

	@Autowired private VehiculeService vs;
	@Autowired private VehiculeMakeService vms;
	@Autowired private VehiculeModelService vms2;
	
	@GetMapping("/vehicule")
	public String getVehicules(Model model) {
		model.addAttribute("list_vehicule", vs.listVehicule());
		model.addAttribute("list_make", vms.getVehiculeMake());
		model.addAttribute("list_model", vms2.listVehiculeModel());
		return "vehicule";
	}
}
