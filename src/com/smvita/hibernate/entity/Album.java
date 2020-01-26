package com.smvita.hibernate.entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="album")
public class Album {
	@Id
	@Column(name="a_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aId;
	
	@OneToOne
	@JoinColumn(name="batch_id")
	private Batch batchId;
	
	@Column(name="album_name",unique = true,length = 20)
	private String albumName;
	
	
	@OneToMany(mappedBy = "aId")
	private List<Photo> photo;
	
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	@CreationTimestamp
	@Column(name = "date_created")
	private Timestamp createdDate;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	@UpdateTimestamp
	@Column(name = "date_modified")
	private Timestamp modifiedDate;


	public Album() {
		// TODO Auto-generated constructor stub
	}


	public Album(Batch batchId, String albumName, List<Photo> photo) {
		this.batchId = batchId;
		this.albumName = albumName;
		this.photo = photo;
		}


	/**
	 * @return the aId
	 */
	public int getaId() {
		return aId;
	}


	/**
	 * @param aId the aId to set
	 */
	public void setaId(int aId) {
		this.aId = aId;
	}


	/**
	 * @return the batchId
	 */
	public Batch getBatchId() {
		return batchId;
	}


	/**
	 * @param batchId the batchId to set
	 */
	public void setBatchId(Batch batchId) {
		this.batchId = batchId;
	}


	/**
	 * @return the albumName
	 */
	public String getAlbumName() {
		return albumName;
	}


	/**
	 * @param albumName the albumName to set
	 */
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}


	/**
	 * @return the photo
	 */
	public List<Photo> getPhoto() {
		return photo;
	}


	/**
	 * @param photo the photo to set
	 */
	public void setPhoto(List<Photo> photo) {
		this.photo = photo;
	}


	/**
	 * @return the createdDate
	 */
	public Timestamp getCreatedDate() {
		return createdDate;
	}


	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}


	/**
	 * @return the modifiedDate
	 */
	public Timestamp getModifiedDate() {
		return modifiedDate;
	}


	/**
	 * @param modifiedDate the modifiedDate to set
	 */
	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}


	@Override
	public String toString() {
		return "Album [aId=" + aId + ", albumName=" + albumName + ", photo=" + photo + "]";
	}
	
	//Helper Method
	
	public void addPhotos(Photo p) {
		if (photo.isEmpty()) {
			photo = new ArrayList<Photo>();
		}
		p.setaId(this);
		photo.add(p);
		
	}
	
	
	

}
