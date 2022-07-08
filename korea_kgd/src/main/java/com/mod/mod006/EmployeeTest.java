package com.mod.mod006;

import com.mod.mod008.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("유비");
		System.out.println(e.getName());
		
		Manager m = new Manager();
		m.setDepartment("UAV Operator");
		System.out.println(m.getDepartment());
		System.out.println(m.getDetails());
		System.out.println("=======================");
		
		String detail = e.getDetails();
		System.out.println(detail);
		
		System.out.println("=======================");
		
		e.setSalary(10000.0);
		System.out.println(e.getSalary());
		
//		e.setBirthDate(new Date());
//		System.out.println(e.getBirthDate());
//		
//		System.out.println("=======================");
//		
//		Director d = new Director();
//		d.setName("여포");
//		System.out.println(d.getName());
	}
}
