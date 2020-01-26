package com.smvita.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smvita.dao.CourseDetailDaoImpl;
import com.smvita.helper.CourseDetailHelper;
import com.smvita.hibernate.entity.CourseDetail;

@Service
public class CourseDetailHelperServiceImpl implements CourseDetailHelperService {

	@Autowired
	CourseDetailDaoImpl dao;
	
	@Override
	@Transactional
	public List<CourseDetail> getCourseDetail() {
		
		return dao.getCourseDetail();
	}

	@Override
	@Transactional
	public void saveBatch(CourseDetailHelper courseDetailHelper) {
		
		dao.saveCourseDetail(courseDetailHelper.getCourseDetail(), courseDetailHelper.getCourseId());
		
	}

	@Override
	@Transactional
	public CourseDetail getCourseDetail(int id) {
		
		return dao.getCourseDetail(id);
	}

	@Override
	@Transactional
	public void deleteCourseDetail(int id) {
		dao.deleteCourseDetail(id);
		
	}

}
