package com.pfa.Entity;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
@DiscriminatorValue(value= "Entreprise")

public class Entreprise extends User {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue ( strategy = GenerationType.AUTO )
	private Long id;
	private String siteWeb;
	private Long TailleEntreprise;
	private String Secteur;
	private String Localisation;
	public Entreprise() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Entreprise(String siteWeb, Long tailleEntreprise, String secteur) {
		super();
		this.siteWeb = siteWeb;
		TailleEntreprise = tailleEntreprise;
		Secteur = secteur;
	}

	public Entreprise(Long id, String nom, String prenom, String telephone, Date dateNaiss, String adress, String email,
			String login, String pass, Date dateCreation, Date dateModification) {
		super(id, nom, prenom, telephone, dateNaiss, adress, email, login, pass, dateCreation, dateModification);
		// TODO Auto-generated constructor stub
	}

	public String getSiteWeb() {
		return siteWeb;
	}
	public void setSiteWeb(String siteWeb) {
		this.siteWeb = siteWeb;
	}
	public Long getTailleEntreprise() {
		return TailleEntreprise;
	}
	public void setTailleEntreprise(Long tailleEntreprise) {
		TailleEntreprise = tailleEntreprise;
	}
	public String getSecteur() {
		return Secteur;
	}
	public void setSecteur(String secteur) {
		Secteur = secteur;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Entreprise [siteWeb=" + siteWeb + ", TailleEntreprise=" + TailleEntreprise + ", Secteur=" + Secteur
				+ "]";
	}

	public String getLocalisation() {
		return Localisation;
	}

	public void setLocalisation(String localisation) {
		Localisation = localisation;
	}
	
	
	

}
