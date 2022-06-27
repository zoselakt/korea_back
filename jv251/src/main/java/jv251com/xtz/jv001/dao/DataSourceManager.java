package jv251com.xtz.jv001.dao;


import java.io.*;
import java.sql.*;
import java.util.*;

public class DataSourceManager {
	private static final String JDBC_URL;
	private static final String JDBC_USER;
	private static final String JDBC_PASSWD;
	
	// 위에 상순값이 바뀐다고 가정하면 어떻게 집어넣을까? 기본적으로는 컴파일다시하는것보다 서버를 다시시작해야한다.
	// 그렇게되면 처리비용이 엄청 많아진다.
	static {
		Properties props = new Properties();
		try {
			props.load(new FileInputStream("jdbc.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			Class.forName(props.getProperty("JDBC_DRIVER"));
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		JDBC_URL = props.getProperty("JDBC_URL");
		JDBC_USER = props.getProperty("JDBC_USER");
		JDBC_PASSWD = props.getProperty("JDBC_PASSWD");
		
		System.out.println("JDBC_URL = " + JDBC_URL);
		System.out.println("JDBC_USER = " + JDBC_USER);
		System.out.println("JDBC_PASSWD = " + JDBC_PASSWD);
	}
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWD);
	}
	
	public static void close(ResultSet rs, PreparedStatement pstmt, Connection con) throws SQLException{
		if(rs != null) {
			rs.close();
		}
		if(pstmt != null) {
			pstmt.close();
		}
		if(con != null) {
			con.close();
		}
	}
	public static void close(PreparedStatement pstmt, Connection con) throws SQLException{
		close(pstmt, con);
	}
	
}