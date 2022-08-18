package com.medici.arang.board.notice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.medici.arang.board.notice.domain.NoticeVo;
import com.medici.arang.board.notice.domain.PagingVo;
import com.medici.arang.board.notice.service.NoticeServiceImpl;

@Controller("board.Notice.controller.NoticeFindController")
public class NoticeFindController {
	private NoticeServiceImpl noticeServiceImpl;
	
	@Autowired
	public NoticeFindController(NoticeServiceImpl noticeServiceImpl) {
		this.noticeServiceImpl = noticeServiceImpl;
	}
	
	@GetMapping("notice/FindAllNoticeForm")
	public String noticeMainForm(HttpServletRequest request, Model model, HttpSession session) {

		int page = 0;
		if(request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));			
		}
		
		Pageable pageable = PageRequest.of(page, 5, Sort.Direction.DESC, "regDate");
		Page<NoticeVo> noticeList = noticeServiceImpl.findAll(pageable);
		
		//현재페이지
		int pageNumber = noticeList.getPageable().getPageNumber();
		//총 페이지수
		int totalPages = noticeList.getTotalPages();
		//블럭의 수
		int pageBlock = 5;
		//현재 페이지가 7이라면 1*5+1=6
		int startBlockPage = ((pageNumber)/pageBlock)*pageBlock+1;
		//6+5-1=10. 6,7,8,9,10해서 10.
		int endBlockPage = startBlockPage+pageBlock-1;
		endBlockPage= totalPages<endBlockPage? totalPages:endBlockPage;
		
		model.addAttribute("startBlockPage", startBlockPage);
		model.addAttribute("endBlockPage", endBlockPage);
		model.addAttribute("noticeList", noticeList);
		
		return "notice/FindAllNoticeForm";
	}

//	@GetMapping("notice/FindAllNoticeForm")
//	public String findAll(@ModelAttribute NoticeVo noticeVo, HttpServletRequest request,
//			Model model, Pageable pageable) {
//		List<NoticeVo> noticeFindAll = noticeServiceImpl.findAllNotice();
//		request.setAttribute("noticeFindAll", noticeFindAll);
//		model.addAttribute("noticeFindAll",noticeFindAll);
//		  
//		return "notice/FindAllNoticeForm";
//	}
	
//	@PostMapping("notice/FindAllNoticeForm")
//	public String findAllNotice(@ModelAttribute NoticeVo noticeVo,HttpServletRequest request, Model model) {
//		List<NoticeVo> noticeFindAll = noticeServiceImpl.findAllNotice();
//		request.setAttribute("noticeFindAll", noticeFindAll);
//		
//		model.addAttribute("noticeVo",noticeVo);
//		return "notice/mainForm";
//	}
	
	@GetMapping("notice/FindOneNoticeForm")
	public String findOne(@ModelAttribute NoticeVo noticeVo, HttpServletRequest request, Model model) {
		long findOne = Long.parseLong(request.getParameter("num"));
		request.setAttribute("findOne", findOne);
		
		NoticeVo noticeFindOne = noticeServiceImpl.findOneNotice(findOne);
		request.setAttribute("noticeFindOne", noticeFindOne);
		
		model.addAttribute("noticeVo", noticeVo);
		return "notice/FindOneNoticeForm";
	}
	
	@PostMapping("notice/FindOneNoticeForm")
	public String findOneNotice(@ModelAttribute NoticeVo noticeVo,HttpServletRequest request, Model model) {
		long findOne = Long.parseLong(request.getParameter("num"));
		request.setAttribute("findOne", findOne);
		
		NoticeVo noticeFindOne = noticeServiceImpl.findOneNotice(findOne);
		request.setAttribute("noticeFindOne", noticeFindOne);
		
		model.addAttribute("noticeVo", noticeVo);
		return "notice/mainForm";
	}
}
