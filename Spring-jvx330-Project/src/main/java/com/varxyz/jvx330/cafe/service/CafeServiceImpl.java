package com.varxyz.jvx330.cafe.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.varxyz.jvx330.cafe.MenuItem;
import com.varxyz.jvx330.cafe.dao.MenuItemDao;

public class CafeServiceImpl implements CafeService{
	private MenuItemDao dao = new MenuItemDao();
	
	@Autowired
	public CafeServiceImpl (MenuItemDao dao) {
		this.dao = dao;
	}
	
	@Override
	public long insertMenu(MenuItem menuItem) {
		return dao.insertMenu(menuItem);
	}

	@Override
	public long updateMenu(MenuItem menuItem) {
		return dao.updateMenu(menuItem);
	}

	@Override
	public long deleteMenu(long mid) {
		return dao.deleteMenu(mid);
	}

}
