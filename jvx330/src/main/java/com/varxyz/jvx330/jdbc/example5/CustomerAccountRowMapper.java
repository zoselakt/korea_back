package com.varxyz.jvx330.jdbc.example5;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.varxyz.jvx330.jdbc.Customer;

public class CustomerAccountRowMapper implements RowMapper<Account>{

	@Override
	public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
		Account account = null;
		char accType = rs.getString("accType").charAt(0);
		if(accType == 'C') {
			account = new CheckingAccount();
			CheckingAccount ca = (CheckingAccount) account;
			ca.setOverdraftAmount(rs.getDouble("overAmount"));
		}else {
			account = new SavingAccount();
			SavingAccount sa = (SavingAccount) account;
			sa.setInterestRate(rs.getDouble("interestRate"));
		}
		account.setAid(rs.getLong("aid"));
		account.setCustomer(new Customer(rs.getLong("customerId")));
		account.setAccountNum(rs.getString("accountNum"));
		account.setAccType(rs.getString(accType));
		account.setBalance(rs.getDouble("balance"));
		account.setRegDate(rs.getDate("regDate"));
		
		return account;
	}

}
