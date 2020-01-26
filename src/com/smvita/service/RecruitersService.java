package com.smvita.service;

import java.util.List;

import com.smvita.hibernate.entity.Recruiters;
import com.smvita.hibernate.entity.Student;

public interface RecruitersService {

	public List<Recruiters> getRecruiters();
	public void saveRecruiter(Recruiters recruiter);
	public Recruiters getRecruiter(int id);
	public void deleteRecruiters(int id);
}
