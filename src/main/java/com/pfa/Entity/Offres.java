package com.pfa.Entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="offres")
public class Offres implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue ( strategy = GenerationType.AUTO )
	private Long id;
	private String type;
	private String technique;
	private String Pays;
	private Long salaire;
	@CreationTimestamp
	private Date date;
	public Offres() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Offres(Long id, String type, String technique, String pays, Long salaire, Date date) {
		super();
		this.id = id;
		this.type = type;
		this.technique = technique;
		Pays = pays;
		this.salaire = salaire;
		this.date = date;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Offres [id=" + id + ", type=" + type + ", technique=" + technique + ", Pays=" + Pays + ", salaire="
				+ salaire + ", date=" + date + "]";
	}
	

}
