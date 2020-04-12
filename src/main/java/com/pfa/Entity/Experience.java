package com.pfa.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="experience")
public class Experience {
   @Id
   @GeneratedValue ( strategy = GenerationType.AUTO )
	private Long id;
	private String description;
	@CreationTimestamp
	private Date datedebut;
	@UpdateTimestamp
	private Date datefin;
	public Experience() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Experience(Long id, String description, Date datedebut, Date datefin) {
		super();
		this.id = id;
		this.description = description;
		this.datedebut = datedebut;
		this.datefin = datefin;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	@Override
	public String toString() {
		return "ExperienceController [id=" + id + ", description=" + description + ", datedebut=" + datedebut + ", datefin="
				+ datefin + "]";
	}
	
	
	
	
	
}
