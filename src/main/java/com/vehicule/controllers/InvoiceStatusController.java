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

import com.vehicule.models.InvoiceStatus;
import com.vehicule.services.InvoiceStatusService;

@Controller
public class InvoiceStatusController {
	
	@Autowired private InvoiceStatusService iss;

	@GetMapping("/invoice_status")
	public String getInvoiceStatus(Model model) {
		List<InvoiceStatus> invoiceStatus = iss.listInvoiceStatut();
		model.addAttribute("list_instat", invoiceStatus);
		return "invoice_statut";
	}
	
	@GetMapping(value = "invoice_status/findById")
	@ResponseBody
	public Optional<InvoiceStatus> getInvoiceById(Integer id){
		return iss.InvoiceById(id);
	}
	
	@PostMapping(value = "invoice_status/addis")
	public String save(InvoiceStatus is) {
		iss.saveInvoiceStatus(is);
		return "redirect:/invoice_status";
	}
	
	@RequestMapping(value = "invoice_status/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(InvoiceStatus is) {
		iss.saveInvoiceStatus(is);
		return "redirect:/invoice_status";
	}
	
	@RequestMapping(value = "invoice_status/delete", method = {RequestMethod.DELETE,RequestMethod.GET})
	public String delete(Integer id) {
		iss.deleteInvoiceStatus(id);
		return "redirect:/invoice_status";
	}
}
