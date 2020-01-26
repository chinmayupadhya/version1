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
import org.springframework.web.bind.annotation.RestController;

import com.smvita.hibernate.entity.Student;
import com.smvita.hibernate.entity.Teacher;
import com.smvita.service.StudentService;
import com.smvita.service.TeacherService;

@RestController
@CrossOrigin(origins = "http://192.168.43.192:4200",allowedHeaders = "*")
@RequestMapping("/api")
public class TeacherRestController {

	@Autowired
	private TeacherService teacherService;
	
	
	@GetMapping("/teachers")
	public List<Teacher> getTeacher(){
		
		return teacherService.getTeachers();
	}
	
	@GetMapping("/teachers/{tId}")
	public Teacher getTeacher(@PathVariable int tId) {
		
	
		return teacherService.getTeacher(tId);
	}
	
	@PostMapping("/teachers")
	public void saveTeacher(@RequestBody Teacher teacher) {
		teacher.settId(0);
		teacherService.addTeacher(teacher);
	}
	
	@PutMapping("/teachers")
	public Teacher updateTeacher(@RequestBody Teacher teacher) {
		
		teacherService.addTeacher(teacher);
		return teacher;
	}
	
	@DeleteMapping("/teachers/{tId}")
	public String deleteTeacher(@PathVariable int tId) {
		
		teacherService.delete(tId);
		return "Deleted Teacher"+ tId;
	}
}
