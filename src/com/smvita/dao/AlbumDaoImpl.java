package com.smvita.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.smvita.hibernate.entity.Album;
import com.smvita.hibernate.entity.Batch;
import com.smvita.hibernate.entity.Photo;


@Repository
public class AlbumDaoImpl implements AlbumDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Album> getAlbum() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Album> query = currentSession.createQuery("from Album", Album.class);

		List<Album> album = query.getResultList();
		return album;
	}

	@Override
	public void saveAlbum(Album album, int bId) {
		Session session = sessionFactory.getCurrentSession();
		Batch batch = session.get(Batch.class, bId);
		album.setBatchId(batch);
		session.saveOrUpdate(batch);
	}

	@Override
	public Album getAlbum(int bId) {
			Session session = sessionFactory.getCurrentSession();
		
			Album album = session.get(Album.class,bId);
			return album;
	}

	@Override
	public void deleteAlbum(int bId) {
		Session session = sessionFactory.getCurrentSession();
		Query<Album> query = session.createQuery("delete from Album where aId=:albumId");
		query.setParameter("albumId", bId);
		query.executeUpdate();

	}

	@Override
	public void addPhoto(Photo photo, int aId) {
		Session session = sessionFactory.getCurrentSession();
		Album album = session.get(Album.class, aId);
		album.addPhotos(photo);
		session.saveOrUpdate(album);
		
	}

	@Override
	public List<Photo> getPhoto(int albumId) {
		// TODO Auto-generated method stub
		Album album = sessionFactory.getCurrentSession().get(Album.class, albumId);
		return album.getPhoto();
	}

}
