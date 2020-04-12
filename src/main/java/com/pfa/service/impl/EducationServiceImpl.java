package com.pfa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfa.Entity.Education;

import com.pfa.repository.EducationRepository;
import com.pfa.service.EducationService;
@Service
public class EducationServiceImpl implements EducationService {

	
	@Autowired
	EducationRepository educationRepository;
	
	@Override
	public Education getById(Long id) {
		Education  education= educationRepository.getOne(id);
		return  education;
	}

	@Override
	public Education create(Education education) {
		Education  result= educationRepository.save(education);
		return  result;
	}

	@Override
	public Education update(Education education) {
		Education  result= educationRepository.save(education);
		return  result;
	}

	@Override
	public List<Education> findAll() {
		List<Education> result=educationRepository.findAll();
		return result;
	}

	@Override
	public void delete(Long id) {
		try{
			educationRepository.deleteById(id);
		}catch (Exception e) {
			e.printStackTrace();
		
	}
		
	}

}
