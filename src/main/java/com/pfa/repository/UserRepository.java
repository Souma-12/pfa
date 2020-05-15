package com.pfa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfa.dto.LoginRequest;
import com.pfa.entity.User;

@Repository
public interface UserRepository extends JpaRepository <User, Long>{

	User findByUsername(String username);

	User findByEmail(String email);
}
