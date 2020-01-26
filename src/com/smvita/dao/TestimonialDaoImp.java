package com.smvita.dao;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.smvita.hibernate.entity.Testimonial;


@Repository
public class TestimonialDaoImp implements TestimonialDao
{

	@Autowired
	private SessionFactory sessionFactory ;
	;

	/* (non-Javadoc)
	 * @see dao.TestimonialDao#getTestimonials()
	 */
	@Override
	public List<Testimonial> getTestimonials() {
		
		Session currentSession = sessionFactory.getCurrentSession();
				Query<Testimonial> query = currentSession.createQuery("from Testimonial", Testimonial.class);
				List<Testimonial> t = query.getResultList();
				return t;
	}

	/* (non-Javadoc)
	 * @see dao.TestimonialDao#saveTestimonial(Pojo.Testimonial)
	 */
	@Override
	public void saveTestimonial(Testimonial testimonial) {
		
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(testimonial);		
	}

	/* (non-Javadoc)
	 * @see dao.TestimonialDao#getTestimonial(int)
	 */
	@Override
	public Testimonial getTestimonial(int id) {
		
		Session session = sessionFactory.getCurrentSession();		
		Testimonial te = session.get(Testimonial.class,id);
		return te;
	}

	

	
	
	
	
	

}
