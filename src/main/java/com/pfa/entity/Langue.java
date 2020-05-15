package com.pfa.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table(name = "langue")
public class Langue extends AbstractEntity {

	private String nom;

	private String Langue;

	public Langue(Long id, LocalDateTime createdAt, LocalDateTime modifiedAt, String nom, String langue) {
		super(id, createdAt, modifiedAt);
		this.nom = nom;
		Langue = langue;
	}

	public Langue() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Langue(Long id, LocalDateTime createdAt, LocalDateTime modifiedAt) {
		super(id, createdAt, modifiedAt);
		// TODO Auto-generated constructor stub
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getLangue() {
		return Langue;
	}

	public void setLangue(String langue) {
		Langue = langue;
	}
	
	
	

}
