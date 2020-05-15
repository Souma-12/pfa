package com.pfa.service;

import java.util.List;

import com.pfa.entity.Actualite;
import com.pfa.entity.Domaine;


public interface DomaineService {
	
	
	
	public Domaine getById(Long id);

	 Domaine create( Domaine domaine);

	 Domaine update ( Domaine domaine);

	List<  Domaine> findAll();

	void delete(Long id);
	
	public List<Domaine> getAll();
}
