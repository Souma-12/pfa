package com.pfa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfa.Entity.Candidature;

@Repository
public interface CandidatureRepository extends JpaRepository <Candidature, Long> {

}
