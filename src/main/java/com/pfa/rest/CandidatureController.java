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

import com.pfa.Entity.Candidature;
import com.pfa.service.CandidatureService;




@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class CandidatureController {
	Logger log = LoggerFactory.getLogger(CandidatureController.class);
	@Autowired
	CandidatureService candidatureService;
	@GetMapping("/candidature/{id}")
	public Candidature getCandidature(@PathVariable("id") Long id) {
		log.info(" get candidature");
		Candidature result = candidatureService.getById(id);
		log.info("candidature :{}", result.toString());
		return result;
	}
	
	
	@DeleteMapping("/candidature/{id}")
	public void deleteCandidature(@PathVariable("id") Long id) {
		log.info("delete candidature");
		candidatureService.delete(id);
	}
	
	@PutMapping("/candidature")
	public Candidature  putCandidature (@RequestBody Candidature  candidature) {
		Candidature  result=candidatureService.create(candidature);
	log.info("candidature :{}", result.toString());	
	return result;
	}
	
	@PostMapping("/candidature")
	public Candidature  postCandidature (@RequestBody Candidature  candidature) {
		Candidature  result=candidatureService.create(candidature);
		log.info("candidature :{}", result.toString());	
		return result;
	}
}
