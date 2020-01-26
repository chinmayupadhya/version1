package com.smvita.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smvita.dao.StudentDao;
import com.smvita.helper.StudentHelper;
import com.smvita.hibernate.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;

	@Override
	public void addStudent(StudentHelper student) {
		studentDao.saveStudent(student);

	}

	@Override
	@Transactional
	public List<Student> getStudents() {
		return studentDao.getStudent();
	}

	@Override
	@Transactional
	public void remove(int id) {
		studentDao.deleteStudent(id);

	}

	@Override
	@Transactional
	public Student getStudent(int id) {
		return studentDao.getStudent(id);
	}

}
