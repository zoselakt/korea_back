package com.varxyz.jvx330.cafe.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.varxyz.jvx330.cafe.Vo.CartVo;
import com.varxyz.jvx330.cafe.Vo.MenuItem;

@Service
public interface CafeService {
	//메뉴추가
	public long insertMenu(MenuItem menuItem);
	//메뉴수정
	public long updateMenu(MenuItem menuItem, long mid);
	//메뉴삭제
	public long deleteMenu(long mid);
	//메뉴전체조회
	public List<MenuItem> findAllOrderedMenuItems();
	//메뉴하나조회
	public MenuItem findAllOrderedMenuItemsByMenuItems(long mid);
	//-------------------------------------------------------------
	//장바구니 추가
	public long insertCard(CartVo card, String cartId);
	//장바구니 조회
	public List<CartVo> findAllCartMenuItems(String cartId);
}
