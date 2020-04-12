package com.pfa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfa.Entity.Candidat;
import com.pfa.repository.CandidatRepository;
import com.pfa.service.CandidatService;
@Service
public class CandidatServiceImpl implements CandidatService {

	
	@Autowired
	CandidatRepository candidatRepository;
	@Override
	public Candidat getById(Long id) {
	Candidat candidat= candidatRepository.getOne(id);
		return candidat;
	}

	@Override
	public Candidat create(Candidat candidat) {
		Candidat result= candidatRepository.save(candidat);
		return result;
	}

	@Override
	public Candidat update(Candidat candidat) {
		Candidat result= candidatRepository.save(candidat);
		return result;
	}

	@Override
	public List<Candidat> findAll() {
		List<Candidat> result=candidatRepository.findAll();
		return result;
	}

	@Override
	public void delete(Long id) {
		try{
			candidatRepository.deleteById(id);
		}catch (Exception e) {
			e.printStackTrace();
		
	}
		
	}

}
