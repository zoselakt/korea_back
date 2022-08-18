package com.medici.arang.board.comment.domain;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CommentRowMapper implements RowMapper<CommentVo>{

	@Override
	public CommentVo mapRow(ResultSet rs, int rowNum) throws SQLException {
		CommentVo vo = new CommentVo();
		
		vo.setCNum(rs.getLong("cNum"));
		vo.setBoardNum(rs.getInt("boardNum"));
		vo.setParent(rs.getInt("parent"));
		vo.setUserId(rs.getString("userId"));
		vo.setContent(rs.getString("content"));
		vo.setClevel(rs.getInt("clevel"));
		vo.setRegDate(rs.getDate("regDate"));
		return vo;
	}
}
