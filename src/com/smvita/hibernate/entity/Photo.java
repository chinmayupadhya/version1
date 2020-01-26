package com.smvita.hibernate.entity;

import java.sql.Timestamp;



import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="photo")
public class Photo {

	@Id
	@Column(name="p_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pId;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="album_id")
	private Album aId;
	
	@Column(name="image_path")
	private String imagePath;
	
	@Column(name="immage_name",nullable = true)
	private String imageName;
	
	@Column(name="cover")
	private Boolean cover;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	@CreationTimestamp
	@Column(name = "date_created")
	private Timestamp createdDate;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	@UpdateTimestamp
	@Column(name = "date_modified")
	private Timestamp modifiedDate;


	public Photo() {
		// TODO Auto-generated constructor stub
	}


	public Photo(Album aId, String imagePath, String imageName, Boolean cover) {
		this.aId = aId;
		this.imagePath = imagePath;
		this.imageName = imageName;
		this.cover = cover;
		
	}


	/**
	 * @return the pId
	 */
	public int getpId() {
		return pId;
	}


	/**
	 * @param pId the pId to set
	 */
	public void setpId(int pId) {
		this.pId = pId;
	}


	/**
	 * @return the aId
	 */
	public Album getaId() {
		return aId;
	}


	/**
	 * @param aId the aId to set
	 */
	public void setaId(Album aId) {
		this.aId = aId;
	}


	/**
	 * @return the imagePath
	 */
	public String getImagePath() {
		return imagePath;
	}


	/**
	 * @param imagePath the imagePath to set
	 */
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}


	/**
	 * @return the imageName
	 */
	public String getImageName() {
		return imageName;
	}


	/**
	 * @param imageName the imageName to set
	 */
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}


	/**
	 * @return the cover
	 */
	public Boolean getCover() {
		return cover;
	}


	/**
	 * @param cover the cover to set
	 */
	public void setCover(Boolean cover) {
		this.cover = cover;
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
		return "Photo [pId=" + pId + ", imagePath=" + imagePath + ", imageName=" + imageName + ", cover=" + cover + "]";
	}
	
	
	
}
