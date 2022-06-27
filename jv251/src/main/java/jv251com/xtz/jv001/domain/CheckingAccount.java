package jv251com.xtz.jv001.domain;

import jv251com.xtz.jv001.exception.OverdraftException;

public class CheckingAccount extends Account {
	private double overdraftAmount;
	
	//기본생성자
	public CheckingAccount() {}
	
	// 생성자, Account상속받음
	public CheckingAccount(double overdraftAmount) {
		super();
		this.overdraftAmount = overdraftAmount;
	}

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
			double overdraftNeeded = amount - balance;
			if(overdraftAmount < overdraftNeeded) {
				throw new OverdraftException("Error : 대출금 초과", balance, overdraftNeeded);
			}else{
				balance = overdraftNeeded *- 1.0;
				overdraftAmount = overdraftAmount - overdraftNeeded;
			}
		}else {
			balance = balance - amount;
		}
	}	
}


