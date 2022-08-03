package com.varxyz.jvx330.cafe;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class CafeCommand {
	private long mid;
	private String menuItems;
	private String addOther1;
	private String addOther2;
	private String addOther3;
	private int menuPrice;
	private int menuItemCount;
	
	public CafeCommand(String menuItems, int menuPrice) {
		this.menuItems = menuItems;
		this.menuPrice = menuPrice;
	}
}
