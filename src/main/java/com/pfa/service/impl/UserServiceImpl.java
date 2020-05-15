package com.pfa.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.pfa.dto.LoginRequest;
import com.pfa.entity.User;
import com.pfa.repository.RoleRepository;
import com.pfa.repository.UserRepository;
import com.pfa.service.UserService;

@Service(value = "userService")
public class UserServiceImpl implements UserDetailsService, UserService {

	@Autowired
	private BCryptPasswordEncoder bcryptEncoder;

	@Autowired
	UserRepository userRepository;
	@Autowired
	RoleRepository roleRepository;

	@Override
	public User getById(Long id) {
		User user = userRepository.getOne(id);
		return user;
	}

	@Override
	public User create(User user) {
		User result = userRepository.save(user);
		return result;
	}

	@Override
	public User update(User user) {
		User result = userRepository.save(user);
		return result;
	}

	@Override
	public List<User> findAll() {
		List<User> result = userRepository.findAll();
		return result;
	}

	@Override
	public void delete(Long id) {
		try {
			userRepository.deleteById(id);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	@Override
	public User findByUsername(String username) {
		Optional<User> result = Optional.ofNullable(userRepository.findByUsername(username));
		if (result.isPresent())
			return result.get();
		return null;
	}

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("Invalid username or password.");
		}
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
				getAuthority());
	}

	private List<SimpleGrantedAuthority> getAuthority() {
		return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
	}

	@Override
	public List<User> getAll() {
		List<User> result = userRepository.findAll();
		return result;
	}

	@Override
	public Boolean findByLogin(String email) {

		User user = userRepository.findByEmail(email);
		return user != null ? true : false;
	}

}