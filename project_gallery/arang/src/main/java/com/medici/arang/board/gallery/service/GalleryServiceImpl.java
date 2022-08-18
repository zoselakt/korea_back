package com.medici.arang.board.gallery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.medici.arang.board.gallery.command.GalleryCommand;
import com.medici.arang.board.gallery.dao.GalleryDao;
import com.medici.arang.board.gallery.domain.GalleryVo;

public class GalleryServiceImpl implements GalleryService{
	private GalleryDao galleryDao = new GalleryDao();
	
	@Autowired
	public GalleryServiceImpl(GalleryDao galleryDao) {
		this.galleryDao = galleryDao;
	}

	@Override
	public long insertGallery(GalleryCommand galleryCommand) {
		return galleryDao.insertGallery(galleryCommand);
	}

	@Override
	public long updateGallery(GalleryCommand galleryCommand, long gallery_code) {
		return galleryDao.updateGallery(galleryCommand, gallery_code);
	}

	@Override
	public long deleteGallery(long gallery_code) {
		return galleryDao.deleteGallery(gallery_code);
	}

	@Override
	public List<GalleryVo> findAllGalleryInfo() {
		return galleryDao.findAllGalleryInfo();
	}
	
	@Override
	public List<GalleryVo> findAllGalleryInfo2() {
		return galleryDao.findAllGalleryInfo2();
	}
	
	@Override
	public List<GalleryVo> findImgPath() {
		return galleryDao.findImgPath();
	}
	
	@Override
	public GalleryVo findOneGalleryInfo(long gallery_code) {
		return galleryDao.findOneGalleryInfo(gallery_code);
	}

	@Override
	public long insertFileUpload(GalleryVo galleryVo) {
		return galleryDao.insertFileUpload(galleryVo);
	}
}
