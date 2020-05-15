package com.pfa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfa.entity.Offre;
import com.pfa.repository.OffreRepository;
import com.pfa.service.OffreService;

@Service
public class OffreServiceImpl implements OffreService {

	@Autowired
	OffreRepository  offreRepository;
	@Override
	public Offre getById(Long id) {
		Offre offre= offreRepository.getOne(id);
		return offre;
	}

	@Override
	public Offre create( Offre offre) {
		Offre result= offreRepository.save(offre);
		return result;
	}

	@Override
	public  Offre update(Offre offre) {
		Offre result= offreRepository.save(offre);
		return result;
	}

	@Override
	public List< Offre> findAll() {
		List< Offre> result=offreRepository.findAll();
		return result;
	}

	@Override
	public void delete(Long id) {
		try{
			offreRepository.deleteById(id);
		}catch (Exception e) {
			e.printStackTrace();
		
	}
		
	}

	@Override
	public List<Offre> getAll() {
		List< Offre> result=offreRepository.findAll();
		return result;
	}}