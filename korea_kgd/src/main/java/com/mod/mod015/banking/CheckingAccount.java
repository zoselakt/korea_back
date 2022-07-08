package com.mod.mod015.banking;

public class CheckingAccount extends Account {
	private double overdraftAmount;
	
	//기본생성자
	public CheckingAccount() {}

	//개터
	public double getOverdraftAmount() {
		return overdraftAmount;
	}
	//새터
	public void setOverdraftAmount(double overdraftAmount) {
		this.overdraftAmount = overdraftAmount;
	}

	//초과시경고
	public void withdraw(double amount) {
		if(balance < amount ) {
			throw new InsufficientBalanceException("한도 초과");
		}else {
			balance = balance - amount;
		}
	}

	// 생성자, Account상속받음
	public CheckingAccount(double overdraftAmount) {
		super();
		this.overdraftAmount = overdraftAmount;
	}

	
}


