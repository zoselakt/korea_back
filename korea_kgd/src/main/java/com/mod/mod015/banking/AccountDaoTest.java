package com.mod.mod015.banking;

import java.util.Date;
/**
 * 
 * @author ksd49
 *
 *
 */
public class AccountDaoTest {
	public static void main(String[] args) {
		//값을 담을 dao객체
		AccountDao dao = new AccountDao();
		
		//SavingAccount는 Account를상속 받아 현재 계좌정보를 담고있음.
		SavingsAccount sa = new SavingsAccount();
		sa.setAccountNum("122-33-210");
		sa.setBalance(45000.0);
		sa.setCustomer(new Customer(1003));
		sa.setInterestRate(0.04);
		sa.setRegDate(new Date());
		sa.setAccountType('s');
		
		//Savingaccount의 값을 dao 담는다.
		dao.addAccount(sa);
		
		// account객체와 dao객체의 값을 반복문으로 비교 해당하는 값이있는지 체크
		for(Account account : dao.findAccountsBySsn("123456-1234567")) {
			System.out.println(account);
		}
	}
}
