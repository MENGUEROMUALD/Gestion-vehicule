package com.vehicule.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehiculeController {

	@GetMapping("/vehicule")
	public String getVehicules() {
		return "vehicule";
	}
}
