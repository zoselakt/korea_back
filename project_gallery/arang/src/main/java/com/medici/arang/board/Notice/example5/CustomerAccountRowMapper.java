package com.medici.arang.board.Notice.example5;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerAccountRowMapper implements RowMapper<Account>{

	@Override
	public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
		Account account = null;
		char accountNum = rs.getString("accountNum").charAt(0);
		char accountType = rs.getString("accountType").charAt(1);
		account.setAid(rs.getLong("aid"));
		account.setCid(new Customer(rs.getLong("cid")));
		account.setAccountNum(accountNum);
		account.setAccType(accountType);
		account.setBalance(rs.getDouble("balance"));
		account.setRegDate(rs.getDate("regDate"));
		
		return account;
	}

}
