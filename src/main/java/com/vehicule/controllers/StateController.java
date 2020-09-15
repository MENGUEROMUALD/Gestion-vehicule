package com.vehicule.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vehicule.models.Contry;
import com.vehicule.models.State;
import com.vehicule.services.ContryService;
import com.vehicule.services.StateService;

@Controller
public class StateController {

	@Autowired
	private StateService stateSerive;
	@Autowired
	private ContryService contryService;
	
	@GetMapping("/state")
	public String getState(Model model) {
		List<State> state = stateSerive.getStates();
		model.addAttribute("stateList", state);	
		
		List<Contry> cont = contryService.getContries();
		model.addAttribute("contries", cont);
		return "state";
	}
	
	@PostMapping(value = "/state/addState")
	public String addState(State state) {
		stateSerive.addState(state);
		return "redirect:/state";
	}
	
	@RequestMapping(value = "/state/findById")
	@ResponseBody
	public Optional<State> getStateById(Integer id){
		return stateSerive.getStateById(id);
	}
	
	@RequestMapping(value = "/state/update",method = {RequestMethod.PUT, RequestMethod.GET})
	public String updateState(State state) {
		stateSerive.addState(state);
		return "redirect:/state";
	}
	
	@RequestMapping(value = "/state/delete",method = {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		stateSerive.deleteState(id);
		return "redirect:/state";
	}
}
