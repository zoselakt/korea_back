package com.varxyz.jvx330.cafe.controller;

import java.net.http.HttpRequest;
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

import com.varxyz.jvx330.cafe.CafeCommand;
import com.varxyz.jvx330.cafe.CafeProvider;
import com.varxyz.jvx330.cafe.MenuItem;
import com.varxyz.jvx330.cafe.service.CafeServiceImpl;

@Controller("cafe.controller.menuItemController")
public class MenuItemController {
	private CafeServiceImpl cafeServiceImpl;
	
	@Autowired
	public MenuItemController(CafeServiceImpl cafeServiceImpl) {
		this.cafeServiceImpl = cafeServiceImpl;
	}
	
	@GetMapping("cafe/AddMenuForm")
	public String menuItem(Model model, MenuItem menuItem, HttpServletRequest request, HttpSession session) {
		List<MenuItem> itemList = cafeServiceImpl.findAllOrderedMenuItems();			
		request.setAttribute("itemList", itemList);
		
		session.setAttribute("itemList", itemList);
		cafeServiceImpl.insertMenu(menuItem);
		
		model.addAttribute("MenuItem", menuItem);
		return "cafe/success_add_menu";
	}
	
	@ModelAttribute("cafeItemList")
	public List<CafeProvider> getMenuItemList(){
		List<CafeProvider> list = new ArrayList<CafeProvider>(); 
		list.add(new CafeProvider(1500, "coffee"));
		list.add(new CafeProvider(2500, "coldBrew"));
		list.add(new CafeProvider(2000, "latte"));
		list.add(new CafeProvider(2500, "smoothie"));
		list.add(new CafeProvider(3000, "fraffe"));
		return list;
	}
	@ModelAttribute("otherList")
	public List<String> getOtherList(){
		List<String> list = new ArrayList<String>();
		list.add("아이스추가");
		list.add("휘핑추가");
		list.add("샷추가");
		list.add("버블추가");
		list.add("디카페인");
		return list;
	}
	
	@PostMapping("cafe/AddMenuForm")
	public String menuItemForm(@ModelAttribute("MenuItem") MenuItem menuItem,
		HttpServletRequest request, HttpSession session, Model model) {
		List<MenuItem> itemList = cafeServiceImpl.findAllOrderedMenuItems();
		request.setAttribute("itemList", itemList);
	
		model.addAttribute("MenuItem", menuItem);
		session.setAttribute("MenuItem", menuItem);
		cafeServiceImpl.insertMenu(menuItem);
		
		return "cafe/success_add_menu";
	}
}