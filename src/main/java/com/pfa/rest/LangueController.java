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

import com.pfa.Entity.Langue;
import com.pfa.service.LangueService;




@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class LangueController {
	Logger log = LoggerFactory.getLogger(LangueController.class);
	@Autowired
	LangueService langueService;
	@GetMapping("/langue/{id}")
	public Langue getLangue(@PathVariable("id") Long id) {
		log.info(" get langue");
		Langue result = langueService.getById(id);
		log.info("langue :{}", result.toString());
		return result;
	}
	
	
	@DeleteMapping("/langue/{id}")
	public void deleteLangue(@PathVariable("id") Long id) {
		log.info("delete langue");
		langueService.delete(id);
	}
	
	@PutMapping("/langue")
	public Langue putLangue(@RequestBody Langue langue) {
		Langue result=langueService.create(langue);
	log.info("langue :{}", result.toString());	
	return result;
	}
	
	@PostMapping("/langue")
	public Langue postLangue(@RequestBody Langue langue) {
		Langue result=langueService.create(langue);
		log.info("langue :{}", result.toString());	
		return result;
	}
}
