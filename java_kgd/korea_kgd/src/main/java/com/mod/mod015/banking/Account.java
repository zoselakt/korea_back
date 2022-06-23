package com.mod.mod015.banking;

import java.util.*;

/**
 * @author Administrator
 */
public class Account {
	protected long aid;
	protected String accountNum;
	protected double balance;
	protected Customer customer;
	protected Date regDate;
	protected char AccountType;
	
	public Account() {
		
	}
	
	public Account(String accountNum, double balance) {
		super();
		this.accountNum = accountNum;
		this.balance = balance;
	}
	
	public long getAid() {
		return aid;
	}
	public void setAid(long aid) {
		this.aid = aid;
	}
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public char getAccountType() {
		return AccountType;
	}
	public void setAccountType(char accountType) {
		AccountType = accountType;
	}

	
	@Override
	public String toString() {
		return "Account [aid=" + aid + ", accountNum=" + accountNum + ", balance=" + balance + ", customer=" + customer
				+ ", regdate=" + regDate + ", AccountType=" + AccountType + "]";
	}
}
