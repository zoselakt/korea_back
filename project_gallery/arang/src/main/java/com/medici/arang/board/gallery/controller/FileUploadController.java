package com.medici.arang.board.gallery.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.medici.arang.board.gallery.domain.GalleryVo;
import com.medici.arang.board.gallery.service.GalleryServiceImpl;

@Controller("board.gallery.controller.FileUploadController")
public class FileUploadController {
private GalleryServiceImpl galleryServiceImpl;
	
	public FileUploadController(GalleryServiceImpl galleryServiceImpl) {
		this.galleryServiceImpl = galleryServiceImpl;
	}
	
	@GetMapping("gallery/FileUploadForm")
	public String FileUpload(GalleryVo galleryVo, HttpServletRequest request, Model model, HttpSession session) {
		model.addAttribute("GalleryVo", galleryVo);
		return "gallery/FileUploadForm";
	}
	
	private static final String SAVE_DIR = "C:\\img";
	//파일추가
	@PostMapping("gallery/FileUploadForm")
	public String FileUpload(@ModelAttribute("menu") GalleryVo galleryUploadVo, 
			Model model, @RequestParam("imgFile") MultipartFile file) {
		
		String fileRealName = file.getOriginalFilename();
		long size = file.getSize();
		
		System.out.println("파일명 : "  + fileRealName);
		System.out.println("용량크기(byte) : " + size);
		
		String fileExtension = fileRealName.substring(fileRealName.lastIndexOf("."), fileRealName.length());
		
		UUID uuid = UUID.randomUUID();
		String[] uuids = uuid.toString().split("-");
		
		String uniqueName = uuids[0];
		System.out.println(uuid.toString());
		System.out.println("생성된 고유문자열: " + uniqueName);
		System.out.println("확장자명: " + fileExtension);
		
		File saveFile = new File(SAVE_DIR+"\\"+uniqueName+fileExtension);
		
		try {
			file.transferTo(saveFile);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		galleryUploadVo.setImg(uniqueName + fileExtension);
		
		String imgName = galleryUploadVo.getImg();
		System.out.println(imgName);
		model.addAttribute("imgName", imgName);
		
		galleryServiceImpl.insertFileUpload(galleryUploadVo);
		System.out.println();
		return "gallery/mainForm";
	}
	public String requestupload1(MultipartHttpServletRequest request) {
        String src = request.getParameter("src");
        MultipartFile mf = request.getFile("file");

        String path = "C:\\img\\";

        String originFileName = mf.getOriginalFilename(); // 원본 파일 명
        long fileSize = mf.getSize(); // 파일 사이즈

        System.out.println("originFileName : " + originFileName);
        System.out.println("fileSize : " + fileSize);

        String safeFile = path + originFileName;

        try {
            mf.transferTo(new File(safeFile));
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "redirect:gallery/mainForm";
    }
}
