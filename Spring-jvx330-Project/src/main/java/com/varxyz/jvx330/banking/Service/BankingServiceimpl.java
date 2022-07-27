package com.varxyz.jvx330.banking.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.varxyz.jvx330.banking.CustomerDao;
import com.varxyz.jvx330.banking.bean.Customer;

import lombok.NoArgsConstructor;

@Service
public class BankingServiceimpl implements BankingService {
	private CustomerDao dao = new CustomerDao();
	
	
	@Autowired
	public BankingServiceimpl(CustomerDao dao) {
		this.dao = dao;
	}

	@Override
	public long addCustomer(Customer customer) {
		return dao.addCustomer(customer);
	}

	@Override
	public List<Customer> findAllCustomer(String customerid, String password, String name, String ssn, String phone) {
		return dao.findAllCustomer();
	}
	public static void main(String[] args) {
		CustomerDao dao = new CustomerDao();
		Customer customer = new Customer();
		System.out.println(dao.addCustomer(customer));
	}
}