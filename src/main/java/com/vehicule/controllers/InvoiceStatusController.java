package com.vehicule.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InvoiceStatusController {

	@GetMapping("/invoice_status")
	public String getInvoiceStatus() {
		return "invoice_statut";
	}
}
