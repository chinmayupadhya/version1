package com.smvita.dao;

import java.util.List;

import com.smvita.helper.StudentHelper;
import com.smvita.hibernate.entity.*;

public interface StudentDao {

	public List<Student> getStudent();
	public void saveStudent(StudentHelper student);
	public Student getStudent(int id);
	public void deleteStudent(int id);
}
