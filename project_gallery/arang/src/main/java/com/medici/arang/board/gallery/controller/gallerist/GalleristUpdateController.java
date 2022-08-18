package com.medici.arang.board.gallery.controller.gallerist;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.medici.arang.board.gallery.command.GalleristCommend;
import com.medici.arang.board.gallery.command.GalleryCommand;
import com.medici.arang.board.gallery.dao.GalleryDao;
import com.medici.arang.board.gallery.domain.GalleryVo;
import com.medici.arang.board.gallery.service.GalleristServiceImpl;
import com.medici.arang.board.gallery.service.GalleryServiceImpl;

@Controller("board.gallery.controller.GalleristUpdateController")
public class GalleristUpdateController {
	private GalleristServiceImpl galleristServiceImpl;
	
	public GalleristUpdateController(GalleristServiceImpl galleristServiceImpl) {
		this.galleristServiceImpl = galleristServiceImpl;
	}
	
	@GetMapping("gallery/html_gallery/UpdateGalleryForm")
	public String updateGallery(@ModelAttribute("galleristCommend") GalleristCommend galleristCommend) {
		return "gallery/UpdateGalleryForm";
	}
	
	@PostMapping("gallery/html_gallery/UpdateGalleryForm")
	public String updateGalleryForm(@ModelAttribute("galleristCommend")GalleristCommend galleristCommend, HttpServletRequest request, Model model) {
		long code = Long.parseLong(request.getParameter("code"));
		request.setAttribute("code", code);
		
		long galleryUpdate = galleristServiceImpl.updateGallerist(galleristCommend, code);
		request.setAttribute("galleryUpdate", galleryUpdate);
		
		model.addAttribute("galleryUpdate", galleryUpdate);
		return "gallery/mainForm";
	} 
}
