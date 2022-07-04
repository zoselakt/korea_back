package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import vo.UserVO;
	
public class UserDAO {
	public static final int MEM_NONEXIST = 0;
	public static final int MEM_EXIST = 1;
	public static final int MEM_JOIN_SUCCESS = 1;
	public static final int MEM_JOIN_FAIL = 0;
	public static final int MEM_LOGIN_SUCCESS = 1;
	public static final int MEM_LOGIN_NOT = -1;
	public static final int MEM_LOGIN_PW_NOT = 0;

	private static UserDAO userDAOIns = new UserDAO();
	
	private UserDAO() {	}
	
	public static UserDAO getInstance() {
		return userDAOIns;
	}
	
	Connection conn; // 외부저장소인  DBMS를 드라이버를 통해 가져온 연결 객체
	PreparedStatement pstm; // 문자열안에 있는 sql문을 객체로 저장, 변수가 들어갈 자리에 알맞는 값을 넣어줌, sql문 실행시킴
	ResultSet rs; // SELECT의 결과를 담는 객체
	
	public int join(UserVO user) {
		int n = 0;
		//SQL문 작성
		String query = "INSERT INTO TBL_USER VALUES(SEQ_USER.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			//connection 객체를 전달받는다.
			conn = DBConnecter.getconnection();
			//위에서 작성한 쿼리문을 prepareStatement에 전달한다.
			pstm = conn.prepareStatement(query);
			//?자리에 알맞는 변수를 전달해준다.
			pstm.setString(1, user.getId());
			pstm.setString(2, user.getName());
			pstm.setString(3, user.getPassword());
			pstm.setString(4, user.getGender());
			pstm.setString(5, user.getZipcode());
			pstm.setString(6, user.getAddress());
			pstm.setString(7, user.getAddress_detail());
			pstm.setString(8, user.getAddress_etc());
			
			//DML중 INSERT 쿼리를 실행하는 메소드를 사용한다.
			pstm.executeUpdate(); // 결과 건수
			n = UserDAO.MEM_JOIN_SUCCESS;
			
			//예외처리
		} catch (SQLException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstm != null) {
					pstm.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}	
		return n;
	}
	
	//아이디 중복검사
	public boolean checkId(String id) {
		String query = "SELECT COUNT(ID) FROM TBL_USER WHERE ID=?";
		boolean check= false;
		try {
			//DBMS 연결 객체 가져오기
			conn = DBConnecter.getconnection();
			// String 으로 선언된 쿼리를 pstm객체에 전달하기
			pstm = conn.prepareStatement(query);
			// SQL쿼리에 ?가 있다면 알맞는 값으로 지정해주기
			pstm.setString(1, id);
			// 쿼리실행후 결과를 rs객체에 담기
			rs = pstm.executeQuery();
			
			//행 가져오기
			rs.next();
			// 행의 열을 타입에 맞춰서 가져오기
			check = rs.getInt(1) == 1; // 0일때 중복 없음(false), 1일때 중복있음(true)
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(pstm != null) {
					pstm.close();
				}
				if(conn != null) {
					pstm.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			} catch(Exception e){
				throw new RuntimeException(e);
			}
		}
		return check;
	}
	
	//로그인 처리
	public int login(String id, String pw) {
		String query = "SELECT COUNT(ID) FROM TBL_USER WHERE ID = ? AND PASSWORD = ?";
		boolean check = false;
		int n = 0;
		String rPw;
		conn = DBConnecter.getconnection();
		
		try {
			pstm = conn.prepareStatement(query);
			pstm.setString(1, id);
			pstm.setString(2, pw);
			
			rs = pstm.executeQuery();
			rs.next();		
			if(rs.next()) {
				rPw = rs.getString("pw");
				if(rPw.equals(pw)) {
					n = UserDAO.MEM_JOIN_SUCCESS; // 로그인 성공
				}else {
					n = UserDAO.MEM_LOGIN_PW_NOT; // 로그인 실패 - 비밀번호가 틀림(회원)
				}
			}else {
				n = UserDAO.MEM_LOGIN_NOT; // 로그인 실패 - 회원등록이 안됨(비회원)
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(pstm != null) {
					pstm.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
		return n;
	}
	public UserVO getMember(String id) {
		UserVO mdto = null;
		Connection dbconn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from member1 where id=?";
		
		try {
			dbconn = getConnection();
			pstmt = dbconn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				mdto = new UserVO();
				mdto.setId(rs.getString("id"));
				mdto.setPassword(rs.getString("password"));
				mdto.setName(rs.getString("name"));
				mdto.setAddress(rs.getString("address"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(dbconn != null) dbconn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		return mdto;
		
	}
	// 정보 수정하기 위한 메서드
	public int updateMember(UserVO mdto) {
		int n = 0;
		Connection dbconn = null;
		PreparedStatement pstmt = null;
		String sql = "update member1 set name=?, address=? where id=? ";
		
		try {
			dbconn = getConnection();
			pstmt = dbconn.prepareStatement(sql);
			pstmt.setString(1, mdto.getName());
			pstmt.setString(2, mdto.getAddress());
			pstmt.setString(3, mdto.getId());
			n = pstmt.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(dbconn != null) dbconn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		return n;
	}
	
	//커넥션 풀을 사용하기 위한 메서드
	private Connection getConnection() {
		Context ctx = null;
		DataSource ds = null;
		Connection dbconn = null;
		
		try {
			ctx = new InitialContext(); 
			ds = (DataSource)ctx.lookup("java:comp/env/jdbc/Oracle11g");
			dbconn = ds.getConnection();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return dbconn;
	}
}
