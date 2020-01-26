package com.smvita.service;

import java.util.List;

import com.smvita.hibernate.entity.*;;

public interface TestimonialService {
	
	public List<Testimonial> getTestimonials();
	public void saveTestimonial(Testimonial testimonial);
	public Testimonial getTestimonial(int id);

}
