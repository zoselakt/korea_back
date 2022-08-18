package com.medici.arang.board.gallery.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.medici.arang.board.gallery.command.GalleristCommend;
import com.medici.arang.board.gallery.domain.GalleristVo;

@Service
public interface GalleristService {
	public long insertGallerist(GalleristCommend commend);
	public long updateGallerist(GalleristCommend commend, long num);
	public long deleteGallerist(long num);
	public List<GalleristVo> findAllGallerist();
	public GalleristVo findOneGallerist(long num);
	public boolean isValidUser(String email, String passwd);
}
