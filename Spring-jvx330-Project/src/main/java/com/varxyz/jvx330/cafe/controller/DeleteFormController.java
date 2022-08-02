package com.varxyz.jvx330.cafe.controller;

import java.util.ArrayList;
import java.util.List;

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
		model.addAttribute(menuItem);
		return "cafe/DeleteMenuForm";
	}
	@ModelAttribute("deleteList")
	public List<String> getMenuItemList(){
		List<String> list = new ArrayList<String>();
		list.add("아이스추가");
		list.add("휘핑추가");
		list.add("샷추가");
		list.add("버블추가");
		list.add("디카페인");
		return null;
	}
	
	@PostMapping("cafe/DeleteMenuForm")
	public String deleteMenuForm(@ModelAttribute("MenuItem") MenuItem menuItem, Model model) {
		cafeServiceImpl.deleteMenu(menuItem.getMid());
		CafeCommand command = new CafeCommand();
		
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
		model.addAttribute("MenuItem", menuItem);
		return "cafe/mainForm";
	}
}
