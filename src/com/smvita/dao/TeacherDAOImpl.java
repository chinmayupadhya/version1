/**
 * 
 */
package com.smvita.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.smvita.hibernate.entity.Teacher;

/**
 * 
 *
 */
@Repository
public class TeacherDAOImpl implements TeacherDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addTeacher(Teacher teacher) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(teacher);
	}

	@Override
	public List<Teacher> getTeachers() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Teacher> query = currentSession.createQuery("from Teacher", Teacher.class);

		List<Teacher> teachers = query.getResultList();
		return teachers;
	}

	@Override
	public void delete(int id) {
		Session session = sessionFactory.getCurrentSession();
		Query<Teacher> query = session.createQuery("delete from Teacher where tId=:teacherId");
		query.setParameter("teacherId", id);
		query.executeUpdate();

	}

	@Override
	public Teacher getTeacher(int id) {
		Session session = sessionFactory.getCurrentSession();

		Teacher teacher = session.get(Teacher.class, id);
		return teacher;
	}

}
