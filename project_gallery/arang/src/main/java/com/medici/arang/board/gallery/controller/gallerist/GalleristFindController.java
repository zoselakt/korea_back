package com.medici.arang.board.gallery.controller.gallerist;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.medici.arang.board.gallery.domain.GalleristVo;
import com.medici.arang.board.gallery.domain.GalleryVo;
import com.medici.arang.board.gallery.service.GalleristServiceImpl;

@Controller("board.gallery.controller.GalleristFindController")
public class GalleristFindController {
	private GalleristServiceImpl galleristServiceImpl;
	
	public GalleristFindController(GalleristServiceImpl galleristServiceImpl) {
		this.galleristServiceImpl = galleristServiceImpl;
	}
	
	@GetMapping("gallery/html_gallery/FindAllGalleryForm")
	public String GetFindAllGallery(GalleryVo galleryVo, HttpServletRequest request, Model model) {
		List<GalleristVo> galleryFindAll = galleristServiceImpl.findAllGallerist();
		request.setAttribute("galleryFindAll", galleryFindAll);
		
		return "gallery/FindAllGalleryForm";
	}
	
	@PostMapping("gallery/html_gallery/FindAllGalleryForm")
	public String PostFindAllGallery(@ModelAttribute("galleristVo") GalleristVo galleristVo, HttpServletRequest request, Model model) {
		return "gallery/mainForm";
	} 
	
	@GetMapping("gallery/html_gallery/FindOneGalleryForm")
	public String GetFindOneGallery(@ModelAttribute("galleristVo")GalleristVo galleristVo, HttpServletRequest request, Model model) {
		long num = Long.parseLong(request.getParameter("num"));
		request.setAttribute("num", num);
		
		GalleristVo galleryFindOne = galleristServiceImpl.findOneGallerist(num);
		request.setAttribute("galleryFindOne", galleryFindOne);
		
		model.addAttribute("galleryFindOne",galleryFindOne);
		return "gallery/FindOneGalleryForm";
	}
	
	
	
	@PostMapping("gallery/html_gallery/FindOneGalleryForm")
	public String PostFindOneGallery(@ModelAttribute("galleristVo") GalleristVo galleristVo, HttpServletRequest request, Model model) {
		long num = Long.parseLong(request.getParameter("num"));
		request.setAttribute("num", num);
		
		GalleristVo galleryFindOne = galleristServiceImpl.findOneGallerist(num);
		request.setAttribute("galleryFindOne", galleryFindOne);
		
		model.addAttribute("galleryFindOne", galleryFindOne);
		return "gallery/mainForm";
	} 
}
