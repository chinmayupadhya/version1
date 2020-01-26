package com.smvita.hibernate.entity;

import java.sql.Timestamp;


import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="teacher")
public class Teacher {

	@Id
	@Column(name="t_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tId;
	
	@Column(name="t_name",nullable = false,length=60)
	private String name;
	
	@Column(name="modules",nullable = false)
	private String modules;
	
	@Column(name="experience")
	private int experience;
	
	@Column(name="email")
	private String email;
	
	@Column(name="mobile_no",length = 10)
	private String mobileNo;
	
	@Column(name="bio")
	private String bio;
	
	@Column(name="image_path")
	private String imagePath;
	
	@Column(name="facebook_link")
	private String facebookLink;
	
	@Column(name="linkdin_link")
	private String linkdinLink;
	
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	@CreationTimestamp
	@Column(name = "date_created")
	private Timestamp createdDate;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	@UpdateTimestamp
	@Column(name = "date_modified")
	private Timestamp modifiedDate;


	public Teacher() {
		// TODO Auto-generated constructor stub
	}


	public Teacher(String name, String modules, int experience, String email, String mobileNo, String bio,
			String imagePath, String facebookLink, String linkdinLink) {
		this.name = name;
		this.modules = modules;
		this.experience = experience;
		this.email = email;
		this.mobileNo = mobileNo;
		this.bio = bio;
		this.imagePath = imagePath;
		this.facebookLink = facebookLink;
		this.linkdinLink = linkdinLink;
		
	}


	/**
	 * @return the tId
	 */
	public int gettId() {
		return tId;
	}


	/**
	 * @param tId the tId to set
	 */
	public void settId(int tId) {
		this.tId = tId;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the modules
	 */
	public String getModules() {
		return modules;
	}


	/**
	 * @param modules the modules to set
	 */
	public void setModules(String modules) {
		this.modules = modules;
	}


	/**
	 * @return the experience
	 */
	public int getExperience() {
		return experience;
	}


	/**
	 * @param experience the experience to set
	 */
	public void setExperience(int experience) {
		this.experience = experience;
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the mobileNo
	 */
	public String getMobileNo() {
		return mobileNo;
	}


	/**
	 * @param mobileNo the mobileNo to set
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}


	/**
	 * @return the bio
	 */
	public String getBio() {
		return bio;
	}


	/**
	 * @param bio the bio to set
	 */
	public void setBio(String bio) {
		this.bio = bio;
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
	 * @return the facebookLink
	 */
	public String getFacebookLink() {
		return facebookLink;
	}


	/**
	 * @param facebookLink the facebookLink to set
	 */
	public void setFacebookLink(String facebookLink) {
		this.facebookLink = facebookLink;
	}


	/**
	 * @return the linkdinLink
	 */
	public String getLinkdinLink() {
		return linkdinLink;
	}


	/**
	 * @param linkdinLink the linkdinLink to set
	 */
	public void setLinkdinLink(String linkdinLink) {
		this.linkdinLink = linkdinLink;
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
		return "Teacher [tId=" + tId + ", name=" + name + ", modules=" + modules + ", experience=" + experience
				+ ", email=" + email + ", mobileNo=" + mobileNo + ", bio=" + bio + ", imagePath=" + imagePath
				+ ", facebookLink=" + facebookLink + ", linkdinLink=" + linkdinLink + "]";
	}
	
	
}
