package com.pfa.service;

import java.util.List;

import com.pfa.entity.Actualite;
import com.pfa.entity.Entreprise;

public interface EntrepriseService {
	
	
	public Entreprise getById(Long id);

	Entreprise create( Entreprise entreprise);

	Entreprise update (Entreprise entreprise);

	List< Entreprise> findAll();

	void delete(Long id);

	
	public List<Entreprise> getAll();

}
