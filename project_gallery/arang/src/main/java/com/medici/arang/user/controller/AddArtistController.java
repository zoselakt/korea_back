package com.medici.arang.user.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import com.medici.arang.user.command.ArtistCommand;
import com.medici.arang.user.command.EmailProvider;
import com.medici.arang.user.service.ArtistServiceImpl;

@MultipartConfig(
		fileSizeThreshold = 1024*1024,
		maxFileSize = 1024*1024*100, 		//100메가
		maxRequestSize = 1024*1024*100*5) 	// 100메가 5개까지
@Controller("controller.addArtistController")
public class AddArtistController {
	
	@Autowired
	ArtistServiceImpl artistService;
	
	@GetMapping("/user/add_artist")
	public String addArtistForm(Model model) {
		model.addAttribute("artistCommand", new ArtistCommand());
		return "user/add_artist";
	}
	
	//이미지 저장될 경로
	private static final String SAVE_DIR = "C:\\PSH\\my-workSpace\\arang\\src\\main\\webapp\\resources\\img\\";
	
	//유저 회원가입 처리 + 이미지 처리
	@PostMapping("user/add_artist")
	public String addArtist(@ModelAttribute("artistCommand")
			ArtistCommand artistCommand, Model model,
			HttpServletRequest request, @RequestParam("imgFile") MultipartFile file) {
//		HttpSession session = request.getSession();
		
		String fileRealName = file.getOriginalFilename(); //파일명을 얻어낼 수 있는 메서드
		long size = file.getSize(); //파일 사이즈
		
		System.out.println("파일명 : "  + fileRealName);
		System.out.println("용량크기(byte) : " + size);
		
		String fileExtension = fileRealName.substring(fileRealName.lastIndexOf("."),fileRealName.length());
		
		UUID uuid = UUID.randomUUID();
		System.out.println(uuid.toString());
		String[] uuids = uuid.toString().split("-");
		
		String uniqueName = uuids[0];
		System.out.println("생성된 고유문자열" + uniqueName);
		System.out.println("확장자명" + fileExtension);
		
		File saveFile = new File(SAVE_DIR+"\\"+uniqueName + fileExtension);  // 적용 후
		try {
			file.transferTo(saveFile); // 실제 파일 저장메서드(filewriter 작업을 손쉽게 한방에 처리해준다.)
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		artistCommand.setImgPath(uniqueName+fileExtension);
		String imgName = artistCommand.getImgPath();
		System.out.println(imgName);
				
		String email = artistCommand.getEmail1()+"@"+artistCommand.getEmail2();
		String phone = artistCommand.getPhone1()+"-"+artistCommand.getPhone2()
		+"-"+artistCommand.getPhone3();
		artistCommand.setEmail(email);
		artistCommand.setPhone(phone);
		model.addAttribute("imgName", imgName);
		artistService.addArtist(artistCommand);
		
		//세션 담기
//		session.setAttribute("email", artistCommand.getEmail());
		
		return "user/add_success";
	}
	
	//회원가입폼 이메일 데이터 제공
	@ModelAttribute("emailProviderList")
	public List<EmailProvider> getEmailProviderList() {
		List<EmailProvider> list = new ArrayList<EmailProvider>();
//		EX)list.add(new EmailProvider("EX)NAME", "EX)VALUE"));
		list.add(new EmailProvider("gmail.com", "gmail.com"));
		list.add(new EmailProvider("naver.com", "naver.com"));
		list.add(new EmailProvider("kakao.com", "kakao.com"));
		list.add(new EmailProvider("yahoo.com", "yahoo.com"));			
		return list;
	}
	
	//회원가입폼 번호 데이터 제공
	@ModelAttribute("phoneProviderList")
	public List<String> getPhoneProviderList() {
		List<String> list = new ArrayList<String>();
		list.add("010");
		list.add("011");
		list.add("02");
		list.add("053");
		list.add("076");
		return list;
	}
	
	@GetMapping("user/add_success")
	public String welcome() {
		return "user/add_success";
	}
	
	@PostMapping("user/add_success")
	public String goMain() {
		return "main";
		
	}

}
