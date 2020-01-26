package com.smvita.service;

import java.util.List;

import com.smvita.helper.StudentHelper;
import com.smvita.hibernate.entity.Student;

public interface StudentService {

	public void addStudent(StudentHelper student);
	public List<Student> getStudents();
	public void remove(int id);
	public Student getStudent(int id); 
}
