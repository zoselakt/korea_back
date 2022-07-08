package com.mod.mod011;

public class AddArguments3 {
	public static void main(String[] args) {
		int sum = 0;
		for(String arg : args) {
			try {
				sum += Integer.parseInt(arg);
			} catch (NumberFormatException nfe) {
				System.err.println("One of the command-line" + "arguments is not an integer.");
			}
		}
		System.out.println("sum = "+ sum);
	}
}
