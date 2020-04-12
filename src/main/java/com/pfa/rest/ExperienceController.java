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

import com.pfa.Entity.Experience;
import com.pfa.service.ExperienceService;




@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class ExperienceController {
	Logger log = LoggerFactory.getLogger(ExperienceController.class);
	@Autowired
	ExperienceService experienceService;
	@GetMapping("/experience/{id}")
	public Experience getExperience(@PathVariable("id") Long id) {
		log.info(" get experience");
		Experience result = experienceService.getById(id);
		log.info("experience :{}", result.toString());
		return result;
	}
	
	
	@DeleteMapping("/experience/{id}")
	public void deleteExperience(@PathVariable("id") Long id) {
		log.info("delete experience");
		experienceService.delete(id);
	}
	
	@PutMapping("/experience")
	public Experience putExperience(@RequestBody Experience experience) {
		Experience result=experienceService.create(experience);
	log.info("experience :{}", result.toString());	
	return result;
	}
	
	@PostMapping("/experience")
	public Experience postExperience(@RequestBody Experience experience) {
		Experience result=experienceService.create(experience);
		log.info("experience :{}", result.toString());	
		return result;
	}
}
