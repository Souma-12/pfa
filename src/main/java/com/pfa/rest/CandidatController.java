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

import com.pfa.Entity.Candidat;
import com.pfa.service.CandidatService;



@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class CandidatController {
	Logger log = LoggerFactory.getLogger(CandidatController.class);
	@Autowired
	CandidatService candidatService;
	@GetMapping("/candidat/{id}")
	public Candidat getCandidat(@PathVariable("id") Long id) {
		log.info(" get candidat");
		Candidat result = candidatService.getById(id);
		log.info("candidat :{}", result.toString());
		return result;
	}
	
	
	@DeleteMapping("/candidat/{id}")
	public void deleteCandidat(@PathVariable("id") Long id) {
		log.info("delete candidat");
		candidatService.delete(id);
	}
	
	@PutMapping("/candidat")
	public Candidat putCandidat(@RequestBody Candidat candidat) {
		Candidat result=candidatService.create(candidat);
	log.info("candidat :{}", result.toString());	
	return result;
	}
	
	@PostMapping("/candidat")
	public Candidat postCandidat(@RequestBody Candidat candidat) {
		Candidat result=candidatService.create(candidat);
		log.info("candidat :{}", result.toString());	
		return result;
	}
}
