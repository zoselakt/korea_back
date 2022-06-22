package com.mod.mod14;

import java.util.*;

public interface AccountService {
	void addCustomer(Customer customer);
	Customer getCustomerBySsn(String ssn);
	Collection<Customer> getAllCustomers();
	int getNumofCustomers();
}
