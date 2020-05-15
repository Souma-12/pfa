package com.pfa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfa.entity.Message;
import com.pfa.repository.MessageRepository;
import com.pfa.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService {

	@Autowired
	MessageRepository messageRepository;

	@Override
	public Message getById(Long id) {
		Message message = messageRepository.getOne(id);
		return message;
	}

	@Override
	public Message create(Message message) {
		Message result = messageRepository.save(message);
		return result;
	}

	@Override
	public Message update(Message message) {
		Message result = messageRepository.save(message);
		return result;
	}

	@Override
	public List<Message> findAll() {
		List<Message> result = messageRepository.findAll();
		return result;
	}

	@Override
	public void delete(Long id) {
		try {
			messageRepository.deleteById(id);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	@Override
	public List<Message> getAll() {
		List<Message> result = messageRepository.findAll();
		return result;
	}

}