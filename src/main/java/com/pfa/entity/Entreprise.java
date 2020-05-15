package com.pfa.entity;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;




//@ToString(exclude = {"pass"})
@Entity
public class Entreprise extends User {

	private static final long serialVersionUID = 1L;
	private String siteWeb;
	private Long tailleEntreprise;
	private String secteur;
	
	@OneToMany
	List<Offre> offre;

	public Entreprise(Long id, LocalDateTime createdAt, LocalDateTime modifiedAt, @NotBlank String nom,
			String telephone, Date dateNaiss, String adress, String pays, @Email @NotBlank String email,
			@NotBlank String username, @NotBlank String password, String siteWeb, Long tailleEntreprise, String secteur,
			List<Offre> offre) {
		super(id, createdAt, modifiedAt, nom, telephone, dateNaiss, adress, pays, email, username, password);
		this.siteWeb = siteWeb;
		this.tailleEntreprise = tailleEntreprise;
		this.secteur = secteur;
		this.offre = offre;
	}

	public Entreprise() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Entreprise(Long id, LocalDateTime createdAt, LocalDateTime modifiedAt, @NotBlank String nom,
			String telephone, Date dateNaiss, String adress, String pays, @Email @NotBlank String email,
			@NotBlank String username, @NotBlank String password) {
		super(id, createdAt, modifiedAt, nom, telephone, dateNaiss, adress, pays, email, username, password);
		// TODO Auto-generated constructor stub
	}

	public Entreprise(Long id, LocalDateTime createdAt, LocalDateTime modifiedAt) {
		super(id, createdAt, modifiedAt);
		// TODO Auto-generated constructor stub
	}

	public String getSiteWeb() {
		return siteWeb;
	}

	public void setSiteWeb(String siteWeb) {
		this.siteWeb = siteWeb;
	}

	public Long getTailleEntreprise() {
		return tailleEntreprise;
	}

	public void setTailleEntreprise(Long tailleEntreprise) {
		this.tailleEntreprise = tailleEntreprise;
	}

	public String getSecteur() {
		return secteur;
	}

	public void setSecteur(String secteur) {
		this.secteur = secteur;
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

	@Override
	public String toString() {
		return "Entreprise [siteWeb=" + siteWeb + ", tailleEntreprise=" + tailleEntreprise + ", secteur=" + secteur
				+ ", offre=" + offre + "]";
	}
	
	

}
