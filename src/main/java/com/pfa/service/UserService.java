package com.pfa.service;

import java.util.List;

import com.pfa.Entity.User;


public interface UserService {
	

	public User getById(Long id);

	User create( User user);

	User update  (User user);

	List<User> findAll();

	void delete(Long id);

}
