package com.smvita.hibernate.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="course")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c_id")
	private int cId;
	
	
	@Column(name = "course_name",nullable = false,unique = true,length = 50)
	private String courseName;
	
	@JsonIgnore
	@OneToMany(mappedBy = "courseId",cascade = CascadeType.ALL)
	private List<Batch> batch;
	
	@JsonIgnore
	@OneToOne(mappedBy = "course",cascade = CascadeType.ALL)
	private CourseDetail courseDetail;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	@CreationTimestamp
	@Column(name = "date_created")
	private Timestamp createdDate;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	@UpdateTimestamp
	@Column(name = "date_modified")
	private Timestamp modifiedDate;

	
	public Course() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Course(String courseName, List<Batch> batch, CourseDetail courseDetail) {
		this.courseName = courseName;
		this.batch = batch;
		this.courseDetail = courseDetail;
	}

	/**
	 * @return the cId
	 */
	public int getcId() {
		return cId;
	}
	
	
	
	/**
	 * @param cId the cId to set
	 */
	public void setcId(int cId) {
		this.cId = cId;
	}
	
	
	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}
	
	
	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	
	/**
	 * @return the batch
	 */
	public List<Batch> getBatch() {
		return batch;
	}
	
	
	/**
	 * @param batch the batch to set
	 */
	public void setBatch(List<Batch> batch) {
		this.batch = batch;
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
	 * @return the courseDetail
	 */
	public CourseDetail getCourseDetail() {
		return courseDetail;
	}

	/**
	 * @param courseDetail the courseDetail to set
	 */
	public void setCourseDetail(CourseDetail courseDetail) {
		this.courseDetail = courseDetail;
	}

	@Override
	public String toString() {
		return "Course [cId=" + cId + ", courseName=" + courseName + ", createdDate=" + createdDate + ", modifiedDate="
				+ modifiedDate + "]";
	}
	
	
	
	

}
