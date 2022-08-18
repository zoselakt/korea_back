package com.medici.arang.board.gallery.dao;

import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.medici.arang.board.gallery.command.GalleryCommand;
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
	
	//갤러리스트가 신규 갤러리 글 추가
	public long insertGallery(GalleryCommand galleryCommand) {
		String sql = "INSERT INTO gallery (galleryName_kor, galleryName_eng,"
				+" galleristName, address, galleryEmail, galleryPhone, area, payment,"
				+ " galleryFloor,corporateRegistrationNum, imgPath) "
				+" VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
		return jdbcTemplate.update(sql, galleryCommand.getGalleryName_kor(),
				galleryCommand.getGalleryName_eng(), galleryCommand.getGalleristName(), 
				galleryCommand.getAddress(), galleryCommand.getGalleryEmail(),
				galleryCommand.getGalleryPhone(), galleryCommand.getArea(),
				galleryCommand.getPayment(), galleryCommand.getGalleryFloor(), 
				galleryCommand.getCorporateRegistrationNum(),
				galleryCommand.getImgPath());
	}
	
	//등록된 갤러리 수정
	public long updateGallery(GalleryCommand galleryCommand, long code) {
		String sql = " UPDATE gallery SET galleryName_kor=?, galleryName_eng=?,"
				+ " galleristName=?, address=?, galleryEmail=?, galleryPhone=?, area=?, "
				+ " payment=?, galleryFloor=?, corporateRegistrationNum=?, imgPath=?"
				+ " WHERE code=?";
		return jdbcTemplate.update(sql, galleryCommand.getGalleryName_kor(),
				galleryCommand.getGalleryName_eng(), galleryCommand.getGalleristName(), 
				galleryCommand.getAddress(), galleryCommand.getGalleryEmail(),
				galleryCommand.getGalleryPhone(), galleryCommand.getArea(),
				galleryCommand.getPayment(), galleryCommand.getGalleryFloor(), 
				galleryCommand.getCorporateRegistrationNum(),
				galleryCommand.getImgPath(), code);
	}
	
	//등록된 갤러리 삭제
	public long deleteGallery(long code) {
		String sql = "DELETE FROM gallery WHERE code = ? ";
		return jdbcTemplate.update(sql, code);
	}
	
	//모든 등록 갤러리찾기
	public List<GalleryVo> findAllGalleryInfo(){
		String sql = "SELECT * FROM gallery";
		return jdbcTemplate.query(sql, new GalleryRowMapper());
	}
	
	public List<GalleryVo> findAllGalleryInfo2(){
		String sql = "SELECT * FROM gallery";
		return jdbcTemplate.query(sql, new GalleryRowMapper());
	}
	
	public List<GalleryVo> findImgPath(){
		String sql = "SELECT imgPath FROM gallery";
		return jdbcTemplate.query(sql, new GalleryRowMapper());
	}
	
	//해당 코드의 갤러리 하나 찾기
	public GalleryVo findOneGalleryInfo(long code){
		String sql = "SELECT * FROM gallery where code = ?";
		return jdbcTemplate.queryForObject(sql, new GalleryRowMapper(), code);
	}
	
	public long insertFileUpload(GalleryVo galleryVo) {
		String sql = "INSERT INTO gallery_item (imgPath) values(?)";
		return jdbcTemplate.update(sql, galleryVo.getImgPath());
	}
}
