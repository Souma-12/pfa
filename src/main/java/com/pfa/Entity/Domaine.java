package com.pfa.Entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="domaine")
public class Domaine implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue ( strategy = GenerationType.AUTO )
	private Long id;
	private String nom;
	private String Sousdomaine;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getSousdomaine() {
		return Sousdomaine;
	}
	public void setSousdomaine(String sousdomaine) {
		Sousdomaine = sousdomaine;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Domaine(Long id, String nom, String sousdomaine) {
		super();
		this.id = id;
		this.nom = nom;
		Sousdomaine = sousdomaine;
	}
	public Domaine() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Domaine [id=" + id + ", nom=" + nom + ", Sousdomaine=" + Sousdomaine + "]";
	}
	
	
	
	
	

}
