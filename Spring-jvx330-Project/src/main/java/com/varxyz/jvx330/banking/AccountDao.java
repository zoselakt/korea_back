package com.varxyz.jvx330.banking;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.databind.BeanProperty;
import com.varxyz.jvx330.banking.bean.Account;
import com.varxyz.jvx330.banking.bean.Customer;
import com.varxyz.jvx330.banking.bean.SavingsAccount;
import com.varxyz.jvx330.banking.bean.CheckingAccount;

import static java.sql.Types.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Repository("accountDao")
public class AccountDao {
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public AccountDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	// 신청한 계좌정보
	public void addAccount(Account account) {
		String sql = "INSERT INTO addAccount(customerId, accountNum, accountType, balance, interestRate) VALUES (?,?,?,?,?)";
		SavingsAccount sa = null;
		CheckingAccount ca = null;
		Object[] args = null;
		int[] types = new int[] {CHAR, CHAR, DOUBLE, DOUBLE, DOUBLE, BIGINT};
		
		if(account instanceof SavingsAccount) {
			sa = (SavingsAccount) account;
			args = new Object[] {
					sa.getAccountNum(), String.valueOf(sa.getAccountType()),
					sa.getBalance(), sa.getInterestRate(), 0.0, sa.getCustomerId().getCid()}; 
		}else {
			ca = (CheckingAccount) account;
			args = new Object[] {
					ca.getAccountNum(), String.valueOf(ca.getAccountType()),
					ca.getBalance(), ca.getOverdraftAmount(), ca.getCustomerId().getCid()};
		}
		jdbcTemplate.update(sql, args, types);
	}
	// 계좌목록 정보
	public List<Account> getAccount(){
		String sql = " select c.customername, c.customerId, a.accountNum, a.accountType "
				+ " from addAccount a inner join addCustomer a"
				+ "on a.customerId = c.cid"
				+ " where accountNum = ?, accountType = ?";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Account>(Account.class));
	}
}
