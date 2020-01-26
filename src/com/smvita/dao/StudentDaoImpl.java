package com.smvita.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.smvita.helper.StudentHelper;
import com.smvita.hibernate.entity.Batch;
import com.smvita.hibernate.entity.Recruiters;
import com.smvita.hibernate.entity.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Student> getStudent() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Student> query = currentSession.createQuery("from Student", Student.class);

		List<Student> student = query.getResultList();
		return student;
	}

	@Override
	public void saveStudent(StudentHelper student) {
		Session session = sessionFactory.getCurrentSession();
		Batch b = session.get(Batch.class, student.getBathchId());
		Recruiters r = session.get(Recruiters.class, student.getRecId());
		student.getStudent().setBatchId(b);
		student.getStudent().setRecruitersId(r);
		session.saveOrUpdate(student.getStudent());
		
	}

	@Override
	public Student getStudent(int id) {
		Session session = sessionFactory.getCurrentSession();
		
		Student student = session.get(Student.class,id);
		return student;
	}

	@Override
	public void deleteStudent(int id) {
		Session session = sessionFactory.getCurrentSession();
		Query<Recruiters> query = session.createQuery("delete from Student where studentId=:studentId");
		query.setParameter("studentId", id);
		query.executeUpdate();
		
	}

}
