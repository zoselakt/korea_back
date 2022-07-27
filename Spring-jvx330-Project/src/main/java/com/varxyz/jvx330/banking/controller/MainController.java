package com.varxyz.jvx330.banking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.varxyz.jvx330.banking.bean.Customer;

@Controller("banking.controller.mainController")
public class MainController {
	@GetMapping("banking/main")
	public String mainForm() {
		return "banking/main";
	}
	@PostMapping("banking/main")
	public String Formmain(Customer customer, Model model) {
		model.addAttribute("customer", customer);
		return "banking/main";
	}
}
