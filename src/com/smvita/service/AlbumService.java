package com.smvita.service;

import java.util.List;

import com.smvita.helper.AlbumHelper;
import com.smvita.helper.PhotoHelper;
import com.smvita.hibernate.entity.Album;
import com.smvita.hibernate.entity.Photo;



public interface AlbumService {

	
	public void addAlbum(AlbumHelper albumHelper);
	public List<Album> getAlbum();
	public void remove(int id);
	public Album getAlbum(int id); 
	public void addPhoto(PhotoHelper helper);
	public List<Photo> getPhoto(int albumId);
}
