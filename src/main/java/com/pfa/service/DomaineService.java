package com.pfa.service;

import java.util.List;

import com.pfa.Entity.Domaine;


public interface DomaineService {
	
	
	
	public Domaine getById(Long id);

	 Domaine create( Domaine domaine);

	 Domaine update ( Domaine domaine);

	List<  Domaine> findAll();

	void delete(Long id);
	

}
