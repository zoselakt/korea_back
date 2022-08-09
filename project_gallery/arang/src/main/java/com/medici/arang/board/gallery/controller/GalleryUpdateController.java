package com.medici.arang.board.gallery.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.medici.arang.board.gallery.command.GalleryCommand;
import com.medici.arang.board.gallery.dao.GalleryDao;
import com.medici.arang.board.gallery.domain.GalleryVo;
import com.medici.arang.board.gallery.service.GalleryServiceImpl;

@Controller("board.gallery.controller.GalleryUpdateController")
public class GalleryUpdateController {
	private GalleryServiceImpl galleryServiceImpl;
	
	public GalleryUpdateController(GalleryServiceImpl galleryServiceImpl) {
		this.galleryServiceImpl = galleryServiceImpl;
	}
	
	@GetMapping("gallery/UpdateGalleryForm")
	public String updateGallery(GalleryVo galleryVo, HttpServletRequest request, Model model, HttpSession session
			,GalleryCommand command) {
		long gallery = command.getGallery_code();
		galleryVo.setGallery_code(gallery);
		
		model.addAttribute("GalleryVo", galleryVo);
		return "gallery/UpdateGalleryForm";
	}
	
	@PostMapping("gallery/UpdateGalleryForm")
	public String updateGalleryForm(GalleryVo galleryVo, HttpServletRequest request, Model model) {
		long gallery_code = Long.parseLong(request.getParameter("gallery_code"));
		request.setAttribute("gallery_code", gallery_code);
		
		long galleryUpdate = galleryServiceImpl.updateGallery(galleryVo, gallery_code);
		request.setAttribute("galleryUpdate", galleryUpdate);
		
		model.addAttribute("GalleryVo", galleryVo);
		return "gallery/mainForm";
	} 
}
