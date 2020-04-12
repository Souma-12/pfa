package com.pfa.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="langue")
public class Langue implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue ( strategy = GenerationType.AUTO )
	private Long id;
	private String nom;
	private String niveau;
	public Langue() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Langue(Long id, String nom, String niveau) {
		super();
		this.id = id;
		this.nom = nom;
		this.niveau = niveau;
	}
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
	public String getNiveau() {
		return niveau;
	}
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Langue [id=" + id + ", nom=" + nom + ", niveau=" + niveau + "]";
	}
	
	
	
	
	

}
