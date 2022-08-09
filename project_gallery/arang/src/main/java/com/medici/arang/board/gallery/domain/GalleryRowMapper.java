package com.medici.arang.board.gallery.domain;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class GalleryRowMapper implements RowMapper<GalleryVo>{

	@Override
	public GalleryVo mapRow(ResultSet rs, int rowNum) throws SQLException {
		GalleryVo vo = new GalleryVo();
		
		vo.setGallery_code(rs.getLong("gallery_code"));
		vo.setGallery_name(rs.getString("gallery_name"));
		vo.setResist_name(rs.getString("resist_name"));
		vo.setGallery_address(rs.getString("gallery_address"));
		vo.setGallery_phone(rs.getString("gallery_phone"));
		vo.setGallery_email(rs.getString("gallery_email"));
		vo.setGallery_area(rs.getString("gallery_area"));
		vo.setGallery_payment(rs.getInt("gallery_payment"));
		vo.setGallery_floor(rs.getInt("gallery_floor"));
		vo.setGallery_etc(rs.getString("gallery_etc"));
		return vo;
	}
	
}	
