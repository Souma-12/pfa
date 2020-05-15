package com.pfa.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "offres")

//@ToString(exclude = {"pass"})
public class Offre extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	private String type;
	private String technique;
	private String Pays;
	private Long salaire;
	private LocalDate dateDebut;
	private LocalDate dateFin;

	@OneToMany(mappedBy = "offre")
	private Set<Postulation> postulations;

	public Offre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Offre(Long id, LocalDateTime createdAt, LocalDateTime modifiedAt) {
		super(id, createdAt, modifiedAt);
		// TODO Auto-generated constructor stub
	}

	public Offre(Long id, LocalDateTime createdAt, LocalDateTime modifiedAt, String type, String technique, String pays,
			Long salaire, LocalDate dateDebut, LocalDate dateFin, Set<Postulation> postulations) {
		super(id, createdAt, modifiedAt);
		this.type = type;
		this.technique = technique;
		Pays = pays;
		this.salaire = salaire;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.postulations = postulations;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTechnique() {
		return technique;
	}

	public void setTechnique(String technique) {
		this.technique = technique;
	}

	public String getPays() {
		return Pays;
	}

	public void setPays(String pays) {
		Pays = pays;
	}

	public Long getSalaire() {
		return salaire;
	}

	public void setSalaire(Long salaire) {
		this.salaire = salaire;
	}

	public LocalDate getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}

	public LocalDate getDateFin() {
		return dateFin;
	}

	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	public Set<Postulation> getPostulations() {
		return postulations;
	}

	public void setPostulations(Set<Postulation> postulations) {
		this.postulations = postulations;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
