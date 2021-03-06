package com.mod.mod009;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeNumberException{
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		try {
			isPrime(sc.nextInt());				
		} catch (InputMismatchException ime) {
			System.out.println("입력된 값이 잘못되었습니다.");
		} catch (ArithmeticException ae) {
			System.out.println("0으로 나눌수 없습니다..");
		} catch (Exception e) {
			System.out.println("예외발생");
		}
	}
	public static void isPrime(int number) throws NumberFormatException{
//		if(number < 2) {
//			throw new RuntimeException("1보다 작은수는 계산이 불가능합니다.");
//		}
		if(number == 1) {
			System.out.println("소수가 아닙니다.");
			return;
		}
		if(number == 2) {
			System.out.println("소수입니다.");
		}
		for(int i=2; i<number; i++) {
			if(number % i == 0) {
				System.out.println("소수가 아닙니다.");
				return;
			}
		}
		System.out.println("소수입니다.");
		return;
		
	}
}