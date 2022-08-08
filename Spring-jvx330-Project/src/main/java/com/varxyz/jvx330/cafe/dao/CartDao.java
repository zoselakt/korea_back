package com.varxyz.jvx330.cafe.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.varxyz.jvx330.cafe.Vo.CartVo;
import com.varxyz.jvx330.cafe.mapper.CafeRowMapper;
import com.varxyz.jvx330.cafe.mapper.CartRowMapper;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CartDao {
	private JdbcTemplate jdbcTemplate;
	
	public CartDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public long insertCard(CartVo cart, String cartId) {
		String sql = "insert into Cart() values()";
		return jdbcTemplate.update(sql, cart, cartId);
	}

	public List<CartVo> findCartMenuItemsByCartId(String cartId) {
		String sql = "select * from Cart";
		return jdbcTemplate.queryForObject(sql, new CartRowMapper(), cartId);
	}
}
