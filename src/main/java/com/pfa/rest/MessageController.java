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

import com.pfa.entity.Message;
import com.pfa.service.MessageService;




@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class MessageController {
	Logger log = LoggerFactory.getLogger(MessageController.class);
	@Autowired
	MessageService messageService;
	@GetMapping("/message/{id}")
	public Message getMessageries(@PathVariable("id") Long id) {
		log.info(" get message");
		Message result = messageService.getById(id);
		log.info("message :{}", result.toString());
		return result;
	}
	
	
	@DeleteMapping("/message/{id}")
	public void deleteMessageries(@PathVariable("id") Long id) {
		log.info("delete message");
		messageService.delete(id);
	}
	
	@PutMapping("/message")
	public Message putMessageries(@RequestBody Message message) {
		Message result=messageService.create(message);
	log.info("message :{}", result.toString());	
	return result;
	}
	
	@PostMapping("/message")
	public Message postMessageries(@RequestBody Message message) {
		Message result=messageService.create(message);
		log.info("message :{}", result.toString());	
		return result;
	}
}
