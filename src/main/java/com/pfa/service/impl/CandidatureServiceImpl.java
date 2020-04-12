package com.pfa.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfa.Entity.Candidat;
import com.pfa.Entity.Candidature;
import com.pfa.repository.CandidatureRepository;
import com.pfa.service.CandidatureService;

@Service
public class CandidatureServiceImpl implements CandidatureService {

	@Autowired
	CandidatureRepository candidatureRepository;
	@Override
	public Candidature getById(Long id) {
		Candidature candidature=candidatureRepository.getOne(id);
		return candidature;
	}

	@Override
	public Candidature create(Candidature candidature) {
		Candidature result=candidatureRepository.save(candidature);
		return result;
	}

	@Override
	public Candidature update(Candidature candidature) {
		Candidature result= candidatureRepository.save(candidature);
		return result;
	}

	@Override
	public List<Candidature> findAll() {
		List<Candidature> result=candidatureRepository.findAll();
		return result;
	}

	@Override
	public void delete(Long id) {
		try{
			candidatureRepository.deleteById(id);
		}catch (Exception e) {
			e.printStackTrace();
		
		
	}

}}
