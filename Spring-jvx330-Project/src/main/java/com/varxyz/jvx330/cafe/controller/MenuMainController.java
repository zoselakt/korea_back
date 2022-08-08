package com.varxyz.jvx330.cafe.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.varxyz.jvx330.cafe.Vo.MenuItem;

@Controller("cafe.controller.MenuMainController")
public class MenuMainController {
	@GetMapping("cafe/menuMainForm")
	public String menuMain(Model model, MenuItem menuItem, HttpServletRequest request, HttpSession session) {
		model.addAttribute(menuItem);
		return "cafe/menuMainForm";
	}
	@PostMapping("cafe/menuMainForm")
	public String menuMainForm(Model model, MenuItem menuItem, HttpServletRequest request, HttpSession session) {
		model.addAttribute(menuItem);
		return "cafe/success/success_add_menu";
	}
}
