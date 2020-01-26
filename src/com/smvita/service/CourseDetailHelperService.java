package com.smvita.service;

import java.util.List;

import com.smvita.helper.CourseDetailHelper;
import com.smvita.hibernate.entity.CourseDetail;


public interface CourseDetailHelperService {
	public List<CourseDetail> getCourseDetail();
	public void saveBatch(CourseDetailHelper courseDetailHelper);
	public CourseDetail getCourseDetail(int id);
	public void deleteCourseDetail(int id);
}
