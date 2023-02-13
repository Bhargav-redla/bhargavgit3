package com.slokam.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class filecontroller {
	@PostMapping("upload1")
	public void fileupload1(MultipartFile multipartfile) throws IOException {
		System.out.println(multipartfile.getOriginalFilename());
		System.out.println(multipartfile.getSize());
		System.out.println(multipartfile.isEmpty());
          System.out.println(multipartfile.getContentType());
       
}
	@PostMapping("upload")
	public void fileupload(MultipartFile multipartfile) throws IOException {
		System.out.println(multipartfile.getOriginalFilename());
		System.out.println(multipartfile.getSize());
		System.out.println(multipartfile.isEmpty());
          System.out.println(multipartfile.getContentType());
          File file =new File("E:\\rest\\"+multipartfile.getOriginalFilename());
          multipartfile.transferTo(file);
}
}
