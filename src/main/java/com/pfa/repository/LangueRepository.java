package com.pfa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfa.entity.Langue;

@Repository
public interface LangueRepository extends JpaRepository <Langue,Long>{

}
