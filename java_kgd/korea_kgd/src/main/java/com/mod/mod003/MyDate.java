package com.mod.mod003;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public MyDate(MyDate date) {
		this.day = date.day;
		this.month = date.month;
		this.year = date.year;
	}
	public void setDay(int d) {
		this.day = d;
	}
	public void setMonth(int m) {
		this.month = m;
	}
	public void setYear(int y) {
		this.year = y;
	}
	public String toString() {
		return "day = "+ day +", month = " + month + ", year = " + year;
	}

}
