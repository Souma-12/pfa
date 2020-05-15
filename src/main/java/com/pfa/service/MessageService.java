package com.pfa.service;

import java.util.List;


import com.pfa.entity.Message;



public interface MessageService {
	
	public Message getById(Long id);

	Message create( Message message);

	Message update  (Message  message);

	List< Message> findAll();

	void delete(Long id);


	public List<Message> getAll();
}
