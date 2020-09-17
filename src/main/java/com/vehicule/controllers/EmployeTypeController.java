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

import com.vehicule.models.EmployeType;
import com.vehicule.services.EmployeTypeService;

@Controller
public class EmployeTypeController {

	@Autowired private EmployeTypeService ets;
	
	@GetMapping("/employe_type")
	public String getEmployeType(Model model) {
		List<EmployeType> list_empt = ets.listEmployeType();
		model.addAttribute("list_emptype", list_empt);
		return "employe_type";
	}
	
	@GetMapping(value = "employe_type/findById")
	@ResponseBody
	public Optional<EmployeType> getById(Integer id){
		return ets.employeTypeById(id);
	}
	
	@PostMapping(value = "employe_type/addet")
	public String saveEmpType(EmployeType et) {
		ets.saveEmployeType(et);
		return "redirect:/employe_type";
	}
	
	@RequestMapping(value = "employe_type/update", method = {RequestMethod.PUT,RequestMethod.GET})
	public String update(EmployeType et) {
		ets.saveEmployeType(et);
		return "redirect:/employe_type";
	}
	
	@RequestMapping(value = "employe_type/delete", method = {RequestMethod.DELETE,RequestMethod.GET})
	public String delete(Integer id) {
		ets.deleteEmployeType(id);
		return "redirect:/employe_type";
	}
}
