package com.pfa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfa.Entity.Offres;
import com.pfa.repository.OffresRepository;
import com.pfa.service.OffresService;

@Service
public class OffresServiceImpl implements OffresService {

	@Autowired
	OffresRepository  offresRepository;
	@Override
	public Offres getById(Long id) {
		Offres offres= offresRepository.getOne(id);
		return offres;
	}

	@Override
	public Offres create( Offres offres) {
		Offres result= offresRepository.save(offres);
		return result;
	}

	@Override
	public  Offres update(Offres offres) {
		Offres result= offresRepository.save(offres);
		return result;
	}

	@Override
	public List< Offres> findAll() {
		List< Offres> result=offresRepository.findAll();
		return result;
	}

	@Override
	public void delete(Long id) {
		try{
			offresRepository.deleteById(id);
		}catch (Exception e) {
			e.printStackTrace();
		
	}
		
	}}