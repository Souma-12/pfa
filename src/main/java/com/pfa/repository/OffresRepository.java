package com.pfa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfa.Entity.Offres;

@Repository
public interface OffresRepository extends JpaRepository <Offres, Long> {

}
