package com.pfa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfa.entity.Entreprise;



@Repository
public interface EntrepriseRepository  extends JpaRepository <Entreprise, Long>{
	
}
