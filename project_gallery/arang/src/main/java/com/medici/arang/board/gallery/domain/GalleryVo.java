package com.medici.arang.board.gallery.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class GalleryVo {
	private long gallery_code;
	private String gallery_name;
	private String resist_name;
	private String gallery_address;
	private String gallery_phone;
	private String gallery_email;
	private String gallery_area;
	private int gallery_payment;
	private int gallery_floor;
	private String gallery_etc;
	private String img;
}
