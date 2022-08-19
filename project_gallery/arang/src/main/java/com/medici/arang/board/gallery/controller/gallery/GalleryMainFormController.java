package com.medici.arang.board.gallery.controller.gallery;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.medici.arang.board.gallery.domain.GalleryVo;

@Controller("board.gallery.controller.gallery.GalleryMainFormController")
public class GalleryMainFormController {
	@GetMapping("gallery/gallery")
	public String Gallery(GalleryVo galleryVo, HttpServletRequest request, Model model, HttpSession session) {
		
		model.addAttribute("galleryVo", galleryVo);
		return "gallery/gallery";
	}
	
	@PostMapping("gallery/gallery")
	public String GalleryForm(GalleryVo galleryVo, HttpServletRequest request, Model model) {
		
		model.addAttribute("galleryVo", galleryVo);
		return "gallery/gallery";
	}
}
