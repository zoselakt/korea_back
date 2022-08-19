package com.medici.arang.board.gallery.controller.gallery;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.medici.arang.board.gallery.command.GalleryCommand;
import com.medici.arang.board.gallery.domain.GalleryVo;
import com.medici.arang.board.gallery.service.GalleryServiceImpl;

@Controller("board.gallery.controller.gallery.GalleryFindController")
public class GalleryFindController {
	private GalleryServiceImpl galleryServiceImpl;
	
	public GalleryFindController(GalleryServiceImpl galleryServiceImpl) {
		this.galleryServiceImpl = galleryServiceImpl;
	}
	
	@GetMapping("gallery/html_gallery/FindAllGalleryForm")
	public String GetFindAllGallery(GalleryVo galleryVo, HttpServletRequest request, Model model) {
		List<GalleryCommand> galleryFindAll = galleryServiceImpl.findAllGalleryInfo();
		request.setAttribute("galleryFindAll", galleryFindAll);
		
		return "gallery/FindAllGalleryForm";
	}
	
	@PostMapping("gallery/html_gallery/FindAllGalleryForm")
	public String PostFindAllGallery(GalleryVo galleryVo, HttpServletRequest request, Model model) {
		return "gallery/mainForm";
	} 
	
	@GetMapping("gallery/html_gallery/FindOneGalleryForm")
	public String GetFindOneGallery(GalleryVo galleryVo, HttpServletRequest request, Model model) {
		long num = Long.parseLong(request.getParameter("num"));
		request.setAttribute("num", num);
		
		GalleryCommand galleryFindOne = galleryServiceImpl.findOneGalleryInfo(num);
		request.setAttribute("galleryFindOne", galleryFindOne);
		
		model.addAttribute("galleryFindOne",galleryFindOne);
		return "gallery/FindOneGalleryForm";
	}
	
	
	
	@PostMapping("gallery/html_gallery/FindOneGalleryForm")
	public String PostFindOneGallery(GalleryVo galleryVo, HttpServletRequest request, Model model) {
		long num = Long.parseLong(request.getParameter("num"));
		request.setAttribute("num", num);
		
		GalleryCommand galleryFindOne = galleryServiceImpl.findOneGalleryInfo(num);
		request.setAttribute("galleryFindOne", galleryFindOne);
		
		model.addAttribute("galleryFindOne", galleryFindOne);
		return "gallery/mainForm";
	} 
}
