package jv251com.xtz.jv001.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jv251com.xtz.jv001.domain.Customer;

public class CustomerDao {
	private CustomerDao customerDao;
	
	
	public CustomerDao() {
		
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
				// 특정 값에 의존적이지 않고 수정이 되어도 이 코드는 그냥 값만 불러온다. / 수정에도 영향을 받지않는다.
				con = DataSourceManager.getConnection();
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					// 고객정보를 가져올 customer의 값
					Customer c = new Customer();
					c.setCid(rs.getLong("cid"));
					c.setName(rs.getString("name"));
					c.setSsn(rs.getString("ssn"));
					c.setPhone(rs.getString("phone"));
					c.setUserId(rs.getString("UserId"));
					customerList.add(c);
				}
			} finally {
				DataSourceManager.close(rs, pstmt, con);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return customerList;
	}
	/**
	 * 주민번호로 고객 조회
	 * @param ssn
	 * @return
	 */
	public Customer findCustomerBySsn(String ssn) {
		String sql = "SELECT * FROM Customer WHERE ssn=?";
		Customer c = null;
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = DataSourceManager.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, ssn);
				rs = pstmt.executeQuery();
				if(rs.next()) {
					c = new Customer();
					c.setCid(rs.getLong("cid"));
					c.setName(rs.getString("name"));
					c.setSsn(rs.getString("ssn"));
					c.setPhone(rs.getString("phone"));
					c.setUserId(rs.getString("userId"));
				}
			} finally {
				DataSourceManager.close(rs, pstmt, con);
//				rs.close();
//				pstmt.close();
//				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;
	}
	/**
	 * 신규 고객 등록
	 * @param customer			등록할 고객정보
	 */
	public void addCustomer(Customer customer) {
		String sql = "INSERT INTO Customer(name, ssn, phone, userId, passwd) "
				+ " VALUES (?, ?, ?, ?, ?)";
		try {
			Connection con = DataSourceManager.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, customer.getName());
			pstmt.setString(2, customer.getSsn());
			pstmt.setString(3, customer.getPhone());
			pstmt.setString(4, customer.getUserId());
			pstmt.setString(5, customer.getPassword());
			pstmt.executeUpdate();
			
			DataSourceManager.close(pstmt, con);
			pstmt.close();
			con.close();
			
			System.out.println("INSERTED...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
