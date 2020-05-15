package com.pfa.service;

import java.util.List;

import com.pfa.entity.Actualite;
import com.pfa.entity.Candidat;

public interface CandidatService {
	
	
	
	public Candidat getById(Long id);

	Candidat create(Candidat candidat);

	Candidat update(Candidat candidat);

	List<Candidat> findAll();

	void delete(Long id);

	public List<Candidat> getAll();
	
	

}
