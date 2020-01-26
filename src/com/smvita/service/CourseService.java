package com.smvita.service;

import java.util.List;

import com.smvita.hibernate.entity.Course;


public interface CourseService {
	

	public List<Course> getCourse();
	public void saveCourse(Course course);
	public Course getCourse(int id);
	public void deleteCourse(int id);


}
