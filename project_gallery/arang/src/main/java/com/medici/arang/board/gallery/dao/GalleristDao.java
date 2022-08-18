package com.medici.arang.board.gallery.dao;

import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.medici.arang.board.gallery.command.GalleristCommend;
import com.medici.arang.board.gallery.domain.GalleristRowMapper;
import com.medici.arang.board.gallery.domain.GalleristVo;

import lombok.NoArgsConstructor;

@Repository
@NoArgsConstructor
public class GalleristDao {
	private JdbcTemplate jdbcTemplate;
	
	public GalleristDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public long insertGallerist(GalleristCommend commend) {
		String sql = "insert into gallerist (email, passwd, name, ssn, phone, imgPath) values (?,?,?,?,?,?)";
		return jdbcTemplate.update(sql, commend.getEmail(), commend.getPasswd() ,commend.getName(), 
				commend.getSsn(), commend.getPhone(), commend.getImgPath());
	}
	public long updateGallerist(GalleristCommend commend, long num) {
		String sql = "update gallerist set(email =?, passwd=?, name=?, ssn=?, phone=?, imgPath=?) where num=?";
		return jdbcTemplate.update(sql, commend.getEmail(), commend.getName(), commend.getPasswd(),
				commend.getSsn(), commend.getPhone(), commend.getImgPath(), num);
	}
	public long deleteGallerist(long num) {
		String sql = "delete from gallerist where num = ?";
		return jdbcTemplate.update(sql, num);
	}
	public List<GalleristVo> findAllGallerist(){
		String sql = "SELECT * FROM gallerist";
		return jdbcTemplate.query(sql, new GalleristRowMapper());
	}
	public GalleristVo findOneGallerist(long num) {
		String sql = "select * from gallerist where num = ?";
		return jdbcTemplate.queryForObject(sql, new GalleristRowMapper(), num);
	}
	//로그인 유효성 검증용
	public boolean isValidUser(String email, String passwd) {
		String sql = "SELECT count(*) FROM Gallerist WHERE email=? AND passwd=?";
		boolean result = true;
		int ishere = jdbcTemplate.queryForObject(sql, Integer.class, email, passwd);
		if(ishere == 0 ) {
			result = false; 
		}
		return result;		
	}
}
