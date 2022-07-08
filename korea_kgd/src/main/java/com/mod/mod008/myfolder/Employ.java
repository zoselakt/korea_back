package com.mod.mod008.myfolder;

public class Employ {
	private String name;
	private double salary;
	private DateMy dateMy;
	
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

	public DateMy getMydate() {
		return dateMy;
	}

	public void setMydate(DateMy dateMy) {
		this.dateMy = dateMy;
	}
	
	public boolean equals(Object o) {
		if(o instanceof Employ) {
			Employ e = (Employ) o;
			if(e.getName().equals(name) && e.getMydate().equals(dateMy)) {
				return true;
			}
		}
		return false;
	}	
}
