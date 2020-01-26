package com.smvita.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.smvita.hibernate.entity.Course;
import com.smvita.hibernate.entity.CourseDetail;

@Repository
public class CourseDetailDaoImpl implements CourseDetailDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<CourseDetail> getCourseDetail() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<CourseDetail> query = currentSession.createQuery("from CourseDetail", CourseDetail.class);
	
		List<CourseDetail> course = query.getResultList();
		return course;
	}

	@Override
	public void saveCourseDetail(CourseDetail courseDetail, int cId) {
				Session session = sessionFactory.getCurrentSession();
				Course c = session.get(Course.class, cId);
				courseDetail.setCourse(c);
				session.saveOrUpdate(courseDetail);

	}

	@Override
	public CourseDetail getCourseDetail(int courseDetailId) {
			Session session = sessionFactory.getCurrentSession();
		
		CourseDetail course = session.get(CourseDetail.class,courseDetailId);
		return course;
	}

	@Override
	public void deleteCourseDetail(int courseDetailId) {
		Session session = sessionFactory.getCurrentSession();
		Query<CourseDetail> query = session.createQuery("delete from CourseDetail where courseDetailId=:courseId");
		query.setParameter("courseId", courseDetailId);
		query.executeUpdate();
	
		
		
	}

}
