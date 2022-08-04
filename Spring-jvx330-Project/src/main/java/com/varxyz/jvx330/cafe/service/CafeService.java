package com.varxyz.jvx330.cafe.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.varxyz.jvx330.cafe.MenuItem;

@Service
public interface CafeService {
	public long insertMenu(MenuItem menuItem);
	long updateMenu(MenuItem menuItem, long mid);
	public long deleteMenu(long mid);
	List<MenuItem> findAllOrderedMenuItems();
	MenuItem findAllOrderedMenuItemsByMenuItems(long mid);
}
