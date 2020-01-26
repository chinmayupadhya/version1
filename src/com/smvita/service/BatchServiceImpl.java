package com.smvita.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smvita.dao.BatchDao;
import com.smvita.helper.BatchHelper;
import com.smvita.hibernate.entity.Batch;

@Service
public class BatchServiceImpl implements BatchService {

	//need to inject batch dao
	@Autowired
	private BatchDao batchDao;
	
	@Override
	@Transactional
	public List<Batch> getBatch() {
		
		return batchDao.getBatch();
	}

	@Override
	@Transactional
	public void saveBatch(BatchHelper batchHelper) {
		batchDao.saveBatch(batchHelper.getBatch(),batchHelper.getCourseId());

	}

	@Override
	@Transactional
	public Batch getBatch(int id) {
		
		return batchDao.getBatch(id);
	}

	@Override
	@Transactional
	public void deleteBatch(int id) {
		batchDao.deleteBatch(id);

	}

}
