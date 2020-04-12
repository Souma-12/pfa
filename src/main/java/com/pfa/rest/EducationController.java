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

import com.pfa.Entity.Education;
import com.pfa.service.EducationService;



@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class EducationController {
	Logger log = LoggerFactory.getLogger(EducationController.class);
	@Autowired
	EducationService educationService;
	@GetMapping("/ education/{id}")
	public Education getEducation(@PathVariable("id") Long id) {
		log.info(" get  education");
		Education result = educationService.getById(id);
		log.info(" education :{}", result.toString());
		return result;
	}
	
	
	@DeleteMapping("/ education/{id}")
	public void deleteEducation(@PathVariable("id") Long id) {
		log.info("delete  education");
		educationService.delete(id);
	}
	
	@PutMapping("/education")
	public Education putEducation(@RequestBody Education education) {
		Education result=educationService.create(education);
	log.info("education :{}", result.toString());	
	return result;
	}
	
	@PostMapping("/education")
	public Education postEducation(@RequestBody Education education) {
		Education result=educationService.create(education);
		log.info("education :{}", result.toString());	
		return result;
	}
}
