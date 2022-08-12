package com.medici.arang.board.Notice.service;

import java.util.List;

import com.medici.arang.board.Notice.domain.NoticeVo;

public interface NoticeService {
	public long insertNotice(NoticeVo noticeVo);
	public long updateNotice(NoticeVo noticeVo, long num);
	public long deleteNotice(long num);
	public List<NoticeVo> findAllNotice();
	public NoticeVo findOneNotice(long num);
	public int readCnt(long num);
}
