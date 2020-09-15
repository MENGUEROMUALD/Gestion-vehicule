package com.vehicule.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehiculeTypeController {

	@GetMapping("/vehicule_type")
	public String getVehiculeType() {
		return "vehicule_type";
	}
}
