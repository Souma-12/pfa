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

import com.pfa.Entity.Messageries;
import com.pfa.service.MessageriesService;




@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class MessageriesController {
	Logger log = LoggerFactory.getLogger(MessageriesController.class);
	@Autowired
	MessageriesService messageriesService;
	@GetMapping("/messageries/{id}")
	public Messageries getMessageries(@PathVariable("id") Long id) {
		log.info(" get messageries");
		Messageries result = messageriesService.getById(id);
		log.info("messageries :{}", result.toString());
		return result;
	}
	
	
	@DeleteMapping("/messageries/{id}")
	public void deleteMessageries(@PathVariable("id") Long id) {
		log.info("delete messageries");
		messageriesService.delete(id);
	}
	
	@PutMapping("/messageries")
	public Messageries putMessageries(@RequestBody Messageries messageries) {
		Messageries result=messageriesService.create(messageries);
	log.info("messageries :{}", result.toString());	
	return result;
	}
	
	@PostMapping("/messageries")
	public Messageries postMessageries(@RequestBody Messageries messageries) {
		Messageries result=messageriesService.create(messageries);
		log.info("messageries :{}", result.toString());	
		return result;
	}
}
