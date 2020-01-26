package com.smvita.helper;

import org.springframework.web.multipart.MultipartFile;


import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.nio.file.Files;  
import java.nio.file.Path;  
import java.nio.file.Paths;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;  
import javax.transaction.Transactional;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  

public class FileUpload {

	 @Autowired
	 private static ServletContext context; 
	
	public static String UploadFile(MultipartFile multipartFile) {
		
		if (!multipartFile.isEmpty() && multipartFile.getSize() < 5000000) {
			try {
			//	String originalFileName = multipartFile.getContentType();
				
				// FilenameUtils.getExtension(originalFileName);
				//User user=(User) session.getAttribute("loggedInUser");
				//String name=user.getUserId().toString();
				//postservice.uploadDP(user.getUserId(), finalName);
				
				String ext = FilenameUtils.getExtension(multipartFile.getOriginalFilename());
				//System.out.println(ext);
				//String finalName="fileName"+"."+ext;
				String fullFileLocation = "C:\\Users\\user\\Desktop\\Images" + File.separator + multipartFile.getOriginalFilename();
				//
				long size = multipartFile.getSize();
				if (size < 5000000) {
					if (ext.equals("jpg") || ext.equals("png") || ext.equals("jpeg")) {
						File destFile = new File(
								fullFileLocation);
						System.out.println(destFile);
						multipartFile.transferTo(destFile);
						return destFile.getAbsolutePath();

						//return new ResponseEntity<String>("File Uploaded successfully", HttpStatus.OK);
					} else {
						//return new ResponseEntity<String>("Uploaded File is not an image file ",
						//		HttpStatus.BAD_REQUEST);
					}
				} else {

					//return new ResponseEntity<String>("File size is greater than 100kb ", HttpStatus.BAD_REQUEST);
				}
			} catch (Exception e) {

				//return new ResponseEntity<String>("bad inside " + e.getMessage(), HttpStatus.BAD_REQUEST);
			}
		} else {
			//return new ResponseEntity<String>("bad outside", HttpStatus.BAD_REQUEST);
		}
	
		
		return "";
	}
}
