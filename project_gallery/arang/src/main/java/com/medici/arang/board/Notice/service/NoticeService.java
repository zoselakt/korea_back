package com.medici.arang.board.notice.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.medici.arang.board.notice.domain.NoticeVo;
import com.medici.arang.board.notice.domain.PagingVo;

@Service
public interface NoticeService {
	public long insertNotice(NoticeVo noticeVo);
	public long updateNotice(NoticeVo noticeVo, long num);
	public long deleteNotice(long num);
	public List<NoticeVo> findAllNotice();
	public NoticeVo findOneNotice(long num);
	public int readCnt(long num);
	public Page<NoticeVo> findAll(Pageable pageable);
	public List<NoticeVo> paging(long num);
	public long getCount();

}
