package com.varxyz.jvx330.banking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.varxyz.jvx330.banking.CustomerDao;
import com.varxyz.jvx330.banking.Service.BankingService;
import com.varxyz.jvx330.banking.Service.BankingServiceimpl;
import com.varxyz.jvx330.banking.bean.Customer;

@Controller("banking.controller.addCustomerController")
public class AddCustomerController {
	CustomerDao dao = new CustomerDao();
	Customer customer = new Customer();
	
	private BankingServiceimpl bankingServiceimpl;
	
	@Autowired
	public AddCustomerController(BankingServiceimpl bankingServiceimpl) {
		this.bankingServiceimpl = bankingServiceimpl;
	}
	
	@GetMapping("banking/addCustomerForm")
	public String addCustomerForm() {
		return "banking/addCustomerForm";
	}
	
	@PostMapping("banking/addCustomerForm")
	public String addCustomer(Customer customer,Model model) {
		model.addAttribute(customer);
		System.out.println(customer.getCustomerid());
		bankingServiceimpl.addCustomer(customer);
		return "banking/loginForm";
	}

}