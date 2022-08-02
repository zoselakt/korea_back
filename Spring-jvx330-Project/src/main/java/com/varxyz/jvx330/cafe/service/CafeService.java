package com.varxyz.jvx330.cafe.service;

import org.springframework.stereotype.Service;

import com.varxyz.jvx330.cafe.MenuItem;

@Service
public interface CafeService {
	public long insertMenu(MenuItem menuItem);
	public long updateMenu(MenuItem menuItem);
	public long deleteMenu(long mid);
}
