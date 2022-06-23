package com.mod.mod006;

public class Employee1 extends Manager1{
	private String id;
	private String phone;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public Employee1(String id, String phone) {
		super();
		this.id = id;
		this.phone = phone;
	}
}
