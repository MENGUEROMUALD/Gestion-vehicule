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

import com.vehicule.models.Supplier;
import com.vehicule.services.ContryService;
import com.vehicule.services.StateService;
import com.vehicule.services.SupplierService;

@Controller
public class SupplierController {
	
	@Autowired private SupplierService supplierService;
	@Autowired private ContryService contryService;
	@Autowired private StateService stateService;

	@GetMapping("/supplier")
	public String getSupplier(Model model) {
		
		model.addAttribute("list_supplier", supplierService.listSupplier());
		model.addAttribute("list_contry", contryService.getContries());
		model.addAttribute("list_state", stateService.getStates());
		
		return "supplier";
	}
	
	@GetMapping(value = "supplier/findById")
	@ResponseBody
	public Optional<Supplier> supplierById(Integer id){
		return supplierService.findById(id);
	}
	
	@PostMapping(value = "suplier/add")
	public String saveSupplier(Supplier supplier) {
		supplierService.saveSupplier(supplier);
		return "redirect:/supplier";
	}
	
	@RequestMapping(value = "supplier/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String updateSupplier(Supplier supplier) {
		supplierService.saveSupplier(supplier);
		return "redirect:/supplier";
	}
	
	@RequestMapping(value = "supplier/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
	public String deleteSupplier(Integer id) {
		supplierService.deleteSupplier(id);
		return "redirect:/supplier";
	}
}
