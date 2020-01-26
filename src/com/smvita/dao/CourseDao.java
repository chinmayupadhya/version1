package com.smvita.dao;

import java.util.List;
import com.smvita.hibernate.entity.*;


public interface CourseDao {


	public List<Course> getCourse();
	public void saveCourse(Course course);
	public Course getCourse(int id);
	public String deleteCourse(int id);

}
