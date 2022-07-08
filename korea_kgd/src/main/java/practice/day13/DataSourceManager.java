package practice.day13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DataSourceManager {
	private static final String JDBC_URL;
	private static final String JDBC_NAME;
	private static final String JDBC_PASSWORD;
	
	static {
		Properties props = new Properties();
		try {
			props.load(new FileInputStream("jdbc.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		JDBC_URL = props.getProperty("JDBC_URL");
		JDBC_NAME = props.getProperty("JDBC_NAME");
		JDBC_PASSWORD = props.getProperty("JDBC_PASSWORD");
	}
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(JDBC_URL, JDBC_NAME, JDBC_PASSWORD);
	}
	
	public static void close(ResultSet rs, PreparedStatement pstmt, Connection con) throws SQLException {
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
