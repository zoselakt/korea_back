package com.medici.arang.board.gallery.command;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class GalleristCommend {
	private long num;
	private String email;
	private String passwd;
	private String name;
	private String ssn;
	private String phone;
	private String imgPath;
	private Timestamp regDate;
}