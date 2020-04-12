package com.pfa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pfa.Entity.Domaine;

@Repository
public interface DomaineRepository  extends JpaRepository <Domaine,Long>{

}
