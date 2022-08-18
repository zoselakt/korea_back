package com.medici.arang.board.gallery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.medici.arang.board.gallery.command.GalleristCommend;
import com.medici.arang.board.gallery.dao.GalleristDao;
import com.medici.arang.board.gallery.domain.GalleristVo;

public class GalleristServiceImpl implements GalleristService{
	private GalleristDao galleristDao = new GalleristDao();
	
	@Autowired
	public GalleristServiceImpl (GalleristDao galleristDao) {
		this.galleristDao = galleristDao;
	}
	
	@Override
	public long insertGallerist(GalleristCommend commend) {
		return galleristDao.insertGallerist(commend);
	}

	@Override
	public long updateGallerist(GalleristCommend commend, long num) {
		return galleristDao.updateGallerist(commend, num);
	}

	@Override
	public long deleteGallerist(long num) {
		return galleristDao.deleteGallerist(num);
	}

	@Override
	public List<GalleristVo> findAllGallerist() {
		return galleristDao.findAllGallerist();
	}

	@Override
	public GalleristVo findOneGallerist(long num) {
		return galleristDao.findOneGallerist(num);
	}

	@Override
	public boolean isValidUser(String email, String passwd) {
		return galleristDao.isValidUser(email, passwd);
	}
	
}