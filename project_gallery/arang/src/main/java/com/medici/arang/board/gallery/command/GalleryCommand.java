package com.medici.arang.board.gallery.command;

import java.sql.Timestamp;

import com.medici.arang.board.gallery.domain.GalleristVo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class GalleryCommand {
	private long code; 
	private String galleristEmail;
	private String galleryName_kor; 
	private String galleryName_eng; 
	private String galleristName;
	private String address; 
	private String galleryEmail;
	private String galleryPhone;
	private int since;
	private String intro; 
	private String openClose; 
	private String area;
	private String corporateRegistration; 
	private String galleryImgPath; 
	private Timestamp regDate;
}
