package com.medici.arang.board.gallery.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.medici.arang.board.gallery.domain.GalleryVo;
import com.medici.arang.board.gallery.service.GalleryServiceImpl;

@MultipartConfig(
		fileSizeThreshold = 1024 * 1024,
		maxFileSize = 1024*1024*50,
		maxRequestSize = 1024*1024*50*5)
@Controller("board.gallery.controller.GalleryFindController")
public class GalleryFindController {
	private GalleryServiceImpl galleryServiceImpl;
	
	public GalleryFindController(GalleryServiceImpl galleryServiceImpl) {
		this.galleryServiceImpl = galleryServiceImpl;
	}
	
	@GetMapping("gallery/FindAllGalleryForm")
	public String GetFindAllGallery(GalleryVo galleryVo, HttpServletRequest request, Model model, HttpSession session) {
		List<GalleryVo> galleryFindAll = galleryServiceImpl.findAllGalleryInfo();
		request.setAttribute("galleryFindAll", galleryFindAll);
		
		model.addAttribute("GalleryVo", galleryVo);
		return "gallery/FindAllGalleryForm";
	}
	@GetMapping("gallery/FindOneGalleryForm")
	public String GetFindOneGallery(@ModelAttribute("galleryFindOne")GalleryVo galleryVo, HttpServletRequest request, Model model, HttpSession session) {
		long gallery_code = Long.parseLong(request.getParameter("gallery_code"));
		request.setAttribute("gallery_code", gallery_code);
		
		GalleryVo galleryFindOne = galleryServiceImpl.findOneGalleryInfo(gallery_code);
		request.setAttribute("galleryFindOne", galleryFindOne);
		
		model.addAttribute("galleryFindOne", galleryFindOne);
		return "gallery/FindOneGalleryForm";
	}
	@PostMapping("gallery/FindAllGalleryForm")
	public String PostFindAllGallery(@ModelAttribute("galleryFindAll") GalleryVo galleryVo, HttpServletRequest request, Model model) {
		List<GalleryVo> galleryFindAll = galleryServiceImpl.findAllGalleryInfo();
		request.setAttribute("galleryFindAll", galleryFindAll);
		
		return "gallery/mainForm";
	} 
	
	@PostMapping("gallery/FindOneGalleryForm")
	public String PostFindOneGallery(@ModelAttribute("galleryFindOne") GalleryVo galleryVo, HttpServletRequest request, Model model) {
		long gallery_code = Long.parseLong(request.getParameter("gallery_code"));
		request.setAttribute("gallery_code", gallery_code);
		
		GalleryVo galleryFindOne = galleryServiceImpl.findOneGalleryInfo(gallery_code);
		request.setAttribute("galleryFindOne", galleryFindOne);
		return "gallery/mainForm";
	} 
}
