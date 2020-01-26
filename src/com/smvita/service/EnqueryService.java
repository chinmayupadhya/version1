package com.smvita.service;

import java.util.List;

import com.smvita.hibernate.entity.Enquery;


public interface EnqueryService {

	void addEnquery(Enquery e);
	List<Enquery>getEnqueries();
	void delete (int id);
	Enquery getEnquery(int id);

}
