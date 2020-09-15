package com.vehicule.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehiculeHireController {

	@GetMapping("/vehicule_hire")
	public String getVehiculeHire() {
		return "vehicule_hire";
	}
}
