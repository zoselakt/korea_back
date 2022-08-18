package com.medici.arang.board.gallery.domain;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class GalleryRowMapper implements RowMapper<GalleryVo>{

	@Override
	public GalleryVo mapRow(ResultSet rs, int rowNum) throws SQLException {
		GalleryVo vo = new GalleryVo();
		
		vo.setCode(rs.getLong("code"));
		vo.setGalleryName_kor(rs.getString("galleryName_kor"));
		vo.setGalleryName_eng(rs.getString("galleryName_eng"));
		vo.setGalleristName(rs.getString("galleristName"));
		vo.setAddress(rs.getString("address"));
		vo.setGalleryEmail(rs.getString("galleryEmail"));
		vo.setGalleryPhone(rs.getString("galleryPhone"));
		vo.setArea(rs.getString("area"));
		vo.setPayment(rs.getInt("payment"));
		vo.setGalleryFloor(rs.getInt("galleryFloor"));
		vo.setCorporateRegistrationNum(rs.getString("corporateRegistrationNum"));
		vo.setImgPath(rs.getString("imgPath"));
		return vo;
	}
}	