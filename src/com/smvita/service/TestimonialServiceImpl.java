package com.smvita.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smvita.hibernate.entity.*;
import com.smvita.dao.*;;

@Service
public class TestimonialServiceImpl  implements TestimonialService{

	@Autowired
	TestimonialDao testimonialdao;
	
	@Override
	@Transactional
	public List<Testimonial> getTestimonials() {
		// TODO Auto-generated method stub
		return testimonialdao.getTestimonials();
	}

	@Override
	@Transactional
	public void saveTestimonial(Testimonial testimonial) {
		// TODO Auto-generated method stub
		testimonialdao.saveTestimonial(testimonial);
	}

	@Override
	@Transactional
	public Testimonial getTestimonial(int id) {
		
		System.out.println("###################"+id);
		return testimonialdao.getTestimonial(id);
		
	}

}
