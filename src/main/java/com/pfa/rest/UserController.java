package com.pfa.rest;

import javax.websocket.server.PathParam;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pfa.dto.LoginRequest;
import com.pfa.entity.User;
import com.pfa.service.UserService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/user")
public class UserController {
	Logger log = LoggerFactory.getLogger(UserController.class);
	@Autowired
	UserService UserService;

	@GetMapping("/{id}")
	public User getUser(@PathVariable("id") Long id) {
		log.info("get user");
		User result = UserService.getById(id);
		log.info("user :{}", result.toString());
		return result;
	}

	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable("id") Long id) {
		log.info("delete user");
		UserService.delete(id);
	}

	@PutMapping("/")
	public User putUser(@RequestBody User user) {
		User result = UserService.create(user);
		log.info("user :{}", result.toString());
		return result;
	}

	@PostMapping("/")
	public User postUser(@RequestBody User user) {
		User result = UserService.create(user);
		log.info("user :{}", result.toString());
		return result;
	}
	@PostMapping("/findByLogin/{email}")
	public Boolean postUser(@PathVariable ("email") String email){
		log.info("email :{}", email);

	Boolean result=UserService.findByLogin(email);
	return result;}
	

}
