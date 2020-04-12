package com.pfa.Entity;

import java.util.Date;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue(value= "Candidat")
public class Candidat extends User {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String Titre;
	private String PosteActuel;
	private String Competance;
	public Candidat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Candidat(Long id, String nom, String prenom, String telephone, Date dateNaiss, String adress, String email,
			String login, String pass, Date dateCreation, Date dateModification) {
		super(id, nom, prenom, telephone, dateNaiss, adress, email, login, pass, dateCreation, dateModification);
		// TODO Auto-generated constructor stub
	}
	public Candidat(String titre, String posteActuel, String competance) {
		super();
		Titre = titre;
		PosteActuel = posteActuel;
		Competance = competance;
	}
	public String getTitre() {
		return Titre;
	}
	public void setTitre(String titre) {
		Titre = titre;
	}
	public String getPosteActuel() {
		return PosteActuel;
	}
	public void setPosteActuel(String posteActuel) {
		PosteActuel = posteActuel;
	}
	public String getCompetance() {
		return Competance;
	}
	public void setCompetance(String competance) {
		Competance = competance;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Candidat [Titre=" + Titre + ", PosteActuel=" + PosteActuel + ", Competance=" + Competance + "]";
	}
	
	
	
	
	
	
}