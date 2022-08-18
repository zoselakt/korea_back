package com.medici.arang.user.dao;

import java.util.List;

import javax.servlet.annotation.MultipartConfig;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import com.medici.arang.user.command.ArtistCommand;

public class ArtistDao {
	private JdbcTemplate jdbcTemplate;
	
	public ArtistDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	//아티스트 유저 추가
	public void addArtist(ArtistCommand artistCommand) {
		String sql = "INSERT INTO Artist (email, passwd, name_kor, name_eng,"
				+ " ssn, phone, genre, career, imgPath)"
				+ " VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql,artistCommand.getEmail(), artistCommand.getPasswd(),
				artistCommand.getName_kor(), artistCommand.getName_eng(),
				artistCommand.getSsn(), artistCommand.getPhone(),
				artistCommand.getGenre(), artistCommand.getCareer(),
				artistCommand.getImgPath());
	}
			
	//로그인 유효성 검증용
	public boolean isValidUser(String email, String passwd) {
		String sql = "SELECT count(*) FROM Artist WHERE email=? AND passwd=?";
		boolean result = true;
		int ishere = jdbcTemplate.queryForObject(sql, Integer.class, email, passwd);
		if(ishere == 0 ) {
			result = false;
		}
		return result;
	}		
	
	//모든 아티스트 조회
	public List<ArtistCommand> getAllArtist() {
		String sql = "SELECT * FROM Artist";
		return jdbcTemplate.query(sql, new ArtistRowMapper());
	}
	
	//이메일로 해당 유저 찾기
	public ArtistCommand getArtistByEmail(String email) {
		String sql = "SELECT * FROM Artist WHERE email=?";
		return jdbcTemplate.queryForObject(sql, new ArtistRowMapper(), email);
	}
}
