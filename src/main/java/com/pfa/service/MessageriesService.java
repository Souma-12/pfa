package com.pfa.service;

import java.util.List;

import com.pfa.Entity.Messageries;



public interface MessageriesService {
	
	public Messageries getById(Long id);

	Messageries create( Messageries messageries);

	Messageries update  (Messageries  messageries);

	List< Messageries> findAll();

	void delete(Long id);

}
