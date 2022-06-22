package com.mod.mod004;

public class Sosu {
	public static void main(String[] args) {
		int num = 0;
			for(int i=2; i<=1000; i++) {
				for(int j=2; j<=i; j++) {
					if(i == j) {
						++num;
					}else if(i % j == 0) {
						break;
					}
				}
				System.out.println(num);
			}
		
		
	}
}
