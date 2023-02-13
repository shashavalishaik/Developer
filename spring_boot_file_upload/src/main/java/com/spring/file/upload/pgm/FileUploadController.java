package com.spring.file.upload.pgm;


import java.io.IOException;


import java.nio.charset.Charset;

import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileUploadController {
	
	@Autowired
	private  FileUploadHelper fileUploadHelper;

	@GetMapping("/file")
	public ResponseEntity<String> fileUpload(@RequestParam("yamlfile") MultipartFile yamlfile)
	{
		try
		{
			
		
		System.out.println(yamlfile.getOriginalFilename());
		System.out.println(yamlfile.getSize()+"kb");
		System.out.println(yamlfile.getName());
//		String s=yamlfile.getContentType();
//		String a="text/yaml";
//		if(s.equals(a)) 
//		{
//		System.out.println(yamlfile.getContentType());
//		}
//		else
//		{
//			System.out.println("not in the required format");
//
//			System.out.println("the actually format of file is "+yamlfile.getContentType());
//			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("upload a file in required format");
//		}
		
		if(!yamlfile.getContentType().equals("text/yaml"))
		{

			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("upload a file in required format");
		}
		
//      if(yamlfile.isEmpty())
//      {
//
//			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("file must be content something");
//      }
		
		boolean f=fileUploadHelper.uploadFile(yamlfile);
		if(f)
		{
			return ResponseEntity.ok("File is successfully uploaded");
		}
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		//return ResponseEntity.ok("working");
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong");
				
	}
	
}
