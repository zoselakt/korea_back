package com.medici.arang.board.comment.domain;

import java.util.Date;

import org.springframework.stereotype.Repository;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@Repository
public class CommentVo {
	private long cNum; //댓글번호
	private int boardNum; // 게시글번호
	private int parent; //대댓글 부모글
	private String userId; //작성자
	private String content; //댓글내용
	private int clevel; // DB용
	private Date regDate; //작성날짜
}
