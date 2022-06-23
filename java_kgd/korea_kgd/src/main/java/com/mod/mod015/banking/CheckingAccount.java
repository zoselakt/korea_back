package com.mod.mod015.banking;

public class CheckingAccount extends Account {
	private double overdraftAmount;

	public double getOverdraftAmount() {
		return overdraftAmount;
	}

	public void setOverdraftAmount(double overdraftAmount) {
		this.overdraftAmount = overdraftAmount;
	}

	public void withdraw(double amount) {
		
		if(balance < amount ) {
			throw new InsufficientBalanceException("한도 초과");
		}else {
			balance = balance - amount;
		}
	}

	public CheckingAccount(double overdraftAmount) {
		super();
		this.overdraftAmount = overdraftAmount;
	}

	
}


