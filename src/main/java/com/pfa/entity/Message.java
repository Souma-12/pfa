package com.pfa.entity;

import java.time.LocalDateTime;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;




@Entity
@Table(name = "messageries")
//@ToString(exclude = {"pass"})
public class Message extends AbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NotNull
	@Enumerated(EnumType.STRING)
	private MessageStatus status = MessageStatus.UNREAD;

	@Lob
	@Basic(fetch = FetchType.LAZY)
	@Column(name = "MESSAGE", nullable = false)
	private String message;

	@Column(name = "readAt")
	private LocalDateTime readAt;

	@ManyToOne(optional = false)
	private User sender;

	@ManyToOne(optional = false)
	private User receiver;

	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Message(Long id, LocalDateTime createdAt, LocalDateTime modifiedAt) {
		super(id, createdAt, modifiedAt);
		// TODO Auto-generated constructor stub
	}

	public Message(Long id, LocalDateTime createdAt, LocalDateTime modifiedAt, @NotNull MessageStatus status,
			String message, LocalDateTime readAt, User sender, User receiver) {
		super(id, createdAt, modifiedAt);
		this.status = status;
		this.message = message;
		this.readAt = readAt;
		this.sender = sender;
		this.receiver = receiver;
	}

	public MessageStatus getStatus() {
		return status;
	}

	public void setStatus(MessageStatus status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getReadAt() {
		return readAt;
	}

	public void setReadAt(LocalDateTime readAt) {
		this.readAt = readAt;
	}

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

	public User getReceiver() {
		return receiver;
	}

	public void setReceiver(User receiver) {
		this.receiver = receiver;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	
}