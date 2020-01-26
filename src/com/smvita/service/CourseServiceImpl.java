package com.smvita.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smvita.dao.CourseDao;
import com.smvita.hibernate.entity.Course;

@Service
public class CourseServiceImpl implements CourseService 
{

	
	@Autowired
	private CourseDao courseDao;
	
	@Override
	@Transactional
	public List<Course> getCourse() {
		// TODO Auto-generated method stub
		return courseDao.getCourse();
	}

	@Override
	@Transactional
	public void saveCourse(Course course) {
		// TODO Auto-generated method stub
		courseDao.saveCourse(course);
	}

	@Override
	@Transactional
	public Course getCourse(int id) {
		// TODO Auto-generated method stub
		return courseDao.getCourse(id);
	}

	@Override
	@Transactional
	public void deleteCourse(int id) {
		// TODO Auto-generated method stub
		courseDao.deleteCourse(id);
	}

}
