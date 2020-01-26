package com.smvita.dao;

import java.util.List;
import com.smvita.hibernate.entity.*;


public interface RecruitersDao {

	public List<Recruiters> getRecruiters();
	public void saveRecruiter(Recruiters recruiter);
	public Recruiters getRecruiter(int id);
	public void deleteRecruiters(int id);
}
