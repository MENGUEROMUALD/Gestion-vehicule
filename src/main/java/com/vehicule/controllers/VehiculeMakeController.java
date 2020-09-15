package com.vehicule.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehiculeMakeController {

	@GetMapping("/vehicule_make")
	public String getVehiculesMakes() {
		return "vehicule_make";
	}
}
