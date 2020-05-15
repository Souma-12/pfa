package com.pfa.service;

import java.util.List;

import com.pfa.entity.Actualite;
import com.pfa.entity.Education;

public interface EducationService {
	
	
	public Education getById(Long id);

	Education create( Education education);

	Education update (Education education);

	List< Education> findAll();

	void delete(Long id);
	
	public List<Education> getAll();
}
