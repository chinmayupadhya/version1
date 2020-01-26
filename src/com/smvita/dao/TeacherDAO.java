package com.smvita.dao;

import java.util.List;

import com.smvita.hibernate.entity.Teacher;

public interface TeacherDAO 
{
	void addTeacher(Teacher teacher);
	List <Teacher> getTeachers();
	void delete(int id);
	Teacher getTeacher(int id);
}
