package com.smvita.helper;

import com.smvita.hibernate.entity.Student;

public class StudentHelper {

	Student student;
	int bathchId;
	int recId;
	public StudentHelper(Student student, int bathchId, int recId) {
		this.student = student;
		this.bathchId = bathchId;
		this.recId = recId;
	}
	/**
	 * @return the student
	 */
	public Student getStudent() {
		return student;
	}
	/**
	 * @param student the student to set
	 */
	public void setStudent(Student student) {
		this.student = student;
	}
	/**
	 * @return the bathchId
	 */
	public int getBathchId() {
		return bathchId;
	}
	/**
	 * @param bathchId the bathchId to set
	 */
	public void setBathchId(int bathchId) {
		this.bathchId = bathchId;
	}
	/**
	 * @return the recId
	 */
	public int getRecId() {
		return recId;
	}
	/**
	 * @param recId the recId to set
	 */
	public void setRecId(int recId) {
		this.recId = recId;
	}
	public StudentHelper() {
		// TODO Auto-generated constructor stub
	}
	
	
	
}
