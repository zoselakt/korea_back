package com.varxyz.jvx330.cafe.dao;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import com.varxyz.jvx330.cafe.MenuItem;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class MenuItemDao {
	private JdbcTemplate jdbcTemplate;
	
	public MenuItemDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public long insertMenu(MenuItem menuItem) {
		String sql = "insert into cafemenu (menuItems, addother1, addother2, addother3, menuPrice, menuItemCount) values(?,?,?,?,?,?)";
		return jdbcTemplate.update(sql, menuItem.getMenuItems(),  menuItem.getAddOther1() 
				,menuItem.getAddOther2(), menuItem.getAddOther3(), menuItem.getMenuPrice(), menuItem.getMenuItemCount());
	}
	public long updateMenu(MenuItem menuItem) {
		String sql = "update cafemenu set menuItems = ?, addother1 = ?, addother2 = ?, addother3 = ?, menuPrice =? , menuItemCount = ? where cid=? ";
		return jdbcTemplate.update(sql, menuItem.getMenuItems(), menuItem.getAddOther1() ,menuItem.getAddOther2(), menuItem.getAddOther3(), 
				menuItem.getMenuPrice(), menuItem.getMenuItemCount(), menuItem.getCid());
	}
	public long deleteMenu(long mid) {
		String sql = "delete from cafemenu where mid = ?";
		return jdbcTemplate.update(sql, mid);
	}
}
