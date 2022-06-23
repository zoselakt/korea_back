package com.mod.mod015.banking;

import java.util.Date;

public class AccountDaoTest {

	public static void main(String[] args) {
		AccountDao dao = new AccountDao();
		
		SavingsAccount sa = new SavingsAccount();
		sa.setAccountNum("122-33-210");
		sa.setBalance(45000.0);
		sa.setCustomer(new Customer(1003));
		sa.setInterestRate(0.04);
		sa.setRegDate(new Date());
		sa.setAccountType('s');
		
		dao.addAccount(sa);
		for(Account account : dao.findAccountsBySsn("123456-1234567")) {
			System.out.println(account);
		}
	}
}
