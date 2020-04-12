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

import com.pfa.Entity.User;
import com.pfa.service.UserService;




@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class UserController {
	Logger log = LoggerFactory.getLogger(UserController.class);
	@Autowired
	UserService UserService;
	@GetMapping("/user/{id}")
	public User getUser(@PathVariable("id") Long id) {
		log.info("get user");
		User result = UserService.getById(id);
		log.info("user :{}", result.toString());
		return result;
	}
	
	
	@DeleteMapping("/user/{id}")
	public void deleteUser(@PathVariable("id") Long id) {
		log.info("delete user");
		UserService.delete(id);
	}
	
	@PutMapping("/user")
	public User putUser(@RequestBody User user) {
		User result=UserService.create(user);
	log.info("user :{}", result.toString());	
	return result;
	}
	
	@PostMapping("/user")
	public User postUser(@RequestBody User user) {
		User result=UserService.create(user);
		log.info("user :{}", result.toString());	
		return result;
	}
}
