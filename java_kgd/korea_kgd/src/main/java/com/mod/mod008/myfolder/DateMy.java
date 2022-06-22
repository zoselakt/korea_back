package com.mod.mod008.myfolder;

public class DateMy {
	private int day;
	private int month;
	private int year;
	
	public DateMy(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public boolean equals(Object o) {
		if(o instanceof DateMy) {
			DateMy d = (DateMy) o;
			if(d.day == day && d.month == month && d.year == year) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		DateMy d1 = new DateMy(1, 1, 2000);
		DateMy d2 = new DateMy(1, 1, 2000);
		
		boolean flag = d1.equals(d2);
		System.out.println(flag);
	}
}
