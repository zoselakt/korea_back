package com.medici.arang.board.comment.dao;

import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.medici.arang.board.comment.domain.CommentRowMapper;
import com.medici.arang.board.comment.domain.CommentVo;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Repository("commentDao")
public class CommentDao {
	private JdbcTemplate jdbcTemplate;
	
	public CommentDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public long insertComment(CommentVo commentVo) {
		String sql = "insert into comment (boardNum, parent, userId, content) values(?,?,?,?)";
		return jdbcTemplate.update(sql, commentVo.getBoardNum(), commentVo.getParent(),
				commentVo.getUserId(), commentVo.getContent());
	}
	
	public long updateComment(CommentVo commentVo, long cNum) {
		String sql = "update comment set( content = ?) where cNum = ?";
		return jdbcTemplate.update(sql, commentVo.getContent(), cNum);
	}
	public long deleteComment(long cNum) {
		String sql = "delete from comment where cNum = ?";
		return jdbcTemplate.update(sql, cNum);
	}
	
	public List<CommentVo> findAllComment(){
		String sql = "select * from comment";
		return jdbcTemplate.query(sql, new CommentRowMapper());
	}
	
	public CommentVo findOneComment(long cNum){
		String sql = "select * from comment where cNum = ?";
		return jdbcTemplate.queryForObject(sql, new CommentRowMapper(), cNum);
	}
}
