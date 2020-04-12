package com.pfa.service;

import java.util.List;

import com.pfa.Entity.Education;

public interface EducationService {
	
	
	public Education getById(Long id);

	Education create( Education education);

	Education update (Education education);

	List< Education> findAll();

	void delete(Long id);
	

}
