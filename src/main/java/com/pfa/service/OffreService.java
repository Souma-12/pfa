package com.pfa.service;

import java.util.List;


import com.pfa.entity.Offre;


public interface OffreService {
	
	
	public Offre getById(Long id);

	Offre create( Offre offre);

	Offre update  (Offre offre);

	List<Offre> findAll();

	void delete(Long id);

	public List<Offre> getAll();

}
