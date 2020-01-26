package com.smvita.dao;

import java.util.List;

import com.smvita.hibernate.entity.Enquery;

public interface EnqueryDAO 
{
	void addEnquery (Enquery e);
	List<Enquery> getEnqueries();
	void delete (int id);
	Enquery getEnquery(int id);
}
