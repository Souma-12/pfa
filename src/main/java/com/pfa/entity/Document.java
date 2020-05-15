package com.pfa.entity;

import java.time.LocalDateTime;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Lob;
import javax.persistence.Table;


@Entity
@Table(name = "documents")


public class Document extends AbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Enumerated(EnumType.STRING)
	private DocumentType type;

	@Column(nullable = false)
	private String mimeType;

	@Column(nullable = false)
	private String filename;

	@Column(nullable = false)
	@Lob
	@Basic(fetch = FetchType.LAZY)
	private byte[] content;
	
	
	public Document(Long id, LocalDateTime createdAt, LocalDateTime modifiedAt) {
		super(id, createdAt, modifiedAt);
		// TODO Auto-generated constructor stub
	}

	public Document(Long id, LocalDateTime createdAt, LocalDateTime modifiedAt, DocumentType type, String mimeType,
			String filename, byte[] content) {
		super(id, createdAt, modifiedAt);
		this.type = type;
		this.mimeType = mimeType;
		this.filename = filename;
		this.content = content;
	}

	public DocumentType getType() {
		return type;
	}

	public void setType(DocumentType type) {
		this.type = type;
	}

	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public byte[] getContent() {
		return content;
	}

	public void setContent(byte[] content) {
		this.content = content;
	}

	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}


	

}
