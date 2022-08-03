package com.varxyz.jvx330.cafe.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.varxyz.jvx330.cafe.CafeCommand;
import com.varxyz.jvx330.cafe.MenuItem;
import com.varxyz.jvx330.cafe.service.CafeServiceImpl;

@Controller
public class DeleteFormController {
	private CafeServiceImpl cafeServiceImpl;
	
	@Autowired
	public DeleteFormController(CafeServiceImpl cafeServiceImpl) {
		this.cafeServiceImpl = cafeServiceImpl;
	}
	
	@GetMapping("cafe/DeleteMenuForm")
	public String deleteForm(MenuItem menuItem, Model model) {
		model.addAttribute("MenuItem", menuItem);
		return "cafe/DeleteMenuForm";
	}
	
	@PostMapping("cafe/DeleteMenuForm")
	public String deleteMenuForm(@ModelAttribute("MenuItem") MenuItem menuItem, @ModelAttribute("command")CafeCommand command,
			HttpSession session, Model model, HttpServletRequest request) {
		
		long midDelete = Long.parseLong(request.getParameter("midDelete"));
		request.setAttribute("midDelete", midDelete);
		
		long midset = command.getMid();
		menuItem.setMid(midset);
		
		session.setAttribute("MenuItem", menuItem);
		
		model.addAttribute("MenuItem", menuItem);
		cafeServiceImpl.deleteMenu(menuItem, midDelete);
		System.out.println(midDelete);
		return "cafe/mainForm";
	}
}
