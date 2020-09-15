package com.vehicule.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehiculeMovementController {

	@GetMapping("/vehicule_movement")
	public String getVehiculeMovement() {
		return "vehicule_movement";
	}
}
