package com.mod.mod015.banking;

public class SavingsAccount extends Account {
	private static final double DEFAULT_INTEREST_RATE = 0.03;
	private double interestRate;
	
	public SavingsAccount() {
		
	}
	
	public SavingsAccount(String accountNum, double balance) {
		this(accountNum, balance, DEFAULT_INTEREST_RATE);
	}
	
	public SavingsAccount(String accountNum, double balance, double interestRate) {
		super();
		this.interestRate = interestRate;
	}
	
	public void withdraw(double amount) {
		if(balance - amount < 0 ) {
			throw new InsufficientBalanceException("잔고 부족");
		}
		super.balance -= amount;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}


}
