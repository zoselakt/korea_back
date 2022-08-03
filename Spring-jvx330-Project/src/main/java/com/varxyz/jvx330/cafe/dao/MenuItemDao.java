package com.varxyz.jvx330.cafe.dao;

import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.varxyz.jvx330.cafe.MenuItem;
import com.varxyz.jvx330.cafe.mapper.CafeRowMapper;

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
	public long updateMenu(MenuItem menuItem, long mid) {
		String sql = "update cafemenu set menuItems = ?, addother1 = ?, addother2 = ?, addother3 = ?,"
				+ " menuPrice =? , menuItemCount = ? where mid = ? ";
		return jdbcTemplate.update(sql, menuItem.getMenuItems(),
				menuItem.getAddOther1() ,menuItem.getAddOther2(),
				menuItem.getAddOther3(), menuItem.getMenuPrice(),
				menuItem.getMenuItemCount(), mid);
	}
	
	public long deleteMenu(MenuItem menuItem, long mid) {
		String sql = "DELETE FROM cafemenu WHERE mid = ?";
		return jdbcTemplate.update(sql, menuItem, mid);
	}
		
	public List<MenuItem> findAllOrderedMenuItems() {
		String sql = "SELECT * FROM cafemenu";
		return jdbcTemplate.query(sql, new CafeRowMapper());
	}
		
	public List<MenuItem> findAllOrderedMenuItemsByMenuItems(String menuItems) {
		String sql = "SELECT * FROM cafemenu WHERE menuItems=?";
		return jdbcTemplate.query(sql, new CafeRowMapper(), menuItems);
	}
	
	

}


//create table cafemenu(
//		mid				BIGINT			PRIMARY KEY auto_increment,
//		menuItems		VARCHAR(15),
//		addother1		VARCHAR(20),
//		addother2		VARCHAR(20),
//		addother3		VARCHAR(20),
//		menuPrice		int,
//		menuItemCount	int,
//		cid				BIGINT,
//		CONSTRAINT cafemenu_cid_FK
//		FOREIGN KEY (cid) REFERENCES cafecategory(cid)
//	)AUTO_INCREMENT = 1;
