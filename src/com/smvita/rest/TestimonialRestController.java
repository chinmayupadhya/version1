package com.smvita.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smvita.hibernate.entity.*;
import com.smvita.service.*;;

@RestController
@CrossOrigin(origins = "http://192.168.43.192:4200",allowedHeaders = "*")
@RequestMapping("/api")
public class TestimonialRestController 
{
	@Autowired
	TestimonialService testimonialservice;
	
	@GetMapping("/testimonials")
	public List<Testimonial> getTestimonials()
	{
		
		return testimonialservice.getTestimonials();
	}
	
	@GetMapping("/testimonials/{tId}")
	public Testimonial getTestimonial(@PathVariable int id)
	{
		
		System.out.println("***********************************"+id);
		return testimonialservice.getTestimonial(id);
	}
	
	@PostMapping("/testimonials")
	public void saveTestimonial(@RequestBody Testimonial testimonial)
	{
		testimonial.settId(0);
		testimonialservice.saveTestimonial(testimonial);
	}		
		
	
	
}