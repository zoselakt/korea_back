package com.medici.arang.board.notice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.medici.arang.board.notice.domain.NoticeVo;
import com.medici.arang.board.notice.service.NoticeServiceImpl;

@Controller("board.gallery.controller.NoticeMainFormController")
public class NoticeMainFormController {
private NoticeServiceImpl noticeServiceImpl;
	
	@Autowired
	public NoticeMainFormController(NoticeServiceImpl noticeServiceImpl) {
		this.noticeServiceImpl = noticeServiceImpl;
	}	
	
	@GetMapping("notice/mainForm")
	public String insertGallery(@ModelAttribute NoticeVo noticeVo) {
		return "notice/mainForm";
	}
	
	@PostMapping("notice/mainForm")
	public String insertGalleryForm(@ModelAttribute NoticeVo noticeVo) {
		return "notice/mainForm";
	}
}
