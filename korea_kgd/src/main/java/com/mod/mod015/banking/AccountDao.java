package com.mod.mod015.banking;

import java.sql.*;
import java.util.*;
/**
 * 
 * @author ksd49
 *
 * 실제 계정 검색, 계정추가, 특정계좌조회를 가지고있는 실체클래스 
 */
public class AccountDao {
	private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/jv250?serverTimezone=Asia/Seoul";
	private static final String JDBC_USER = "jv250";
	private static final String JDBC_PASSWORD = "jv250";
	
	public AccountDao() {
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("JDBC_driver Loading" + JDBC_DRIVER);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	//계정검색
	public List<Account> findAllAccounts(){
		String sql = "select * from Account";
		List<Account> accountList = new ArrayList<Account>();
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					//Account의 객체값을 가져오는 코드
					Account a = new Account(sql, 0);
					accountList.add(a);
				}
			}finally {
				rs.close();
				pstmt.close();
				con.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return accountList;
	}
	// 계정추가
	public void addAccount(Account account){
		String sql = "insert into Account(accountNum, balance, interestRate, overdraft, accountType, customerid)"
				+ "values (?,?,?,?,?,?)";
		
		//객체값을 담을 accountList객체생성
		List<Account> accountList = new ArrayList<Account>();
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			try {
				con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
				pstmt = con.prepareStatement(sql);
				
				// 디비의 값에 맞추어 값을 저장할 값을 생성한다.
				pstmt.setString(1, account.getAccountNum());
				pstmt.setDouble(2, account.getBalance());
				
				//account와 SavingAccount의 객체비교값이 true이면 저장 아니면 
				if(account instanceof SavingsAccount) {
					//SavingAccount의 객체에 account값을 할당한다.
					//Account객체의 자식의 값을 사용하기위해 SavingsAccount로 형변환하여 값을 대입한다.
					SavingsAccount sa = (SavingsAccount) account;
					pstmt.setDouble(3, sa.getInterestRate());
					pstmt.setDouble(4, 0.0);
					pstmt.setString(5, String.valueOf('s'));
				}else {
					
					// ??
					CheckingAccount ca = (CheckingAccount) account;
					pstmt.setDouble(3, 0.0);
					pstmt.setDouble(4, ca.getOverdraftAmount());
					pstmt.setString(5, String.valueOf('c'));
				}
				
				// customer의 cid와 맵핑하여 고객정보을 가지고 오는 코드.
				pstmt.setLong(6, account.getCustomer().getCid());
				
				pstmt.executeUpdate();
			}finally {
				pstmt.close();
				con.close();
			}
			System.out.println("Insert...");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 전달된 고객의 주민번호를 가지고 특정고객의 계좌목록 조회 
	 */
	//특정계좌 조회
	public List<Account> findAccountsBySsn(String ssn) {
		String sql = "SELECT a.aid, a.accountNum, a.balance, a.interestRate, "
				+ " a.overdraft, a.accountType, c.name, c.ssn, c.phone, a.regDate" //약칭 AS accountAid
				+ " FROM Account a INNER JOIN Customer c ON a.customerId = c.cid"
				+ " WHERE c.ssn = ?";
		//객체값을 담을 List객체생성
		List<Account> list = new ArrayList<Account>();
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
				pstmt = con.prepareStatement(sql);
				
				//주민번호로 조회
				pstmt.setString(1, ssn);
				rs = pstmt.executeQuery();
				
				// ??
				Account account = null;
				while(rs.next()) {
					//s에 해당되면 계정을 찾아주는 조건문
					if ( rs.getString("accountType").charAt(0) == 'S' ) {
						//SavingAccount의 accountNum의 값을 대입
						account = new SavingsAccount(sql, 0);
						
						//??
						((SavingsAccount)account).setInterestRate(rs.getDouble("interestRate"));
					}else {
						//계정이 맞지않다면 checkingAccount 값을 대입한다.
						account = new CheckingAccount();
						//
						((CheckingAccount)account).setOverdraftAmount(rs.getDouble("overdraft"));
					}
					//조회에 추가로 불러올 값
					account.setAid(rs.getLong("aid"));
					account.setAccountNum(rs.getString("accountNum"));
					account.setBalance(rs.getDouble("balance"));
					
					//customer클래스에서 조회할 name, ssn, phone값을 불러온다
					account.setCustomer(new Customer(rs.getString("name"),
							rs.getString("ssn"), rs.getString("phone")));
					
					account.setRegDate(rs.getTimestamp("regDate")); // 현재타임스탬프
					account.setAccountType(rs.getString("accountType").charAt(0)); //accountType의 0번째값
					//객체값을 담는 add
					list.add(account);
					
				}
			} finally {
				rs.close();
				pstmt.close();
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
