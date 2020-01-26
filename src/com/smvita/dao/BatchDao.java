package com.smvita.dao;

import java.util.List;

import com.smvita.hibernate.entity.Batch;


public interface BatchDao {

	public List<Batch> getBatch();
	public void saveBatch(Batch batch,int courseId);
	public Batch getBatch(int id);
	public void deleteBatch(int id);
}
