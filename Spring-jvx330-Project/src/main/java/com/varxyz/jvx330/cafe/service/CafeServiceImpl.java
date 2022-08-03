package com.varxyz.jvx330.cafe.service;

import java.util.List;

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
	public long updateMenu(MenuItem menuItem, long mid) {
		return dao.updateMenu(menuItem, mid);
	}

	@Override
	public long deleteMenu(MenuItem menuItem, long mid) {
		return dao.deleteMenu(menuItem, mid);
	}

	@Override
	public List<MenuItem> findAllOrderedMenuItems() {
		return dao.findAllOrderedMenuItems();
	}

	@Override
	public List<MenuItem> findAllOrderedMenuItemsByMenuItems(String menuItems) {
		return dao.findAllOrderedMenuItemsByMenuItems(menuItems);
	}
}
