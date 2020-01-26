package com.smvita.helper;

import com.smvita.hibernate.entity.Photo;

public class PhotoHelper {

	Photo photo;
	int albumId;
	public PhotoHelper() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the photo
	 */
	public Photo getPhoto() {
		return photo;
	}
	/**
	 * @param photo the photo to set
	 */
	public void setPhoto(Photo photo) {
		this.photo = photo;
	}
	/**
	 * @return the albumId
	 */
	public int getAlbumId() {
		return albumId;
	}
	/**
	 * @param albumId the albumId to set
	 */
	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}
	
	
}
