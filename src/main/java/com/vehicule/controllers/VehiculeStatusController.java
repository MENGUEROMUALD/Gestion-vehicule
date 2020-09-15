package com.vehicule.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehiculeStatusController {

	@GetMapping("/vehicule_status")
	public String getStatusVehicule() {
		return "vehicule_status";
	}
}
