package com.smvita.hibernate.entity;

import java.sql.Timestamp;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="course_detail")
public class CourseDetail {

	@Id
	@Column(name="course_detail_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int courseDetailId;
	
	
	@Column(name="course_link",nullable = true)
	private String link;
	
	
	@Column(name="course_description",nullable = false)
	private String courseDescription;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="course_id")
	private Course course;
	
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	@CreationTimestamp
	@Column(name = "date_created")
	private Timestamp createdDate;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	@UpdateTimestamp
	@Column(name = "date_modified")
	private Timestamp modifiedDate;

	
	public CourseDetail() {
		// TODO Auto-generated constructor stub
	}
	
	
	public CourseDetail(String link, String courseDescription, Course course) {
		this.link = link;
		this.courseDescription = courseDescription;
		this.course = course;
	
	}
	
	
	/**
	 * @return the courseDetailId
	 */
	public int getCourseDetailId() {
		return courseDetailId;
	}
	
	
	/**
	 * @param courseDetailId the courseDetailId to set
	 */
	public void setCourseDetailId(int courseDetailId) {
		this.courseDetailId = courseDetailId;
	}
	
	
	/**
	 * @return the link
	 */
	public String getLink() {
		return link;
	}
	
	
	/**
	 * @param link the link to set
	 */
	public void setLink(String link) {
		this.link = link;
	}
	
	
	/**
	 * @return the courseDescription
	 */
	public String getCourseDescription() {
		return courseDescription;
	}
	
	
	/**
	 * @param courseDescription the courseDescription to set
	 */
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	
	
	/**
	 * @return the course
	 */
	public Course getCourse() {
		return course;
	}
	
	
	/**
	 * @param course the course to set
	 */
	public void setCourse(Course course) {
		this.course = course;
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
		return "CourseDetail [courseDetailId=" + courseDetailId + ", link=" + link + ", courseDescription="
				+ courseDescription + "]";
	}
	
	
	
	
	
	
}
