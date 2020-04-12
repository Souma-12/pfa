package com.pfa.service;

import java.util.List;

import com.pfa.Entity.Experience;

public interface ExperienceService {
	
	
	public Experience getById(Long id);

	Experience create( Experience experience);

	Experience update (Experience experience);

	List<Experience> findAll();

	void delete(Long id);

}
