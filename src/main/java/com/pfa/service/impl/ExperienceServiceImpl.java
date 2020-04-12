package com.pfa.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfa.Entity.Experience;
import com.pfa.repository.ExperienceRepository;
import com.pfa.service.ExperienceService;

@Service
public class ExperienceServiceImpl implements ExperienceService {

	
	
	@Autowired
	ExperienceRepository experienceRepository;
	@Override
	public Experience getById(Long id) {
		Experience experience= experienceRepository.getOne(id);
		return experience;
	}

	@Override
	public Experience create(Experience experience) {
		Experience result= experienceRepository.save(experience);
		return result;
	}

	@Override
	public Experience update(Experience experience) {
		Experience result= experienceRepository.save(experience);
		return result;
	}

	@Override
	public List<Experience> findAll() {
		List<Experience> result=experienceRepository.findAll();
		return result;
	}

	@Override
	public void delete(Long id) {
		try{
			experienceRepository.deleteById(id);
		}catch (Exception e) {
			e.printStackTrace();
		
	}
		
	}

}