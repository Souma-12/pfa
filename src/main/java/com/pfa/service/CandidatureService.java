package com.pfa.service;

import java.util.List;

import com.pfa.Entity.Candidature;


public interface CandidatureService {
	
	
	public Candidature getById(Long id);

	 Candidature create( Candidature candidature);

	 Candidature update (Candidature candidature);

	List< Candidature> findAll();

	void delete(Long id);
	

}
