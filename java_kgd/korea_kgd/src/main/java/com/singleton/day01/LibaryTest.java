package com.singleton.day01;

public class LibaryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libary li = Libary.getlibary();
		for (int i = 0; i < 1000; i++) {
			Book book = new Book("");
			li.addBook(book);
		}
		li.getBook(199);
	}

}
