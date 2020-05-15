package com.pfa.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "domaine")

public class Domaine extends AbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getSpecialite() {
		return Specialite;
	}
	public void setSpecialite(String specialite) {
		Specialite = specialite;
	}
	public List<Offre> getOffre() {
		return offre;
	}
	public void setOffre(List<Offre> offre) {
		this.offre = offre;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Domaine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Domaine(Long id, LocalDateTime createdAt, LocalDateTime modifiedAt) {
		super(id, createdAt, modifiedAt);
		// TODO Auto-generated constructor stub
	}
	public Domaine(Long id, LocalDateTime createdAt, LocalDateTime modifiedAt, String nom, String specialite,
			List<Offre> offre) {
		super(id, createdAt, modifiedAt);
		this.nom = nom;
		Specialite = specialite;
		this.offre = offre;
	}
	private String nom;
	private String Specialite;
	@OneToMany
	List<Offre> offre;

}