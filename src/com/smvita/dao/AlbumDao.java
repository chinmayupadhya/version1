package com.smvita.dao;

import java.util.List;

import com.smvita.hibernate.entity.Album;
import com.smvita.hibernate.entity.Photo;



public interface AlbumDao {

	
	public List<Album> getAlbum();
	public void saveAlbum(Album album ,int bId);
	public Album getAlbum(int bId);
	public void deleteAlbum(int bId);
	public void addPhoto(Photo photo,int aId);
	public List<Photo> getPhoto(int albumId);
}
