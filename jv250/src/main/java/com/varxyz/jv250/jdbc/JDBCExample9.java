package com.varxyz.jv250.jdbc;

import java.sql.*;

public class JDBCExample9 {
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jv250";
		String id = "jv250", passwd = "jv250";
		
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, id, passwd);
			String sql = "insert into account(accountNum, balance, interestRate, overdraft, accountType, customerId, regDate)"
					+ "values(?,?,?,?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "111-222-333");
			pstmt.setDouble(2, 0.1);
			pstmt.setDouble(3, 0.05);
			pstmt.setDouble(4, 0.2);
			pstmt.setString(5, "s");
			pstmt.setLong(6, 1002);
			pstmt.setString(7, "2022-06-22");
			pstmt.executeUpdate();
			
			System.out.println("run...");
			
			pstmt.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
