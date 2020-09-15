package com.vehicule.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehiculeModelController {

	@GetMapping("/vehicule_model")
	public String getVehiculeModel() {
		return "vehicule_model";
	}
}
