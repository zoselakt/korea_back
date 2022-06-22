package com.mod.mod005;

public class Array {

	public static void main(String[] args) {
		double [][] temp = new double[10][365];
		
		for(int i=0; i<temp.length; i++) {
			for(int j=0; j<temp[i].length; j++) {
				System.out.println(temp[i][j]);
			}
		}
		
	}
}
