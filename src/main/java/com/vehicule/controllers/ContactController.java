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

import com.vehicule.models.Contact;
import com.vehicule.services.ContactService;

@Controller
public class ContactController {
	
	@Autowired private ContactService contactService;
	

	@GetMapping(value = "/contact")
	public String getContact(Model model) {
		model.addAttribute("list_contact", contactService.getContact());
		return "conttact";
	}
	
	@GetMapping("contact/findById/")
	@ResponseBody
	public Optional<Contact> dontactById(Integer id){
		return contactService.getContactById(id);
	}
	
	@PostMapping("contact/add")
	public String save(Contact contact) {
		contactService.saveContact(contact);
		return "redirect:/contact";
	}
	
	@RequestMapping(value = "contact/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(Contact contact) {
		contactService.saveContact(contact);
		return "redirect:/contact";
	}
	
	@RequestMapping(value = "contact/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		contactService.deleteContact(id);
		return "redirect:/contact";
	}
}
