package com.pfa.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfa.Entity.Actualite;
import com.pfa.repository.ActualiteRepository;
import com.pfa.service.ActualiteService;
@Service
public class ActualiteServiceImpl implements ActualiteService{
	
	
	@Autowired
	ActualiteRepository actualiteRepository;

	@Override
	public Actualite getById(Long id) {
		Actualite actualite=actualiteRepository.getOne(id);
		return actualite;
	}

	@Override
	public Actualite create(Actualite actualite) {
		Actualite result=actualiteRepository.save(actualite);
		return result;
	}

	@Override
	public Actualite update(Actualite actualite) {
		Actualite result=actualiteRepository.save(actualite);
		return result;
	}

	@Override
	public List<Actualite> findAll() {
		List<Actualite> result=actualiteRepository.findAll();
		return result;
	}

	@Override
	public void delete(Long id) {
		try{
			actualiteRepository.deleteById(id);
		}catch (Exception e) {
			e.printStackTrace();
		
	}

}}
