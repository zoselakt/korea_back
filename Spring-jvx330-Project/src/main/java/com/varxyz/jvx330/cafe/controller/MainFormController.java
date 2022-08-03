package com.varxyz.jvx330.cafe.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.varxyz.jvx330.cafe.MenuItem;
import com.varxyz.jvx330.cafe.service.CafeServiceImpl;

@Controller("cafe.controller.MainFormController")
public class MainFormController {
	private CafeServiceImpl cafeServiceImpl;
	
	@Autowired
	public MainFormController(CafeServiceImpl cafeServiceImpl) {
		this.cafeServiceImpl = cafeServiceImpl;
	}
	
	@GetMapping("cafe/mainForm")
	public String mainForm(MenuItem menuItem, Model model, HttpServletRequest request, HttpSession session) {
		List<MenuItem> oneitem = cafeServiceImpl.findAllOrderedMenuItemsByMenuItems(menuItem.getMenuItems());
		request.setAttribute("oneitem", oneitem);
		
		session.getAttribute("oneitem");
		model.addAttribute("MenuItem", menuItem);
		System.out.println(oneitem);
		return "cafe/mainForm";
	}
	@PostMapping("cafe/mainForm")
	
	public String cafeMainForm(@ModelAttribute("MenuItem") MenuItem menuItem, Model model, HttpSession session, HttpServletRequest request) {
		List<MenuItem> oneitem = cafeServiceImpl.findAllOrderedMenuItemsByMenuItems(menuItem.getMenuItems());
		request.setAttribute("oneitem", oneitem);
		
		session.getAttribute("oneitem");
		model.addAttribute("menuItem", menuItem);
		System.out.println(oneitem);
		return "cafe/mainForm";
	}
}
