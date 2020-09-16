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

import com.vehicule.models.VehiculeModel;
import com.vehicule.services.VehiculeModelService;

@Controller
public class VehiculeModelController {

	@Autowired private VehiculeModelService vms;
	
	@GetMapping("/vehicule_model")
	public String getVehiculeModel(Model model) {
		List<VehiculeModel> vm = vms.listVehiculeModel();
		model.addAttribute("list_vm", vm);
		return "vehicule_model";
	}
	
	@GetMapping(value = "vehicule_model/findById")
	@ResponseBody
	public Optional<VehiculeModel> getById(Integer id){
		return vms.VehiculeModelById(id);
	}
	
	@PostMapping(value = "vehicule_model/addvm")
	public String save(VehiculeModel vm) {
		vms.saveVm(vm);
		return "redirect:/vehicule_model";
	}
	
	@RequestMapping(value = "vehicule_model/update", method = {RequestMethod.PUT,RequestMethod.GET})
	public String update(VehiculeModel vm) {
		vms.saveVm(vm);
		return "redirect:/vehicule_model";
	}
	
	@RequestMapping(value = "vehicule_model/delete", method = {RequestMethod.DELETE,RequestMethod.GET})
	public String deleteV(Integer id) {
		vms.deleteVm(id);
		return "redirect:/vehicule_model";
	}
}
