package com.smvita.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.smvita.hibernate.entity.Course;


@Repository
public class CourseDaoImpl implements CourseDao{

	// need to inject session factory
		@Autowired
		private SessionFactory sessionFactory;

	
	@Override
	public List<Course> getCourse() {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Course> query = currentSession.createQuery("from Course", Course.class);
	
		List<Course> course = query.getResultList();
		return course;

	}

	@Override
    public void saveCourse(Course course) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(course);

	}

	@Override
	public Course getCourse(int id) {
		// TODO Auto-generated method stub
	
		
		Session session = sessionFactory.getCurrentSession();
		
		Course course = session.get(Course.class,id);
		return course;

		
	}

	@Override
	public String deleteCourse(int id) {
		// TODO Auto-generated method stub
		/*Course entity = new Course();
		entity.setcId(id);
		session.delete(entity);*/
		
		Session session = sessionFactory.getCurrentSession();
		Query<Course> query = session.createQuery("delete from Course where cId=:courseId");
		query.setParameter("courseId", id);
		query.executeUpdate();
	
		
		return "Deleted RecruiterId"+ id;

	}

}
