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

import com.vehicule.models.VehiculeStatus;
import com.vehicule.services.VehiculeStatusService;

@Controller
public class VehiculeStatusController {

	@Autowired private VehiculeStatusService vss;
	
	@GetMapping("/vehicule_status")
	public String getStatusVehicule(Model model) {
		List<VehiculeStatus> list_vs = vss.ListStatusVehicule();
		model.addAttribute("list_vs", list_vs);
		return "vehicule_status";
	}
	
	@GetMapping(value = "vehicule_status/findById")
	@ResponseBody
	public Optional<VehiculeStatus> findElementById(Integer id){
		return vss.getById(id);
	}
	
	@PostMapping(value = "vehicule_status/addvs")
	public String saveVS(VehiculeStatus vs) {
		vss.saveStatusVehicule(vs);
		return "redirect:/vehicule_status";
	}
	
	@RequestMapping(value = "vehicule_status/update", method = {RequestMethod.PUT,RequestMethod.GET})
	public String update(VehiculeStatus vs) {
		vss.saveStatusVehicule(vs);
		return "redirect:/vehicule_status";
	}
	
	@RequestMapping(value = "vehicule_status/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		vss.deleteVehiculeStatus(id);
		return "redirect:/vehicule_status";
	}
}
