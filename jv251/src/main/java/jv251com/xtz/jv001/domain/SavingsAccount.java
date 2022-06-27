package jv251com.xtz.jv001.domain;

import jv251com.xtz.jv001.exception.InsufficientBalanceException;

/**
 * 
 * @author ksd49
 * 현재계좌 정보를 담고있는 클래스 / Account를 상속받고 있음
 *
 */
public class SavingsAccount extends Account {
	private double interestRate;
	
	//기본생성자
	public SavingsAccount() {
		
	}
	
	// accountNum와 balance로 증가율
	public SavingsAccount(String accountNum, double balance) {
		this(accountNum, balance, 0.0);
	}
	
	//account 값 생성자
	public SavingsAccount(String accountNum, double balance, double interestRate) {
		super(accountNum, balance);
		this.interestRate = interestRate;
	}
	
	//잔고부족시 경고
	public void withdraw(double amount) {
		if(balance - amount < 0 ) {
			throw new InsufficientBalanceException("잔고 부족");
		}
		super.balance -= amount;
	}

	//개터
	public double getInterestRate() {
		return interestRate;
	}

	//새터
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}


}
