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

import com.vehicule.models.Client;
import com.vehicule.models.Invoice;
import com.vehicule.models.InvoiceStatus;
import com.vehicule.services.ClientService;
import com.vehicule.services.InvoiceService;
import com.vehicule.services.InvoiceStatusService;

@Controller
public class InvoiceController {

	@Autowired private InvoiceService invoiceService;
	@Autowired private ClientService clienService;
	@Autowired private InvoiceStatusService invoiceStatusService;
	
	@GetMapping("/invoice")
	public String getInvoice(Model model) {
		List<Invoice> list_invoice = invoiceService.listInvoice();
		model.addAttribute("list_invoice", list_invoice);
		
		List<InvoiceStatus> list_instat = invoiceStatusService.listInvoiceStatut();
		model.addAttribute("list_instat", list_instat);
		
		List<Client> list_client = clienService.getClient();
		model.addAttribute("list_client", list_client);
		
		return "invoice";
	}
	
	@GetMapping(value = "invoice/findById")
	@ResponseBody
	public Optional<Invoice> findById(Integer id){
		return invoiceService.InvoiceById(id);
	}
	
	@PostMapping(value = "invoice/add")
	public String save(Invoice invoice) {
		invoiceService.saveInvoice(invoice);
		return "redirec:/invoice";
	}
	
	@RequestMapping(value = "invoice/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(Invoice invoice) {
		invoiceService.saveInvoice(invoice);
		return "redirec:/invoice";
	}
	
	@RequestMapping(value = "invoice/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		invoiceService.deleteInvoice(id);
		return "redirec:/invoice";
	}
}
