package com.mod.mod014;

import java.util.*;

public interface AccountService {
	void addCustomer(Customer customer);
	Customer getCustomerBySsn(String ssn);
	Collection<Customer> getAllCustomers();
	int getNumofCustomers();
}
