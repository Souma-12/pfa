package com.pfa.service;

import java.util.List;

import com.pfa.entity.Actualite;


public interface ActualiteService {
	
	public Actualite getById(Long id);

	Actualite create(Actualite actualite);

	Actualite update(Actualite actualite);

     List<Actualite> findAll();

	void delete(Long id);

	public List<Actualite> getAll();
	

	
	
}
