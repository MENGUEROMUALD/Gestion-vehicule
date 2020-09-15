package com.vehicule.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeTypeController {

	@GetMapping("/employe_type")
	public String getEmployeType() {
		return "employe_type";
	}
}
