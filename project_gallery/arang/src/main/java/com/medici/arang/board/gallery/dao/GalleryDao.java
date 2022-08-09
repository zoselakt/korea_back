package com.medici.arang.board.gallery.dao;

import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.medici.arang.board.gallery.domain.GalleryRowMapper;
import com.medici.arang.board.gallery.domain.GalleryVo;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Repository
public class GalleryDao {
	private JdbcTemplate jdbcTemplate;
	
	public GalleryDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public long insertGallery(GalleryVo vo) {
		String sql = "INSERT INTO gallery (gallery_name, resist_name, gallery_address, gallery_phone, "
				+" gallery_email, gallery_area, gallery_payment, gallery_floor, gallery_etc ) "
				+ " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?) ";
		return jdbcTemplate.update(sql, vo.getGallery_name(), vo.getResist_name(), vo.getGallery_address(),
				vo.getGallery_phone(), vo.getGallery_email(), vo.getGallery_area(),
				vo.getGallery_payment(), vo.getGallery_floor(), vo.getGallery_etc());
	}
	
	public long updateGallery(GalleryVo vo, long gallery_code) {
		String sql = " UPDATE gallery SET gallery_name = ?, resist_name = ?, gallery_address = ?, gallery_phone = ?, "
				+ " gallery_email = ?, gallery_area = ?, gallery_payment = ?, gallery_floor = ?, gallery_etc = ? "
				+ " WHERE gallery_code = ?";
		return jdbcTemplate.update(sql, vo.getGallery_name(), vo.getResist_name(), vo.getGallery_address(),
				vo.getGallery_phone(), vo.getGallery_email(), vo.getGallery_area(),
				vo.getGallery_payment(), vo.getGallery_floor(), vo.getGallery_etc(), gallery_code);
	}
	
	public long deleteGallery(long gallery_code) {
		String sql = "DELETE FROM gallery WHERE gallery_code = ? ";
		return jdbcTemplate.update(sql, gallery_code);
	}
	
	public List<GalleryVo> findAllGalleryInfo(){
		String sql = "SELECT * FROM gallery";
		return jdbcTemplate.query(sql, new GalleryRowMapper());
	}
	public GalleryVo findOneGalleryInfo(long gallery_code){
		String sql = "SELECT * FROM gallery where gallery_code = ?";
		return jdbcTemplate.queryForObject(sql, new GalleryRowMapper(), gallery_code);
	}
}
