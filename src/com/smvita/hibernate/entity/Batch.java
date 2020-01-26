package com.smvita.hibernate.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "batch")
public class Batch {

	@Id
	@Column(name = "batch_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int batchId;
	
	
	@Column(name = "batch_name",unique = true,nullable = true,length = 20)
	private String batchName;

	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="course_id")
	private Course courseId;

	@Column(name = "logo_path")
	private String logoPath;
	
	@Column(name="batch_year",nullable = false,unique = true)
	private String batchYear;
	
	@Column(name = "cover_photo",nullable = true)
	private String coverPhoto;
	
	@JsonIgnore
	@OneToOne(mappedBy = "batchId")
	private Album album;
	

	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	@CreationTimestamp
	@Column(name = "date_created")
	private Timestamp createdDate;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	@UpdateTimestamp
	@Column(name = "date_modified")
	private Timestamp modifiedDate;
	
	@JsonIgnore
	@OneToMany(mappedBy = "batchId",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Student> students;
	
	
	public Batch() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Batch(String batchName, Course courseId, String logoPath, String coverPhoto,List<Student> students) {
		this.batchName = batchName;
		this.courseId = courseId;
		this.logoPath = logoPath;
		this.coverPhoto = coverPhoto;
		
		this.students = students;
	}
	
	
	/**
	 * @return the batchId
	 */
	public int getBatchId() {
		return batchId;
	}
	
	
	/**
	 * @param batchId the batchId to set
	 */
	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}
	
	
	/**
	 * @return the batchName
	 */
	public String getBatchName() {
		return batchName;
	}
	
	
	/**
	 * @param batchName the batchName to set
	 */
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	
	
	
	
	/**
	 * @return the courseId
	 */
	public Course getCourseId() {
		return courseId;
	}
	
	
	/**
	 * @param courseId the courseId to set
	 */
	public void setCourseId(Course courseId) {
		this.courseId = courseId;
	}
	
	
	/**
	 * @return the logoPath
	 */
	public String getLogoPath() {
		return logoPath;
	}
	
	
	/**
	 * @param logoPath the logoPath to set
	 */
	public void setLogoPath(String logoPath) {
		this.logoPath = logoPath;
	}
	
	
	/**
	 * @return the coverPhoto
	 */
	public String getCoverPhoto() {
		return coverPhoto;
	}
	
	
	/**
	 * @param coverPhoto the coverPhoto to set
	 */
	public void setCoverPhoto(String coverPhoto) {
		this.coverPhoto = coverPhoto;
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
	 * @return the students
	 */
	public List<Student> getStudents() {
		return students;
	}
	
	
	/**
	 * @param students the students to set
	 */
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	/**
	 * @return the batchYear
	 */
	public String getBatchYear() {
		return batchYear;
	}


	/**
	 * @param batchYear the batchYear to set
	 */
	public void setBatchYear(String batchYear) {
		this.batchYear = batchYear;
	}

	
	
	/**
	 * @return the album
	 */
	public Album getAlbum() {
		return album;
	}


	/**
	 * @param album the album to set
	 */
	public void setAlbum(Album album) {
		this.album = album;
	}


	@Override
	public String toString() {
		return "Batch [batchId=" + batchId + ", batchName=" + batchName + ", courseId=" + courseId + ", logoPath="
				+ logoPath + ", coverPhoto=" + coverPhoto + "]";
	}

	
	
	

}
