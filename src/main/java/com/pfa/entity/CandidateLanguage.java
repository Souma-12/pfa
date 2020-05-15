package com.pfa.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "candidatelanguage")
public class CandidateLanguage extends AbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@NotNull
	private Candidat candidate;

	@ManyToOne
	@NotNull
	private Langue language;

	@NotNull
	@Enumerated(EnumType.STRING)
	private LanguageLevel level = LanguageLevel.Beginner;

	public CandidateLanguage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CandidateLanguage(Long id, LocalDateTime createdAt, LocalDateTime modifiedAt) {
		super(id, createdAt, modifiedAt);
		// TODO Auto-generated constructor stub
	}

	public CandidateLanguage(Long id, LocalDateTime createdAt, LocalDateTime modifiedAt, @NotNull Candidat candidate,
			@NotNull Langue language, @NotNull LanguageLevel level) {
		super(id, createdAt, modifiedAt);
		this.candidate = candidate;
		this.language = language;
		this.level = level;
	}

	public Candidat getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidat candidate) {
		this.candidate = candidate;
	}

	public Langue getLanguage() {
		return language;
	}

	public void setLanguage(Langue language) {
		this.language = language;
	}

	public LanguageLevel getLevel() {
		return level;
	}

	public void setLevel(LanguageLevel level) {
		this.level = level;
	}

}
