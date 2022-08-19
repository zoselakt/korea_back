package com.medici.arang.board.gallery.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.medici.arang.board.gallery.command.GalleristCommend;
import com.medici.arang.board.gallery.command.GalleryCommand;
import com.medici.arang.board.gallery.domain.GalleryVo;

@Service
public interface GalleryService {
	public void insertGallery(GalleryCommand galleryCommand);
	public void updateGallery(GalleryCommand galleryCommand, long code);
	public void deleteGallery(long code);
	public List<GalleryCommand> findAllGalleryInfo();
	public GalleristCommend GalleristbyEmail(String email);
	public GalleryCommand findOneGalleryInfo(long code);
	public List<GalleryCommand> findImgPath();
	public long insertFileUpload(GalleryVo vo);
	
}

