package com.varxyz.jv250.jdbc;

import java.sql.*;

public class JDBCExample10 {
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jv250";
		String id = "jv250", passwd="jv250";
		
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, id, passwd);
			String sql = "update account where aid 3007 set accountnum=?, balance=?, interestRate=?, overdraft=?, accountType=?, customerId=?, regDate=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
