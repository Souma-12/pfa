package com.pfa.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="messageries")
public class Messageries implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue ( strategy = GenerationType.AUTO )
	private Long id;
	private String message;
	private String emetteur;
	private String distinataire;
	public Messageries() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Messageries(Long id, String message, String emetteur, String distinataire) {
		super();
		this.id = id;
		this.message = message;
		this.emetteur = emetteur;
		this.distinataire = distinataire;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getEmetteur() {
		return emetteur;
	}
	public void setEmetteur(String emetteur) {
		this.emetteur = emetteur;
	}
	public String getDistinataire() {
		return distinataire;
	}
	public void setDistinataire(String distinataire) {
		this.distinataire = distinataire;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Messageries [id=" + id + ", message=" + message + ", emetteur=" + emetteur + ", distinataire="
				+ distinataire + "]";
	}
	
	
	
	

}
