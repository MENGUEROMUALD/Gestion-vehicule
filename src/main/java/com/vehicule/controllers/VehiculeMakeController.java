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

import com.vehicule.models.VehiculeMake;
import com.vehicule.services.VehiculeMakeService;

@Controller
public class VehiculeMakeController {

	@Autowired private VehiculeMakeService vms;
	
	@GetMapping("/vehicule_make")
	public String getVehiculesMakes(Model model) {
		List<VehiculeMake> list_vm = vms.getVehiculeMake();
		model.addAttribute("list_vehicule_make", list_vm);
		return "vehicule_make";
	}
	
	@PostMapping(value = "vehicule_make/addvm")
	public String save(VehiculeMake vm) {
		vms.saveVehiculeMake(vm);
		return "redirect:/vehicule_make";
	}
	
	@GetMapping(value = "vehicule_make/findById")
	@ResponseBody
	public Optional<VehiculeMake> getVehiculeMakeById(Integer id) {
		return vms.getVehiculeMakeById(id);
	}
	
	@RequestMapping(value = "vehicule_make/update", method = {RequestMethod.PUT,RequestMethod.GET})
	public String update(VehiculeMake vm) {
		vms.saveVehiculeMake(vm);
		return "redirect:/vehicule_make";
	}
	
	@RequestMapping(value = "vehicule_make/delete", method = {RequestMethod.DELETE,RequestMethod.GET})
	public String delete(Integer id) {
		vms.deleteById(id);
		return "redirect:/vehicule_make";
	}
}
