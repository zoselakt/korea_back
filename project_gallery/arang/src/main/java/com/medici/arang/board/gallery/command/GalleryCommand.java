package com.medici.arang.board.gallery.command;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class GalleryCommand {
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
