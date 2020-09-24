package com.vehicule.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vehicule.models.VehiculeHire;
import com.vehicule.services.ClientService;
import com.vehicule.services.LocationService;
import com.vehicule.services.VehiculeHireService;
import com.vehicule.services.VehiculeService;

@Controller
public class VehiculeHireController {

	@Autowired private VehiculeHireService vhs;
	@Autowired private LocationService ls;
	@Autowired private VehiculeService vs;
	@Autowired private ClientService cs;
	
	@GetMapping("/vehicule_hire")
	public String getVehiculeHire(Model model) {
		model.addAttribute("list_vm", vhs.getVehiculeHire());
		model.addAttribute("list_location", ls.getLocation());
		model.addAttribute("list_vehicule", vs.listVehicule());
		model.addAttribute("list_client", cs.getClient());
		return "vehicule_hire";
	}
	
	@GetMapping("vehicule_hire/findById/")
	@ResponseBody
	public Optional<VehiculeHire> byId(Integer id){
		return vhs.getVehiculeHireById(id);
	}
	
	@PostMapping("vehicule_hire/add")
	public String save(VehiculeHire vm) {
		this.vhs.saveVehiculeHire(vm);
		return "redirect:/vehicule_hire";
	}
	
	@RequestMapping(value = "vehicule_hire/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(VehiculeHire vm) {
		this.vhs.saveVehiculeHire(vm);
		return "redirect:/vehicule_hire";
	}
	
	@RequestMapping(value = "vehicule_hire/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		this.vhs.deleteById(id);
		return "redirect:/vehicule_hire";
	}
}
