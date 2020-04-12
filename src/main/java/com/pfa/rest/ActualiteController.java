package com.pfa.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfa.Entity.Actualite;
import com.pfa.service.ActualiteService;



@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class ActualiteController {
	Logger log = LoggerFactory.getLogger(ActualiteController.class);
	@Autowired
	ActualiteService actualiteService;
	@GetMapping("/actualite/{id}")
	public Actualite getActualite(@PathVariable("id") Long id) {
		log.info(" get actualite");
		Actualite result = actualiteService.getById(id);
		log.info("actualite :{}", result.toString());
		return result;
	}
	
	
	@DeleteMapping("/actualite/{id}")
	public void deleteActualite(@PathVariable("id") Long id) {
		log.info("delete actualite");
		actualiteService.delete(id);
	}
	
	@PutMapping("/actualite")
	public Actualite putActualite(@RequestBody Actualite actualite) {
		Actualite result=actualiteService.create(actualite);
	log.info("actualite :{}", result.toString());	
	return result;
	}
	
	@PostMapping("/actualite")
	public Actualite postActualite(@RequestBody Actualite actualite) {
		Actualite result=actualiteService.create(actualite);
		log.info("actualite :{}", result.toString());	
		return result;
	}
}
