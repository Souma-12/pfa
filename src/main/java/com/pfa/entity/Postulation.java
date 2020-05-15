package com.pfa.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "postulations")

//@ToString(exclude = {"pass"})
public class Postulation extends AbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@NotNull
	private Candidat candidat;

	@ManyToOne
	@NotNull
	private Offre offre;

	@OneToMany
	private Set<Document> documents;

	@Enumerated(EnumType.STRING)
	@NotNull
	private PostulationStatus status = PostulationStatus.OPEN;
	
	
	

}
