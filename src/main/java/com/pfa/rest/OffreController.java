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

import com.pfa.entity.Offre;
import com.pfa.service.OffreService;




@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class OffreController {
	Logger log = LoggerFactory.getLogger(OffreController.class);
	@Autowired
	OffreService offreService;
	@GetMapping("/offre/{id}")
	public Offre getOffres(@PathVariable("id") Long id) {
		log.info(" get Offre");
		Offre result = offreService.getById(id);
		log.info("offre :{}", result.toString());
		return result;
	}
	
	
	@DeleteMapping("/offre/{id}")
	public void deleteOffres(@PathVariable("id") Long id) {
		log.info("delete offre");
		offreService.delete(id);
	}
	
	@PutMapping("/offre")
	public Offre putOffres(@RequestBody Offre offre) {
		Offre result=offreService.create(offre);
	log.info("offre :{}", result.toString());	
	return result;
	}
	
	@PostMapping("/offre")
	public Offre postOffres(@RequestBody Offre offre) {
		Offre result=offreService.create(offre);
		log.info("offre :{}", result.toString());	
		return result;
	}
}

