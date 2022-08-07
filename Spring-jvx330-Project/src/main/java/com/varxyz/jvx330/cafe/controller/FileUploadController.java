package com.varxyz.jvx330.cafe.controller;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller("cafe.controller.fileUploadController")
public class FileUploadController {
	  private Logger logger = LoggerFactory.getLogger(FileUploadController.class);

	    // 파일 저장할 위치
	    @Value("${file.path}")
	    private String file_Path;

	    // 파일 폼 매핑
	    @GetMapping("/cafe/uploadForm")
	    public String fileForm(Locale locale, Model model) {
	        logger.info("fileForm file.path={}", file_Path);
	        return "cafe/uploadForm";
	    }

	    // 파일 등록 매핑
	    @PostMapping("/cafe/uploadForm")
	    public String fileUpload(@RequestParam MultipartFile file, RedirectAttributes redirectAttributes) throws IOException {
	        logger.info("fileUpload={}", file);
	        String uuid = UUID.randomUUID().toString();
	        
	        // file upload to system
	        File converFile = new File(file_Path, uuid + file.getOriginalFilename());
	        logger.info("fileUpload converFile={}", converFile);
	        file.transferTo(converFile);

	        String msg = file.getOriginalFilename() + " is saved in server db";
	        redirectAttributes.addFlashAttribute("msg", msg);
	        logger.info("fileUpload={}", msg);
	        return "redirect:mainForm";
	    }
}
