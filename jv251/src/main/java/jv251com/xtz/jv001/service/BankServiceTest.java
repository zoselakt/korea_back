package jv251com.xtz.jv001.service;

import java.util.List;

import jv251com.xtz.jv001.domain.Account;
import jv251com.xtz.jv001.domain.Customer;
import jv251com.xtz.jv001.exception.CustomerNotFoundException;
import jv251com.xtz.jv001.exception.EntityNotFountException;

public class BankServiceTest {
	public static void main(String[] args) {
		BankService service = BankService.getInstance();
		String name = "동탁";
		String ssn = "880123-1234567";
		String phone = "010-4434-3232";
		String userId = "framework";
		String passwd = "1111";
		service.addCustomer(name, ssn, phone, userId, passwd);
		
		//1. 신규고객 등록
		service.addCustomer(name, ssn, phone, userId, passwd);
		try {
			//2. SavingsAccount 생성
			service.addSavingsAccount(7000.0, 0.4, ssn);
		} catch (EntityNotFountException e) {
			e.printStackTrace();
		}
		//3.고객 등록확인
		Customer customer = service.getCustomerBySsn(ssn);
		System.out.println(customer);
		
		//4. 고객 계좌목록 확인
		List<Account> myList = service.getAccountsBySsn(ssn);
		for(Account account : myList) {
			System.out.println(account);
		}
	}
}
