package com.pfa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pfa.Entity.Messageries;

@Repository
public interface MessageriesRepository extends JpaRepository <Messageries, Long> {
	
	

}
