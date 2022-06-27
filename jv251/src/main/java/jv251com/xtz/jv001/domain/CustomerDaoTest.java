package jv251com.xtz.jv001.domain;

import java.util.List;

import jv251com.xtz.jv001.dao.CustomerDao;


public class CustomerDaoTest {
	public static void main(String[] args) {
		//값을 가져올 dao객체
		CustomerDao dao = new CustomerDao();
		
		// customerList에 Customerdao의 값을 할당
		List<Customer> customerList = dao.findAllCustomers();
		for(Customer customer : customerList) {
			System.out.println(customer.toString());
		}
	}
}