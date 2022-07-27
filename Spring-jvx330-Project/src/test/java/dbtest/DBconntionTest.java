package dbtest;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.jupiter.api.Test;

public class DBconntionTest {

	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/jvx330?serverTimezone=Asia/Seoul";
	private static final String USER = "root";
	private static final String PASSWORD = "1234";
	
	@Test
	public void testCon() throws Exception{
		Class.forName(DRIVER);
		try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)){
			System.out.println("커넥션 성공 " + con);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}