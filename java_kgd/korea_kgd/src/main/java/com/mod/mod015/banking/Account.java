package com.mod.mod015.banking;

import java.util.*;

/**
 * @author Administrator
 */
public class Account {
	protected String aid;
	protected String accountNum;
	protected double balance;
	protected Customer customer;
	protected Date regdate;
	protected char AccountType;
	
	public Account() {
		
	}
	
	public Account(String accountNum, double balance) {
		super();
		this.accountNum = accountNum;
		this.balance = balance;
	}
	
	public String getAid() {
		return aid;
	}
	public void setAid(String aid) {
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
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
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
				+ ", regdate=" + regdate + ", AccountType=" + AccountType + "]";
	}
}
