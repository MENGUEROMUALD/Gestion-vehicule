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
		model.addAttribute("list_supplier", supplierService.getListSupplier());
		model.addAttribute("list_state", stateService.getStates());
		model.addAttribute("list_contry", contryService.getContries());
		return "supplier";
	}
	
	@GetMapping("supplier/findById")
	@ResponseBody
	public Optional<Supplier> findById(Integer id){
		return supplierService.getById(id);
	}
	
	@PostMapping("supplier/add")
	public String save(Supplier suppl) {
		supplierService.saveSupplier(suppl);
		return "redirect:/supplier";
	}
	
	@RequestMapping(value = "supplier/update", method = {RequestMethod.PUT,RequestMethod.GET})
	public String update(Supplier suppl) {
		supplierService.saveSupplier(suppl);
		return "redirect:/supplier";
	}
	
	@RequestMapping(value = "supplier/delete", method = {RequestMethod.DELETE,RequestMethod.GET})
	public String delete(Integer id) {
		supplierService.deleteSupplier(id);
		return "redirect:/supplier";
	}
}
