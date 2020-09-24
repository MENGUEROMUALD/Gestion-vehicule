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

import com.vehicule.models.Vehicule;
import com.vehicule.services.VehiculeMakeService;
import com.vehicule.services.VehiculeModelService;
import com.vehicule.services.VehiculeService;

@Controller
public class VehiculeController {

	@Autowired private VehiculeService vs;
	@Autowired private VehiculeMakeService vms;
	@Autowired private VehiculeModelService vms2;
	
	@GetMapping("/vehicule")
	public String getVehicules(Model model) {
		model.addAttribute("list_vehicule", vs.listVehicule());
		model.addAttribute("list_make", vms.getVehiculeMake());
		model.addAttribute("list_model", vms2.listVehiculeModel());
		return "vehicule";
	}
	
	@GetMapping("vehicule/findById")
	@ResponseBody
	public Optional<Vehicule> byId(Integer id){
		return vs.findByid(id);
	}
	
	@PostMapping("vehicule/add")
	public String save(Vehicule v) {
		vs.savevehicule(v);
		return "redirect:/vehicule";
	}
	
	@RequestMapping(value = "vehicule/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(Vehicule v) {
		vs.savevehicule(v);
		return "redirect:/vehicule";
	}
	
	@RequestMapping(value = "vehicule/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		vs.delete(id);
		return "redirect:/vehicule";
	}
}
