package com.mod.mod009.domain;

public class CheckingAccount extends Account {
	private double overdraftAmount;
	
	public void withdrow(double amount) {
		if(balance < amount) {
			// 잔고부족시 overdraftAmount 금액 한도내에서 추가 출금을 승인하는 코드
			overdraftAmount = 10000;
			balance += overdraftAmount;
		}else {
			balance -= amount;
		}
	}
}
