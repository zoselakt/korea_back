package com.mod.mod008;

public class Employee {
	private String name;
	private double salary;
	private MyDate birthDate;
	
	public String getDetails() {
		return "name: " + name + "\n Salary: " + salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public MyDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(MyDate birthDate) {
		this.birthDate = birthDate;
	}

	public boolean equals(Object obj) {
		// instanceof는 객체타입을 확인하는 연산자 / obj와 Employee와 비교
		if(obj instanceof Employee) { // 여기에 맞지 않으면 무조건 리턴false
			Employee e = (Employee) obj;
			if(e.getName().equals(name) && e.getBirthDate().equals(birthDate)) {
				//속성값 비교후 리턴
				return true;
			}
		}
		return false;
	}
}
