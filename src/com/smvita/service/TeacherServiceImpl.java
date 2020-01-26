package com.smvita.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smvita.dao.TeacherDAO;
import com.smvita.hibernate.entity.Teacher;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	private TeacherDAO teacherDao;
	
	@Override
	@Transactional
	public void addTeacher(Teacher teacher) {
		teacherDao.addTeacher(teacher);

	}

	@Override
	@Transactional
	public List<Teacher> getTeachers() {
		
		return teacherDao.getTeachers();
	}

	@Override
	@Transactional
	public void delete(int id) {
		teacherDao.delete(id);

	}

	@Override
	@Transactional
	public Teacher getTeacher(int id) {
		
		return teacherDao.getTeacher(id);
	}

}
