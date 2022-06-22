package com.singleton.day02;

public class Book {
	//싱글톤 객체로 넘겨줄 변수를 작성한다.
	private String bookName;
	private int serial;
	
	// book객체를 초기화한다.
	public Book(String bookName, int serial) {
		this.bookName = bookName;
		this.serial = serial;
	}
	
	//개터를 작성한다.
	public String getBookName() {
		return bookName;
	}
	public String getSerial() {
		return Integer.toString(serial);
	}
}
