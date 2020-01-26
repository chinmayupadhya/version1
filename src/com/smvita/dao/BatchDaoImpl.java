package com.smvita.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.smvita.hibernate.entity.Batch;
import com.smvita.hibernate.entity.Course;
import com.smvita.hibernate.entity.Recruiters;

@Repository
public class BatchDaoImpl implements BatchDao{
		
	// need to inject session factory
		@Autowired
		private SessionFactory sessionFactory;

	
	@Override
	public List<Batch> getBatch() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Batch> query = currentSession.createQuery("from Batch", Batch.class);

		List<Batch> batch = query.getResultList();
		return batch;
		
	}

	@Override
	public void saveBatch(Batch batch,int courseId) {
		
		Session session = sessionFactory.getCurrentSession();
		Course course = session.get(Course.class, courseId);
		batch.setCourseId(course);
		session.saveOrUpdate(batch);
		
	}

	@Override
	public Batch getBatch(int id) {
			Session session = sessionFactory.getCurrentSession();
		
			Batch batch = session.get(Batch.class,id);
			return batch;
	}

	@Override
	public void deleteBatch(int id) {
		Session session = sessionFactory.getCurrentSession();
		Query<Batch> query = session.createQuery("delete from Batch where batchId=:batchId");
		query.setParameter("batchId", id);
		query.executeUpdate();
	}

}
