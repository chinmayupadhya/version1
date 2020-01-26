package com.smvita.service;

import java.util.List;

import com.smvita.hibernate.entity.Teacher;

public interface TeacherService {

	void addTeacher(Teacher teacher);
	List <Teacher> getTeachers();
	void delete(int id);
	Teacher getTeacher(int id);
}
