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

import com.smvita.helper.BatchHelper;
import com.smvita.helper.CourseDetailHelper;
import com.smvita.hibernate.entity.Batch;
import com.smvita.hibernate.entity.CourseDetail;
import com.smvita.service.BatchService;
import com.smvita.service.CourseDetailHelperService;

@RestController
@CrossOrigin(origins = "http://192.168.43.192:4200",allowedHeaders = "*")
@RequestMapping("/api")
public class CourseDetailRestController {

	
	@Autowired
	private CourseDetailHelperService service;
	
	
	@GetMapping("/coursedetails")
	public List<CourseDetail> getCourseDetail(){
		
		return service.getCourseDetail();
	}
	
	@GetMapping("/coursedetails/{cId}")
	public CourseDetail getCourseDetail(@PathVariable int cId) {
		
		CourseDetail courseDetail = service.getCourseDetail(cId);
		return courseDetail;
	}
	
	@PostMapping("/coursedetails")
	public void saveBatch(@RequestBody CourseDetailHelper courseDetailHelper) {
		courseDetailHelper.getCourseDetail().setCourseDetailId(0);
		service.saveBatch(courseDetailHelper);
	}
	
	@PutMapping("/coursedetails")
	public CourseDetail updateCourseDetail(@RequestBody CourseDetailHelper helper) {
		
			service.saveBatch(helper);
			return helper.getCourseDetail();
	}
	
	@DeleteMapping("/coursedetails/{cId}")
	public void deleteCourseDetail(@PathVariable int cId) {
		
		service.deleteCourseDetail(cId);
		
	}
	
}
