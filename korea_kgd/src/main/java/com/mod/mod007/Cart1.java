package com.mod.mod007;

public class Cart1 {
	private Product1[] products = new Product1[3];
	
	public void addProduct(Product1 p) {
		for(int i=0; i<products.length; i++) {
			if(products[i] == null) {
				products[i] = p;
				break;
			}
		}
	}
	public Product1[] getProducts() {
		return products;
	}
	public String getDetails() {
		StringBuilder sb = new StringBuilder();
		for(Product1 p : products) {
			sb.append("Name: ");
			sb.append(p.getName());
			sb.append("\n Price: ");
			sb.append(p.getPrice());
			if(p instanceof SmartPhone1) {
				SmartPhone1 s = (SmartPhone1) p;
				sb.append("/n platform: ");
				sb.append(s.getPlatform());
			}
			sb.append("===================");
		}
		return sb.toString();
	}
}
