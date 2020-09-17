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

import com.vehicule.models.JobTitle;
import com.vehicule.services.JobTitleService;

@Controller
public class JobTitleController {

	@Autowired private JobTitleService jts;
	
	@GetMapping("/job_title")
	public String getEmployeType(Model model) {
		List<JobTitle> list_jt = jts.listJobTitle();
		model.addAttribute("list_jt", list_jt);
		return "job_title";
	}
	
	@GetMapping(value = "job_title/findById")
	@ResponseBody
	public Optional<JobTitle> getById(Integer id){
		return jts.JobTitleById(id);
	}
	
	@PostMapping(value = "job_title/addjt")
	public String saveEmpType(JobTitle et) {
		jts.saveJobTitle(et);
		return "redirect:/job_title";
	}
	
	@RequestMapping(value = "job_title/update", method = {RequestMethod.PUT,RequestMethod.GET})
	public String update(JobTitle et) {
		jts.saveJobTitle(et);
		return "redirect:/job_title";
	}
	
	@RequestMapping(value = "job_title/delete", method = {RequestMethod.DELETE,RequestMethod.GET})
	public String delete(Integer id) {
		jts.deleteJobTitle(id);
		return "redirect:/job_title";
	}
}
