package com.medici.arang.board.gallery.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.medici.arang.board.gallery.domain.GalleryVo;
import com.medici.arang.board.gallery.service.GalleryServiceImpl;

@Controller("board.gallery.controller.GalleryFindController")
public class GalleryFindController {
	private GalleryServiceImpl galleryServiceImpl;
	
	public GalleryFindController(GalleryServiceImpl galleryServiceImpl) {
		this.galleryServiceImpl = galleryServiceImpl;
	}
	@GetMapping("gallery/FindAllGalleryForm")
	public String FindAllGallery(GalleryVo galleryVo, HttpServletRequest request, Model model, HttpSession session) {
		model.addAttribute("GalleryVo", galleryVo);
		return "gallery/FindAllGalleryForm";
	}
	@GetMapping("gallery/FindOneGalleryForm")
	public String FindOneGallery(GalleryVo galleryVo, HttpServletRequest request, Model model, HttpSession session) {
		model.addAttribute("GalleryVo", galleryVo);
		return "gallery/FindOneGalleryForm";
	}
	
	
	@PostMapping("gallery/FindAllGalleryForm")
	public String FindAllGallery(GalleryVo galleryVo, HttpServletRequest request, Model model) {
		List<GalleryVo> galleryFindAll = galleryServiceImpl.findAllGalleryInfo();
		request.setAttribute("galleryFindAll", galleryFindAll);
		
		model.addAttribute("GalleryVo", galleryVo);
		return "gallery/mainForm";
	} 
	
	@PostMapping("gallery/FindOneGalleryForm")
	public String FindOneGallery(GalleryVo galleryVo, HttpServletRequest request, Model model) {
		long gallery_code = Long.parseLong(request.getParameter("gallery_code"));
		request.setAttribute("gallery_code", gallery_code);
		
		GalleryVo galleryFindOne = galleryServiceImpl.findOneGalleryInfo(gallery_code);
		request.setAttribute("galleryFindOne", galleryFindOne);
		
		model.addAttribute("GalleryVo", galleryVo);
		return "gallery/mainForm";
	} 
}
