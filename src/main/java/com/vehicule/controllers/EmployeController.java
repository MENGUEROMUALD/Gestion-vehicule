package com.vehicule.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeController {

	@GetMapping("/employe")
	public String getEmploye() {
		return "employe";
	}
}
