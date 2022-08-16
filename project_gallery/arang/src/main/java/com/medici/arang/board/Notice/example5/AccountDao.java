package com.medici.arang.board.Notice.example5;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Order;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.medici.arang.board.Notice.domain.NoticeRowMapper;
import com.medici.arang.board.Notice.domain.NoticeVo;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Repository("accountDao")
public class AccountDao {
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public AccountDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public Page<NoticeVo> findAll(Pageable pageable){
		Order order = pageable.getSort().isEmpty() ? Order.by("num") : pageable.getSort().toList().get(0);
		String sql = " select num, title, writer, content, readCnt from notice "
				+ " order by" + order.getProperty() + " " + order.getDirection().name()
				+ " limit " + pageable.getPageSize()
				+ " offset " + pageable.getOffset();
		
		return new PageImpl<NoticeVo>(
			jdbcTemplate.query(sql, new NoticeRowMapper())
			, pageable, countAccount());
		
	}
	public long countAccount() {
		String sql = "select count(*) from notice";
		return jdbcTemplate.queryForObject(sql, Long.class);
				
	}
}
