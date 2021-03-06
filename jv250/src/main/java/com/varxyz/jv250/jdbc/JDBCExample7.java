package com.varxyz.jv250.jdbc;

import java.sql.*;

public class JDBCExample7 {
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jv250?serverTimezone=Asia/Seoul";
		String id ="jv250";
		String passwd ="jv250";
		
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, id, passwd);
			
			String sql = "update account set accountnum=?, balance=?, interestRate=?, overdraft=?, accountType=?, customerId=?, regDate=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "112-233-445");
			pstmt.setDouble(2, 0.0);
			pstmt.setDouble(3, 0.0);
			pstmt.setDouble(4, 0.0);
			pstmt.setString(5, "s");
			pstmt.setLong(6, 1002);
			pstmt.setString(7, "2022-06-22");
			pstmt.executeUpdate();
			
			pstmt.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
