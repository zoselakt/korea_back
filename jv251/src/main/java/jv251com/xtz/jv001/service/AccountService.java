package jv251com.xtz.jv001.service;

import java.util.List;

import jv251com.xtz.jv001.dao.AccountDao;
import jv251com.xtz.jv001.domain.Account;

public class AccountService {
	private AccountDao accountDao;
	
	public AccountService(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	public void addAccount(Account account) {
		accountDao.addAccount(account);
	}
	
	public List<Account> getAccountsBySsn(String ssn){
		return accountDao.findAccountsBySsn(ssn);
	}
	
	/**
	 * XXX-XX-XXXX형식의 계좌번호 생성
	 * 
	 */
	public String generateAccountNum() {
		String numStr = String.valueOf((int)(Math.random() * 100000000));
		StringBuilder sb = new StringBuilder();
		sb.append(numStr.substring(0,3));
		sb.append("-");
		sb.append(numStr.subSequence(3, 5));
		sb.append("-");
		sb.append(numStr.substring(5));
		return sb.toString();
	}
}
