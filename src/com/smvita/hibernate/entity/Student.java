package com.smvita.hibernate.entity;

import java.sql.Timestamp;


import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="student")
public class Student {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	
	@Column(name="student_prn",unique = true,nullable = false)
	private int prn;
	
	@Column(name="student_name",length = 60,nullable = false)
	private String name;
	
	@Column(name="student_mobile_no",length = 10,nullable = false)
	private String mobileNo;
	
	@Column(name="student_email",nullable = false)
	private String email;
	
	@JsonIgnore
	@OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
	private Testimonial testimonial;
	
	@Column(name="photograph")
	private String photograph;
	
	
	@ManyToOne
	@JoinColumn(name = "recruiters_id")
	private Recruiters recruitersId;
	
	@ManyToOne
	@JoinColumn(name = "batch_id")
	private Batch batchId;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	@CreationTimestamp
	@Column(name = "date_created")
	private Timestamp createdDate;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	@UpdateTimestamp
	@Column(name = "date_modified")
	private Timestamp modifiedDate;

	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(int prn, String name, String mobileNo, String email, 
			String photograph) {
		this.prn = prn;
		this.name = name;
		this.mobileNo = mobileNo;
		this.email = email;
		this.photograph = photograph;
		
	}
	
	
	/**
	 * @return the studentId
	 */
	public int getStudentId() {
		return studentId;
	}
	
	
	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	
	/**
	 * @return the prn
	 */
	public int getPrn() {
		return prn;
	}
	
	
	/**
	 * @param prn the prn to set
	 */
	public void setPrn(int prn) {
		this.prn = prn;
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
	 * @return the photograph
	 */
	public String getPhotograph() {
		return photograph;
	}
	
	
	/**
	 * @param photograph the photograph to set
	 */
	public void setPhotograph(String photograph) {
		this.photograph = photograph;
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
	
	
	

	/**
	 * @return the testimonial
	 */
	public Testimonial getTestimonial() {
		return testimonial;
	}


	/**
	 * @param testimonial the testimonial to set
	 */
	public void setTestimonial(Testimonial testimonial) {
		this.testimonial = testimonial;
	}


	/**
	 * @return the recruitersId
	 */
	public Recruiters getRecruitersId() {
		return recruitersId;
	}


	/**
	 * @param recruitersId the recruitersId to set
	 */
	public void setRecruitersId(Recruiters recruitersId) {
		this.recruitersId = recruitersId;
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


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", prn=" + prn + ", name=" + name + ", mobileNo=" + mobileNo
				+ ", email=" + email +" photograph="
				+ photograph + ", createdDate=" + createdDate + ", modifiedDate=" + modifiedDate + "]";
	}
	
	
	
	
}
