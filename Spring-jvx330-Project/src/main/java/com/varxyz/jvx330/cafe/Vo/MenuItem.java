package com.varxyz.jvx330.cafe.Vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class MenuItem {
	private long mid;
	private MenuCategory cid;
	private String menuItems;
	private String addOther;
	private String addOther1;
	private String addOther2;
	private String addOther3;
	private int menuPrice;
	private int menuItemCount;
	
	public MenuItem(String menuItems, int menuPrice) {
		this.menuItems = menuItems;
		this.menuPrice = menuPrice;
	}
}
