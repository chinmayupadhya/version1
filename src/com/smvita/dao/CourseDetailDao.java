package com.smvita.dao;

import java.util.List;

import com.smvita.hibernate.entity.CourseDetail;



public interface CourseDetailDao {

	public List<CourseDetail> getCourseDetail();
	public void saveCourseDetail(CourseDetail courseDetail,int cId);
	public CourseDetail getCourseDetail(int courseDetailId);
	public void deleteCourseDetail(int courseDetailId);
	
}
