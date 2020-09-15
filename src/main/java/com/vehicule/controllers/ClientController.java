package com.vehicule.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.vehicule.services.ClientService;
import com.vehicule.services.ContryService;
import com.vehicule.services.StateService;

@Controller
public class ClientController {

	@Autowired
	private ClientService clientService;
	private ContryService contryService;
	private StateService StateService;
	
	@GetMapping("/client")
	public String getClient() {
		return "client";
	}
}
