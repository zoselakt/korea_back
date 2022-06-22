package com.mod.mod006;

import com.mod.mod008.Employee;

public class Manager extends Employee {
	private String department;
	
	//Overriding
	public String getDetails() {
		return super.getDetails()+"\n Department: "+ department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
