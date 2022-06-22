package com.singleton.day01;

public class Libary {
	private static int bookCount = 100;
	private static String[] bookInfo = new String[bookCount-1];
	private static Libary libary = new Libary();
	
	private Libary() {
	}
	
	public static Libary getlibary() {
		return libary;
	}
	
	public void addBook(Book book) {
		if (book.bookNum == bookCount) {
			bookCount *= 2;
			String[] copy = bookInfo;
			bookInfo = new String[bookCount - 1];
			System.arraycopy(bookInfo, 0, copy, 0, copy.length-1 );
		}
		bookInfo[book.getSerial() - 1] = book.getTitle();
	}
	
	public void getBook(int serial) {
		System.out.println(bookInfo[serial-1]);
	}
}
