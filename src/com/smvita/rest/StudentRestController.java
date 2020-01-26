package com.smvita.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.smvita.helper.FileUpload;
import com.smvita.helper.StudentHelper;
import com.smvita.hibernate.entity.*;
import com.smvita.service.StudentService;

@RestController
@CrossOrigin(origins = "http://192.168.43.192:4200",allowedHeaders = "*")
@RequestMapping("/api")
public class StudentRestController {

	@Autowired
	private StudentService studentService;
	
	
	@GetMapping("/students")
	public List<Student> getStudent(){
		
		return studentService.getStudents();
	}
	
	@GetMapping("/students/{sId}")
	public Student getStudent(@PathVariable int sId) {
		
		Student student = studentService.getStudent(sId);
		return student;
	}
	
	@PostMapping("/students")
	public void saveStudent(@RequestParam("file") MultipartFile file, @RequestParam("user") String helper ) {
		ObjectMapper obj = new ObjectMapper();
		StudentHelper student = null;
		
		try {
			student  = obj.readValue(helper, StudentHelper.class);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		student.getStudent().setStudentId(0);
		student.getStudent().setPhotograph(FileUpload.UploadFile(file));
		studentService.addStudent(student);
	}
	
	@PutMapping("/students")
	public Student updateStudent(@RequestParam("file") MultipartFile file, @RequestParam("user") String helper) {
		ObjectMapper obj = new ObjectMapper();
		StudentHelper student = null;
		
		try {
			student  = obj.readValue(helper, StudentHelper.class);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		student.getStudent().setPhotograph(FileUpload.UploadFile(file));
		studentService.addStudent(student);
		return student.getStudent();
	}
	
	@DeleteMapping("/students/{sId}")
	public void deleteStudent(@PathVariable int sId) {
		
		studentService.remove(sId);
		
	}
}
