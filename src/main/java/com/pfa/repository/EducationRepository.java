package com.pfa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfa.entity.Education;

@Repository
public interface EducationRepository extends JpaRepository <Education,Long>{

}
