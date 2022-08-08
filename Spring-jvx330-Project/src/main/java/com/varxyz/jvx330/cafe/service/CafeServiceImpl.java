package com.varxyz.jvx330.cafe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.varxyz.jvx330.cafe.Vo.CartVo;
import com.varxyz.jvx330.cafe.Vo.MenuItem;
import com.varxyz.jvx330.cafe.dao.CartDao;
import com.varxyz.jvx330.cafe.dao.MenuItemDao;

public class CafeServiceImpl implements CafeService{
	private MenuItemDao dao = new MenuItemDao();
	private CartDao cdao = new CartDao();
	
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
	public long deleteMenu(long mid) {
		return dao.deleteMenu(mid);
	}

	@Override
	public List<MenuItem> findAllOrderedMenuItems() {
		return dao.findAllOrderedMenuItems();
	}

	@Override
	public MenuItem findAllOrderedMenuItemsByMenuItems(long mid) {
		return dao.findAllOrderedMenuItemsByMenuItems(mid);
	}
//---------------------------------------------------------------------------------
	@Override
	public long insertCard(CartVo card, String cartId) {
		return cdao.insertCard(card, cartId);
	}

	@Override
	public List<CartVo> findAllCartMenuItems(String cartId) {
		return cdao.findCartMenuItemsByCartId(cartId);
	}
}
