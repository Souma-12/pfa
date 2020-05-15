package com.pfa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table(name = "actualite")

public class Actualite extends AbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Column(nullable = false)
	private String createdBy;
	
	
	


	public String getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}


	@Override
	public String toString() {
		return "Actualite [createdBy=" + createdBy + "]";
	}
	

	
}
