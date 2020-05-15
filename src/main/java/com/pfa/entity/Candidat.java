package com.pfa.entity;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;



@Entity
public class Candidat extends User {

	private static final long serialVersionUID = 1L;
	
	
	@NotBlank
	@Column(nullable = false)
	private String prenom;
	
	
	private String titre;

	private String posteActuel;

	private String competance;

	@OneToMany
	private Set<Document> documents;

	@OneToMany(mappedBy = "owner")
	List<Education> educations;

	@OneToMany(mappedBy = "owner")
	List<Experience> experiences;

	@OneToMany(mappedBy = "candidat")
	Set<Postulation> postulations;

	@OneToMany(mappedBy = "candidate")
	private Set<CandidateLanguage> languages;

	public Candidat(@NotBlank String prenom, String titre, String posteActuel, String competance,
			Set<Document> documents, List<Education> educations, List<Experience> experiences,
			Set<Postulation> postulations, Set<CandidateLanguage> languages) {
		super();
		this.prenom = prenom;
		this.titre = titre;
		this.posteActuel = posteActuel;
		this.competance = competance;
		this.documents = documents;
		this.educations = educations;
		this.experiences = experiences;
		this.postulations = postulations;
		this.languages = languages;
	}

	public Candidat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Candidat(Long id, LocalDateTime createdAt, LocalDateTime modifiedAt, @NotBlank String nom, String telephone,
			Date dateNaiss, String adress, String pays, @Email @NotBlank String email, @NotBlank String username,
			@NotBlank String password) {
		super(id, createdAt, modifiedAt, nom, telephone, dateNaiss, adress, pays, email, username, password);
		// TODO Auto-generated constructor stub
	}

	public Candidat(Long id, LocalDateTime createdAt, LocalDateTime modifiedAt) {
		super(id, createdAt, modifiedAt);
		// TODO Auto-generated constructor stub
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getPosteActuel() {
		return posteActuel;
	}

	public void setPosteActuel(String posteActuel) {
		this.posteActuel = posteActuel;
	}

	public String getCompetance() {
		return competance;
	}

	public void setCompetance(String competance) {
		this.competance = competance;
	}

	public Set<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(Set<Document> documents) {
		this.documents = documents;
	}

	public List<Education> getEducations() {
		return educations;
	}

	public void setEducations(List<Education> educations) {
		this.educations = educations;
	}

	public List<Experience> getExperiences() {
		return experiences;
	}

	public void setExperiences(List<Experience> experiences) {
		this.experiences = experiences;
	}

	public Set<Postulation> getPostulations() {
		return postulations;
	}

	public void setPostulations(Set<Postulation> postulations) {
		this.postulations = postulations;
	}

	public Set<CandidateLanguage> getLanguages() {
		return languages;
	}

	public void setLanguages(Set<CandidateLanguage> languages) {
		this.languages = languages;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Candidat [prenom=" + prenom + ", titre=" + titre + ", posteActuel=" + posteActuel + ", competance="
				+ competance + ", documents=" + documents + ", educations=" + educations + ", experiences="
				+ experiences + ", postulations=" + postulations + ", languages=" + languages + "]";
	}

	
}