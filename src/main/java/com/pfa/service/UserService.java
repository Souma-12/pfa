package com.pfa.service;

import java.util.List;

import com.pfa.dto.LoginRequest;
import com.pfa.entity.User;


public interface UserService {
	

	public User getById(Long id);

	User create( User user);

	User update  (User user);

	List<User> findAll();

	void delete(Long id);

	public User findByUsername(String username);

	public List<User> getAll();
	public  Boolean  findByLogin (String email);
	

}
