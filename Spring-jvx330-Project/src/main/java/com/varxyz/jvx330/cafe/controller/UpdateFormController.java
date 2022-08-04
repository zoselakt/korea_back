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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.varxyz.jvx330.cafe.CafeCommand;
import com.varxyz.jvx330.cafe.CafeProvider;
import com.varxyz.jvx330.cafe.MenuItem;
import com.varxyz.jvx330.cafe.service.CafeServiceImpl;

@Controller("cafe.controller.updateFormController")
public class UpdateFormController {
	private CafeServiceImpl cafeServiceImpl;
	
	@Autowired
	public UpdateFormController(CafeServiceImpl cafeServiceImpl) {
		this.cafeServiceImpl = cafeServiceImpl;
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
	
	@GetMapping("cafe/UpdateMenuForm")
	public String updateForm(MenuItem menuItem, HttpSession session, Model model, 
			@ModelAttribute("command")CafeCommand command, HttpServletRequest request) {
		
//		long midInput = Long.parseLong(request.getParameter("allItem"));
//		request.setAttribute("midInput", midInput);
//		
//		long updateMenu = cafeServiceImpl.updateMenu(menuItem, midInput);
//		request.setAttribute("updateMenu", updateMenu);
		String menu = command.getMenuItems();
		menuItem.setMenuItems(menu);
		
		model.addAttribute("MenuItem", menuItem);
		return "cafe/UpdateMenuForm";
	}
	
	@PostMapping("cafe/UpdateMenuForm")
	public String updateMenuForm(@ModelAttribute("MenuItem") MenuItem menuItem, @ModelAttribute("command")CafeCommand command,
			HttpSession session, Model model, HttpServletRequest request) {
		
		long midInput = Long.parseLong(request.getParameter("midInput"));
		request.setAttribute("midInput", midInput);
		
		String menu = command.getMenuItems();
		String other1 = command.getAddOther1();
		String other2 = command.getAddOther2();
		String other3 = command.getAddOther3();
		int price = command.getMenuPrice();
		
		menuItem.setMenuItems(menu);
		menuItem.setMenuPrice(price);
		menuItem.setAddOther1(other1);
		menuItem.setAddOther2(other2);
		menuItem.setAddOther3(other3);
		
		session.setAttribute("MenuItem", menuItem);
		
		model.addAttribute("MenuItem", menuItem);
		cafeServiceImpl.updateMenu(menuItem, midInput);
		System.out.println(midInput);
		return "cafe/success_update_menu";
	}
}
