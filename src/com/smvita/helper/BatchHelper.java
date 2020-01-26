package com.smvita.helper;

import com.smvita.hibernate.entity.Batch;

public class BatchHelper {
	
	Batch batch;
	int courseId;
	
	
	public BatchHelper() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the batch
	 */
	public Batch getBatch() {
		return batch;
	}
	/**
	 * @param batch the batch to set
	 */
	public void setBatch(Batch batch) {
		this.batch = batch;
	}
	/**
	 * @return the courseId
	 */
	public int getCourseId() {
		return courseId;
	}
	/**
	 * @param courseId the courseId to set
	 */
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

}
