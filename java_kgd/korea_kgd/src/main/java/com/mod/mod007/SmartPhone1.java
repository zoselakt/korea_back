package com.mod.mod007;

public class SmartPhone1 extends Product1{
	private boolean apple = false;
	
	public SmartPhone1(String name) {
		super(name);
		
		if(getName().startsWith("Apple")) {
			apple = true;
		}
	}
	public double getPrice() {
		if(apple) {
			return 1500.0;
		}else {
			return 1000.0;
		}
	}
	public String getPlatform() {
		if(apple) {
			return "apple";
		}else {
			return "Android";
		}
	}
}
