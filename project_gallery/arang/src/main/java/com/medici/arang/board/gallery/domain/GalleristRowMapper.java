package com.medici.arang.board.gallery.domain;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

public class GalleristRowMapper implements RowMapper<GalleristVo> {

	@Override
	public GalleristVo mapRow(ResultSet rs, int rowNum) throws SQLException {
		GalleristVo vo = new GalleristVo();
		vo.setNum(rs.getLong("num"));
		vo.setEmail(rs.getString("email"));
		vo.setPasswd(rs.getString("passwd"));
		vo.setName(rs.getString("name"));
		vo.setSsn(rs.getString("ssn"));
		vo.setPhone(rs.getString("phone"));
		vo.setImgPath(rs.getString("imgPath"));
		vo.setRegDate(rs.getTimestamp("regDate"));
		return vo;
	}

}
