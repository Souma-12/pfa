package com.pfa.service;

import java.util.List;

import com.pfa.Entity.Actualite;


public interface ActualiteService {
	
	public Actualite getById(Long id);

	Actualite create(Actualite actualite);

	Actualite update(Actualite actualite);

	List<Actualite> findAll();

	void delete(Long id);
	

	
	
}
