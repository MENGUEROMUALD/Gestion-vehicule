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
import com.vehicule.models.VehiculeMaintenance;
import com.vehicule.services.SupplierService;
import com.vehicule.services.VehiculeMaintenanceService;
import com.vehicule.services.VehiculeService;

@Controller
public class VehiculeMaintenanceController {
	
	@Autowired private VehiculeMaintenanceService vms;
	@Autowired private VehiculeService vs;
	@Autowired private SupplierService ss;
	
	@GetMapping("/vehicule_maintenance")
	public String getVehiculeMaintenance(Model model) {
		model.addAttribute("list_vm", vms.listVehiculeMaintenance());
		model.addAttribute("list_vehicule", vs.listVehicule());
		model.addAttribute("list_supplier", ss.getListSupplier());
		return "vehicule_maintenance";
	}
	
	@GetMapping("vehicule_maintenance/findById/")
	@ResponseBody
	public Optional<VehiculeMaintenance> byId(Integer id){
		return vms.vmrById(id);
	}
	
	@PostMapping("vehicule_maintenance/add")
	public String save(VehiculeMaintenance vm) {
		this.vms.saveVMR(vm);
		return "redirect:/vehicule_maintenance";
	}
	
	@RequestMapping(value = "vehicule_maintenance/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(VehiculeMaintenance vm) {
		this.vms.saveVMR(vm);
		return "redirect:/vehicule_maintenance";
	}
	
	@RequestMapping(value = "vehicule_maintenance/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		this.vms.deleteVMR(id);
		return "redirect:/vehicule_maintenance";
	}
}
