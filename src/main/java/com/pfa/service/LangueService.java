package com.pfa.service;

import java.util.List;

import com.pfa.Entity.Langue;


public interface LangueService {
	
	
	
	public  Langue getById(Long id);

	 Langue create(  Langue langue);

	 Langue update  (Langue langue);

	List< Langue> findAll();

	void delete(Long id);

}
