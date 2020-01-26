package com.smvita.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smvita.hibernate.entity.Recruiters;
import com.smvita.hibernate.entity.Student;
import com.smvita.service.RecruitersService;

@RestController
@CrossOrigin(origins = "http://192.168.43.192:4200",allowedHeaders = "*")
@RequestMapping("/api")
public class RecruitersRestController {
	
	@Autowired
	private RecruitersService recruiterService;
	
	
	@GetMapping("/recruiters")
	public List<Recruiters> getRecruiters(){
		
		return recruiterService.getRecruiters();
	}
	
	@GetMapping("/recruiters/{rId}")
	public Recruiters getRecruiter(@PathVariable int rId) {
		
		Recruiters recruiters = recruiterService.getRecruiter(rId);
		return recruiters;
	}
	
	@PostMapping("/recruiters")
	public void saveRecruiter(@RequestBody Recruiters recruiter) {
		recruiter.setrId(0);
		recruiterService.saveRecruiter(recruiter);
	}
	
	@PutMapping("/recruiters")
	public Recruiters updateRecruiter(@RequestBody Recruiters recruiter) {
		
		recruiterService.saveRecruiter(recruiter);
		return recruiter;
	}
	
	@DeleteMapping("/recruiters/{rId}")
	public String deleteRecruiter(@PathVariable int rId) {
		
		recruiterService.deleteRecruiters(rId);
		return "Deleted RecruiterId"+ rId;
	}
	

}
