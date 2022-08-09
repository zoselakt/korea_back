package com.medici.arang.board.gallery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.medici.arang.board.gallery.dao.GalleryDao;
import com.medici.arang.board.gallery.domain.GalleryVo;

public class GalleryServiceImpl implements GalleryService{
	private GalleryDao dao = new GalleryDao();
	
	@Autowired
	public GalleryServiceImpl(GalleryDao dao) {
		this.dao = dao;
	}

	@Override
	public long insertGallery(GalleryVo vo) {
		return dao.insertGallery(vo);
	}

	@Override
	public long updateGallery(GalleryVo vo, long gallery_code) {
		return dao.updateGallery(vo, gallery_code);
	}

	@Override
	public long deleteGallery(long gallery_code) {
		return dao.deleteGallery(gallery_code);
	}

	@Override
	public List<GalleryVo> findAllGalleryInfo() {
		return dao.findAllGalleryInfo();
	}

	@Override
	public GalleryVo findOneGalleryInfo(long gallery_code) {
		return dao.findOneGalleryInfo(gallery_code);
	}

}
