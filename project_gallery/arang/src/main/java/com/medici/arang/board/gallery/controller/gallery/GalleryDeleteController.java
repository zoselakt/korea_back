package com.medici.arang.board.gallery.controller.gallery;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.medici.arang.board.gallery.domain.GalleristVo;
import com.medici.arang.board.gallery.service.GalleristServiceImpl;

@Controller("board.gallery.controller.gallery.GalleristDeleteController")
public class GalleryDeleteController {
	private GalleristServiceImpl galleristServiceImpl;
	
	public GalleryDeleteController(GalleristServiceImpl galleristServiceImpl) {
		this.galleristServiceImpl = galleristServiceImpl;
	}
	
	@GetMapping("gallery/html_gallery/DeleteGalleryForm")
	public String insertGallery(@ModelAttribute GalleristVo galleristVo, HttpServletRequest request, Model model, HttpSession session) {
		
		model.addAttribute("galleristVo", galleristVo);
		return "gallery/DeleteGalleryForm";
	}
	
	@PostMapping("gallery/html_gallery/DeleteGalleryForm")
	public String insertGalleryForm(@ModelAttribute GalleristVo galleristVo, HttpServletRequest request, Model model) {
		long num = Long.parseLong(request.getParameter("num"));
		request.setAttribute("num", num);
		
		long galleristDelete = galleristServiceImpl.deleteGallerist(num);
		request.setAttribute("galleristDelete", galleristDelete);
		
		model.addAttribute("galleristDelete", galleristDelete);
		return "gallery/mainForm";
	} 
}
