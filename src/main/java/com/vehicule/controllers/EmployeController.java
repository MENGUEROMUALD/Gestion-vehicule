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

import com.vehicule.models.Employe;
import com.vehicule.models.Vehicule;
import com.vehicule.services.EmployeService;
import com.vehicule.services.EmployeTypeService;
import com.vehicule.services.JobTitleService;

@Controller
public class EmployeController {

	@Autowired EmployeTypeService ets;
	@Autowired JobTitleService jts;
	@Autowired EmployeService es;
	
	@GetMapping("/employe")
	public String getEmploye(Model model) {
		model.addAttribute("employe", es.listEmploye());
		model.addAttribute("employeType", ets.listEmployeType());
		model.addAttribute("jobTitle", jts.listJobTitle());
		return "employe";
	}
	
	@GetMapping("employe/findById")
	@ResponseBody
	public Optional<Employe> byId(Integer id){
		return es.findById(id);
	}
	
	@PostMapping("employe/add")
	public String save(Employe empl) {
		es.SaveEmploye(empl);	
		return "redirect:/employe";
	}
	
	@RequestMapping(value = "employe/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(Employe empl) {
		es.SaveEmploye(empl);
		return "redirect:/employe";
	}
	
	@RequestMapping(value = "employe/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		es.DeleteEmploye(id);
		return "redirect:/employe";
	}
}
