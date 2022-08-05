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

@Controller("cafe.controller.MenuItemController")
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
		model.addAttribute("MenuItem", menuItem);
		return "cafe/AddMenuForm";
	}
	
	@GetMapping("cafe/order/CoffeeForm")
	public String coffeeForm(Model model, MenuItem menuItem, HttpServletRequest request, HttpSession session) {
		model.addAttribute("MenuItem", menuItem);
		return "cafe/order/CoffeeForm";
	}
	@GetMapping("cafe/order/JuiceForm")
	public String juiceForm(Model model, MenuItem menuItem, HttpServletRequest request, HttpSession session) {
		model.addAttribute("MenuItem", menuItem);
		return "cafe/order/JuiceForm";
	}
	@GetMapping("cafe/order/DessertForm")
	public String dessertForm(Model model, MenuItem menuItem, HttpServletRequest request, HttpSession session) {
		model.addAttribute("MenuItem", menuItem);
		return "cafe/order/DessertForm";
	}
	@GetMapping("cafe/order/TeeForm")
	public String teeForm(Model model, MenuItem menuItem, HttpServletRequest request, HttpSession session) {
		model.addAttribute("MenuItem", menuItem);
		return "cafe/order/TeeForm";
	}
	@GetMapping("cafe/order/FrappuForm")
	public String frappuForm(Model model, MenuItem menuItem, HttpServletRequest request, HttpSession session) {
		model.addAttribute("MenuItem", menuItem);
		return "cafe/order/FrappuForm";
	}
	@GetMapping("cafe/order/SmoothieForm")
	public String smoothieForm(Model model, MenuItem menuItem, HttpServletRequest request, HttpSession session) {
		model.addAttribute("MenuItem", menuItem);
		return "cafe/order/SmoothieForm";
	}
	@GetMapping("cafe/order/BreadForm")
	public String BreadForm(Model model, MenuItem menuItem, HttpServletRequest request, HttpSession session) {
		model.addAttribute("MenuItem", menuItem);
		return "cafe/order/BreadForm";
	}
	@GetMapping("cafe/order/BlendForm")
	public String BlendForm(Model model, MenuItem menuItem, HttpServletRequest request, HttpSession session) {
		model.addAttribute("MenuItem", menuItem);
		return "cafe/order/BlendForm";
	}
	@GetMapping("cafe/order/MojitoForm")
	public String MojitoForm(Model model, MenuItem menuItem, HttpServletRequest request, HttpSession session) {
		model.addAttribute("MenuItem", menuItem);
		return "cafe/order/MojitoForm";
	}
	
	@ModelAttribute("itemName")
	public List<String> getMenuList(){
		List<String> list = new ArrayList<String>();
		list.add("아메리카노");
		list.add("카페라떼");
		list.add("카페모카");
		list.add("콜드브루");
		list.add("카라멜마끼아또");
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
		HttpServletRequest request, Model model) {
//		List<MenuItem> itemList = cafeServiceImpl.findAllOrderedMenuItems();
//		request.setAttribute("itemList", itemList);
		
		model.addAttribute("MenuItem", menuItem);
		cafeServiceImpl.insertMenu(menuItem);
		return "cafe/success_add_menu";
	}
}
