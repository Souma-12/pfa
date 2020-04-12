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

import com.pfa.Entity.Entreprise;
import com.pfa.service.EntrepriseService;




@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class EntrepriseController {
	Logger log = LoggerFactory.getLogger(EntrepriseController.class);
	@Autowired
	EntrepriseService entrepriseService;
	@GetMapping("/entreprise/{id}")
	public Entreprise getEntreprise(@PathVariable("id") Long id) {
		log.info(" get entreprise");
		Entreprise result = entrepriseService.getById(id);
		log.info("entreprise :{}", result.toString());
		return result;
	}
	
	
	@DeleteMapping("/entreprise/{id}")
	public void deleteEntreprise(@PathVariable("id") Long id) {
		log.info("delete entreprise");
		entrepriseService.delete(id);
	}
	
	@PutMapping("/entreprise")
	public Entreprise putEntreprise(@RequestBody Entreprise entreprise) {
		Entreprise result=entrepriseService.create(entreprise);
	log.info("entreprise :{}", result.toString());	
	return result;
	}
	
	@PostMapping("/entreprise")
	public Entreprise postEntreprise(@RequestBody Entreprise entreprise) {
		Entreprise result=entrepriseService.create(entreprise);
		log.info("entreprise :{}", result.toString());	
		return result;
	}
}
