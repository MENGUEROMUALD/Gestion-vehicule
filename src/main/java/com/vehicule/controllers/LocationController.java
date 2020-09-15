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
import com.vehicule.models.Location;
import com.vehicule.models.State;
import com.vehicule.services.ContryService;
import com.vehicule.services.LocationService;
import com.vehicule.services.StateService;

@Controller
public class LocationController {

	@Autowired private LocationService locationService;
	@Autowired private StateService stateService;
	@Autowired private ContryService contryService;
	
	@GetMapping("/location")
	public String getLocation(Model model) {
		List<Location> locate = locationService.getLocation();
		model.addAttribute("locations", locate);
		
		// state
		List<State> stat = stateService.getStates();
		model.addAttribute("state", stat);
		
		//contry
		List<Contry> cont = contryService.getContries();
		model.addAttribute("contries", cont);
		return "location";
	}
	
	@PostMapping(value = "/location/addLocation")
	public String saveLocate(Location locate) {
		locationService.saveLocation(locate);
		return "redirect:/location";
	}
	
	@RequestMapping(value = "/location/findById")
	@ResponseBody
	public Optional<Location> getLocationById(Integer id){
		return locationService.getById(id);
	}
	
	@RequestMapping(value = "/location/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String updateLocation(Location locate) {
		locationService.saveLocation(locate);
		return "redirect:/location";
	}
	
	@RequestMapping(value = "/location/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
	public String deleteLocation(Integer id) {
		locationService.deleteLocation(id);
		return "redirect:/location";
	}	
}
