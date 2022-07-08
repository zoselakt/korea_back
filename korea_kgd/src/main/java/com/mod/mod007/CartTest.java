package com.mod.mod007;

public class CartTest {
	public static void main(String[] args) {
		Cart cart = new Cart();
		cart.addProduct(new NoteBook("ThinkPad"));
		cart.addProduct(new SmartPhone("Galuxy"));
		cart.addProduct(new SmartPhone("Iphone"));
		System.out.println(cart.getProducts().length);
		System.out.println(cart.getDetails());
	}
}
