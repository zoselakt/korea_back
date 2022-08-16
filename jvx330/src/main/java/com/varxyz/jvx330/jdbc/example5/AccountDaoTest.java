package com.varxyz.jvx330.jdbc.example5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.varxyz.jvx330.jdbc.DataSourceConfig;

public class AccountDaoTest {
	private static AccountDao dao;
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DataSourceConfig.class);
		dao = context.getBean("accountDao", AccountDao.class);
		findAll();
		
		context.close();
	}
	public static void findAll() {
		System.out.println("[findAll()]");
		Pageable pageable = PageRequest.of(0, 5, Sort.Direction.DESC, "regDate");
		dao.findAll(pageable).forEach(c -> System.out.println(c));
	}
}
