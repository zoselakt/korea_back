package com.varxyz.jvx330.jdbc.example5;

import static java.sql.Types.BIGINT;
import static java.sql.Types.CHAR;
import static java.sql.Types.DOUBLE;

import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Order;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository("accountDao")
public class AccountDao {
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public AccountDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void addAccount (Account account) {
			String sql = " insert into Account(customerId, accountNum, accType, balance, interestRate"
				+ "overAmount) values(?,?,?,?,?,?) ";
		
		SavingAccount sa = null;
		CheckingAccount ca = null;
		Object[] args = null;
		int[] types = new int[] {CHAR, CHAR, DOUBLE, DOUBLE, DOUBLE, BIGINT};
		
		if(account instanceof SavingAccount) {
			sa = (SavingAccount) account;
			args = new Object[] {
					sa.getAccountNum(), String.valueOf(sa.getAccType()), 
					sa.getBalance(), sa.getInterestRate(), 0.0, sa.getCustomerId().getCid()};
		}else {
			ca = (CheckingAccount) account;
			args = new Object[] {
					ca.getAccountNum(), String.valueOf(ca.getAccType()),
					ca.getBalance(), ca.getOverdraftAmount(), ca.getCustomerId().getCid()};
			}
		jdbcTemplate.update(sql, args, types);
	}

	public List<Account> findAccountsBySsn(String ssn){
		String sql = "select a.aid, a.customerId, a.accountId, a.accountNum, a.accType "
				+ " a.balance, a.interestRate, a.overAmount, a.regDate "
				+ " from Account a inner join Customer c"
				+ " on a.customerId = c.cid"
				+ " where c.ssn = ?";
		return jdbcTemplate.query(sql, new CustomerAccountRowMapper(), ssn);
	}
	
	public List<Account> findAccountsByCustomerId(long customerId){
		String sql = "select a.aid, a.customerId, a.accountId, a.accountNum, a.accType "
				+ " a.balance, a.interestRate, a.overAmount, a.regDate "
				+ " from Account a inner join Customer c"
				+ " on a.customerId = c.cid"
				+ " where c.customerId = ?";
		return jdbcTemplate.query(sql, new CustomerAccountRowMapper(), customerId);
	}
	
	public Page<Account> findAll(Pageable pageable){
		Order order = pageable.getSort().isEmpty() ? Order.by("aid") : pageable.getSort().toList().get(0);
		String sql = " select a.aid, a.customerId, a.ccountNu, a.accType, "
				+ " a.balance, a.interestRate,a.overAmount, a.regDate "
				+ " from account a inner join customer c "
				+ " on a.customerId = c.cid "
				+ " order by" + order.getProperty() + " " + order.getDirection().name()
				+ " limit " + pageable.getPageSize()
				+ " offset " + pageable.getOffset();
		
		return new PageImpl<Account>(
			jdbcTemplate.query(sql, new CustomerAccountRowMapper())
			, pageable, countAccount());
		
	}
	public long countAccount() {
		String sql = "select count(*) from account";
		return jdbcTemplate.queryForObject(sql, Long.class);
				
	}
}
