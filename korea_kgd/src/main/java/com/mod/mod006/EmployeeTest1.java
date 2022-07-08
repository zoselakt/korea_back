package com.mod.mod006;

public class EmployeeTest1 {
	public static void main(String[] args) {
		Employee1 employee1 = new Employee1("kim", "kimgd");
		Manager1 manager1 = new Manager1();
		
		System.out.println(employee1.getId());
		System.out.println(employee1.getName());
		employee1.getId();
		employee1.getName();
		
		manager1.setName("유비");
		manager1.setPw("1234");
		System.out.println(manager1.getName());
	}
}
