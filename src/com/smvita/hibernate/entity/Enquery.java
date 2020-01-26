package com.smvita.hibernate.entity;

import java.sql.Timestamp;
import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name="enquery")
public class Enquery {
	
	private int eId;
	private String name;
	private String email;
	private String message;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	@CreationTimestamp
	@Column(name = "date_created")
	private Timestamp createdDate;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	@UpdateTimestamp
	@Column(name = "date_modified")
	private Timestamp modifiedDate;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="e_id")
	public int geteId() {
		return eId;
	}

	/**
	 * @param eId the eId to set
	 */
	public void seteId(int eId) {
		this.eId = eId;
	}
	@Column(name="name",nullable = false,length = 50)
	public String getName() {
		return name;
	}
	
	/**
	 * @return the eId
	 */
	

	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="email",nullable = false)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name="message",nullable = false)
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Equery [e_id=" + eId + ", name=" + name + ", email=" + email + ", message=" + message + "]";
	}
	public Enquery(int eId, String name, String email, String message) {
		
		this.eId = eId;
		this.name = name;
		this.email = email;
		this.message = message;
	}
	
	

	/**
	 * @return the createdDate
	 */
	/**
	 * @return
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
	public Enquery()
	{
		
	}
	



}
