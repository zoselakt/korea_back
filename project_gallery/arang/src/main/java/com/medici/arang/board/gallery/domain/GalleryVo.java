package com.medici.arang.board.gallery.domain;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class GalleryVo {
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
}
