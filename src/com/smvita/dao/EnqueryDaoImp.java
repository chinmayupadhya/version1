package com.smvita.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.smvita.hibernate.entity.Enquery;


@Repository
public class EnqueryDaoImp implements EnqueryDAO
{

	@Autowired
	private SessionFactory sessionFactory;

	
	@Override
	public void addEnquery(Enquery e) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(e);
				
	}

	@Override
	public List<Enquery> getEnqueries() {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Enquery> query = currentSession.createQuery("from Enquery", Enquery.class);

		List<Enquery> enqueries = query.getResultList();
		return enqueries;
	}

	@Override
	public void delete(int id) {
		Session session = sessionFactory.getCurrentSession();
		Query<Enquery> query = session.createQuery("delete from Enquery where eId=:enId");
		query.setParameter("enId", id);
		query.executeUpdate();	
	}

	@Override
	public Enquery getEnquery(int id) {
			Session session = sessionFactory.getCurrentSession();
		
		Enquery enquery = session.get(Enquery.class,id);
		return enquery;
			
		
	}

}
