package com.pfa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfa.Entity.Messageries;
import com.pfa.repository.MessageriesRepository;
import com.pfa.service.MessageriesService;

@Service
public class MessageriesServiceImpl implements MessageriesService {

	@Autowired
	 MessageriesRepository  messageriesRepository;
	@Override
	public Messageries getById(Long id) {
		 Messageries messageries= messageriesRepository.getOne(id);
		return messageries;
	}

	@Override
	public  Messageries create( Messageries messageries) {
		 Messageries result= messageriesRepository.save(messageries);
		return result;
	}

	@Override
	public  Messageries update( Messageries messageries) {
		 Messageries result= messageriesRepository.save(messageries);
		return result;
	}

	@Override
	public List< Messageries> findAll() {
		List< Messageries> result=messageriesRepository.findAll();
		return result;
	}

	@Override
	public void delete(Long id) {
		try{
			messageriesRepository.deleteById(id);
		}catch (Exception e) {
			e.printStackTrace();
		
	}
		
	}

}