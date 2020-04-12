package com.pfa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfa.Entity.Langue;
import com.pfa.repository.LangueRepository;
import com.pfa.service.LangueService;

@Service
public class LangueServiceImpl implements LangueService {

	@Autowired
	 LangueRepository langueRepository;
	@Override
	public Langue getById(Long id) {
		Langue langue= langueRepository.getOne(id);
		return langue;
	}

	@Override
	public Langue create(Langue langue) {
		Langue result= langueRepository.save(langue);
		return result;
	}

	@Override
	public Langue update (Langue langue) {
		Langue result= langueRepository.save(langue);
		return result;
	}

	@Override
	public List<Langue> findAll() {
		List<Langue> result=langueRepository.findAll();
		return result;
	}

	@Override
	public void delete(Long id) {
		try{
			langueRepository.deleteById(id);
		}catch (Exception e) {
			e.printStackTrace();
		
	}
		
	}

}