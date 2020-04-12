package com.pfa.service;

import java.util.List;

import com.pfa.Entity.Candidat;

public interface CandidatService {
	
	
	
	public Candidat getById(Long id);

	Candidat create(Candidat candidat);

	Candidat update(Candidat candidat);

	List<Candidat> findAll();

	void delete(Long id);
	

}
