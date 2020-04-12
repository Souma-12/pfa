package com.pfa.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfa.Entity.Domaine;
import com.pfa.repository.DomaineRepository;
import com.pfa.service.DomaineService;
@Service
public class DomaineServiceImpl implements DomaineService {

	
	
	@Autowired
	DomaineRepository domaineRepository;
	@Override
	public Domaine getById(Long id) {
		Domaine  domaine= domaineRepository.getOne(id);
		return  domaine;
	}

	@Override
	public Domaine create(Domaine domaine) {
		Domaine result=domaineRepository.save(domaine);
		return result;
	}

	@Override
	public Domaine update(Domaine domaine) {
		Domaine result=domaineRepository.save(domaine);
		return result;
	}

	@Override
	public List<Domaine> findAll() {
		List<Domaine> result=domaineRepository.findAll();
		return result;
	}

	@Override
	public void delete(Long id) {
		try{
			domaineRepository.deleteById(id);
		}catch (Exception e) {
			e.printStackTrace();
		
	}
		
		
	}

}
