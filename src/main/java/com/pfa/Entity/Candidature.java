package com.pfa.Entity;

import java.io.File;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="candidature")
public class Candidature implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue ( strategy = GenerationType.AUTO )
	private String id;
	private String nom;
	private String prenom;
	private String email;
	private File cv;
	public Candidature() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Candidature(String id, String nom, String prenom, String email, File cv) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.cv = cv;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public File getCv() {
		return cv;
	}
	public void setCv(File cv) {
		this.cv = cv;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Candidature [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", cv=" + cv
				+ "]";
	}
	
	

}
