package com.varxyz.jv250.jdbc;

import java.sql.*;

public class JDBCExample8 {
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jv250?serverTimezone=Asia/Seoul";
		String id = "jv250";
		String passwd = "jv250";
		
		try {
			Class.forName(driver);
			System.out.println("LOADED DRIVER ---> " + driver);
			
			Connection con = DriverManager.getConnection(url, id, passwd);
			System.out.println("CONNECTED TO ---> " + url);
			
			String sql = "DELETE FROM account";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.executeUpdate();
			
			System.out.println("DELETED...");
			stmt.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
	}
}
