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

import com.vehicule.models.Contry;
import com.vehicule.services.ContryService;

@Controller
public class ContryController {

	@Autowired
	private ContryService contryService;
	@GetMapping(value = "/contry")
	public String getContries(Model model) {		
		List<Contry> cont = contryService.getContries();
		model.addAttribute("contrylist", cont);
		return "contry";
	}
	
	@PostMapping(value = "contry/addcontry")
	public String saveContry(Contry contry) {
		contryService.saveContry(contry);
		return "redirect:/contry";
	}
	
	@RequestMapping(value = "contry/findById")
	@ResponseBody
	public Optional<Contry> getContriesById(Integer id){
		return contryService.getContriesById(id);
	}
	
	@RequestMapping(value = "/contry/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String updateContry(Contry contry) {
		contryService.saveContry(contry);
		return "redirect:/contry";
	}
	
	@RequestMapping(value = "/contry/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
	public String deleteContry(Integer id) {
		contryService.deleteContry(id);
		return "redirect:/contry";
	}
}
