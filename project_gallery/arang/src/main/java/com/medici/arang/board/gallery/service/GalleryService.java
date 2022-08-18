package com.medici.arang.board.gallery.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.medici.arang.board.gallery.command.GalleryCommand;
import com.medici.arang.board.gallery.domain.GalleryVo;

@Service
public interface GalleryService {
	public long insertGallery(GalleryCommand galleryCommand);
	public long updateGallery(GalleryCommand galleryCommand, long code);
	public long deleteGallery(long code);
	public List<GalleryVo> findAllGalleryInfo();
	public List<GalleryVo> findAllGalleryInfo2();
	public GalleryVo findOneGalleryInfo(long code);
	public List<GalleryVo> findImgPath();
	public long insertFileUpload(GalleryVo vo);
}

