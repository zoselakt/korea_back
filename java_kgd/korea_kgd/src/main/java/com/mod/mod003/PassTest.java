package com.mod.mod003;

public class PassTest {
	public static void changeInt(int value) {
		value = 55;
	}
	public static void changeObjectRef(MyDate ref) {
		ref = new MyDate(1, 1, 2000);
	}
	public static void changeObjectAttr(MyDate ref) {
		ref.setDay(6);
		ref.setMonth(10);
		ref.setYear(2022);
	}
	public static void main(String[] args) {
		MyDate date;
		MyDate month;
		MyDate year;
		int val;
		
		val = 11; 
		changeInt(val);
		System.out.println("int value is = " + val);
		
		date = new MyDate(20, 5, 1993);
		month = new MyDate(20, 5, 1993);
		year = new MyDate(20, 5, 1993);
		changeObjectRef(date);
		System.out.println("Mydate is = " + date);
		
		changeObjectAttr(date);
		changeObjectAttr(month);
		changeObjectAttr(year);
		System.out.println("Mydate is = " + date);
	}
	
}
