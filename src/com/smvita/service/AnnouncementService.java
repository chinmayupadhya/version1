package com.smvita.service;

import java.util.List;

import com.smvita.hibernate.entity.Announcement;

public interface AnnouncementService {


	void addAnnouncement(Announcement announcement);
	List<Announcement> getAnnouncements();
	void remove(int id);
	Announcement getAnnouncement(int id); 

}
