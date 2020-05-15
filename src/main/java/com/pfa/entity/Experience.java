package com.pfa.entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "experience")

//@ToString(exclude = {"pass"})
public class Experience extends AbstractEntity {

	private String description;
	private String company;
	private Date datedebut;
	private Date datefin;

	@ManyToOne
	private Candidat owner;

	public Experience() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Experience(Long id, LocalDateTime createdAt, LocalDateTime modifiedAt) {
		super(id, createdAt, modifiedAt);
		// TODO Auto-generated constructor stub
	}

	public Experience(Long id, LocalDateTime createdAt, LocalDateTime modifiedAt, String description, String company,
			Date datedebut, Date datefin, Candidat owner) {
		super(id, createdAt, modifiedAt);
		this.description = description;
		this.company = company;
		this.datedebut = datedebut;
		this.datefin = datefin;
		this.owner = owner;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Date getDatedebut() {
		return datedebut;
	}

	public void setDatedebut(Date datedebut) {
		this.datedebut = datedebut;
	}

	public Date getDatefin() {
		return datefin;
	}

	public void setDatefin(Date datefin) {
		this.datefin = datefin;
	}

	public Candidat getOwner() {
		return owner;
	}

	public void setOwner(Candidat owner) {
		this.owner = owner;
	}
	
	
	

}
