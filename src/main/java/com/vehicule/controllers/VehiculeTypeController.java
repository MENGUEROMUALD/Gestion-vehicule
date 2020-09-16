package com.vehicule.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vehicule.models.VehiculeType;
import com.vehicule.services.VehiculeTypeService;

@Controller
public class VehiculeTypeController {
	
	@Autowired private VehiculeTypeService vts;

	@GetMapping("/vehicule_type")
	public String getVehiculeType(Model model) {
		List<VehiculeType> vt = vts.listVehiculeType();
		model.addAttribute("list_vt", vt);
		return "vehicule_type";
	}
	
	@GetMapping(value = "vehicule_type/findById")
	@ResponseBody
	public Optional<VehiculeType> getVtById(Integer id){
		return vts.ElementById(id);
	}
	
	@PostMapping(value = "vehicule_type/addvt")
	public String save(VehiculeType vt) {
		vts.saveVt(vt);
		return "redirect:/vehicule_type";
	}
	
	@RequestMapping(value = "vehicule_type/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(VehiculeType vt) {
		vts.saveVt(vt);
		return "redirect:/vehicule_type";
	}
	
	@RequestMapping(value = "vehicule_type/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		vts.deleteVt(id);
		return "redirect:/vehicule_type";
	}
}
