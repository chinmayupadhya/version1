package com.smvita.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smvita.dao.RecruitersDao;
import com.smvita.hibernate.entity.Recruiters;
import com.smvita.hibernate.entity.Student;

@Service
public class RecruitersServiceImpl implements RecruitersService {

	//need to inject the customer dao
	@Autowired
	private RecruitersDao recruitersDao;
	
	@Override
	@Transactional
	public List<Recruiters> getRecruiters() {
		
		return recruitersDao.getRecruiters();
	}

	@Override
	@Transactional
	public void saveRecruiter(Recruiters recruiter) {
		recruitersDao.saveRecruiter(recruiter);
		
	}

	@Override
	@Transactional
	public Recruiters getRecruiter(int id) {
		
		return recruitersDao.getRecruiter(id);
	}

	@Override
	@Transactional
	public void deleteRecruiters(int id) {
		recruitersDao.deleteRecruiters(id);
		
	}

}
