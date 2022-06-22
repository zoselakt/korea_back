package com.mod.mod007;

public class Tablet extends Product{
	private boolean ipad = false;
	
	public Tablet(String name) {
		super(name);
		if(getName().startsWith("ipad")) {
			ipad = true;
		}
	}
	public double getPrice() {
		if(ipad) {
			return 6000.0;
		}else {
			return 7500.0;
		}
	}
	public String getPlatform() {
		if(ipad) {
			return "ipad";
		}else {
			return "ipot";
		}
	}
}
