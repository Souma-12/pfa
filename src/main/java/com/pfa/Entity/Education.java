package com.pfa.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="education")
public class Education implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue ( strategy = GenerationType.AUTO )
	private Long id;
	private String Ecole;
	private String Diplome;
	private String DomaineEtudes;
    private String Activites;
    @CreationTimestamp
	private Date dateDebut;
	@UpdateTimestamp
	private Date dateFin;
	public Education() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Education(Long id, String ecole, String diplome, String domaineEtudes, String activites, Date dateDebut,
			Date dateFin) {
		super();
		this.id = id;
		Ecole = ecole;
		Diplome = diplome;
		DomaineEtudes = domaineEtudes;
		Activites = activites;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEcole() {
		return Ecole;
	}
	public void setEcole(String ecole) {
		Ecole = ecole;
	}
	public String getDiplome() {
		return Diplome;
	}
	public void setDiplome(String diplome) {
		Diplome = diplome;
	}
	public String getDomaineEtudes() {
		return DomaineEtudes;
	}
	public void setDomaineEtudes(String domaineEtudes) {
		DomaineEtudes = domaineEtudes;
	}
	public String getActivites() {
		return Activites;
	}
	public void setActivites(String activites) {
		Activites = activites;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Education [id=" + id + ", Ecole=" + Ecole + ", Diplome=" + Diplome + ", DomaineEtudes=" + DomaineEtudes
				+ ", Activites=" + Activites + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + "]";
	}

	
	
	
	
}
