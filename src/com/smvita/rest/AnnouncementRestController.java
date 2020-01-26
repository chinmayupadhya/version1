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

import com.smvita.hibernate.entity.Announcement;

import com.smvita.service.AnnouncementService;

@RestController
@CrossOrigin(origins = "http://192.168.43.192:4200",allowedHeaders = "*")
@RequestMapping("/api")
public class AnnouncementRestController {

	@Autowired
	private AnnouncementService announcementService;
	
	@GetMapping("/announcements")
	public List<Announcement> getAnnouncement(){
		
		return announcementService.getAnnouncements();
	}
	
	@GetMapping("/announcements/{aId}")
	public Announcement getAnnouncement(@PathVariable int aId) {
		
		Announcement announcement = announcementService.getAnnouncement(aId);
		return announcement;
	}
	
	@PostMapping("/announcements")
	public void saveAnnouncement(@RequestBody Announcement announcement) {
		announcement.setAnnId(0);
		announcementService.addAnnouncement(announcement);
	}
	
	@PutMapping("/announcements")
	public Announcement updateAnnouncement(@RequestBody Announcement announcement) {
		
		announcementService.addAnnouncement(announcement);
		return announcement;
	}
	
	@DeleteMapping("/announcements/{aId}")
	public String deleteAnnouncement(@PathVariable int aId) {
		
		announcementService.remove(aId);
		return "Deleted RecruiterId"+ aId;
	}
}
