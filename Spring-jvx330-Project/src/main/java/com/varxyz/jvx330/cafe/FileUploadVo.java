package com.varxyz.jvx330.cafe;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
public class FileUploadVo {
	private String fileName;
	private String uploadPath;
	private String uuid;
	private boolean image;
}
