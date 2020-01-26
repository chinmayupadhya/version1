/**
 * 
 */
package com.smvita.dao;

import java.util.List;

import com.smvita.hibernate.entity.Announcement;

/**
 * @author 
 *
 */
public interface AnnouncementDAO 
{
	void addAnnouncement(Announcement announcement);
	List <Announcement> getAnnouncements();
	void delete(int id);
	Announcement getAnnouncement(int id);
}
