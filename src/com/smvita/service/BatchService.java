package com.smvita.service;

import java.util.List;

import com.smvita.helper.BatchHelper;
import com.smvita.hibernate.entity.Batch;

public interface BatchService {

	public List<Batch> getBatch();
	public void saveBatch(BatchHelper batch);
	public Batch getBatch(int id);
	public void deleteBatch(int id);
}
