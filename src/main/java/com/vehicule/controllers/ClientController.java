package com.vehicule.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vehicule.models.Client;
import com.vehicule.models.Contry;
import com.vehicule.models.State;
import com.vehicule.services.ClientService;
import com.vehicule.services.ContryService;
import com.vehicule.services.StateService;

@Controller
public class ClientController {

	@Autowired 	private ClientService clientService;
	@Autowired private ContryService contryService;
	@Autowired private StateService StateService;
	
	@GetMapping("/client")
	public String getClient(Model model) {
		List<Client> list_client = clientService.getClient();
		model.addAttribute("list_client", list_client);
		
		List<Contry> list_contry = contryService.getContries();
		model.addAttribute("list_contry", list_contry);
		
		List<State> list_state = StateService.getStates();
		model.addAttribute("list_state", list_state);
		
		return "client";
	}
	
	@GetMapping(value = "client/findById")
	@ResponseBody
	public Optional<Client> clientById(Integer id){
		return clientService.getClientById(id);
	}
	
	@PostMapping(value = "client/add")
	public String saveClient(Client client) {
		clientService.saveClient(client);
		return "redirect:/client";
	}
	
	@RequestMapping(value = "client/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(Client client) {
		clientService.saveClient(client);
		return "redirect:/client";
	}
	
	@RequestMapping(value = "client/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		clientService.deleteClient(id);
		return "redirect:/client";
	}
}
