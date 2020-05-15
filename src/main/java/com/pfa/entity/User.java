package com.pfa.entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name = "utilisateur")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@JsonIgnoreProperties(ignoreUnknown = true, value = { "hibernateLazyInitializer", "handler" })

public class User extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@NotBlank
	@Column(nullable = false)
	private String nom;

	private String telephone;
	private Date dateNaiss;
	private String adress;
	private String pays;
	@Email
	@NotBlank
	@Column(nullable = false)
	private String email;

	private String username;

	@NotBlank
	@Column(nullable = false)
	private String password;

	public User(Long id, LocalDateTime createdAt, LocalDateTime modifiedAt, @NotBlank String nom, String telephone,
			Date dateNaiss, String adress, String pays, @Email @NotBlank String email, @NotBlank String username,
			@NotBlank String password) {
		super(id, createdAt, modifiedAt);
		this.nom = nom;
		this.telephone = telephone;
		this.dateNaiss = dateNaiss;
		this.adress = adress;
		this.pays = pays;
		this.email = email;
		this.username = email;
		this.password = password;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Long id, LocalDateTime createdAt, LocalDateTime modifiedAt) {
		super(id, createdAt, modifiedAt);
		// TODO Auto-generated constructor stub
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Date getDateNaiss() {
		return dateNaiss;
	}

	public void setDateNaiss(Date dateNaiss) {
		this.dateNaiss = dateNaiss;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "User [nom=" + nom + ", telephone=" + telephone + ", dateNaiss=" + dateNaiss + ", adress=" + adress
				+ ", pays=" + pays + ", email=" + email + ", username=" + username + ", password=" + password + "]";
	}

	
	
}
