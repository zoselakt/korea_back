package com.varxyz.banking;

import java.util.*;

public class AccountServiceImpl implements AccountService{
	//일정한 값으로 accountserviceimpl값을 받아오는 변수
	private static AccountService service = new AccountServiceImpl();
	
	// 배열을 기반으로 데이터를 저장 
	private List<Account> accountList = new ArrayList<Account>();
	
	// CustomerService객체 생성
	private CustomerService customerService;
	
	//
	public AccountServiceImpl() {
		customerService = CustomerServiceImpl.getInstance();
	}
	public static AccountService getInstance() {
		return service;
	}
	
	public Account createSavingsAccount(String accountNum, double balance, double interestRate) {		
		return new SavingsAccount(accountNum, balance, interestRate);
	}
	
	public Account createCheckingAccount(String accountNum, double balance, double overdraftAmount) {
		return new CheckingAccount(accountNum, balance, overdraftAmount);
	}
	
	/**
	 * 신규계좌등록 
	 * @param account   계좌정보와 고객정보 전체를 캡슐화
	 */
	
	public void addAccount(Account account) {
		accountList.add(account);
	}
	
	/**
	 * 전달할 ssn을 통해 고객을 조회한 후 신규 꼐좌 등록
	 * @param account
	 * @param ssn
	 */
	
	public void addAccount(Account account, String ssn) {
		Customer customer = customerService.getCustomerBySsn(ssn);
		account.setCustomer(customer);
	}
	
	public List<Account> getAccountBySsn(String ssn) {
		//주민번호에 해당하는 계좌가 나오게 구현해야하는 영역
		Customer customer = customerService.getCustomerBySsn(ssn);
		return customer.getAccountList();
		// customer.getAccountList()의 자료형이 List<Account>기 때문에 List<Account> 자료형으로 통일.		

	}
	
	public Account getAccountByAccountNum(String accountNum) {
		for(Account c : accountList) {
			if(accountNum.equals(c.getAccountNum())) {
				return c;
			}
		}
		return null;
	}
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}
	public Customer getCustomerBySsn(String ssn) {
		// TODO Auto-generated method stub
		return null;
	}
	public Collection<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}
	public int getNumofCustomers() {
		// TODO Auto-generated method stub
		return 0;
	}
}
