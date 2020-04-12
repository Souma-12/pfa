package com.pfa.Entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="actualite")
public class Actualite implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue ( strategy = GenerationType.AUTO )
	private Long id;
	private String createdBy;
	private Date date;
	public Actualite() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Actualite(Long id, String user, Date date) {
		super();
		this.id = id;
		this.createdBy = user;
		this.date = date;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUser() {
		return createdBy;
	}
	public void setUser(String user) {
		this.createdBy = user;
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
		return "Actualite [id=" + id + ", createdBy=" + createdBy + ", date=" + date + "]";
	}
	
	
	
	

}
