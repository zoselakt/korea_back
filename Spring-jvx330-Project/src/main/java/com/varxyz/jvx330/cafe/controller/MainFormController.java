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
		List<MenuItem> allItem = cafeServiceImpl.findAllOrderedMenuItems();
		request.setAttribute("allItem", allItem);
		
		session.getAttribute("oneitem");
		model.addAttribute("MenuItem", menuItem);
		System.out.println(allItem);
		return "cafe/mainForm";
	}
	
	@PostMapping("cafe/mainForm")
	public String cafeMainForm( MenuItem menuItem, HttpServletRequest request, Model model) {
		System.out.println(request.getParameter("midOne"));
		
		long midOne = Long.parseLong(request.getParameter("midOne"));
		request.setAttribute("midOne", midOne);
		
		MenuItem oneItem = cafeServiceImpl.findAllOrderedMenuItemsByMenuItems(midOne);
		request.setAttribute("oneItem", oneItem);
		
		model.addAttribute("MenuItem", menuItem);
		return "cafe/FindMenuItems";
	}
}
