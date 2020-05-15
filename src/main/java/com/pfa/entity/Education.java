package com.pfa.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "education")

//@ToString(exclude = {"pass"})
public class Education implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String ecole;
	private String diplome;
	private String domaineEtudes;
	private String activites;
	private Date dateDebut;
	private Date dateFin;
	@ManyToOne
	private Candidat owner;
	public Education() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Education(Long id, String ecole, String diplome, String domaineEtudes, String activites, Date dateDebut,
			Date dateFin, Candidat owner) {
		super();
		this.id = id;
		this.ecole = ecole;
		this.diplome = diplome;
		this.domaineEtudes = domaineEtudes;
		this.activites = activites;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.owner = owner;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEcole() {
		return ecole;
	}
	public void setEcole(String ecole) {
		this.ecole = ecole;
	}
	public String getDiplome() {
		return diplome;
	}
	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}
	public String getDomaineEtudes() {
		return domaineEtudes;
	}
	public void setDomaineEtudes(String domaineEtudes) {
		this.domaineEtudes = domaineEtudes;
	}
	public String getActivites() {
		return activites;
	}
	public void setActivites(String activites) {
		this.activites = activites;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public Candidat getOwner() {
		return owner;
	}
	public void setOwner(Candidat owner) {
		this.owner = owner;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
