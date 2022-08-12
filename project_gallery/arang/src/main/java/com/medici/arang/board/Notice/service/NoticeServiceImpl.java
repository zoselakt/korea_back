package com.medici.arang.board.Notice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.medici.arang.board.Notice.dao.NoticeDao;
import com.medici.arang.board.Notice.domain.NoticeVo;

public class NoticeServiceImpl implements NoticeService{
	NoticeDao noticeDao = new NoticeDao();
	
	@Autowired
	public NoticeServiceImpl(NoticeDao noticeDao) {
		this.noticeDao = noticeDao;
	}
	
	@Override
	public long insertNotice(NoticeVo noticeVo) {
		return noticeDao.insertNotice(noticeVo);
	}

	@Override
	public long updateNotice(NoticeVo noticeVo, long num) {
		return noticeDao.updateNotice(noticeVo, num);
	}

	@Override
	public long deleteNotice(long num) {
		return noticeDao.deleteNotice(num);
	}

	@Override
	public List<NoticeVo> findAllNotice() {
		return noticeDao.findAllNotice();
	}

	@Override
	public NoticeVo findOneNotice(long num) {
		return noticeDao.findOneNotice(num);
	}

	@Override
	public int readCnt(long num) {
		return noticeDao.readCnt(num);
	}
}