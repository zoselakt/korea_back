package com.mod.mod009.domain;

public class SavingsAccount extends Account {
	private double interestRate;
	
	public void withdraw(double amount) {
		if(balance - amount < 0) {
			//출금할 금액이 통장에 있는 금액보다 많을때 처리할 예외처리 로직
			throw new InsufficientBalanceException("잔고가 부족합니다.");
		}
		super.balance -= amount;
	}
}
