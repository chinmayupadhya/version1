package com.smvita.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smvita.dao.EnqueryDAO;
import com.smvita.hibernate.entity.Enquery;

@Service
public class EnqueryServiceImpl implements EnqueryService {

	@Autowired
	private EnqueryDAO enqueryDao;
	
	@Override
	@Transactional
	public void addEnquery(Enquery e) {
		enqueryDao.addEnquery(e);

	}

	@Override
	@Transactional
	public List<Enquery> getEnqueries() {
		
		return enqueryDao.getEnqueries();
	}

	@Override
	@Transactional
	public void delete(int id) {
		enqueryDao.delete(id);

	}

	@Override
	@Transactional
	public Enquery getEnquery(int id) {
		
		return enqueryDao.getEnquery(id);
	}

}
