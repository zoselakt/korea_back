package com.mod.mod015.banking;

import java.util.List;

import com.mod.mod014.*;

public class CustomerDaoTest {
	public static void main(String[] args) {
		CustomerDao dao = new CustomerDao();
		
		List<Customer> customerList = dao.findAllCustomers();
		for(Customer customer : customerList) {
			System.out.println(customer.toString());
		}
	}
}