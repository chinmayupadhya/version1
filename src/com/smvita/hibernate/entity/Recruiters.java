package com.smvita.hibernate.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "recruiters")
public class Recruiters {

	@Id
	@Column(name = "r_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rId;
	
	
	@Column(name = "r_name",unique = true,nullable = false)
	private String rName;
	
	
	@Column(name = "r_link",nullable = true)
	private String rLink;
	
	
	@Column(name = "image_path")
	private String imagePath;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	@CreationTimestamp
	@Column(name = "date_created")
	private Timestamp createdDate;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	@UpdateTimestamp
	@Column(name = "date_modified")
	private Timestamp modifiedDate;

	
	@JsonIgnore
	@OneToMany(mappedBy = "recruitersId",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Student> students;
	
	
	public Recruiters() {

		// TODO Auto-generated constructor stub
	}
	public Recruiters(String rName, String rLink, String imagePath, List<Student> students) {
		this.rName = rName;
		this.rLink = rLink;
		this.imagePath = imagePath;
		this.students = students;
	}
	/**
	 * @return the rId

	 */
	public int getrId() {
		return rId;
	}
	
	
	/**
	 * @param rId the rId to set
	 */
	public void setrId(int rId) {
		this.rId = rId;
	}
	/**
	 * @return the rName
	 */
	public String getrName() {
		return rName;
	}
	/**
	 * @param rName the rName to set
	 */
	public void setrName(String rName) {
		this.rName = rName;
	}
	
	
	/**
	 * @return the rLink
	 */
	public String getrLink() {
		return rLink;
	}
	
	
	/**
	 * @param rLink the rLink to set
	 */
	public void setrLink(String rLink) {
		this.rLink = rLink;
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
	
	
	@Override
	public String toString() {
		return "Recruiters [rId=" + rId + ", rName=" + rName + ", rLink=" + rLink + ", imagePath=" + imagePath + "]";
	}
	
	
	

}
