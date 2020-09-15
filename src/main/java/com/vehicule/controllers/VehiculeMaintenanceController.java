package com.vehicule.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehiculeMaintenanceController {
	
	@GetMapping("/vehicule_maintenance")
	public String getVehiculeMaintenance() {
		return "vehicule_maintenance";
	}
}
