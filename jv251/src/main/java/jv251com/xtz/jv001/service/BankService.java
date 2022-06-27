package jv251com.xtz.jv001.service;

import java.util.List;

import jv251com.xtz.jv001.dao.AccountDao;
import jv251com.xtz.jv001.dao.CustomerDao;
import jv251com.xtz.jv001.domain.Account;
import jv251com.xtz.jv001.domain.CheckingAccount;
import jv251com.xtz.jv001.domain.Customer;
import jv251com.xtz.jv001.domain.SavingsAccount;
import jv251com.xtz.jv001.exception.CustomerNotFoundException;
import jv251com.xtz.jv001.exception.DuplicatedEntityException;
import jv251com.xtz.jv001.exception.EntityNotFountException;

public class BankService {
	private static final BankService service = new BankService();
	public static final char SA = 'S';
	public static final char CA = 'C';
	
	public static final double DEFAULT_INTEREST_RATE = 0.03;
	public static final double DEFAULT_OVERDRAFT_AMOUNT = 1000.0;
	
	private CustomerService customerService;
	private AccountService accountService;
	
	private BankService() {
		init();
	}
	
	
	public void init() {
		customerService = new CustomerService(new CustomerDao());
		accountService = new AccountService(new AccountDao());
	}
	
	public static BankService getInstance() {
		return service;
	}
	
	public void addCustomer(String name, String ssn, String phone, String userId, String passwd) {
		if(!isCustomer(ssn)) {
			customerService.addCustomer(customerService.createCustomer(name, ssn, phone, userId, passwd));
		}else {
			throw new DuplicatedEntityException(ssn + " is Duplicated...");
		}
	}
	
	public Customer getCustomerBySsn(String ssn) {
		return customerService.getCustomerBySsn(ssn);
	}
	public List<Customer> getAllCustoemrs(){
		return customerService.getAllCustomers();
	}
	
	public void addSavingsAccount(double balance, double interestRate, String ssn) 
												throws EntityNotFountException {
		SavingsAccount account = new SavingsAccount();
		account.setAccountNum(accountService.generateAccountNum());
		account.setBalance(balance);
		account.setAccountType(BankService.SA);
		account.setInterestRate(interestRate);
		Customer customer = customerService.getCustomerBySsn(ssn);
		if(customer != null) {
			account.setCustomer(customer);
			accountService.addAccount(account);
		}else {
			throw new CustomerNotFoundException(ssn + "Not Fount");
		}
	}
	public void addCheckingAccount(double balance, double overdraftAmount, String ssn) throws CustomerNotFoundException{
		CheckingAccount account = new CheckingAccount();
		account.setAccountNum(accountService.generateAccountNum());
		account.setBalance(balance);
		account.setAccountType(BankService.SA);
		account.setOverdraftAmount(overdraftAmount);
		
		Customer customer = customerService.getCustomerBySsn(ssn);
		if(customer != null) {
			account.setCustomer(customer);	
			accountService.addAccount(account);
		}else {
			throw new CustomerNotFoundException(ssn + "Not Fount");
		}
	}
	public boolean isCustomer(String ssn) {
		return customerService.getCustomerBySsn(ssn) == null ? false : true;
	}
	public List<Account> getAccountsBySsn(String ssn){
		return accountService.getAccountsBySsn(ssn);
	}
}
