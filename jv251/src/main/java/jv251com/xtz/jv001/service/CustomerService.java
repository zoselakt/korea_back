package jv251com.xtz.jv001.service;

import java.util.*;

import jv251com.xtz.jv001.dao.CustomerDao;
import jv251com.xtz.jv001.domain.Customer;

public class CustomerService {
	private CustomerDao customerDao;
	
	public CustomerService(CustomerDao customerDao) {

	}
	
	public Customer createCustomer(String name, String ssn, String phone, String userId, String passwd) {
		return new Customer(name, ssn, phone, userId, passwd);
//		Customer c =  new Customer(name, ssn, phone, userId, passwd);
//		c.setUserId(userId);
//		c.setPassword(passwd);
//		return c;
	}
	public void addCustomer(Customer customer) {
		customerDao.addCustomer(customer);
	}
	public Customer getCustomerBySsn(String ssn) {
		return customerDao.findCustomerBySsn(ssn);
	}
	public List<Customer> getAllCustomers(){
		return customerDao.findAllCustomers();
	}
}
