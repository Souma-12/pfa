package com.pfa.service;

import java.util.List;

import com.pfa.Entity.Entreprise;

public interface EntrepriseService {
	
	
	public Entreprise getById(Long id);

	Entreprise create( Entreprise entreprise);

	Entreprise update (Entreprise entreprise);

	List< Entreprise> findAll();

	void delete(Long id);
	


}
