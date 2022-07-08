package com.mod.mod014;

public class Account {
	public static void main(String[] args) {
		Account a1 = new Account("1234", 200.0);
		Account a2 = new Account("3734", 600.0);
		Account a3 = new Account("4934", 800.0);
		Account a4 = new Account("6234", 150.0);
		
		a1.setAccountNum("1000");
		System.out.println(a1.getAccountNum());
		a1.setBalance(2000);
		System.out.println(a1.getBalance());
		a1.deposite(100000);
		System.out.println(a1.getBalance());
		a2.setAccountNum("2000");
	}
	
	//account에는 accountNUm, balance, customer 값이 있다.
	//개터, 새터로 값을 넘긴다.
	
	protected String accountNum;
	protected double balance;
	protected Customer customer;
	
	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void deposite(double amount) {
		this.balance += amount;
	}

	public Account(String accountNum, double balance) {
		this.accountNum = accountNum;
		this.balance = balance;
	}
	
	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}	

	public double getBalance() {
		return balance;
	}
	
}
