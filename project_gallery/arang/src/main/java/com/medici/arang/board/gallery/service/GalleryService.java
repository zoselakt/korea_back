package com.medici.arang.board.gallery.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.medici.arang.board.gallery.domain.GalleryVo;

@Service
public interface GalleryService {
	public long insertGallery(GalleryVo vo);
	public long updateGallery(GalleryVo vo, long gallery_code);
	public long deleteGallery(long gallery_code);
	public List<GalleryVo> findAllGalleryInfo();
	public GalleryVo findOneGalleryInfo(long gallery_code);
}
