package com.pfa.service;

import java.util.List;

import com.pfa.entity.Actualite;
import com.pfa.entity.Experience;

public interface ExperienceService {
	
	
	public Experience getById(Long id);

	Experience create( Experience experience);

	Experience update (Experience experience);

	List<Experience> findAll();

	void delete(Long id);

	public List<Experience> getAll();
}
