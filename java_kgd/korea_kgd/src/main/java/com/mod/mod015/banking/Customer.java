package com.mod.mod015.banking;

import java.util.*;

public class Customer {
	private long cid;
	private String name;
	public long getCid() {
		return cid;
	}
	private String ssn;
	private String phone;
	private String customerID;
	private String password;
	private List<Account> accountList;
	
	public Customer() {
		
	}
	
	public Customer(long cid) {
		this.cid = cid;
	}
	public Customer(String name, String ssn, String phone) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Account> getAccountList() {		
		return accountList;
	}
	public void setAccountList(List<Account> accountList) {
		this.accountList = accountList;
	}
	@Override
	public String toString() {
		return "name:" + name + "/" + "ssn:" + ssn + "/" + "phone:"
				+ phone + "/" + "customerID:" + customerID;
	}
	public void setCid(long long1) {
		// TODO Auto-generated method stub
		
	}

}

