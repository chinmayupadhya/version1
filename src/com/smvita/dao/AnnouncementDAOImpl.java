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

import com.smvita.hibernate.entity.Announcement;
import com.smvita.hibernate.entity.Batch;
import com.smvita.hibernate.entity.Recruiters;

/**
 * 
 *
 */
@Repository
@Transactional
public class AnnouncementDAOImpl implements AnnouncementDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addAnnouncement(Announcement announcement) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(announcement);


	}

	@Override
	public List<Announcement> getAnnouncements() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Announcement> query = currentSession.createQuery("from Announcement", Announcement.class);

		List<Announcement> announcement = query.getResultList();
		return announcement;
		
	}

	@Override
	public void delete(int id) {
		Session session = sessionFactory.getCurrentSession();
		Query<Announcement> query = session.createQuery("delete from Announcement where annId=:aid");
		query.setParameter("aid", id);
		query.executeUpdate();


	}

	

	@Override
	public Announcement getAnnouncement(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		
		Announcement announcement = session.get(Announcement.class,id);
		return announcement;
}

}
