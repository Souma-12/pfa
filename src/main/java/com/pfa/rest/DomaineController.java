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

import com.pfa.Entity.Domaine;
import com.pfa.service.DomaineService;




@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class DomaineController {
	Logger log = LoggerFactory.getLogger(DomaineController.class);
	@Autowired
	DomaineService domaineService;
	@GetMapping("/domaine/{id}")
	public Domaine getDomaine(@PathVariable("id") Long id) {
		log.info(" get domaine");
		Domaine result = domaineService.getById(id);
		log.info("domaine :{}", result.toString());
		return result;
	}
	
	
	@DeleteMapping("/domaine/{id}")
	public void deleteDomaine(@PathVariable("id") Long id) {
		log.info("delete domaine");
		domaineService.delete(id);
	}
	
	@PutMapping("/domaine")
	public Domaine putDomaine(@RequestBody Domaine domaine) {
		Domaine result=domaineService.create(domaine);
	log.info("domaine :{}", result.toString());	
	return result;
	}
	
	@PostMapping("/domaine")
	public Domaine postDomaine(@RequestBody Domaine domaine) {
		Domaine result=domaineService.create(domaine);
		log.info("domaine :{}", result.toString());	
		return result;
	}
}
