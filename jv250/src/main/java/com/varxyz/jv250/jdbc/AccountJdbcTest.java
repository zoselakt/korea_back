package com.varxyz.jv250.jdbc;

import java.sql.*;

public class AccountJdbcTest {
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jv250";
		String id="jv250", passwd="jv250";
				
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, id, passwd);
			String sql = "select * from customer";
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void select(Connection con) {
		try {
		String sql = "select * from account";
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			long aid = rs.getLong("aid");
			String accountNum = rs.getString("accountNum");
			double balance = rs.getDouble("balance");
			double interestRate = rs.getDouble("interestRate");
			double overdraft = rs.getDouble("overdrafts");
			char accountType = rs.getString("accountType").charAt(0);
		}
		pstmt.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void insert(Connection con) {
		String sql = "insert into account(accountNum, balance, interestrate"
				+ "overdraft, accountType, customerId)"
				+"values (?,?,?,?,'s',1001),";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "456-78-1234");
			pstmt.setDouble(2, 3000.0);
			pstmt.setDouble(3, 0.03);
			pstmt.setDouble(4, 0.0);
			pstmt.setString(5, String.valueOf('s'));
			pstmt.setLong(6, 1004);
			
			pstmt.executeUpdate();
			pstmt.close();
			System.out.println("new account insert...s");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
