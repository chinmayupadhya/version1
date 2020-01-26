package com.smvita.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smvita.dao.AnnouncementDAO;
import com.smvita.hibernate.entity.Announcement;

@Service
public class AnnouncementServiceImpl implements AnnouncementService {

	@Autowired
	private AnnouncementDAO announcementDao;
	
	@Override
	@Transactional
	public void addAnnouncement(Announcement announcement) {
		announcementDao.addAnnouncement(announcement);

	}

	@Override
	@Transactional
	public List<Announcement> getAnnouncements() {
		
		return announcementDao.getAnnouncements();
	}

	@Override
	@Transactional
	public void remove(int id) {
		announcementDao.delete(id);

	}

	@Override
	@Transactional
	public Announcement getAnnouncement(int id) {
		
		return announcementDao.getAnnouncement(id);
	}

}
