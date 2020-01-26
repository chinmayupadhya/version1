package com.smvita.hibernate.entity;

import java.sql.Timestamp;
import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "testimonial")
public class Testimonial {
	@Id
	@Column(name = "t_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tId;

	@Column(name = "email",nullable = false)
	private String email;

	@Column(name = "mobile_no",nullable = false)
	private String mobileNo;

	@Column(name = "content",nullable = false)
	private String text;

	@Column(name = "t_name",nullable = false)
	private String name;

	@Column(name = "caption")
	private String caption;

	@OneToOne
	@JoinColumn(name = "student_id")
	private Student student;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	@CreationTimestamp
	@Column(name = "date_created")
	private Timestamp createdDate;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	@UpdateTimestamp
	@Column(name = "date_modified")
	private Timestamp modifiedDate;

	public Testimonial() {
		// TODO Auto-generated constructor stub
	}

	public Testimonial(String email, String mobileNo, String text, String name, String caption, Student student) {
		this.email = email;
		this.mobileNo = mobileNo;
		this.text = text;
		this.name = name;
		this.caption = caption;
		this.student = student;
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
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
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
	 * @return the caption
	 */
	public String getCaption() {
		return caption;
	}

	/**
	 * @param caption the caption to set
	 */
	public void setCaption(String caption) {
		this.caption = caption;
	}

	/**
	 * @return the student
	 */
	public Student getStudent() {
		return student;
	}

	/**
	 * @param student the student to set
	 */
	public void setStudent(Student student) {
		this.student = student;
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
		return "Testimonial [tId=" + tId + ", email=" + email + ", mobileNo=" + mobileNo + ", text=" + text + ", name="
				+ name + ", caption=" + caption + ", student=" + student + ", createdDate=" + createdDate
				+ ", modifiedDate=" + modifiedDate + "]";
	}

	
	
	
	

}
