package com.pfa.service;

import java.util.List;

import com.pfa.Entity.Offres;


public interface OffresService {
	
	
	public Offres getById(Long id);

	Offres create( Offres offres);

	Offres update  (Offres offres);

	List<Offres> findAll();

	void delete(Long id);

}
