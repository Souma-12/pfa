package com.pfa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfa.entity.Message;

@Repository
public interface MessageRepository extends JpaRepository <Message, Long> {
	
	

}
