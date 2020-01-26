package com.smvita.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.smvita.hibernate.entity.Recruiters;
import com.smvita.hibernate.entity.Student;

@Repository
public class RecruitersDaoImpl implements RecruitersDao {

	// need to inject session factory
	@Autowired
	private SessionFactory sessionFactory;

	@Override

	public List<Recruiters> getRecruiters() {

		Session currentSession = sessionFactory.getCurrentSession();
		Query<Recruiters> query = currentSession.createQuery("from Recruiters", Recruiters.class);

		List<Recruiters> recruiters = query.getResultList();
		return recruiters;
	}

	@Override
	public void saveRecruiter(Recruiters recruiter) {

		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(recruiter);

	}

	@Override
	public Recruiters getRecruiter(int id) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Recruiters recruiter = session.get(Recruiters.class,id);
		return recruiter;
	}

	@Override
	public void deleteRecruiters(int id) {
		
		Session session = sessionFactory.getCurrentSession();
		Query<Recruiters> query = session.createQuery("delete from Recruiters where rId=:recruiterId");
		query.setParameter("recruiterId", id);
		query.executeUpdate();
		
	}

}
