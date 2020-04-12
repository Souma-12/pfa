package com.pfa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.pfa.Entity.Candidat;
import com.pfa.service.CandidatService;


@SpringBootApplication
public class Pfa1Application {
	@Autowired
	static
	CandidatService candidatService;

	public static void main(String[] args) {
		SpringApplication.run(Pfa1Application.class, args);
		Create();
	}

	private static void Create() {
		
	}
	

}
