package com.mod.mod007;

public class CartTest1 {
	public static void main(String[] args) {
		Cart1 cart1 = new Cart1();
		
		cart1.addProduct(new NoteBook1("삼성"));
		cart1.addProduct(new SmartPhone1("apple"));
		cart1.addProduct(new NoteBook1("LG"));
		cart1.addProduct(new SmartPhone1("ANDROID"));
		
	}
}
