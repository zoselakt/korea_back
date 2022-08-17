package com.medici.arang.board.notice.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Order;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.medici.arang.board.notice.domain.NoticeRowMapper;
import com.medici.arang.board.notice.domain.NoticeVo;
import com.medici.arang.board.notice.domain.PagingRowMapper;
import com.medici.arang.board.notice.domain.PagingVo;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Repository("noticeDao")
public class NoticeDao {
	private JdbcTemplate jdbcTemplate;
	
	public NoticeDao(DataSource datasource) {
		jdbcTemplate = new JdbcTemplate(datasource);
	}
	//INSERT
	public long insertNotice(NoticeVo noticeVo) {
		String sql = " INSERT INTO notice (title, content, readCnt)"
				+ " VALUES (?, ?, ?)";
		return jdbcTemplate.update(sql, noticeVo.getTitle(), noticeVo.getContent(), noticeVo.getReadCnt());
	}
	//UPDATE
	public long updateNotice(NoticeVo noticeVo, long num) {
		String sql = "UPDATE notice SET num = ?, title = ?, content = ?"
				+ " WHERE num = ?";
		return jdbcTemplate.update(sql, noticeVo.getNum(), noticeVo.getTitle(), noticeVo.getContent(), num);
	}
	//DELETE
	public long deleteNotice(long num) {
		String sql = "DELETE FROM notice WHERE num = ?";
		return jdbcTemplate.update(sql, num);
	}
	//FIND ALL
	public List<NoticeVo> findAllNotice(){
		String sql = "SELECT * FROM notice";
		return jdbcTemplate.query(sql, new NoticeRowMapper());
	}
	//FIND BY NUM
	public NoticeVo findOneNotice(long num) {
		readCnt(num);
		String sql = "SELECT * FROM notice WHERE num = ?";
		return jdbcTemplate.queryForObject(sql, new NoticeRowMapper(), num);
	}
	
	public int readCnt(long num) {
		String sql = "UPDATE notice SET readCnt = readCnt + 1 WHERE num = ?";
		return jdbcTemplate.update(sql, num);
	}
	
	public List<NoticeVo> paging(long num){
		String sql = "SELECT * FROM (SELECT @rownum := @rownum + 1 as rownum,"
				+ " t.* from notice t, (select @rownum := 0) tmp "
				+ "order by num = ? desc) as rownum_table limit 1, 20";
		return jdbcTemplate.query(sql, new NoticeRowMapper(), num);
	}
	
	//COUNT
	public long getCount() {
		String sql = "SELECT COUNT(*) FROM notice";
		return jdbcTemplate.queryForObject(sql, Long.class);
	}
	
	//페이지 보여줄 수, 페이지 전체 사이즈, Pageable(페이지를 나누는 기준)
	public Page<NoticeVo> findAll(Pageable pageable){

		Order order = pageable.getSort().isEmpty()
				? Order.by("num")
				: pageable.getSort().toList().get(0);
		String sql = "SELECT num, title, writer, content, readCnt, regDate"					
				+ " FROM notice "
				+ " ORDER BY " + order.getProperty() + " " + order.getDirection().name()
				//MY SQL
				+ " LIMIT " + pageable.getPageSize()
				+ " OFFSET " + pageable.getOffset();
			
		return new PageImpl<NoticeVo>(
				jdbcTemplate.query(sql, new NoticeRowMapper()),
				pageable,
				getCount());	
		}
	
}
