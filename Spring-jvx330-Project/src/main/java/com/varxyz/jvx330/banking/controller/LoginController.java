package com.varxyz.jvx330.banking.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("banking.controller.loginController")
public class LoginController {
	@GetMapping("banking/loginForm")
	public String loginForm() {
		return "banking/loginForm";
	}
	
	@PostMapping("banking/loginForm")
	public ModelAndView login(HttpServletRequest request) {
		String customerid = request.getParameter("customerid");
		String password = request.getParameter("password");
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("customerid", customerid);
		mav.addObject("password", password);
		mav.setViewName("banking/main");
		return mav;
	}
}
