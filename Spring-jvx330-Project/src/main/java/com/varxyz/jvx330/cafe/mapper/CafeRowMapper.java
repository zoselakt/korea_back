package com.varxyz.jvx330.cafe.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;

import com.varxyz.jvx330.cafe.Vo.MenuItem;

public class CafeRowMapper implements RowMapper<MenuItem> {

	@Override
	public MenuItem mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		MenuItem menuItem = new MenuItem();
		
		menuItem.setMid(rs.getLong("mid"));
		menuItem.setMenuItems(rs.getString("menuItems"));
		menuItem.setAddOther1(rs.getString("addother1"));
		menuItem.setAddOther2(rs.getString("addother2"));
		menuItem.setAddOther3(rs.getString("addother3"));
		menuItem.setMenuPrice(rs.getInt("menuPrice"));
		menuItem.setMenuItemCount(rs.getInt("menuItemCount"));		
		
		return menuItem;
	}
}
