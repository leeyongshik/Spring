package user.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping(value = "user")
public class UserController2 {
	
	@RequestMapping(value = "/uploadForm")
	public String uploadForm() {
		return "user/uploadForm";
	}
	
//	@PostMapping(value = "/upload")
//	@ResponseBody
//	public void upload(@RequestParam MultipartFile upload) {
//		String filePath = "/Users/leeyongshik/Desktop/JAVA/Spring/workspace/chapter06_SpringWebMaven/src/main/webapp/WEB-INF/storage";
//		String fileName = upload.getOriginalFilename();
//		
//		File file = new File(filePath, fileName);
//		
//		try {
//			//FileCopyUtils.copy(upload.getInputStream(), new FileOutputStream(file)); // 가상폴더로 복사한다
//			upload.transferTo(file);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}//복사
//	}
	
	
	// name="img" 1개 이상일 경우
//	@PostMapping(value = "/upload")
//	@ResponseBody
//	public String upload(@RequestParam MultipartFile upload, HttpSession session) {
//		//실제폴더
//		String filePath = session.getServletContext().getRealPath("/WEB-INF/storage");
//		System.out.println("실제폴더 : "+filePath);
//		String fileName = upload.getOriginalFilename();
//		
//		File file = new File(filePath, fileName);
//		
//		try {
//			//FileCopyUtils.copy(upload.getInputStream(), new FileOutputStream(file)); // 가상폴더로 복사한다
//			upload.transferTo(file);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}//복사
//		
//		return "<img src='../storage/"+fileName+"' width='300' height='300'/>";
//	}
	
	
	
	
	// name="img" 2개 이상일 경우, 배열로 받아온다.
//	@PostMapping(value = "/upload")
//	@ResponseBody
//	public void upload(@RequestParam MultipartFile[] img, HttpSession session) {
//		//실제폴더
//		String filePath = session.getServletContext().getRealPath("/WEB-INF/storage");
//		
//		String fileName;
//		File file;
//		
//		
//		if(img[0] != null ) {
//			fileName = img[0].getOriginalFilename();
//			file = new File(filePath, fileName);
//			
//			
//			try {
//				//FileCopyUtils.copy(upload.getInputStream(), new FileOutputStream(file)); // 가상폴더로 복사한다
//				img[0].transferTo(file);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}//복사
//		}//if
//		
//		if(img[1] != null ) {
//			fileName = img[1].getOriginalFilename();
//			file = new File(filePath, fileName);
//			
//			
//			try {
//				//FileCopyUtils.copy(upload.getInputStream(), new FileOutputStream(file)); // 가상폴더로 복사한다
//				img[1].transferTo(file);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}//복사
//		}//if
//		
//		
//	}
	
//	//파일 업로드 한번에 여러개 
//	@PostMapping(value = "/upload")
//	@ResponseBody
//	public void upload(@RequestParam("img[]") List<MultipartFile> list, HttpSession session) {
//		//실제폴더
//		String filePath = session.getServletContext().getRealPath("/WEB-INF/storage");
//		
//		String fileName;
//		File file;
//		
//		
//		for(MultipartFile img : list) {
//			fileName = img.getOriginalFilename();
//			file = new File(filePath, fileName);
//			
//			
//			try {
//				//FileCopyUtils.copy(upload.getInputStream(), new FileOutputStream(file)); // 가상폴더로 복사한다
//				img.transferTo(file);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}//복사
//		}//if
//		
//		
//	}
	
	
	
	
	@PostMapping(value = "/upload2", produces = "text/html; charset=UTF-8")
	@ResponseBody
	public String upload2(@RequestParam MultipartFile img) {
		String filePath = "/Users/leeyongshik/Desktop/JAVA/Spring/workspace/chapter06_SpringWebMaven/src/main/webapp/WEB-INF/storage";
		String fileName = img.getOriginalFilename();
		
		File file = new File(filePath, fileName);
		System.out.println(file);
		try {
			//FileCopyUtils.copy(upload.getInputStream(), new FileOutputStream(file)); // 가상폴더로 복사한다
			img.transferTo(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//복사
		
		return "<img src='../storage/"+fileName+"' width='300' height='300'/>";
	}
	
}
