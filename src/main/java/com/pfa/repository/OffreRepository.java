package com.pfa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfa.entity.Offre;

@Repository
public interface OffreRepository extends JpaRepository <Offre, Long> {

}
