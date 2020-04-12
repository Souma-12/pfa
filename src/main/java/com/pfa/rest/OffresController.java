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

import com.pfa.Entity.Offres;
import com.pfa.service.OffresService;




@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class OffresController {
	Logger log = LoggerFactory.getLogger(OffresController.class);
	@Autowired
	OffresService offresService;
	@GetMapping("/offres/{id}")
	public Offres getOffres(@PathVariable("id") Long id) {
		log.info(" get Offres");
		Offres result = offresService.getById(id);
		log.info("offres :{}", result.toString());
		return result;
	}
	
	
	@DeleteMapping("/offres/{id}")
	public void deleteOffres(@PathVariable("id") Long id) {
		log.info("delete offres");
		offresService.delete(id);
	}
	
	@PutMapping("/offres")
	public Offres putOffres(@RequestBody Offres offres) {
		Offres result=offresService.create(offres);
	log.info("offres :{}", result.toString());	
	return result;
	}
	
	@PostMapping("/offres")
	public Offres postOffres(@RequestBody Offres offres) {
		Offres result=offresService.create(offres);
		log.info("offres :{}", result.toString());	
		return result;
	}
}

