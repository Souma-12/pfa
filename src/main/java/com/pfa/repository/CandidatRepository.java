/**
 * 
 */
package com.pfa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfa.Entity.Candidat;

@Repository
public interface CandidatRepository  extends JpaRepository <Candidat, Long>{

}
