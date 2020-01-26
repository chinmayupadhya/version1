package com.smvita.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smvita.dao.AlbumDao;
import com.smvita.helper.AlbumHelper;
import com.smvita.helper.PhotoHelper;
import com.smvita.hibernate.entity.Album;
import com.smvita.hibernate.entity.Photo;

@Service
public class AlbumServiceImpl implements AlbumService {

	@Autowired
	private AlbumDao dao;
	
	@Override
	@Transactional
	public void addAlbum(AlbumHelper albumHelper) {
		dao.saveAlbum(albumHelper.getAlbum(), albumHelper.getBatchId());

	}

	@Override
	@Transactional
	public List<Album> getAlbum() {
		return dao.getAlbum();
	}

	@Override
	@Transactional
	public void remove(int id) {
		// TODO Auto-generated method stub
		dao.deleteAlbum(id);

	}

	@Override
	@Transactional
	public Album getAlbum(int id) {
		// TODO Auto-generated method stub
		return dao.getAlbum(id);
	}

	@Override
	@Transactional
	public void addPhoto(PhotoHelper helper) {
		// TODO Auto-generated method stub
		dao.addPhoto(helper.getPhoto(), helper.getAlbumId());
		
	}

	@Override
	@Transactional
	public List<Photo> getPhoto(int albumId) {
		// TODO Auto-generated method stub
		return dao.getPhoto(albumId);
	}

}
