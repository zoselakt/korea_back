package com.mod.mod015.banking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class CustomerDao {
	private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/jv250?serverTimezone=Asia/Seoul";
	private static final String JDBC_USER = "jv250";
	private static final String JDBC_PASSWORD = "jv250";
	
	public CustomerDao() {
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("Loaded driver -> " + JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	//고객정보 조회
	public List<Customer> findAllCustomers(){
		String sql = "select * from customer";
		List<Customer> customerList = new ArrayList<Customer>();
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					// 고객정보를 가져올 customer의 값
					Customer c = new Customer();
					c.setCid(rs.getLong("cid"));
					c.setName(rs.getString("name"));
					c.setSsn(rs.getString("ssn"));
					c.setPhone(rs.getString("phone"));
					c.setCustomerID(rs.getString("customerId"));
					customerList.add(c);
				}
			} finally {
				rs.close();
				pstmt.close();
				con.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return customerList;
	}
}
