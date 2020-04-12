package com.pfa.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfa.Entity.Entreprise;
import com.pfa.repository.EntrepriseRepository;
import com.pfa.service.EntrepriseService;
@Service
public class EntrepriseServiceImpl implements EntrepriseService {

	@Autowired
	EntrepriseRepository entrepriseRepository;
	@Override
	public Entreprise getById(Long id) {
		Entreprise entreprise= entrepriseRepository.getOne(id);
		return entreprise;
	}

	@Override
	public Entreprise create(Entreprise entreprise) {
		Entreprise result= entrepriseRepository.save(entreprise);
		return result;
	}

	@Override
	public Entreprise update(Entreprise entreprise) {
		Entreprise result= entrepriseRepository.save(entreprise);
		return result;
	}

	@Override
	public List<Entreprise> findAll() {
		List<Entreprise> result=entrepriseRepository.findAll();
		return result;
	}

	@Override
	public void delete(Long id) {
		try{
			entrepriseRepository.deleteById(id);
		}catch (Exception e) {
			e.printStackTrace();
		
	}
		
	}

}