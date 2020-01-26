package com.smvita.dao;

import java.util.List;

import com.smvita.hibernate.entity.Testimonial;


public interface TestimonialDao {
	
	public List<Testimonial> getTestimonials();
	public void saveTestimonial(Testimonial testimonial);
	public Testimonial getTestimonial(int id);
	
}
