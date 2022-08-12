package com.medici.arang.board.Notice.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.medici.arang.board.Notice.domain.NoticeVo;
import com.medici.arang.board.Notice.service.NoticeServiceImpl;

@Controller("board.Notice.controller.NoticeFindController")
public class NoticeFindController {
	private NoticeServiceImpl noticeServiceImpl;
	
	public NoticeFindController(NoticeServiceImpl noticeServiceImpl) {
		this.noticeServiceImpl = noticeServiceImpl;
	}
	
	@GetMapping("notice/FindAllNoticeForm")
	public String findAll(@ModelAttribute NoticeVo noticeVo, HttpServletRequest request, Model model) {	
		List<NoticeVo> noticeFindAll = noticeServiceImpl.findAllNotice();
		request.setAttribute("noticeFindAll", noticeFindAll);
		
		
		model.addAttribute("noticeFindAll",noticeFindAll);
		return "notice/FindAllNoticeForm";
	}
	
	@GetMapping("notice/FindOneNoticeForm")
	public String findOne(@ModelAttribute NoticeVo noticeVo, HttpServletRequest request, Model model) {
		long findOne = Long.parseLong(request.getParameter("num"));
		request.setAttribute("findOne", findOne);
		
		NoticeVo noticeFindOne = noticeServiceImpl.findOneNotice(findOne);
		request.setAttribute("noticeFindOne", noticeFindOne);
		
		long readCnt = Long.parseLong(request.getParameter("num"));
		noticeServiceImpl.readCnt(readCnt);
		
		model.addAttribute("noticeVo", noticeVo);
		return "notice/FindOneNoticeForm";
	}
	
	@PostMapping("notice/FindAllNoticeForm")
	public String findAllNotice(@ModelAttribute NoticeVo noticeVo,HttpServletRequest request, Model model) {
		List<NoticeVo> noticeFindAll = noticeServiceImpl.findAllNotice();
		request.setAttribute("noticeFindAll", noticeFindAll);
		
		model.addAttribute("noticeVo",noticeVo);
		return "notice/mainForm";
	}
	@PostMapping("notice/FindOneNoticeForm")
	public String findOneNotice(@ModelAttribute NoticeVo noticeVo,HttpServletRequest request, Model model) {
		long findOne = Long.parseLong(request.getParameter("num"));
		request.setAttribute("findOne", findOne);
		
		NoticeVo noticeFindOne = noticeServiceImpl.findOneNotice(findOne);
		request.setAttribute("noticeFindOne", noticeFindOne);
		
		long readCnt = Long.parseLong(request.getParameter("num"));
		noticeServiceImpl.readCnt(readCnt);

		model.addAttribute("noticeVo", noticeVo);
		return "notice/mainForm";
	}
}
