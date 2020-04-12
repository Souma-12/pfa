package com.pfa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfa.Entity.User;

import com.pfa.repository.UserRepository;
import com.pfa.service.UserService;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository  userRepository;
	@Override
	public User getById(Long id) {
		User user= userRepository.getOne(id);
		return user;
	}

	@Override
	public  User create( User user) {
		User result= userRepository.save(user);
		return result;
	}

	@Override
	public  User update( User user) {
		User result= userRepository.save(user);
		return result;
	}

	@Override
	public List< User> findAll() {
		List< User> result=userRepository.findAll();
		return result;
	}

	@Override
	public void delete(Long id) {
		try{
			userRepository.deleteById(id);
		}catch (Exception e) {
			e.printStackTrace();
		
	}
		
	}}