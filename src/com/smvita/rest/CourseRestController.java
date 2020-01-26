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

import com.smvita.hibernate.entity.Course;
import com.smvita.service.CourseService;

@RestController
@CrossOrigin(origins = "http://192.168.43.192:4200",allowedHeaders = "*")
@RequestMapping("/api")
public class CourseRestController {

	@Autowired
	private CourseService courseService;

	@GetMapping("/courses")
	public List<Course> getCourse() {
		return courseService.getCourse();
	}

	@GetMapping("/course/{cId}")
	public Course getCourse(@PathVariable int cId) {

		Course course = courseService.getCourse(cId);
		return course;

	}

	@PostMapping("/courses")
	public void saveCourse(@RequestBody Course course) {
		course.setcId(0);
		courseService.saveCourse(course);
	}

	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course) {

		courseService.saveCourse(course);
		return course;
	}

	@DeleteMapping("/courses/{cId}")
	public String deleteCourse(@PathVariable int cId) {

		courseService.deleteCourse(cId);
		return "Deleted RecruiterId" + cId;
	}

}
