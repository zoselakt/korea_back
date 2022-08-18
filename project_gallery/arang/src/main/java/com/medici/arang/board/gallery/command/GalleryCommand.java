package com.medici.arang.board.gallery.command;

import java.sql.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class GalleryCommand {
	private long code;
	private String galleryName_kor;
	private String galleryName_eng;
	private String galleristName;
	private String address;
	private String galleryEmail;
	private String galleryPhone;
	private String area;
	private int payment;
	private int galleryFloor;
	private String corporateRegistrationNum;
	private String imgPath;
	private Date regDate;
}
